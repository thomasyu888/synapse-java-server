package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SubmissionInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A page of Submission Information
 */
@ApiModel(description = "A page of Submission Information")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionInfoPage   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("results")
  @Valid
  private List<SubmissionInfo> results = null;

  public SubmissionInfoPage nextPageToken(String nextPageToken) {
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

  public SubmissionInfoPage results(List<SubmissionInfo> results) {
    this.results = results;
    return this;
  }

  public SubmissionInfoPage addResultsItem(SubmissionInfo resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * A page of Submission Information
   * @return results
  */
  @ApiModelProperty(value = "A page of Submission Information")

  @Valid

  public List<SubmissionInfo> getResults() {
    return results;
  }

  public void setResults(List<SubmissionInfo> results) {
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
    SubmissionInfoPage submissionInfoPage = (SubmissionInfoPage) o;
    return Objects.equals(this.nextPageToken, submissionInfoPage.nextPageToken) &&
        Objects.equals(this.results, submissionInfoPage.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionInfoPage {\n");
    
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

