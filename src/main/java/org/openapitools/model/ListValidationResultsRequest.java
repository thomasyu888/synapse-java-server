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
 * Request to get a single page of JSON schema validation results for a given Entity container.
 */
@ApiModel(description = "Request to get a single page of JSON schema validation results for a given Entity container.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ListValidationResultsRequest   {
  @JsonProperty("containerId")
  private String containerId;

  @JsonProperty("nextPageToken")
  private String nextPageToken;

  public ListValidationResultsRequest containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * The ID of the Entity container to get.
   * @return containerId
  */
  @ApiModelProperty(value = "The ID of the Entity container to get.")


  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public ListValidationResultsRequest nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Forward the returned 'nextPageToken' to get the next page of results. 
   * @return nextPageToken
  */
  @ApiModelProperty(value = "Forward the returned 'nextPageToken' to get the next page of results. ")


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
    ListValidationResultsRequest listValidationResultsRequest = (ListValidationResultsRequest) o;
    return Objects.equals(this.containerId, listValidationResultsRequest.containerId) &&
        Objects.equals(this.nextPageToken, listValidationResultsRequest.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerId, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListValidationResultsRequest {\n");
    
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
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

