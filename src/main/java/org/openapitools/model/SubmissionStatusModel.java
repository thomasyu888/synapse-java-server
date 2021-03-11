package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.AnnotationsAnnotation;
import org.openapitools.model.AnnotationsV2;
import org.openapitools.model.SubmissionStatusEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A SubmissionStatus is a secondary, mutable object associated with a Submission. This object should be used to contain scoring data about the Submission. 
 */
@ApiModel(description = "A SubmissionStatus is a secondary, mutable object associated with a Submission. This object should be used to contain scoring data about the Submission. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionStatusModel   {
  @JsonProperty("annotations")
  private AnnotationsAnnotation annotations;

  @JsonProperty("canCancel")
  private Boolean canCancel;

  @JsonProperty("cancelRequested")
  private Boolean cancelRequested;

  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("status")
  private SubmissionStatusEnum status;

  @JsonProperty("statusVersion")
  private BigDecimal statusVersion;

  @JsonProperty("submissionAnnotations")
  private AnnotationsV2 submissionAnnotations;

  @JsonProperty("versionNumber")
  private Integer versionNumber;

  public SubmissionStatusModel annotations(AnnotationsAnnotation annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Get annotations
   * @return annotations
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnnotationsAnnotation getAnnotations() {
    return annotations;
  }

  public void setAnnotations(AnnotationsAnnotation annotations) {
    this.annotations = annotations;
  }

  public SubmissionStatusModel canCancel(Boolean canCancel) {
    this.canCancel = canCancel;
    return this;
  }

  /**
   * Can this submission be cancelled? By default, this will be set to False. Users can read this value. Only the queue's scoring application can change this value. 
   * @return canCancel
  */
  @ApiModelProperty(value = "Can this submission be cancelled? By default, this will be set to False. Users can read this value. Only the queue's scoring application can change this value. ")


  public Boolean getCanCancel() {
    return canCancel;
  }

  public void setCanCancel(Boolean canCancel) {
    this.canCancel = canCancel;
  }

  public SubmissionStatusModel cancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
    return this;
  }

  /**
   * Has user requested to cancel this submission? By default, this will be set to False. Submission owner can read and request to change this value.
   * @return cancelRequested
  */
  @ApiModelProperty(value = "Has user requested to cancel this submission? By default, this will be set to False. Submission owner can read and request to change this value.")


  public Boolean getCancelRequested() {
    return cancelRequested;
  }

  public void setCancelRequested(Boolean cancelRequested) {
    this.cancelRequested = cancelRequested;
  }

  public SubmissionStatusModel entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The Synapse ID of the Entity in this Submission.
   * @return entityId
  */
  @ApiModelProperty(value = "The Synapse ID of the Entity in this Submission.")


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public SubmissionStatusModel etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. The eTag changes every time an SubmissionStatus is updated; it is used to detect when a client's copy of an SubmissionStatus is out-of-date. 
   * @return etag
  */
  @ApiModelProperty(value = "Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. The eTag changes every time an SubmissionStatus is updated; it is used to detect when a client's copy of an SubmissionStatus is out-of-date. ")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public SubmissionStatusModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique, immutable Synapse ID of the Submission.
   * @return id
  */
  @ApiModelProperty(value = "The unique, immutable Synapse ID of the Submission.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubmissionStatusModel modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date on which this SubmissionStatus was last modified.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date on which this SubmissionStatus was last modified.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public SubmissionStatusModel status(SubmissionStatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubmissionStatusEnum getStatus() {
    return status;
  }

  public void setStatus(SubmissionStatusEnum status) {
    this.status = status;
  }

  public SubmissionStatusModel statusVersion(BigDecimal statusVersion) {
    this.statusVersion = statusVersion;
    return this;
  }

  /**
   * A version of the status, auto-generated and auto-incremented by the system and read-only to the client.
   * @return statusVersion
  */
  @ApiModelProperty(value = "A version of the status, auto-generated and auto-incremented by the system and read-only to the client.")

  @Valid

  public BigDecimal getStatusVersion() {
    return statusVersion;
  }

  public void setStatusVersion(BigDecimal statusVersion) {
    this.statusVersion = statusVersion;
  }

  public SubmissionStatusModel submissionAnnotations(AnnotationsV2 submissionAnnotations) {
    this.submissionAnnotations = submissionAnnotations;
    return this;
  }

  /**
   * Get submissionAnnotations
   * @return submissionAnnotations
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnnotationsV2 getSubmissionAnnotations() {
    return submissionAnnotations;
  }

  public void setSubmissionAnnotations(AnnotationsV2 submissionAnnotations) {
    this.submissionAnnotations = submissionAnnotations;
  }

  public SubmissionStatusModel versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * The version number of the Entity in this Submission.
   * @return versionNumber
  */
  @ApiModelProperty(value = "The version number of the Entity in this Submission.")


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
    SubmissionStatusModel submissionStatusModel = (SubmissionStatusModel) o;
    return Objects.equals(this.annotations, submissionStatusModel.annotations) &&
        Objects.equals(this.canCancel, submissionStatusModel.canCancel) &&
        Objects.equals(this.cancelRequested, submissionStatusModel.cancelRequested) &&
        Objects.equals(this.entityId, submissionStatusModel.entityId) &&
        Objects.equals(this.etag, submissionStatusModel.etag) &&
        Objects.equals(this.id, submissionStatusModel.id) &&
        Objects.equals(this.modifiedOn, submissionStatusModel.modifiedOn) &&
        Objects.equals(this.status, submissionStatusModel.status) &&
        Objects.equals(this.statusVersion, submissionStatusModel.statusVersion) &&
        Objects.equals(this.submissionAnnotations, submissionStatusModel.submissionAnnotations) &&
        Objects.equals(this.versionNumber, submissionStatusModel.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, canCancel, cancelRequested, entityId, etag, id, modifiedOn, status, statusVersion, submissionAnnotations, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionStatusModel {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    canCancel: ").append(toIndentedString(canCancel)).append("\n");
    sb.append("    cancelRequested: ").append(toIndentedString(cancelRequested)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusVersion: ").append(toIndentedString(statusVersion)).append("\n");
    sb.append("    submissionAnnotations: ").append(toIndentedString(submissionAnnotations)).append("\n");
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

