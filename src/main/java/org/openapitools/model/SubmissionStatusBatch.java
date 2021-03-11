package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SubmissionStatusModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A batch of status objects, to be updated en masse.
 */
@ApiModel(description = "A batch of status objects, to be updated en masse.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionStatusBatch   {
  @JsonProperty("batchToken")
  private String batchToken;

  @JsonProperty("isFirstBatch")
  private Boolean isFirstBatch;

  @JsonProperty("isLastBatch")
  private Boolean isLastBatch;

  @JsonProperty("statuses")
  @Valid
  private List<SubmissionStatusModel> statuses = null;

  public SubmissionStatusBatch batchToken(String batchToken) {
    this.batchToken = batchToken;
    return this;
  }

  /**
   * A token required to accept a batch submission for all but the first batch.
   * @return batchToken
  */
  @ApiModelProperty(value = "A token required to accept a batch submission for all but the first batch.")


  public String getBatchToken() {
    return batchToken;
  }

  public void setBatchToken(String batchToken) {
    this.batchToken = batchToken;
  }

  public SubmissionStatusBatch isFirstBatch(Boolean isFirstBatch) {
    this.isFirstBatch = isFirstBatch;
    return this;
  }

  /**
   * true if and only if this is the first batch to upload
   * @return isFirstBatch
  */
  @ApiModelProperty(value = "true if and only if this is the first batch to upload")


  public Boolean getIsFirstBatch() {
    return isFirstBatch;
  }

  public void setIsFirstBatch(Boolean isFirstBatch) {
    this.isFirstBatch = isFirstBatch;
  }

  public SubmissionStatusBatch isLastBatch(Boolean isLastBatch) {
    this.isLastBatch = isLastBatch;
    return this;
  }

  /**
   * true if and only if this is the last batch to upload
   * @return isLastBatch
  */
  @ApiModelProperty(value = "true if and only if this is the last batch to upload")


  public Boolean getIsLastBatch() {
    return isLastBatch;
  }

  public void setIsLastBatch(Boolean isLastBatch) {
    this.isLastBatch = isLastBatch;
  }

  public SubmissionStatusBatch statuses(List<SubmissionStatusModel> statuses) {
    this.statuses = statuses;
    return this;
  }

  public SubmissionStatusBatch addStatusesItem(SubmissionStatusModel statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * A collection of Submission Statuses
   * @return statuses
  */
  @ApiModelProperty(value = "A collection of Submission Statuses")

  @Valid

  public List<SubmissionStatusModel> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<SubmissionStatusModel> statuses) {
    this.statuses = statuses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionStatusBatch submissionStatusBatch = (SubmissionStatusBatch) o;
    return Objects.equals(this.batchToken, submissionStatusBatch.batchToken) &&
        Objects.equals(this.isFirstBatch, submissionStatusBatch.isFirstBatch) &&
        Objects.equals(this.isLastBatch, submissionStatusBatch.isLastBatch) &&
        Objects.equals(this.statuses, submissionStatusBatch.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchToken, isFirstBatch, isLastBatch, statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionStatusBatch {\n");
    
    sb.append("    batchToken: ").append(toIndentedString(batchToken)).append("\n");
    sb.append("    isFirstBatch: ").append(toIndentedString(isFirstBatch)).append("\n");
    sb.append("    isLastBatch: ").append(toIndentedString(isLastBatch)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

