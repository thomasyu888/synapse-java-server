package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Challenge;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List the Challenges for which the given participant is registered. To be in the returned list the caller must have READ permission on the project associated with the Challenge.
 */
@ApiModel(description = "List the Challenges for which the given participant is registered. To be in the returned list the caller must have READ permission on the project associated with the Challenge.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ChallengePagedResults   {
  @JsonProperty("totalNumberOfResults")
  private Integer totalNumberOfResults;

  @JsonProperty("results")
  @Valid
  private List<Challenge> results = null;

  public ChallengePagedResults totalNumberOfResults(Integer totalNumberOfResults) {
    this.totalNumberOfResults = totalNumberOfResults;
    return this;
  }

  /**
   * The total number of results
   * @return totalNumberOfResults
  */
  @ApiModelProperty(value = "The total number of results")


  public Integer getTotalNumberOfResults() {
    return totalNumberOfResults;
  }

  public void setTotalNumberOfResults(Integer totalNumberOfResults) {
    this.totalNumberOfResults = totalNumberOfResults;
  }

  public ChallengePagedResults results(List<Challenge> results) {
    this.results = results;
    return this;
  }

  public ChallengePagedResults addResultsItem(Challenge resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The list of results for this page
   * @return results
  */
  @ApiModelProperty(value = "The list of results for this page")

  @Valid

  public List<Challenge> getResults() {
    return results;
  }

  public void setResults(List<Challenge> results) {
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
    ChallengePagedResults challengePagedResults = (ChallengePagedResults) o;
    return Objects.equals(this.totalNumberOfResults, challengePagedResults.totalNumberOfResults) &&
        Objects.equals(this.results, challengePagedResults.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfResults, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengePagedResults {\n");
    
    sb.append("    totalNumberOfResults: ").append(toIndentedString(totalNumberOfResults)).append("\n");
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

