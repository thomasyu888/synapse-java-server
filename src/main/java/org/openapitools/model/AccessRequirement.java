package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ACCESSTYPE;
import org.openapitools.model.RestrictableObjectDescriptor;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Interface for JSON schema for AccessRequirement. The Access Requirement mechanism is distinct from the access control list in that it is controlled not by the entity owner but by a separate authority: Access Requirements are created and maintained by the Synapse Access and Compliance Team (ACT). ACTAccessRequirements can only be approved by the ACT. Self-sign Access Requirements can be approved by the user desiring access, but said user first has to meet &#39;terms of use&#39; associated with the requirement. 
 */
@ApiModel(description = "Interface for JSON schema for AccessRequirement. The Access Requirement mechanism is distinct from the access control list in that it is controlled not by the entity owner but by a separate authority: Access Requirements are created and maintained by the Synapse Access and Compliance Team (ACT). ACTAccessRequirements can only be approved by the ACT. Self-sign Access Requirements can be approved by the user desiring access, but said user first has to meet 'terms of use' associated with the requirement. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessRequirement   {
  @JsonProperty("accessType")
  private ACCESSTYPE accessType;

  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("description")
  private String description;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private BigDecimal id;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("subjectIds")
  @Valid
  private List<RestrictableObjectDescriptor> subjectIds = null;

  @JsonProperty("versionNumber")
  private Integer versionNumber;

  public AccessRequirement accessType(ACCESSTYPE accessType) {
    this.accessType = accessType;
    return this;
  }

  /**
   * Get accessType
   * @return accessType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ACCESSTYPE getAccessType() {
    return accessType;
  }

  public void setAccessType(ACCESSTYPE accessType) {
    this.accessType = accessType;
  }

  public AccessRequirement concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * Indicates which type of AccessRequirement this object represents. Provided by the system, the user may not set this field.
   * @return concreteType
  */
  @ApiModelProperty(value = "Indicates which type of AccessRequirement this object represents. Provided by the system, the user may not set this field.")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public AccessRequirement createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The user that created this object. Provided by the system, the user may not set this field.
   * @return createdBy
  */
  @ApiModelProperty(value = "The user that created this object. Provided by the system, the user may not set this field.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public AccessRequirement createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this object was created. Provided by the system, the user may not set this field.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this object was created. Provided by the system, the user may not set this field.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public AccessRequirement description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Short optional description for the AR. Limited to 50 characters.
   * @return description
  */
  @ApiModelProperty(value = "Short optional description for the AR. Limited to 50 characters.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AccessRequirement etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time an entity is updated it is used to detect when a client's current representation of an object is out-of-date. 
   * @return etag
  */
  @ApiModelProperty(value = "Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time an entity is updated it is used to detect when a client's current representation of an object is out-of-date. ")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public AccessRequirement id(BigDecimal id) {
    this.id = id;
    return this;
  }

  /**
   * The unique immutable ID. Provided by the system, the user may not set this field.
   * @return id
  */
  @ApiModelProperty(value = "The unique immutable ID. Provided by the system, the user may not set this field.")

  @Valid

  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public AccessRequirement modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The user that last modified this object. Provided by the system, the user may not set this field.
   * @return modifiedBy
  */
  @ApiModelProperty(value = "The user that last modified this object. Provided by the system, the user may not set this field.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public AccessRequirement modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date this object was last modified. Provided by the system, the user may not set this field.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date this object was last modified. Provided by the system, the user may not set this field.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public AccessRequirement subjectIds(List<RestrictableObjectDescriptor> subjectIds) {
    this.subjectIds = subjectIds;
    return this;
  }

  public AccessRequirement addSubjectIdsItem(RestrictableObjectDescriptor subjectIdsItem) {
    if (this.subjectIds == null) {
      this.subjectIds = new ArrayList<>();
    }
    this.subjectIds.add(subjectIdsItem);
    return this;
  }

  /**
   * The IDs of the items controlled by this Access Requirement. Required when creating or updating.
   * @return subjectIds
  */
  @ApiModelProperty(value = "The IDs of the items controlled by this Access Requirement. Required when creating or updating.")

  @Valid

  public List<RestrictableObjectDescriptor> getSubjectIds() {
    return subjectIds;
  }

  public void setSubjectIds(List<RestrictableObjectDescriptor> subjectIds) {
    this.subjectIds = subjectIds;
  }

  public AccessRequirement versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * The version number issued to this version on the object.
   * @return versionNumber
  */
  @ApiModelProperty(value = "The version number issued to this version on the object.")


  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
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
    AccessRequirement accessRequirement = (AccessRequirement) o;
    return Objects.equals(this.accessType, accessRequirement.accessType) &&
        Objects.equals(this.concreteType, accessRequirement.concreteType) &&
        Objects.equals(this.createdBy, accessRequirement.createdBy) &&
        Objects.equals(this.createdOn, accessRequirement.createdOn) &&
        Objects.equals(this.description, accessRequirement.description) &&
        Objects.equals(this.etag, accessRequirement.etag) &&
        Objects.equals(this.id, accessRequirement.id) &&
        Objects.equals(this.modifiedBy, accessRequirement.modifiedBy) &&
        Objects.equals(this.modifiedOn, accessRequirement.modifiedOn) &&
        Objects.equals(this.subjectIds, accessRequirement.subjectIds) &&
        Objects.equals(this.versionNumber, accessRequirement.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, concreteType, createdBy, createdOn, description, etag, id, modifiedBy, modifiedOn, subjectIds, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRequirement {\n");
    
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    subjectIds: ").append(toIndentedString(subjectIds)).append("\n");
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

