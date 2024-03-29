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
import org.openapitools.client.model.ModelsTokenAggregatedMetadata;
import org.openapitools.client.model.ModelsTokenRefMetadata;

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
 * ModelsTokenMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-10-03T07:11:51.536091Z[Etc/UTC]")
public class ModelsTokenMetadata {
  public static final String SERIALIZED_NAME_AGG = "agg";
  @SerializedName(SERIALIZED_NAME_AGG)
  private ModelsTokenAggregatedMetadata agg;

  public static final String SERIALIZED_NAME_REUSABLE_TOKEN_ID = "reusable_token_id";
  @SerializedName(SERIALIZED_NAME_REUSABLE_TOKEN_ID)
  private Boolean reusableTokenId;

  public static final String SERIALIZED_NAME_REVERSIBLE = "reversible";
  @SerializedName(SERIALIZED_NAME_REVERSIBLE)
  private Boolean reversible;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_TOKEN_ID = "token_id";
  @SerializedName(SERIALIZED_NAME_TOKEN_ID)
  private String tokenId;

  public static final String SERIALIZED_NAME_TOKENS = "tokens";
  @SerializedName(SERIALIZED_NAME_TOKENS)
  private List<ModelsTokenRefMetadata> tokens = null;

  public ModelsTokenMetadata() {
  }

  public ModelsTokenMetadata agg(ModelsTokenAggregatedMetadata agg) {
    
    this.agg = agg;
    return this;
  }

   /**
   * Get agg
   * @return agg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ModelsTokenAggregatedMetadata getAgg() {
    return agg;
  }


  public void setAgg(ModelsTokenAggregatedMetadata agg) {
    this.agg = agg;
  }


  public ModelsTokenMetadata reusableTokenId(Boolean reusableTokenId) {
    
    this.reusableTokenId = reusableTokenId;
    return this;
  }

   /**
   * ID reusability status of the tokens.
   * @return reusableTokenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID reusability status of the tokens.")

  public Boolean getReusableTokenId() {
    return reusableTokenId;
  }


  public void setReusableTokenId(Boolean reusableTokenId) {
    this.reusableTokenId = reusableTokenId;
  }


  public ModelsTokenMetadata reversible(Boolean reversible) {
    
    this.reversible = reversible;
    return this;
  }

   /**
   * Whether the token is reversible or not.
   * @return reversible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the token is reversible or not.")

  public Boolean getReversible() {
    return reversible;
  }


  public void setReversible(Boolean reversible) {
    this.reversible = reversible;
  }


  public ModelsTokenMetadata scope(String scope) {
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the tokens.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of the tokens.")

  public String getScope() {
    return scope;
  }


  public void setScope(String scope) {
    this.scope = scope;
  }


  public ModelsTokenMetadata tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * The shared ID of the tokens.
   * @return tokenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The shared ID of the tokens.")

  public String getTokenId() {
    return tokenId;
  }


  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  public ModelsTokenMetadata tokens(List<ModelsTokenRefMetadata> tokens) {
    
    this.tokens = tokens;
    return this;
  }

  public ModelsTokenMetadata addTokensItem(ModelsTokenRefMetadata tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Metadata for the each token.
   * @return tokens
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata for the each token.")

  public List<ModelsTokenRefMetadata> getTokens() {
    return tokens;
  }


  public void setTokens(List<ModelsTokenRefMetadata> tokens) {
    this.tokens = tokens;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelsTokenMetadata modelsTokenMetadata = (ModelsTokenMetadata) o;
    return Objects.equals(this.agg, modelsTokenMetadata.agg) &&
        Objects.equals(this.reusableTokenId, modelsTokenMetadata.reusableTokenId) &&
        Objects.equals(this.reversible, modelsTokenMetadata.reversible) &&
        Objects.equals(this.scope, modelsTokenMetadata.scope) &&
        Objects.equals(this.tokenId, modelsTokenMetadata.tokenId) &&
        Objects.equals(this.tokens, modelsTokenMetadata.tokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agg, reusableTokenId, reversible, scope, tokenId, tokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelsTokenMetadata {\n");
    sb.append("    agg: ").append(toIndentedString(agg)).append("\n");
    sb.append("    reusableTokenId: ").append(toIndentedString(reusableTokenId)).append("\n");
    sb.append("    reversible: ").append(toIndentedString(reversible)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
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
    openapiFields.add("agg");
    openapiFields.add("reusable_token_id");
    openapiFields.add("reversible");
    openapiFields.add("scope");
    openapiFields.add("token_id");
    openapiFields.add("tokens");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ModelsTokenMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ModelsTokenMetadata.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ModelsTokenMetadata is not found in the empty JSON string", ModelsTokenMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ModelsTokenMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ModelsTokenMetadata` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `agg`
      if (jsonObj.get("agg") != null && !jsonObj.get("agg").isJsonNull()) {
        ModelsTokenAggregatedMetadata.validateJsonObject(jsonObj.getAsJsonObject("agg"));
      }
      if ((jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) && !jsonObj.get("scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scope").toString()));
      }
      if ((jsonObj.get("token_id") != null && !jsonObj.get("token_id").isJsonNull()) && !jsonObj.get("token_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `token_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("token_id").toString()));
      }
      JsonArray jsonArraytokens = jsonObj.getAsJsonArray("tokens");
      if (jsonArraytokens != null) {
        // ensure the json data is an array
        if (!jsonObj.get("tokens").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `tokens` to be an array in the JSON string but got `%s`", jsonObj.get("tokens").toString()));
        }

        // validate the optional field `tokens` (array)
        for (int i = 0; i < jsonArraytokens.size(); i++) {
          ModelsTokenRefMetadata.validateJsonObject(jsonArraytokens.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ModelsTokenMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ModelsTokenMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ModelsTokenMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ModelsTokenMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ModelsTokenMetadata>() {
           @Override
           public void write(JsonWriter out, ModelsTokenMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ModelsTokenMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ModelsTokenMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ModelsTokenMetadata
  * @throws IOException if the JSON string is invalid with respect to ModelsTokenMetadata
  */
  public static ModelsTokenMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ModelsTokenMetadata.class);
  }

 /**
  * Convert an instance of ModelsTokenMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

