package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SubmissionModel;
import org.openapitools.model.SubmissionStatusModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A bundle object to contain a Submission and its accompanying SubmissionStatus.
 */
@ApiModel(description = "A bundle object to contain a Submission and its accompanying SubmissionStatus.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionBundle   {
  @JsonProperty("submission")
  private SubmissionModel submission;

  @JsonProperty("submissionStatus")
  private SubmissionStatusModel submissionStatus;

  public SubmissionBundle submission(SubmissionModel submission) {
    this.submission = submission;
    return this;
  }

  /**
   * Get submission
   * @return submission
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubmissionModel getSubmission() {
    return submission;
  }

  public void setSubmission(SubmissionModel submission) {
    this.submission = submission;
  }

  public SubmissionBundle submissionStatus(SubmissionStatusModel submissionStatus) {
    this.submissionStatus = submissionStatus;
    return this;
  }

  /**
   * Get submissionStatus
   * @return submissionStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubmissionStatusModel getSubmissionStatus() {
    return submissionStatus;
  }

  public void setSubmissionStatus(SubmissionStatusModel submissionStatus) {
    this.submissionStatus = submissionStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionBundle submissionBundle = (SubmissionBundle) o;
    return Objects.equals(this.submission, submissionBundle.submission) &&
        Objects.equals(this.submissionStatus, submissionBundle.submissionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(submission, submissionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionBundle {\n");
    
    sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
    sb.append("    submissionStatus: ").append(toIndentedString(submissionStatus)).append("\n");
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

