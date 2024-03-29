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
 * AuthRole
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T07:11:51.536091Z[Etc/UTC]")
public class AuthRole {
  public static final String SERIALIZED_NAME_CAPABILITIES = "capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private List<String> capabilities = null;

  public static final String SERIALIZED_NAME_POLICIES = "policies";
  @SerializedName(SERIALIZED_NAME_POLICIES)
  private List<String> policies = null;

  public AuthRole() {
  }

  public AuthRole capabilities(List<String> capabilities) {
    
    this.capabilities = capabilities;
    return this;
  }

  public AuthRole addCapabilitiesItem(String capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * Get capabilities
   * @return capabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getCapabilities() {
    return capabilities;
  }


  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }


  public AuthRole policies(List<String> policies) {
    
    this.policies = policies;
    return this;
  }

  public AuthRole addPoliciesItem(String policiesItem) {
    if (this.policies == null) {
      this.policies = new ArrayList<>();
    }
    this.policies.add(policiesItem);
    return this;
  }

   /**
   * Get policies
   * @return policies
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getPolicies() {
    return policies;
  }


  public void setPolicies(List<String> policies) {
    this.policies = policies;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthRole authRole = (AuthRole) o;
    return Objects.equals(this.capabilities, authRole.capabilities) &&
        Objects.equals(this.policies, authRole.policies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, policies);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthRole {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    policies: ").append(toIndentedString(policies)).append("\n");
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
    openapiFields.add("capabilities");
    openapiFields.add("policies");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AuthRole
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthRole.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthRole is not found in the empty JSON string", AuthRole.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthRole.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthRole` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if ((jsonObj.get("capabilities") != null && !jsonObj.get("capabilities").isJsonNull()) && !jsonObj.get("capabilities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `capabilities` to be an array in the JSON string but got `%s`", jsonObj.get("capabilities").toString()));
      }
      // ensure the json data is an array
      if ((jsonObj.get("policies") != null && !jsonObj.get("policies").isJsonNull()) && !jsonObj.get("policies").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `policies` to be an array in the JSON string but got `%s`", jsonObj.get("policies").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthRole.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthRole' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthRole> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthRole.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthRole>() {
           @Override
           public void write(JsonWriter out, AuthRole value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthRole read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AuthRole given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AuthRole
  * @throws IOException if the JSON string is invalid with respect to AuthRole
  */
  public static AuthRole fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthRole.class);
  }

 /**
  * Convert an instance of AuthRole to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

