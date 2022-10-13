#!/bin/bash

BASE_URL="http://localhost:8080/demo"
MYSQL_USER=springuser
MUSQL_ROOT_USER=admin
MYSQL_ROOT_PASS=rootpass
MYSQL_PASS=userpass
MYSQL_DBNAME=app_db
DOCKER_TAG="0.9.7-poc-221012"
PVAULT_CLI="docker run --rm -i -v $(pwd):/pwd -w /pwd piiano/pvault-cli:${DOCKER_TAG}"

# Run as root and also wait allow for time until mysql is up
function mysql_cmd_inital()
{
	for i in {1..5}
	do  
		output=`docker run -it --rm mysql mysql -hhost.docker.internal -uroot -p${MYSQL_ROOT_PASS} -e "show databases;"`
		if [ $? != "0" ] ; then
			echo ${output} | grep -q "ERROR 20"
			if [ $? != "0" ] ; then
				echo "Failed running SQL command."
				return
			fi
			echo "MySQL not ready yet. Sleep 5"
			sleep 5
		else
			echo "MySQL is ready"
			echo "${output}"
			break
		fi
	done
}

function mysql_cmd()
{
	IS_ROOT=${1}
	CMD="${2}"

	if ${IS_ROOT} ; then
		U=""
		P="-p${MYSQL_ROOT_PASS}"
		DB=""
	else
		U="-u ${MYSQL_USER}"
		P="-p${MYSQL_PASS}"
		DB=${MYSQL_DBNAME}
	fi
	echo Running "${CMD}"
	docker run -it --rm mysql mysql -hhost.docker.internal ${DB} ${U} ${P} -e "${CMD}"
}

function add_user()
{
  firstname=$1
  lastname=$2
	username=$3
	password=$4
	email=$5
	country=$6

	printf "Adding user ${username} with email ${email} ... "
	curl -s "${BASE_URL}/add-user?first_name=${firstname}&last_name=${lastname}&username=${username}&password=${password}&email=${email}&country=${country}"
	if [ $? != 0 ] ; then
		echo "Failed adding user"
	else
		echo
	fi
}

function usage_and_exit()
{
	echo "Usage: $0 -i : run in interactive mode"
	exit 1
}

function stop_all()
{
	echo "stop mysql"
	docker stop mysql
	kill $(jobs -p)
}

function interrupted_callback()
{
	echo "Interrupted ..."
	stop_all
	exit 0
}

function debug()
{
	echo -e '\n--' $1
	if $INTERACTIVE_MODE ; then
		echo "<enter> to continue"
		read press_enter
	fi
}

# -------------
# 	 M A I N
# -------------


# trap ctrl-c and call the interrupted callback
trap interrupted_callback INT
INTERACTIVE_MODE=false
if [ $# -gt "1" ] ; then
    usage_and_exit
elif [ $# -eq "1" ] ; then
	if [ $1 = "-i" ] ; then
		INTERACTIVE_MODE=true
		echo "Enable interactive mode"
	else
		usage_and_exit
	fi
fi

# if JQ is missing, use just cat instead
JQ=jq
${JQ} --version > /dev/null 2>&1
if [ $? != 0 ] ; then
	JQ=cat
fi

debug "stopping stale containers"
stop_all

debug "starting mysql"
docker run --rm --name mysql -e MYSQL_ROOT_PASSWORD=${MYSQL_ROOT_PASS} -p 3306:3306 -d mysql:8.0.30
mysql_cmd_inital
mysql_cmd true "create database app_db; create user '${MYSQL_USER}'@'%' identified by '${MYSQL_PASS}'; grant all on ${MYSQL_DBNAME}.* to '${MYSQL_USER}'@'%';"

# run Piiano connector
debug "Running the spring app: java -jar ~/.m2/repository/com/piiano/demo-app/0.0.1-SNAPSHOT/demo-app-0.0.1-SNAPSHOT.jar"
java -jar ~/.m2/repository/com/piiano/demo-app/0.0.1-SNAPSHOT/demo-app-0.0.1-SNAPSHOT.jar &
sleep 10

# Add some users
debug "Adding users..."
add_user john       Doe 		johndoe   1111  john@gmail.com      us
add_user also_john	Doe     also_john 2222  john@gmail.com      us
add_user alice		  Smith   alices    3333  alice@hotmail.com   us
add_user bob		    Jones   bobj      4444  bob@yahoo.com       us


# Search user by email=john@email.com
debug "Search user by email=john@email.com --> expecting 2 results:"
curl -s "${BASE_URL}/findUserByEmail?email=john@gmail.com" | ${JQ}
if [ $? != 0 ] ; then
	echo "Failed find user by email"
fi

# Get all users
debug "Get all users --> Expecting 4 results:"
curl -s "${BASE_URL}/all" | ${JQ}
if [ $? != 0 ] ; then
	echo "Failed get all users"
fi

# Show mysql data
debug "Showing data in mysql (note the 'email' column)"
mysql_cmd false 'select * from user;'

stop_all