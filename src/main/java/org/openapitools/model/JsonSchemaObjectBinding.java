package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BoundObjectType;
import org.openapitools.model.JsonSchemaVersionInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the binding of a JSON schema to an object
 */
@ApiModel(description = "Describes the binding of a JSON schema to an object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class JsonSchemaObjectBinding   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("jsonSchemaVersionInfo")
  private JsonSchemaVersionInfo jsonSchemaVersionInfo;

  @JsonProperty("objectId")
  private Integer objectId;

  @JsonProperty("objectType")
  private BoundObjectType objectType;

  public JsonSchemaObjectBinding createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that bound this object to the schema.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that bound this object to the schema.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public JsonSchemaObjectBinding createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this binding was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this binding was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public JsonSchemaObjectBinding jsonSchemaVersionInfo(JsonSchemaVersionInfo jsonSchemaVersionInfo) {
    this.jsonSchemaVersionInfo = jsonSchemaVersionInfo;
    return this;
  }

  /**
   * Get jsonSchemaVersionInfo
   * @return jsonSchemaVersionInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonSchemaVersionInfo getJsonSchemaVersionInfo() {
    return jsonSchemaVersionInfo;
  }

  public void setJsonSchemaVersionInfo(JsonSchemaVersionInfo jsonSchemaVersionInfo) {
    this.jsonSchemaVersionInfo = jsonSchemaVersionInfo;
  }

  public JsonSchemaObjectBinding objectId(Integer objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The numeric identifier of the object bound to a JSON schema
   * @return objectId
  */
  @ApiModelProperty(value = "The numeric identifier of the object bound to a JSON schema")


  public Integer getObjectId() {
    return objectId;
  }

  public void setObjectId(Integer objectId) {
    this.objectId = objectId;
  }

  public JsonSchemaObjectBinding objectType(BoundObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Get objectType
   * @return objectType
  */
  @ApiModelProperty(value = "")

  @Valid

  public BoundObjectType getObjectType() {
    return objectType;
  }

  public void setObjectType(BoundObjectType objectType) {
    this.objectType = objectType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaObjectBinding jsonSchemaObjectBinding = (JsonSchemaObjectBinding) o;
    return Objects.equals(this.createdBy, jsonSchemaObjectBinding.createdBy) &&
        Objects.equals(this.createdOn, jsonSchemaObjectBinding.createdOn) &&
        Objects.equals(this.jsonSchemaVersionInfo, jsonSchemaObjectBinding.jsonSchemaVersionInfo) &&
        Objects.equals(this.objectId, jsonSchemaObjectBinding.objectId) &&
        Objects.equals(this.objectType, jsonSchemaObjectBinding.objectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, jsonSchemaVersionInfo, objectId, objectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaObjectBinding {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    jsonSchemaVersionInfo: ").append(toIndentedString(jsonSchemaVersionInfo)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
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
}

