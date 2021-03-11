package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ApprovalState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for AccessApproval POJO
 */
@ApiModel(description = "JSON schema for AccessApproval POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessApproval   {
  @JsonProperty("accessorId")
  private String accessorId;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("expiredOn")
  private String expiredOn;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("requirementId")
  private Integer requirementId;

  @JsonProperty("requirementVersion")
  private Integer requirementVersion;

  @JsonProperty("state")
  private ApprovalState state;

  @JsonProperty("submitterId")
  private String submitterId;

  public AccessApproval accessorId(String accessorId) {
    this.accessorId = accessorId;
    return this;
  }

  /**
   * The ID of the principal (user or group) approved for access
   * @return accessorId
  */
  @ApiModelProperty(value = "The ID of the principal (user or group) approved for access")


  public String getAccessorId() {
    return accessorId;
  }

  public void setAccessorId(String accessorId) {
    this.accessorId = accessorId;
  }

  public AccessApproval createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The user that created this object.
   * @return createdBy
  */
  @ApiModelProperty(value = "The user that created this object.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public AccessApproval createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this object was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this object was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public AccessApproval etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time an entity is updated it is used to detect when a client's current representation of an entity is out-of-date. 
   * @return etag
  */
  @ApiModelProperty(value = "Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time an entity is updated it is used to detect when a client's current representation of an entity is out-of-date. ")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public AccessApproval expiredOn(String expiredOn) {
    this.expiredOn = expiredOn;
    return this;
  }

  /**
   * The date this object will be expired.
   * @return expiredOn
  */
  @ApiModelProperty(value = "The date this object will be expired.")


  public String getExpiredOn() {
    return expiredOn;
  }

  public void setExpiredOn(String expiredOn) {
    this.expiredOn = expiredOn;
  }

  public AccessApproval id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * The unique immutable ID
   * @return id
  */
  @ApiModelProperty(value = "The unique immutable ID")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public AccessApproval modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The user that last modified this object.
   * @return modifiedBy
  */
  @ApiModelProperty(value = "The user that last modified this object.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public AccessApproval modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date this object was last modified.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date this object was last modified.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public AccessApproval requirementId(Integer requirementId) {
    this.requirementId = requirementId;
    return this;
  }

  /**
   * The ID of the Access Requirement.
   * @return requirementId
  */
  @ApiModelProperty(value = "The ID of the Access Requirement.")


  public Integer getRequirementId() {
    return requirementId;
  }

  public void setRequirementId(Integer requirementId) {
    this.requirementId = requirementId;
  }

  public AccessApproval requirementVersion(Integer requirementVersion) {
    this.requirementVersion = requirementVersion;
    return this;
  }

  /**
   * The version of the Access Requirement.
   * @return requirementVersion
  */
  @ApiModelProperty(value = "The version of the Access Requirement.")


  public Integer getRequirementVersion() {
    return requirementVersion;
  }

  public void setRequirementVersion(Integer requirementVersion) {
    this.requirementVersion = requirementVersion;
  }

  public AccessApproval state(ApprovalState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")

  @Valid

  public ApprovalState getState() {
    return state;
  }

  public void setState(ApprovalState state) {
    this.state = state;
  }

  public AccessApproval submitterId(String submitterId) {
    this.submitterId = submitterId;
    return this;
  }

  /**
   * The user who performed the necessary action(s) to gain this approval.
   * @return submitterId
  */
  @ApiModelProperty(value = "The user who performed the necessary action(s) to gain this approval.")


  public String getSubmitterId() {
    return submitterId;
  }

  public void setSubmitterId(String submitterId) {
    this.submitterId = submitterId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessApproval accessApproval = (AccessApproval) o;
    return Objects.equals(this.accessorId, accessApproval.accessorId) &&
        Objects.equals(this.createdBy, accessApproval.createdBy) &&
        Objects.equals(this.createdOn, accessApproval.createdOn) &&
        Objects.equals(this.etag, accessApproval.etag) &&
        Objects.equals(this.expiredOn, accessApproval.expiredOn) &&
        Objects.equals(this.id, accessApproval.id) &&
        Objects.equals(this.modifiedBy, accessApproval.modifiedBy) &&
        Objects.equals(this.modifiedOn, accessApproval.modifiedOn) &&
        Objects.equals(this.requirementId, accessApproval.requirementId) &&
        Objects.equals(this.requirementVersion, accessApproval.requirementVersion) &&
        Objects.equals(this.state, accessApproval.state) &&
        Objects.equals(this.submitterId, accessApproval.submitterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessorId, createdBy, createdOn, etag, expiredOn, id, modifiedBy, modifiedOn, requirementId, requirementVersion, state, submitterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessApproval {\n");
    
    sb.append("    accessorId: ").append(toIndentedString(accessorId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    expiredOn: ").append(toIndentedString(expiredOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    requirementId: ").append(toIndentedString(requirementId)).append("\n");
    sb.append("    requirementVersion: ").append(toIndentedString(requirementVersion)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    submitterId: ").append(toIndentedString(submitterId)).append("\n");
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

