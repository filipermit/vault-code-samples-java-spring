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
 * ConfigGC
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T07:11:51.536091Z[Etc/UTC]")
public class ConfigGC {
  public static final String SERIALIZED_NAME_BATCH_SIZE = "batch_size";
  @SerializedName(SERIALIZED_NAME_BATCH_SIZE)
  private Integer batchSize;

  public static final String SERIALIZED_NAME_GRACE_PERIOD_DAYS = "grace_period_days";
  @SerializedName(SERIALIZED_NAME_GRACE_PERIOD_DAYS)
  private Integer gracePeriodDays;

  public ConfigGC() {
  }

  public ConfigGC batchSize(Integer batchSize) {
    
    this.batchSize = batchSize;
    return this;
  }

   /**
   * Get batchSize
   * @return batchSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBatchSize() {
    return batchSize;
  }


  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }


  public ConfigGC gracePeriodDays(Integer gracePeriodDays) {
    
    this.gracePeriodDays = gracePeriodDays;
    return this;
  }

   /**
   * Get gracePeriodDays
   * @return gracePeriodDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getGracePeriodDays() {
    return gracePeriodDays;
  }


  public void setGracePeriodDays(Integer gracePeriodDays) {
    this.gracePeriodDays = gracePeriodDays;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigGC configGC = (ConfigGC) o;
    return Objects.equals(this.batchSize, configGC.batchSize) &&
        Objects.equals(this.gracePeriodDays, configGC.gracePeriodDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchSize, gracePeriodDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigGC {\n");
    sb.append("    batchSize: ").append(toIndentedString(batchSize)).append("\n");
    sb.append("    gracePeriodDays: ").append(toIndentedString(gracePeriodDays)).append("\n");
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
    openapiFields.add("batch_size");
    openapiFields.add("grace_period_days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConfigGC
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ConfigGC.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConfigGC is not found in the empty JSON string", ConfigGC.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ConfigGC.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ConfigGC` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConfigGC.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConfigGC' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConfigGC> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConfigGC.class));

       return (TypeAdapter<T>) new TypeAdapter<ConfigGC>() {
           @Override
           public void write(JsonWriter out, ConfigGC value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ConfigGC read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConfigGC given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConfigGC
  * @throws IOException if the JSON string is invalid with respect to ConfigGC
  */
  public static ConfigGC fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConfigGC.class);
  }

 /**
  * Convert an instance of ConfigGC to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

