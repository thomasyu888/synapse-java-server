package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AccessorGroup;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A page of AccessorGroup.
 */
@ApiModel(description = "A page of AccessorGroup.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessorGroupResponse   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("results")
  @Valid
  private List<AccessorGroup> results = null;

  public AccessorGroupResponse nextPageToken(String nextPageToken) {
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

  public AccessorGroupResponse results(List<AccessorGroup> results) {
    this.results = results;
    return this;
  }

  public AccessorGroupResponse addResultsItem(AccessorGroup resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * A page of AccessorGroup.
   * @return results
  */
  @ApiModelProperty(value = "A page of AccessorGroup.")

  @Valid

  public List<AccessorGroup> getResults() {
    return results;
  }

  public void setResults(List<AccessorGroup> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessorGroupResponse accessorGroupResponse = (AccessorGroupResponse) o;
    return Objects.equals(this.nextPageToken, accessorGroupResponse.nextPageToken) &&
        Objects.equals(this.results, accessorGroupResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessorGroupResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

