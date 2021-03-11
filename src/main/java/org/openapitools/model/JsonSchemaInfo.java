package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about a single JSON schema.
 */
@ApiModel(description = "Information about a single JSON schema.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class JsonSchemaInfo   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("organizationId")
  private String organizationId;

  @JsonProperty("organizationName")
  private String organizationName;

  @JsonProperty("schemaId")
  private String schemaId;

  @JsonProperty("schemaName")
  private String schemaName;

  public JsonSchemaInfo createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that created this JsonSchema.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that created this JsonSchema.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public JsonSchemaInfo createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this JsonSchema was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this JsonSchema was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public JsonSchemaInfo organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * The Synapse identifier issued to the Organization to which this JsonSchema belongs.
   * @return organizationId
  */
  @ApiModelProperty(value = "The Synapse identifier issued to the Organization to which this JsonSchema belongs.")


  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public JsonSchemaInfo organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  /**
   * The name of the Organization to which this JsonSchema belongs.
   * @return organizationName
  */
  @ApiModelProperty(value = "The name of the Organization to which this JsonSchema belongs.")


  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public JsonSchemaInfo schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  /**
   * The Synapse identifier issued to the JsonSchema.
   * @return schemaId
  */
  @ApiModelProperty(value = "The Synapse identifier issued to the JsonSchema.")


  public String getSchemaId() {
    return schemaId;
  }

  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }

  public JsonSchemaInfo schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * The name of the JsonSchema.
   * @return schemaName
  */
  @ApiModelProperty(value = "The name of the JsonSchema.")


  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaInfo jsonSchemaInfo = (JsonSchemaInfo) o;
    return Objects.equals(this.createdBy, jsonSchemaInfo.createdBy) &&
        Objects.equals(this.createdOn, jsonSchemaInfo.createdOn) &&
        Objects.equals(this.organizationId, jsonSchemaInfo.organizationId) &&
        Objects.equals(this.organizationName, jsonSchemaInfo.organizationName) &&
        Objects.equals(this.schemaId, jsonSchemaInfo.schemaId) &&
        Objects.equals(this.schemaName, jsonSchemaInfo.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, organizationId, organizationName, schemaId, schemaName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaInfo {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
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

