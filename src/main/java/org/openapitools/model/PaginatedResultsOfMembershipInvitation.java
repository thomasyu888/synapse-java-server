package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.MembershipInvitation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Retrieve the open invitations from a Team, optionally filtering by the invitee. An invitation is only open if it has not expired and if the user has not joined the Team. Note: certain fields may be omitted when returned if the field value is null 
 */
@ApiModel(description = "Retrieve the open invitations from a Team, optionally filtering by the invitee. An invitation is only open if it has not expired and if the user has not joined the Team. Note: certain fields may be omitted when returned if the field value is null ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class PaginatedResultsOfMembershipInvitation   {
  @JsonProperty("results")
  @Valid
  private List<MembershipInvitation> results = null;

  @JsonProperty("totalNumberOfResults")
  private Integer totalNumberOfResults;

  public PaginatedResultsOfMembershipInvitation results(List<MembershipInvitation> results) {
    this.results = results;
    return this;
  }

  public PaginatedResultsOfMembershipInvitation addResultsItem(MembershipInvitation resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The the id of the entity to which this reference refers
   * @return results
  */
  @ApiModelProperty(value = "The the id of the entity to which this reference refers")

  @Valid

  public List<MembershipInvitation> getResults() {
    return results;
  }

  public void setResults(List<MembershipInvitation> results) {
    this.results = results;
  }

  public PaginatedResultsOfMembershipInvitation totalNumberOfResults(Integer totalNumberOfResults) {
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
    PaginatedResultsOfMembershipInvitation paginatedResultsOfMembershipInvitation = (PaginatedResultsOfMembershipInvitation) o;
    return Objects.equals(this.results, paginatedResultsOfMembershipInvitation.results) &&
        Objects.equals(this.totalNumberOfResults, paginatedResultsOfMembershipInvitation.totalNumberOfResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results, totalNumberOfResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedResultsOfMembershipInvitation {\n");
    
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

