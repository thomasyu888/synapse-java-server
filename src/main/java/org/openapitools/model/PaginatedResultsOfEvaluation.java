package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Evaluation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Gets a collection of Evaluations, within a given range.
 */
@ApiModel(description = "Gets a collection of Evaluations, within a given range.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class PaginatedResultsOfEvaluation   {
  @JsonProperty("results")
  @Valid
  private List<Evaluation> results = null;

  @JsonProperty("totalNumberOfResults")
  private Integer totalNumberOfResults;

  public PaginatedResultsOfEvaluation results(List<Evaluation> results) {
    this.results = results;
    return this;
  }

  public PaginatedResultsOfEvaluation addResultsItem(Evaluation resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * List of evaluations
   * @return results
  */
  @ApiModelProperty(value = "List of evaluations")

  @Valid

  public List<Evaluation> getResults() {
    return results;
  }

  public void setResults(List<Evaluation> results) {
    this.results = results;
  }

  public PaginatedResultsOfEvaluation totalNumberOfResults(Integer totalNumberOfResults) {
    this.totalNumberOfResults = totalNumberOfResults;
    return this;
  }

  /**
   * Number of results per page
   * @return totalNumberOfResults
  */
  @ApiModelProperty(value = "Number of results per page")


  public Integer getTotalNumberOfResults() {
    return totalNumberOfResults;
  }

  public void setTotalNumberOfResults(Integer totalNumberOfResults) {
    this.totalNumberOfResults = totalNumberOfResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedResultsOfEvaluation paginatedResultsOfEvaluation = (PaginatedResultsOfEvaluation) o;
    return Objects.equals(this.results, paginatedResultsOfEvaluation.results) &&
        Objects.equals(this.totalNumberOfResults, paginatedResultsOfEvaluation.totalNumberOfResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalNumberOfResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResultsOfEvaluation {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    totalNumberOfResults: ").append(toIndentedString(totalNumberOfResults)).append("\n");
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

