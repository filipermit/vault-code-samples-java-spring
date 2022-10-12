/*
 * Piiano Vault REST API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.ConfigDB;
import org.openapitools.client.model.ConfigFeatures;
import org.openapitools.client.model.ConfigKMS;
import org.openapitools.client.model.ConfigLog;
import org.openapitools.client.model.ConfigSentry;
import org.openapitools.client.model.ConfigService;
import org.openapitools.client.model.ConfigTLS;
import org.openapitools.client.model.ConfigTTL;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * ConfigConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T07:11:51.536091Z[Etc/UTC]")
public class ConfigConfig {
  public static final String SERIALIZED_NAME_DB = "db";
  @SerializedName(SERIALIZED_NAME_DB)
  private ConfigDB db;

  public static final String SERIALIZED_NAME_DEVMODE = "devmode";
  @SerializedName(SERIALIZED_NAME_DEVMODE)
  private Boolean devmode;

  public static final String SERIALIZED_NAME_FEATURES = "features";
  @SerializedName(SERIALIZED_NAME_FEATURES)
  private ConfigFeatures features;

  public static final String SERIALIZED_NAME_KMS = "kms";
  @SerializedName(SERIALIZED_NAME_KMS)
  private ConfigKMS kms;

  public static final String SERIALIZED_NAME_LOG = "log";
  @SerializedName(SERIALIZED_NAME_LOG)
  private ConfigLog log;

  public static final String SERIALIZED_NAME_SENTRY = "sentry";
  @SerializedName(SERIALIZED_NAME_SENTRY)
  private ConfigSentry sentry;

  public static final String SERIALIZED_NAME_SERVICE = "service";
  @SerializedName(SERIALIZED_NAME_SERVICE)
  private ConfigService service;

  public static final String SERIALIZED_NAME_TLS = "tls";
  @SerializedName(SERIALIZED_NAME_TLS)
  private ConfigTLS tls;

  public static final String SERIALIZED_NAME_TTL = "ttl";
  @SerializedName(SERIALIZED_NAME_TTL)
  private ConfigTTL ttl;

  public ConfigConfig() {
  }

  public ConfigConfig db(ConfigDB db) {
    
    this.db = db;
    return this;
  }

   /**
   * Get db
   * @return db
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigDB getDb() {
    return db;
  }


  public void setDb(ConfigDB db) {
    this.db = db;
  }


  public ConfigConfig devmode(Boolean devmode) {
    
    this.devmode = devmode;
    return this;
  }

   /**
   * Get devmode
   * @return devmode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDevmode() {
    return devmode;
  }


  public void setDevmode(Boolean devmode) {
    this.devmode = devmode;
  }


  public ConfigConfig features(ConfigFeatures features) {
    
    this.features = features;
    return this;
  }

   /**
   * Get features
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigFeatures getFeatures() {
    return features;
  }


  public void setFeatures(ConfigFeatures features) {
    this.features = features;
  }


  public ConfigConfig kms(ConfigKMS kms) {
    
    this.kms = kms;
    return this;
  }

   /**
   * Get kms
   * @return kms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigKMS getKms() {
    return kms;
  }


  public void setKms(ConfigKMS kms) {
    this.kms = kms;
  }


  public ConfigConfig log(ConfigLog log) {
    
    this.log = log;
    return this;
  }

   /**
   * Get log
   * @return log
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigLog getLog() {
    return log;
  }


  public void setLog(ConfigLog log) {
    this.log = log;
  }


  public ConfigConfig sentry(ConfigSentry sentry) {
    
    this.sentry = sentry;
    return this;
  }

   /**
   * Get sentry
   * @return sentry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigSentry getSentry() {
    return sentry;
  }


  public void setSentry(ConfigSentry sentry) {
    this.sentry = sentry;
  }


  public ConfigConfig service(ConfigService service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigService getService() {
    return service;
  }


  public void setService(ConfigService service) {
    this.service = service;
  }


  public ConfigConfig tls(ConfigTLS tls) {
    
    this.tls = tls;
    return this;
  }

   /**
   * Get tls
   * @return tls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigTLS getTls() {
    return tls;
  }


  public void setTls(ConfigTLS tls) {
    this.tls = tls;
  }


  public ConfigConfig ttl(ConfigTTL ttl) {
    
    this.ttl = ttl;
    return this;
  }

   /**
   * Get ttl
   * @return ttl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigTTL getTtl() {
    return ttl;
  }


  public void setTtl(ConfigTTL ttl) {
    this.ttl = ttl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigConfig configConfig = (ConfigConfig) o;
    return Objects.equals(this.db, configConfig.db) &&
        Objects.equals(this.devmode, configConfig.devmode) &&
        Objects.equals(this.features, configConfig.features) &&
        Objects.equals(this.kms, configConfig.kms) &&
        Objects.equals(this.log, configConfig.log) &&
        Objects.equals(this.sentry, configConfig.sentry) &&
        Objects.equals(this.service, configConfig.service) &&
        Objects.equals(this.tls, configConfig.tls) &&
        Objects.equals(this.ttl, configConfig.ttl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(db, devmode, features, kms, log, sentry, service, tls, ttl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigConfig {\n");
    sb.append("    db: ").append(toIndentedString(db)).append("\n");
    sb.append("    devmode: ").append(toIndentedString(devmode)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
    sb.append("    kms: ").append(toIndentedString(kms)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    sentry: ").append(toIndentedString(sentry)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("db");
    openapiFields.add("devmode");
    openapiFields.add("features");
    openapiFields.add("kms");
    openapiFields.add("log");
    openapiFields.add("sentry");
    openapiFields.add("service");
    openapiFields.add("tls");
    openapiFields.add("ttl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfigConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigConfig is not found in the empty JSON string", ConfigConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfigConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `db`
      if (jsonObj.get("db") != null && !jsonObj.get("db").isJsonNull()) {
        ConfigDB.validateJsonObject(jsonObj.getAsJsonObject("db"));
      }
      // validate the optional field `features`
      if (jsonObj.get("features") != null && !jsonObj.get("features").isJsonNull()) {
        ConfigFeatures.validateJsonObject(jsonObj.getAsJsonObject("features"));
      }
      // validate the optional field `kms`
      if (jsonObj.get("kms") != null && !jsonObj.get("kms").isJsonNull()) {
        ConfigKMS.validateJsonObject(jsonObj.getAsJsonObject("kms"));
      }
      // validate the optional field `log`
      if (jsonObj.get("log") != null && !jsonObj.get("log").isJsonNull()) {
        ConfigLog.validateJsonObject(jsonObj.getAsJsonObject("log"));
      }
      // validate the optional field `sentry`
      if (jsonObj.get("sentry") != null && !jsonObj.get("sentry").isJsonNull()) {
        ConfigSentry.validateJsonObject(jsonObj.getAsJsonObject("sentry"));
      }
      // validate the optional field `service`
      if (jsonObj.get("service") != null && !jsonObj.get("service").isJsonNull()) {
        ConfigService.validateJsonObject(jsonObj.getAsJsonObject("service"));
      }
      // validate the optional field `tls`
      if (jsonObj.get("tls") != null && !jsonObj.get("tls").isJsonNull()) {
        ConfigTLS.validateJsonObject(jsonObj.getAsJsonObject("tls"));
      }
      // validate the optional field `ttl`
      if (jsonObj.get("ttl") != null && !jsonObj.get("ttl").isJsonNull()) {
        ConfigTTL.validateJsonObject(jsonObj.getAsJsonObject("ttl"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigConfig>() {
           @Override
           public void write(JsonWriter out, ConfigConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigConfig
  * @throws IOException if the JSON string is invalid with respect to ConfigConfig
  */
  public static ConfigConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigConfig.class);
  }

 /**
  * Convert an instance of ConfigConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
