package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ChallengeTeam;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List the Teams registered for a Challenge. You must have READ permission in the associated Project to make this request.
 */
@ApiModel(description = "List the Teams registered for a Challenge. You must have READ permission in the associated Project to make this request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ChallengeTeamPagedResults   {
  @JsonProperty("totalNumberOfResults")
  private Integer totalNumberOfResults;

  @JsonProperty("results")
  @Valid
  private List<ChallengeTeam> results = null;

  public ChallengeTeamPagedResults totalNumberOfResults(Integer totalNumberOfResults) {
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

  public ChallengeTeamPagedResults results(List<ChallengeTeam> results) {
    this.results = results;
    return this;
  }

  public ChallengeTeamPagedResults addResultsItem(ChallengeTeam resultsItem) {
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

  public List<ChallengeTeam> getResults() {
    return results;
  }

  public void setResults(List<ChallengeTeam> results) {
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
    ChallengeTeamPagedResults challengeTeamPagedResults = (ChallengeTeamPagedResults) o;
    return Objects.equals(this.totalNumberOfResults, challengeTeamPagedResults.totalNumberOfResults) &&
        Objects.equals(this.results, challengeTeamPagedResults.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfResults, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeTeamPagedResults {\n");
    
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

