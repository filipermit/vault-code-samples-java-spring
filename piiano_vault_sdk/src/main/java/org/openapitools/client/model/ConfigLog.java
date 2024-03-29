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
 * ConfigLog
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T07:11:51.536091Z[Etc/UTC]")
public class ConfigLog {
  public static final String SERIALIZED_NAME_CUSTOMER_ENV = "customer_env";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ENV)
  private String customerEnv;

  public static final String SERIALIZED_NAME_CUSTOMER_IDENTIFIER = "customer_identifier";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_IDENTIFIER)
  private String customerIdentifier;

  public static final String SERIALIZED_NAME_DATADOG_APM_ENABLE = "datadog_apm_enable";
  @SerializedName(SERIALIZED_NAME_DATADOG_APM_ENABLE)
  private Boolean datadogApmEnable;

  public static final String SERIALIZED_NAME_DATADOG_ENABLE = "datadog_enable";
  @SerializedName(SERIALIZED_NAME_DATADOG_ENABLE)
  private Boolean datadogEnable;

  public static final String SERIALIZED_NAME_DATADOG_SOURCE = "datadog_source";
  @SerializedName(SERIALIZED_NAME_DATADOG_SOURCE)
  private String datadogSource;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public ConfigLog() {
  }

  public ConfigLog customerEnv(String customerEnv) {
    
    this.customerEnv = customerEnv;
    return this;
  }

   /**
   * Get customerEnv
   * @return customerEnv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomerEnv() {
    return customerEnv;
  }


  public void setCustomerEnv(String customerEnv) {
    this.customerEnv = customerEnv;
  }


  public ConfigLog customerIdentifier(String customerIdentifier) {
    
    this.customerIdentifier = customerIdentifier;
    return this;
  }

   /**
   * Get customerIdentifier
   * @return customerIdentifier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCustomerIdentifier() {
    return customerIdentifier;
  }


  public void setCustomerIdentifier(String customerIdentifier) {
    this.customerIdentifier = customerIdentifier;
  }


  public ConfigLog datadogApmEnable(Boolean datadogApmEnable) {
    
    this.datadogApmEnable = datadogApmEnable;
    return this;
  }

   /**
   * Get datadogApmEnable
   * @return datadogApmEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDatadogApmEnable() {
    return datadogApmEnable;
  }


  public void setDatadogApmEnable(Boolean datadogApmEnable) {
    this.datadogApmEnable = datadogApmEnable;
  }


  public ConfigLog datadogEnable(Boolean datadogEnable) {
    
    this.datadogEnable = datadogEnable;
    return this;
  }

   /**
   * Get datadogEnable
   * @return datadogEnable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDatadogEnable() {
    return datadogEnable;
  }


  public void setDatadogEnable(Boolean datadogEnable) {
    this.datadogEnable = datadogEnable;
  }


  public ConfigLog datadogSource(String datadogSource) {
    
    this.datadogSource = datadogSource;
    return this;
  }

   /**
   * Get datadogSource
   * @return datadogSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDatadogSource() {
    return datadogSource;
  }


  public void setDatadogSource(String datadogSource) {
    this.datadogSource = datadogSource;
  }


  public ConfigLog level(String level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLevel() {
    return level;
  }


  public void setLevel(String level) {
    this.level = level;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigLog configLog = (ConfigLog) o;
    return Objects.equals(this.customerEnv, configLog.customerEnv) &&
        Objects.equals(this.customerIdentifier, configLog.customerIdentifier) &&
        Objects.equals(this.datadogApmEnable, configLog.datadogApmEnable) &&
        Objects.equals(this.datadogEnable, configLog.datadogEnable) &&
        Objects.equals(this.datadogSource, configLog.datadogSource) &&
        Objects.equals(this.level, configLog.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerEnv, customerIdentifier, datadogApmEnable, datadogEnable, datadogSource, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigLog {\n");
    sb.append("    customerEnv: ").append(toIndentedString(customerEnv)).append("\n");
    sb.append("    customerIdentifier: ").append(toIndentedString(customerIdentifier)).append("\n");
    sb.append("    datadogApmEnable: ").append(toIndentedString(datadogApmEnable)).append("\n");
    sb.append("    datadogEnable: ").append(toIndentedString(datadogEnable)).append("\n");
    sb.append("    datadogSource: ").append(toIndentedString(datadogSource)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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
    openapiFields.add("customer_env");
    openapiFields.add("customer_identifier");
    openapiFields.add("datadog_apm_enable");
    openapiFields.add("datadog_enable");
    openapiFields.add("datadog_source");
    openapiFields.add("level");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigLog
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfigLog.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigLog is not found in the empty JSON string", ConfigLog.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfigLog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigLog` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("customer_env") != null && !jsonObj.get("customer_env").isJsonNull()) && !jsonObj.get("customer_env").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_env` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_env").toString()));
      }
      if ((jsonObj.get("customer_identifier") != null && !jsonObj.get("customer_identifier").isJsonNull()) && !jsonObj.get("customer_identifier").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customer_identifier` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customer_identifier").toString()));
      }
      if ((jsonObj.get("datadog_source") != null && !jsonObj.get("datadog_source").isJsonNull()) && !jsonObj.get("datadog_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `datadog_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("datadog_source").toString()));
      }
      if ((jsonObj.get("level") != null && !jsonObj.get("level").isJsonNull()) && !jsonObj.get("level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("level").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigLog.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigLog>() {
           @Override
           public void write(JsonWriter out, ConfigLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigLog read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigLog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigLog
  * @throws IOException if the JSON string is invalid with respect to ConfigLog
  */
  public static ConfigLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigLog.class);
  }

 /**
  * Convert an instance of ConfigLog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

