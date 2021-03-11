package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for EntityHeader POJO
 */
@ApiModel(description = "JSON schema for EntityHeader POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EntityHeader   {
  @JsonProperty("benefactorId")
  private BigDecimal benefactorId;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("id")
  private String id;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private String type;

  @JsonProperty("versionLabel")
  private String versionLabel;

  @JsonProperty("versionNumber")
  private BigDecimal versionNumber;

  public EntityHeader benefactorId(BigDecimal benefactorId) {
    this.benefactorId = benefactorId;
    return this;
  }

  /**
   * The ID of the entity that this Entity's ACL is inherited from.' 
   * @return benefactorId
  */
  @ApiModelProperty(value = "The ID of the entity that this Entity's ACL is inherited from.' ")

  @Valid

  public BigDecimal getBenefactorId() {
    return benefactorId;
  }

  public void setBenefactorId(BigDecimal benefactorId) {
    this.benefactorId = benefactorId;
  }

  public EntityHeader createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that created this entity.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that created this entity.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public EntityHeader createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this entity was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this entity was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public EntityHeader id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the entity
   * @return id
  */
  @ApiModelProperty(value = "The id of the entity")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EntityHeader modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The ID of the user that last modified this entity.
   * @return modifiedBy
  */
  @ApiModelProperty(value = "The ID of the user that last modified this entity.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public EntityHeader modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date this entity was last modified.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date this entity was last modified.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public EntityHeader name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the entity
   * @return name
  */
  @ApiModelProperty(value = "The name of the entity")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EntityHeader type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the entity
   * @return type
  */
  @ApiModelProperty(value = "The type of the entity")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public EntityHeader versionLabel(String versionLabel) {
    this.versionLabel = versionLabel;
    return this;
  }

  /**
   * The user defined version label of the entity
   * @return versionLabel
  */
  @ApiModelProperty(value = "The user defined version label of the entity")


  public String getVersionLabel() {
    return versionLabel;
  }

  public void setVersionLabel(String versionLabel) {
    this.versionLabel = versionLabel;
  }

  public EntityHeader versionNumber(BigDecimal versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * The version number of the entity
   * @return versionNumber
  */
  @ApiModelProperty(value = "The version number of the entity")

  @Valid

  public BigDecimal getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(BigDecimal versionNumber) {
    this.versionNumber = versionNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityHeader entityHeader = (EntityHeader) o;
    return Objects.equals(this.benefactorId, entityHeader.benefactorId) &&
        Objects.equals(this.createdBy, entityHeader.createdBy) &&
        Objects.equals(this.createdOn, entityHeader.createdOn) &&
        Objects.equals(this.id, entityHeader.id) &&
        Objects.equals(this.modifiedBy, entityHeader.modifiedBy) &&
        Objects.equals(this.modifiedOn, entityHeader.modifiedOn) &&
        Objects.equals(this.name, entityHeader.name) &&
        Objects.equals(this.type, entityHeader.type) &&
        Objects.equals(this.versionLabel, entityHeader.versionLabel) &&
        Objects.equals(this.versionNumber, entityHeader.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefactorId, createdBy, createdOn, id, modifiedBy, modifiedOn, name, type, versionLabel, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityHeader {\n");
    
    sb.append("    benefactorId: ").append(toIndentedString(benefactorId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    versionLabel: ").append(toIndentedString(versionLabel)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

