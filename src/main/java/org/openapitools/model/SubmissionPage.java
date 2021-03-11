package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Submission;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Page of AR submissions
 */
@ApiModel(description = "Page of AR submissions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionPage   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("results")
  @Valid
  private List<Submission> results = null;

  public SubmissionPage nextPageToken(String nextPageToken) {
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

  public SubmissionPage results(List<Submission> results) {
    this.results = results;
    return this;
  }

  public SubmissionPage addResultsItem(Submission resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * Page of AR submissions
   * @return results
  */
  @ApiModelProperty(value = "Page of AR submissions")

  @Valid

  public List<Submission> getResults() {
    return results;
  }

  public void setResults(List<Submission> results) {
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
    SubmissionPage submissionPage = (SubmissionPage) o;
    return Objects.equals(this.nextPageToken, submissionPage.nextPageToken) &&
        Objects.equals(this.results, submissionPage.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionPage {\n");
    
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

