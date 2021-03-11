package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SubmissionOrder;
import org.openapitools.model.SubmissionState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A request to retrieve a page of a Submission.
 */
@ApiModel(description = "A request to retrieve a page of a Submission.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionPageRequest   {
  @JsonProperty("accessRequirementId")
  private String accessRequirementId;

  @JsonProperty("filterBy")
  private SubmissionState filterBy;

  @JsonProperty("isAscending")
  private Boolean isAscending;

  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("orderBy")
  private SubmissionOrder orderBy;

  public SubmissionPageRequest accessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
    return this;
  }

  /**
   * The ID of an AccessRequirement.
   * @return accessRequirementId
  */
  @ApiModelProperty(value = "The ID of an AccessRequirement.")


  public String getAccessRequirementId() {
    return accessRequirementId;
  }

  public void setAccessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
  }

  public SubmissionPageRequest filterBy(SubmissionState filterBy) {
    this.filterBy = filterBy;
    return this;
  }

  /**
   * Get filterBy
   * @return filterBy
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubmissionState getFilterBy() {
    return filterBy;
  }

  public void setFilterBy(SubmissionState filterBy) {
    this.filterBy = filterBy;
  }

  public SubmissionPageRequest isAscending(Boolean isAscending) {
    this.isAscending = isAscending;
    return this;
  }

  /**
   * If true, order the returned result in ascending order. Otherwise, order the returned result in descending order.
   * @return isAscending
  */
  @ApiModelProperty(value = "If true, order the returned result in ascending order. Otherwise, order the returned result in descending order.")


  public Boolean getIsAscending() {
    return isAscending;
  }

  public void setIsAscending(Boolean isAscending) {
    this.isAscending = isAscending;
  }

  public SubmissionPageRequest nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The token to get the next page result.
   * @return nextPageToken
  */
  @ApiModelProperty(value = "The token to get the next page result.")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public SubmissionPageRequest orderBy(SubmissionOrder orderBy) {
    this.orderBy = orderBy;
    return this;
  }

  /**
   * Get orderBy
   * @return orderBy
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubmissionOrder getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(SubmissionOrder orderBy) {
    this.orderBy = orderBy;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionPageRequest submissionPageRequest = (SubmissionPageRequest) o;
    return Objects.equals(this.accessRequirementId, submissionPageRequest.accessRequirementId) &&
        Objects.equals(this.filterBy, submissionPageRequest.filterBy) &&
        Objects.equals(this.isAscending, submissionPageRequest.isAscending) &&
        Objects.equals(this.nextPageToken, submissionPageRequest.nextPageToken) &&
        Objects.equals(this.orderBy, submissionPageRequest.orderBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementId, filterBy, isAscending, nextPageToken, orderBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionPageRequest {\n");
    
    sb.append("    accessRequirementId: ").append(toIndentedString(accessRequirementId)).append("\n");
    sb.append("    filterBy: ").append(toIndentedString(filterBy)).append("\n");
    sb.append("    isAscending: ").append(toIndentedString(isAscending)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
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

