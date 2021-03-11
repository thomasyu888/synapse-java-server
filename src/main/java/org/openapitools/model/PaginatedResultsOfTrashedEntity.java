package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TrashedEntity;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of trashed entities
 */
@ApiModel(description = "List of trashed entities")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class PaginatedResultsOfTrashedEntity   {
  @JsonProperty("results")
  @Valid
  private List<TrashedEntity> results = null;

  @JsonProperty("totalNumberOfResults")
  private Integer totalNumberOfResults;

  public PaginatedResultsOfTrashedEntity results(List<TrashedEntity> results) {
    this.results = results;
    return this;
  }

  public PaginatedResultsOfTrashedEntity addResultsItem(TrashedEntity resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * List of trashed entities.
   * @return results
  */
  @ApiModelProperty(value = "List of trashed entities.")

  @Valid

  public List<TrashedEntity> getResults() {
    return results;
  }

  public void setResults(List<TrashedEntity> results) {
    this.results = results;
  }

  public PaginatedResultsOfTrashedEntity totalNumberOfResults(Integer totalNumberOfResults) {
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
    PaginatedResultsOfTrashedEntity paginatedResultsOfTrashedEntity = (PaginatedResultsOfTrashedEntity) o;
    return Objects.equals(this.results, paginatedResultsOfTrashedEntity.results) &&
        Objects.equals(this.totalNumberOfResults, paginatedResultsOfTrashedEntity.totalNumberOfResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalNumberOfResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResultsOfTrashedEntity {\n");
    
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

