package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DockerCommit;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for Row POJO
 */
@ApiModel(description = "JSON schema for Row POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class PaginatedResultsOfDockerCommit   {
  @JsonProperty("results")
  @Valid
  private List<DockerCommit> results = null;

  @JsonProperty("totalNumberOfResults")
  private Integer totalNumberOfResults;

  public PaginatedResultsOfDockerCommit results(List<DockerCommit> results) {
    this.results = results;
    return this;
  }

  public PaginatedResultsOfDockerCommit addResultsItem(DockerCommit resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * List of Docker commits.
   * @return results
  */
  @ApiModelProperty(value = "List of Docker commits.")

  @Valid

  public List<DockerCommit> getResults() {
    return results;
  }

  public void setResults(List<DockerCommit> results) {
    this.results = results;
  }

  public PaginatedResultsOfDockerCommit totalNumberOfResults(Integer totalNumberOfResults) {
    this.totalNumberOfResults = totalNumberOfResults;
    return this;
  }

  /**
   * Calculating the actual totalNumberOfResults is not longer supported. Therefore, for each page, the totalNumberOfResults is estimated using the current page, limit, and offset. When the page size equals the limit, the totalNumberOfResults will be offset+pageSize+ 1. Otherwise, the totalNumberOfResults will be offset+pageSize. 
   * @return totalNumberOfResults
  */
  @ApiModelProperty(value = "Calculating the actual totalNumberOfResults is not longer supported. Therefore, for each page, the totalNumberOfResults is estimated using the current page, limit, and offset. When the page size equals the limit, the totalNumberOfResults will be offset+pageSize+ 1. Otherwise, the totalNumberOfResults will be offset+pageSize. ")


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
    PaginatedResultsOfDockerCommit paginatedResultsOfDockerCommit = (PaginatedResultsOfDockerCommit) o;
    return Objects.equals(this.results, paginatedResultsOfDockerCommit.results) &&
        Objects.equals(this.totalNumberOfResults, paginatedResultsOfDockerCommit.totalNumberOfResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalNumberOfResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResultsOfDockerCommit {\n");
    
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

