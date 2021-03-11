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
 * Information about a single version of a JSON schema.
 */
@ApiModel(description = "Information about a single version of a JSON schema.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class JsonSchemaVersionInfo   {
  @JsonProperty("$id")
  private String $id;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("jsonSHA256Hex")
  private String jsonSHA256Hex;

  @JsonProperty("organizationId")
  private String organizationId;

  @JsonProperty("organizationName")
  private String organizationName;

  @JsonProperty("schemaId")
  private String schemaId;

  @JsonProperty("schemaName")
  private String schemaName;

  @JsonProperty("semanticVersion")
  private String semanticVersion;

  @JsonProperty("versionId")
  private String versionId;

  public JsonSchemaVersionInfo $id(String $id) {
    this.$id = $id;
    return this;
  }

  /**
   * The full '$id' of this schema version 
   * @return $id
  */
  @ApiModelProperty(value = "The full '$id' of this schema version ")


  public String get$Id() {
    return $id;
  }

  public void set$Id(String $id) {
    this.$id = $id;
  }

  public JsonSchemaVersionInfo createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that created this JSON schema version.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that created this JSON schema version.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public JsonSchemaVersionInfo createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this JSON schema version was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this JSON schema version was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public JsonSchemaVersionInfo jsonSHA256Hex(String jsonSHA256Hex) {
    this.jsonSHA256Hex = jsonSHA256Hex;
    return this;
  }

  /**
   * The SHA-256 hexadecimal hash of the UTF-8 encoded JSON schema.
   * @return jsonSHA256Hex
  */
  @ApiModelProperty(value = "The SHA-256 hexadecimal hash of the UTF-8 encoded JSON schema.")


  public String getJsonSHA256Hex() {
    return jsonSHA256Hex;
  }

  public void setJsonSHA256Hex(String jsonSHA256Hex) {
    this.jsonSHA256Hex = jsonSHA256Hex;
  }

  public JsonSchemaVersionInfo organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * The Synapse issued numeric identifier for the organization.
   * @return organizationId
  */
  @ApiModelProperty(value = "The Synapse issued numeric identifier for the organization.")


  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public JsonSchemaVersionInfo organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  /**
   * The name of the organization to which this schema belongs.
   * @return organizationName
  */
  @ApiModelProperty(value = "The name of the organization to which this schema belongs.")


  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public JsonSchemaVersionInfo schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

  /**
   * The Synapse issued numeric identifier for the schema.
   * @return schemaId
  */
  @ApiModelProperty(value = "The Synapse issued numeric identifier for the schema.")


  public String getSchemaId() {
    return schemaId;
  }

  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }

  public JsonSchemaVersionInfo schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * The name of the this schema.
   * @return schemaName
  */
  @ApiModelProperty(value = "The name of the this schema.")


  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }

  public JsonSchemaVersionInfo semanticVersion(String semanticVersion) {
    this.semanticVersion = semanticVersion;
    return this;
  }

  /**
   * The semantic version label provided when this version was created. Can be null if a semantic version was not provided when this version was created. 
   * @return semanticVersion
  */
  @ApiModelProperty(value = "The semantic version label provided when this version was created. Can be null if a semantic version was not provided when this version was created. ")


  public String getSemanticVersion() {
    return semanticVersion;
  }

  public void setSemanticVersion(String semanticVersion) {
    this.semanticVersion = semanticVersion;
  }

  public JsonSchemaVersionInfo versionId(String versionId) {
    this.versionId = versionId;
    return this;
  }

  /**
   * The Synapse issued numeric identifier for this version.
   * @return versionId
  */
  @ApiModelProperty(value = "The Synapse issued numeric identifier for this version.")


  public String getVersionId() {
    return versionId;
  }

  public void setVersionId(String versionId) {
    this.versionId = versionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JsonSchemaVersionInfo jsonSchemaVersionInfo = (JsonSchemaVersionInfo) o;
    return Objects.equals(this.$id, jsonSchemaVersionInfo.$id) &&
        Objects.equals(this.createdBy, jsonSchemaVersionInfo.createdBy) &&
        Objects.equals(this.createdOn, jsonSchemaVersionInfo.createdOn) &&
        Objects.equals(this.jsonSHA256Hex, jsonSchemaVersionInfo.jsonSHA256Hex) &&
        Objects.equals(this.organizationId, jsonSchemaVersionInfo.organizationId) &&
        Objects.equals(this.organizationName, jsonSchemaVersionInfo.organizationName) &&
        Objects.equals(this.schemaId, jsonSchemaVersionInfo.schemaId) &&
        Objects.equals(this.schemaName, jsonSchemaVersionInfo.schemaName) &&
        Objects.equals(this.semanticVersion, jsonSchemaVersionInfo.semanticVersion) &&
        Objects.equals(this.versionId, jsonSchemaVersionInfo.versionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash($id, createdBy, createdOn, jsonSHA256Hex, organizationId, organizationName, schemaId, schemaName, semanticVersion, versionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JsonSchemaVersionInfo {\n");
    
    sb.append("    $id: ").append(toIndentedString($id)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    jsonSHA256Hex: ").append(toIndentedString(jsonSHA256Hex)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
    sb.append("    semanticVersion: ").append(toIndentedString(semanticVersion)).append("\n");
    sb.append("    versionId: ").append(toIndentedString(versionId)).append("\n");
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

