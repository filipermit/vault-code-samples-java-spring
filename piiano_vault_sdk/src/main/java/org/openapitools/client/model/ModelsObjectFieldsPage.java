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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openapitools.client.model.ModelsPaging;

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
 * ModelsObjectFieldsPage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T07:11:51.536091Z[Etc/UTC]")
public class ModelsObjectFieldsPage {
  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<Map<String, Object>> results = null;

  public static final String SERIALIZED_NAME_PAGING = "paging";
  @SerializedName(SERIALIZED_NAME_PAGING)
  private ModelsPaging paging;

  public ModelsObjectFieldsPage() {
  }

  public ModelsObjectFieldsPage results(List<Map<String, Object>> results) {
    
    this.results = results;
    return this;
  }

  public ModelsObjectFieldsPage addResultsItem(Map<String, Object> resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * The page objects.
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The page objects.")

  public List<Map<String, Object>> getResults() {
    return results;
  }


  public void setResults(List<Map<String, Object>> results) {
    this.results = results;
  }


  public ModelsObjectFieldsPage paging(ModelsPaging paging) {
    
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelsPaging getPaging() {
    return paging;
  }


  public void setPaging(ModelsPaging paging) {
    this.paging = paging;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsObjectFieldsPage modelsObjectFieldsPage = (ModelsObjectFieldsPage) o;
    return Objects.equals(this.results, modelsObjectFieldsPage.results) &&
        Objects.equals(this.paging, modelsObjectFieldsPage.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsObjectFieldsPage {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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
    openapiFields.add("results");
    openapiFields.add("paging");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsObjectFieldsPage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModelsObjectFieldsPage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsObjectFieldsPage is not found in the empty JSON string", ModelsObjectFieldsPage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsObjectFieldsPage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsObjectFieldsPage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) && !jsonObj.get("results").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
      }
      // validate the optional field `paging`
      if (jsonObj.get("paging") != null && !jsonObj.get("paging").isJsonNull()) {
        ModelsPaging.validateJsonObject(jsonObj.getAsJsonObject("paging"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsObjectFieldsPage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsObjectFieldsPage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsObjectFieldsPage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsObjectFieldsPage.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsObjectFieldsPage>() {
           @Override
           public void write(JsonWriter out, ModelsObjectFieldsPage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsObjectFieldsPage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsObjectFieldsPage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsObjectFieldsPage
  * @throws IOException if the JSON string is invalid with respect to ModelsObjectFieldsPage
  */
  public static ModelsObjectFieldsPage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsObjectFieldsPage.class);
  }

 /**
  * Convert an instance of ModelsObjectFieldsPage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

