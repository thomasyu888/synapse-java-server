package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.MembershipRequest;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of Membership Requests
 */
@ApiModel(description = "List of Membership Requests")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class PaginatedResultsOfMembershipRequest   {
  @JsonProperty("results")
  @Valid
  private List<MembershipRequest> results = null;

  @JsonProperty("totalNumberOfResults")
  private Integer totalNumberOfResults;

  public PaginatedResultsOfMembershipRequest results(List<MembershipRequest> results) {
    this.results = results;
    return this;
  }

  public PaginatedResultsOfMembershipRequest addResultsItem(MembershipRequest resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * List of membership requests 
   * @return results
  */
  @ApiModelProperty(value = "List of membership requests ")

  @Valid

  public List<MembershipRequest> getResults() {
    return results;
  }

  public void setResults(List<MembershipRequest> results) {
    this.results = results;
  }

  public PaginatedResultsOfMembershipRequest totalNumberOfResults(Integer totalNumberOfResults) {
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
    PaginatedResultsOfMembershipRequest paginatedResultsOfMembershipRequest = (PaginatedResultsOfMembershipRequest) o;
    return Objects.equals(this.results, paginatedResultsOfMembershipRequest.results) &&
        Objects.equals(this.totalNumberOfResults, paginatedResultsOfMembershipRequest.totalNumberOfResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalNumberOfResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResultsOfMembershipRequest {\n");
    
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

