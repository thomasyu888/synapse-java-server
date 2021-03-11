package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A request to retrieve a page of Submission Information
 */
@ApiModel(description = "A request to retrieve a page of Submission Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionInfoPageRequest   {
  @JsonProperty("accessRequirementId")
  private String accessRequirementId;

  @JsonProperty("nextPageToken")
  private String nextPageToken;

  public SubmissionInfoPageRequest accessRequirementId(String accessRequirementId) {
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

  public SubmissionInfoPageRequest nextPageToken(String nextPageToken) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionInfoPageRequest submissionInfoPageRequest = (SubmissionInfoPageRequest) o;
    return Objects.equals(this.accessRequirementId, submissionInfoPageRequest.accessRequirementId) &&
        Objects.equals(this.nextPageToken, submissionInfoPageRequest.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementId, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionInfoPageRequest {\n");
    
    sb.append("    accessRequirementId: ").append(toIndentedString(accessRequirementId)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

