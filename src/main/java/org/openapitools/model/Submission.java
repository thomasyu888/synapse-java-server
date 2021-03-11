package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AccessorChange;
import org.openapitools.model.ResearchProject;
import org.openapitools.model.RestrictableObjectType;
import org.openapitools.model.SubmissionState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A submission to request access to controlled data.
 */
@ApiModel(description = "A submission to request access to controlled data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Submission   {
  @JsonProperty("accessRequirementId")
  private String accessRequirementId;

  @JsonProperty("accessRequirementVersion")
  private Integer accessRequirementVersion;

  @JsonProperty("accessorChanges")
  @Valid
  private List<AccessorChange> accessorChanges = null;

  @JsonProperty("attachments")
  @Valid
  private List<String> attachments = null;

  @JsonProperty("ducFileHandleId")
  private String ducFileHandleId;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("irbFileHandleId")
  private String irbFileHandleId;

  @JsonProperty("isRenewalSubmission")
  private Boolean isRenewalSubmission;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("publication")
  private String publication;

  @JsonProperty("rejectedReason")
  private String rejectedReason;

  @JsonProperty("requestId")
  private String requestId;

  @JsonProperty("researchProjectSnapshot")
  private ResearchProject researchProjectSnapshot;

  @JsonProperty("state")
  private SubmissionState state;

  @JsonProperty("subjectId")
  private String subjectId;

  @JsonProperty("subjectType")
  private RestrictableObjectType subjectType;

  @JsonProperty("submittedBy")
  private String submittedBy;

  @JsonProperty("submittedOn")
  private String submittedOn;

  @JsonProperty("summaryOfUse")
  private String summaryOfUse;

  public Submission accessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
    return this;
  }

  /**
   * The ID of the Access Requirement which requires a request to be submitted to gain access to a dataset. This submission contains information that satisfies those requirements.
   * @return accessRequirementId
  */
  @ApiModelProperty(value = "The ID of the Access Requirement which requires a request to be submitted to gain access to a dataset. This submission contains information that satisfies those requirements.")


  public String getAccessRequirementId() {
    return accessRequirementId;
  }

  public void setAccessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
  }

  public Submission accessRequirementVersion(Integer accessRequirementVersion) {
    this.accessRequirementVersion = accessRequirementVersion;
    return this;
  }

  /**
   * The version of the Access Requirement which requires a request to be submitted to gain access to a dataset. This submission contains information that satisfies those requirements.
   * @return accessRequirementVersion
  */
  @ApiModelProperty(value = "The version of the Access Requirement which requires a request to be submitted to gain access to a dataset. This submission contains information that satisfies those requirements.")


  public Integer getAccessRequirementVersion() {
    return accessRequirementVersion;
  }

  public void setAccessRequirementVersion(Integer accessRequirementVersion) {
    this.accessRequirementVersion = accessRequirementVersion;
  }

  public Submission accessorChanges(List<AccessorChange> accessorChanges) {
    this.accessorChanges = accessorChanges;
    return this;
  }

  public Submission addAccessorChangesItem(AccessorChange accessorChangesItem) {
    if (this.accessorChanges == null) {
      this.accessorChanges = new ArrayList<>();
    }
    this.accessorChanges.add(accessorChangesItem);
    return this;
  }

  /**
   * List of user changes. A user can gain access, renew access or have access revoked.
   * @return accessorChanges
  */
  @ApiModelProperty(value = "List of user changes. A user can gain access, renew access or have access revoked.")

  @Valid

  public List<AccessorChange> getAccessorChanges() {
    return accessorChanges;
  }

  public void setAccessorChanges(List<AccessorChange> accessorChanges) {
    this.accessorChanges = accessorChanges;
  }

  public Submission attachments(List<String> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Submission addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * The set of file handle ID of attached files to this request.
   * @return attachments
  */
  @ApiModelProperty(value = "The set of file handle ID of attached files to this request.")


  public List<String> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }

  public Submission ducFileHandleId(String ducFileHandleId) {
    this.ducFileHandleId = ducFileHandleId;
    return this;
  }

  /**
   * The Data Use Certificate uploaded by user.
   * @return ducFileHandleId
  */
  @ApiModelProperty(value = "The Data Use Certificate uploaded by user.")


  public String getDucFileHandleId() {
    return ducFileHandleId;
  }

  public void setDucFileHandleId(String ducFileHandleId) {
    this.ducFileHandleId = ducFileHandleId;
  }

  public Submission etag(String etag) {
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

  public Submission id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique immutable ID for this submission. A new ID will be generated for new Submission. Once issued, this ID is guaranteed to never change or be re-issued.
   * @return id
  */
  @ApiModelProperty(value = "The unique immutable ID for this submission. A new ID will be generated for new Submission. Once issued, this ID is guaranteed to never change or be re-issued.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Submission irbFileHandleId(String irbFileHandleId) {
    this.irbFileHandleId = irbFileHandleId;
    return this;
  }

  /**
   * The Institutional Review Board Approval document uploaded by user.
   * @return irbFileHandleId
  */
  @ApiModelProperty(value = "The Institutional Review Board Approval document uploaded by user.")


  public String getIrbFileHandleId() {
    return irbFileHandleId;
  }

  public void setIrbFileHandleId(String irbFileHandleId) {
    this.irbFileHandleId = irbFileHandleId;
  }

  public Submission isRenewalSubmission(Boolean isRenewalSubmission) {
    this.isRenewalSubmission = isRenewalSubmission;
    return this;
  }

  /**
   * True if this submission is a renewal submission.
   * @return isRenewalSubmission
  */
  @ApiModelProperty(value = "True if this submission is a renewal submission.")


  public Boolean getIsRenewalSubmission() {
    return isRenewalSubmission;
  }

  public void setIsRenewalSubmission(Boolean isRenewalSubmission) {
    this.isRenewalSubmission = isRenewalSubmission;
  }

  public Submission modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The ID of the user that last modified the status of this submission.
   * @return modifiedBy
  */
  @ApiModelProperty(value = "The ID of the user that last modified the status of this submission.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Submission modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date this submission was reviewed or was cancelled.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date this submission was reviewed or was cancelled.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public Submission publication(String publication) {
    this.publication = publication;
    return this;
  }

  /**
   * Link(s) to publication that used the controlled data.
   * @return publication
  */
  @ApiModelProperty(value = "Link(s) to publication that used the controlled data.")


  public String getPublication() {
    return publication;
  }

  public void setPublication(String publication) {
    this.publication = publication;
  }

  public Submission rejectedReason(String rejectedReason) {
    this.rejectedReason = rejectedReason;
    return this;
  }

  /**
   * The reason this submission is rejected, if it's rejected. 
   * @return rejectedReason
  */
  @ApiModelProperty(value = "The reason this submission is rejected, if it's rejected. ")


  public String getRejectedReason() {
    return rejectedReason;
  }

  public void setRejectedReason(String rejectedReason) {
    this.rejectedReason = rejectedReason;
  }

  public Submission requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * The ID of the Request which is used to create this submission.
   * @return requestId
  */
  @ApiModelProperty(value = "The ID of the Request which is used to create this submission.")


  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public Submission researchProjectSnapshot(ResearchProject researchProjectSnapshot) {
    this.researchProjectSnapshot = researchProjectSnapshot;
    return this;
  }

  /**
   * Get researchProjectSnapshot
   * @return researchProjectSnapshot
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResearchProject getResearchProjectSnapshot() {
    return researchProjectSnapshot;
  }

  public void setResearchProjectSnapshot(ResearchProject researchProjectSnapshot) {
    this.researchProjectSnapshot = researchProjectSnapshot;
  }

  public Submission state(SubmissionState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubmissionState getState() {
    return state;
  }

  public void setState(SubmissionState state) {
    this.state = state;
  }

  public Submission subjectId(String subjectId) {
    this.subjectId = subjectId;
    return this;
  }

  /**
   * The ID of the subject user interested in. This information will be used to help user navigate back to where they were to continue their work.
   * @return subjectId
  */
  @ApiModelProperty(value = "The ID of the subject user interested in. This information will be used to help user navigate back to where they were to continue their work.")


  public String getSubjectId() {
    return subjectId;
  }

  public void setSubjectId(String subjectId) {
    this.subjectId = subjectId;
  }

  public Submission subjectType(RestrictableObjectType subjectType) {
    this.subjectType = subjectType;
    return this;
  }

  /**
   * Get subjectType
   * @return subjectType
  */
  @ApiModelProperty(value = "")

  @Valid

  public RestrictableObjectType getSubjectType() {
    return subjectType;
  }

  public void setSubjectType(RestrictableObjectType subjectType) {
    this.subjectType = subjectType;
  }

  public Submission submittedBy(String submittedBy) {
    this.submittedBy = submittedBy;
    return this;
  }

  /**
   * The ID of the user that submit this submission.
   * @return submittedBy
  */
  @ApiModelProperty(value = "The ID of the user that submit this submission.")


  public String getSubmittedBy() {
    return submittedBy;
  }

  public void setSubmittedBy(String submittedBy) {
    this.submittedBy = submittedBy;
  }

  public Submission submittedOn(String submittedOn) {
    this.submittedOn = submittedOn;
    return this;
  }

  /**
   * The date this submission was created.
   * @return submittedOn
  */
  @ApiModelProperty(value = "The date this submission was created.")


  public String getSubmittedOn() {
    return submittedOn;
  }

  public void setSubmittedOn(String submittedOn) {
    this.submittedOn = submittedOn;
  }

  public Submission summaryOfUse(String summaryOfUse) {
    this.summaryOfUse = summaryOfUse;
    return this;
  }

  /**
   * Summary of how the data has been used.
   * @return summaryOfUse
  */
  @ApiModelProperty(value = "Summary of how the data has been used.")


  public String getSummaryOfUse() {
    return summaryOfUse;
  }

  public void setSummaryOfUse(String summaryOfUse) {
    this.summaryOfUse = summaryOfUse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Submission submission = (Submission) o;
    return Objects.equals(this.accessRequirementId, submission.accessRequirementId) &&
        Objects.equals(this.accessRequirementVersion, submission.accessRequirementVersion) &&
        Objects.equals(this.accessorChanges, submission.accessorChanges) &&
        Objects.equals(this.attachments, submission.attachments) &&
        Objects.equals(this.ducFileHandleId, submission.ducFileHandleId) &&
        Objects.equals(this.etag, submission.etag) &&
        Objects.equals(this.id, submission.id) &&
        Objects.equals(this.irbFileHandleId, submission.irbFileHandleId) &&
        Objects.equals(this.isRenewalSubmission, submission.isRenewalSubmission) &&
        Objects.equals(this.modifiedBy, submission.modifiedBy) &&
        Objects.equals(this.modifiedOn, submission.modifiedOn) &&
        Objects.equals(this.publication, submission.publication) &&
        Objects.equals(this.rejectedReason, submission.rejectedReason) &&
        Objects.equals(this.requestId, submission.requestId) &&
        Objects.equals(this.researchProjectSnapshot, submission.researchProjectSnapshot) &&
        Objects.equals(this.state, submission.state) &&
        Objects.equals(this.subjectId, submission.subjectId) &&
        Objects.equals(this.subjectType, submission.subjectType) &&
        Objects.equals(this.submittedBy, submission.submittedBy) &&
        Objects.equals(this.submittedOn, submission.submittedOn) &&
        Objects.equals(this.summaryOfUse, submission.summaryOfUse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementId, accessRequirementVersion, accessorChanges, attachments, ducFileHandleId, etag, id, irbFileHandleId, isRenewalSubmission, modifiedBy, modifiedOn, publication, rejectedReason, requestId, researchProjectSnapshot, state, subjectId, subjectType, submittedBy, submittedOn, summaryOfUse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Submission {\n");
    
    sb.append("    accessRequirementId: ").append(toIndentedString(accessRequirementId)).append("\n");
    sb.append("    accessRequirementVersion: ").append(toIndentedString(accessRequirementVersion)).append("\n");
    sb.append("    accessorChanges: ").append(toIndentedString(accessorChanges)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    ducFileHandleId: ").append(toIndentedString(ducFileHandleId)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    irbFileHandleId: ").append(toIndentedString(irbFileHandleId)).append("\n");
    sb.append("    isRenewalSubmission: ").append(toIndentedString(isRenewalSubmission)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    publication: ").append(toIndentedString(publication)).append("\n");
    sb.append("    rejectedReason: ").append(toIndentedString(rejectedReason)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    researchProjectSnapshot: ").append(toIndentedString(researchProjectSnapshot)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
    sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
    sb.append("    submittedBy: ").append(toIndentedString(submittedBy)).append("\n");
    sb.append("    submittedOn: ").append(toIndentedString(submittedOn)).append("\n");
    sb.append("    summaryOfUse: ").append(toIndentedString(summaryOfUse)).append("\n");
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

