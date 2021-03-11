package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EvaluationStatus;
import org.openapitools.model.SubmissionQuota;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An Evaluation is the core object of the Evaluation API, used to support collaborative data analysis challenges in Synapse.
 */
@ApiModel(description = "An Evaluation is the core object of the Evaluation API, used to support collaborative data analysis challenges in Synapse.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Evaluation   {
  @JsonProperty("contentSource")
  private String contentSource;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("description")
  private String description;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("ownerId")
  private String ownerId;

  @JsonProperty("quota")
  private SubmissionQuota quota;

  @JsonProperty("status")
  private EvaluationStatus status;

  @JsonProperty("submissionInstructionsMessage")
  private String submissionInstructionsMessage;

  @JsonProperty("submissionReceiptMessage")
  private String submissionReceiptMessage;

  public Evaluation contentSource(String contentSource) {
    this.contentSource = contentSource;
    return this;
  }

  /**
   * The Synapse ID of the Entity to which this Evaluation belongs, e.g. a reference to a Synapse project.
   * @return contentSource
  */
  @ApiModelProperty(value = "The Synapse ID of the Entity to which this Evaluation belongs, e.g. a reference to a Synapse project.")


  public String getContentSource() {
    return contentSource;
  }

  public void setContentSource(String contentSource) {
    this.contentSource = contentSource;
  }

  public Evaluation createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date on which Evaluation was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date on which Evaluation was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public Evaluation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A text description of this Evaluation.
   * @return description
  */
  @ApiModelProperty(value = "A text description of this Evaluation.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Evaluation etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. The eTag changes every time an Evaluation is updated; it is used to detect when a client's copy of an Evaluation is out-of-date. 
   * @return etag
  */
  @ApiModelProperty(value = "Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. The eTag changes every time an Evaluation is updated; it is used to detect when a client's copy of an Evaluation is out-of-date. ")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Evaluation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique immutable ID for this Evaluation.
   * @return id
  */
  @ApiModelProperty(value = "The unique immutable ID for this Evaluation.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Evaluation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this Evaluation
   * @return name
  */
  @ApiModelProperty(value = "The name of this Evaluation")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Evaluation ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * The ID of the Synapse user who created this Evaluation.
   * @return ownerId
  */
  @ApiModelProperty(value = "The ID of the Synapse user who created this Evaluation.")


  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public Evaluation quota(SubmissionQuota quota) {
    this.quota = quota;
    return this;
  }

  /**
   * Get quota
   * @return quota
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubmissionQuota getQuota() {
    return quota;
  }

  public void setQuota(SubmissionQuota quota) {
    this.quota = quota;
  }

  public Evaluation status(EvaluationStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluationStatus getStatus() {
    return status;
  }

  public void setStatus(EvaluationStatus status) {
    this.status = status;
  }

  public Evaluation submissionInstructionsMessage(String submissionInstructionsMessage) {
    this.submissionInstructionsMessage = submissionInstructionsMessage;
    return this;
  }

  /**
   * Message to display to users detailing acceptable formatting for Submissions to this Evaluation.
   * @return submissionInstructionsMessage
  */
  @ApiModelProperty(value = "Message to display to users detailing acceptable formatting for Submissions to this Evaluation.")


  public String getSubmissionInstructionsMessage() {
    return submissionInstructionsMessage;
  }

  public void setSubmissionInstructionsMessage(String submissionInstructionsMessage) {
    this.submissionInstructionsMessage = submissionInstructionsMessage;
  }

  public Evaluation submissionReceiptMessage(String submissionReceiptMessage) {
    this.submissionReceiptMessage = submissionReceiptMessage;
    return this;
  }

  /**
   * Message to display to users upon successful submission to this Evaluation.
   * @return submissionReceiptMessage
  */
  @ApiModelProperty(value = "Message to display to users upon successful submission to this Evaluation.")


  public String getSubmissionReceiptMessage() {
    return submissionReceiptMessage;
  }

  public void setSubmissionReceiptMessage(String submissionReceiptMessage) {
    this.submissionReceiptMessage = submissionReceiptMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evaluation evaluation = (Evaluation) o;
    return Objects.equals(this.contentSource, evaluation.contentSource) &&
        Objects.equals(this.createdOn, evaluation.createdOn) &&
        Objects.equals(this.description, evaluation.description) &&
        Objects.equals(this.etag, evaluation.etag) &&
        Objects.equals(this.id, evaluation.id) &&
        Objects.equals(this.name, evaluation.name) &&
        Objects.equals(this.ownerId, evaluation.ownerId) &&
        Objects.equals(this.quota, evaluation.quota) &&
        Objects.equals(this.status, evaluation.status) &&
        Objects.equals(this.submissionInstructionsMessage, evaluation.submissionInstructionsMessage) &&
        Objects.equals(this.submissionReceiptMessage, evaluation.submissionReceiptMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentSource, createdOn, description, etag, id, name, ownerId, quota, status, submissionInstructionsMessage, submissionReceiptMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evaluation {\n");
    
    sb.append("    contentSource: ").append(toIndentedString(contentSource)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    quota: ").append(toIndentedString(quota)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    submissionInstructionsMessage: ").append(toIndentedString(submissionInstructionsMessage)).append("\n");
    sb.append("    submissionReceiptMessage: ").append(toIndentedString(submissionReceiptMessage)).append("\n");
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

