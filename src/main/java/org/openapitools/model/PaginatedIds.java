package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Paginated results of strings
 */
@ApiModel(description = "Paginated results of strings")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class PaginatedIds   {
  @JsonProperty("totalNumberOfResults")
  private Integer totalNumberOfResults;

  @JsonProperty("results")
  @Valid
  private List<String> results = null;

  public PaginatedIds totalNumberOfResults(Integer totalNumberOfResults) {
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

  public PaginatedIds results(List<String> results) {
    this.results = results;
    return this;
  }

  public PaginatedIds addResultsItem(String resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The list of Object Ids for this page
   * @return results
  */
  @ApiModelProperty(value = "The list of Object Ids for this page")


  public List<String> getResults() {
    return results;
  }

  public void setResults(List<String> results) {
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
    PaginatedIds paginatedIds = (PaginatedIds) o;
    return Objects.equals(this.totalNumberOfResults, paginatedIds.totalNumberOfResults) &&
        Objects.equals(this.results, paginatedIds.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalNumberOfResults, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedIds {\n");
    
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

