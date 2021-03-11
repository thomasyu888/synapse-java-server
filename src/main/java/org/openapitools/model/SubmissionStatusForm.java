package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.StateEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The status of a a submitted FormData object.
 */
@ApiModel(description = "The status of a a submitted FormData object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionStatusForm   {
  @JsonProperty("rejectionMessage")
  private String rejectionMessage;

  @JsonProperty("reviewedBy")
  private String reviewedBy;

  @JsonProperty("reviewedOn")
  private String reviewedOn;

  @JsonProperty("state")
  private StateEnum state;

  @JsonProperty("submittedOn")
  private String submittedOn;

  public SubmissionStatusForm rejectionMessage(String rejectionMessage) {
    this.rejectionMessage = rejectionMessage;
    return this;
  }

  /**
   * The message provided by the reviewer when a submission is rejected.
   * @return rejectionMessage
  */
  @ApiModelProperty(value = "The message provided by the reviewer when a submission is rejected.")


  public String getRejectionMessage() {
    return rejectionMessage;
  }

  public void setRejectionMessage(String rejectionMessage) {
    this.rejectionMessage = rejectionMessage;
  }

  public SubmissionStatusForm reviewedBy(String reviewedBy) {
    this.reviewedBy = reviewedBy;
    return this;
  }

  /**
   * The id of the service user that reviewed the submission.
   * @return reviewedBy
  */
  @ApiModelProperty(value = "The id of the service user that reviewed the submission.")


  public String getReviewedBy() {
    return reviewedBy;
  }

  public void setReviewedBy(String reviewedBy) {
    this.reviewedBy = reviewedBy;
  }

  public SubmissionStatusForm reviewedOn(String reviewedOn) {
    this.reviewedOn = reviewedOn;
    return this;
  }

  /**
   * The date when this submission was reviewed.
   * @return reviewedOn
  */
  @ApiModelProperty(value = "The date when this submission was reviewed.")


  public String getReviewedOn() {
    return reviewedOn;
  }

  public void setReviewedOn(String reviewedOn) {
    this.reviewedOn = reviewedOn;
  }

  public SubmissionStatusForm state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")

  @Valid

  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public SubmissionStatusForm submittedOn(String submittedOn) {
    this.submittedOn = submittedOn;
    return this;
  }

  /**
   * The date when the object was submitted.
   * @return submittedOn
  */
  @ApiModelProperty(value = "The date when the object was submitted.")


  public String getSubmittedOn() {
    return submittedOn;
  }

  public void setSubmittedOn(String submittedOn) {
    this.submittedOn = submittedOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionStatusForm submissionStatusForm = (SubmissionStatusForm) o;
    return Objects.equals(this.rejectionMessage, submissionStatusForm.rejectionMessage) &&
        Objects.equals(this.reviewedBy, submissionStatusForm.reviewedBy) &&
        Objects.equals(this.reviewedOn, submissionStatusForm.reviewedOn) &&
        Objects.equals(this.state, submissionStatusForm.state) &&
        Objects.equals(this.submittedOn, submissionStatusForm.submittedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rejectionMessage, reviewedBy, reviewedOn, state, submittedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionStatusForm {\n");
    
    sb.append("    rejectionMessage: ").append(toIndentedString(rejectionMessage)).append("\n");
    sb.append("    reviewedBy: ").append(toIndentedString(reviewedBy)).append("\n");
    sb.append("    reviewedOn: ").append(toIndentedString(reviewedOn)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    submittedOn: ").append(toIndentedString(submittedOn)).append("\n");
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

