package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AccessApprovalInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response for an AccessApprovalInfoRequest.
 */
@ApiModel(description = "Response for an AccessApprovalInfoRequest.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class BatchAccessApprovalInfoResponse   {
  @JsonProperty("results")
  @Valid
  private List<AccessApprovalInfo> results = null;

  public BatchAccessApprovalInfoResponse results(List<AccessApprovalInfo> results) {
    this.results = results;
    return this;
  }

  public BatchAccessApprovalInfoResponse addResultsItem(AccessApprovalInfo resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The list of resulting AccessApprovalInfo.
   * @return results
  */
  @ApiModelProperty(value = "The list of resulting AccessApprovalInfo.")

  @Valid

  public List<AccessApprovalInfo> getResults() {
    return results;
  }

  public void setResults(List<AccessApprovalInfo> results) {
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
    BatchAccessApprovalInfoResponse batchAccessApprovalInfoResponse = (BatchAccessApprovalInfoResponse) o;
    return Objects.equals(this.results, batchAccessApprovalInfoResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchAccessApprovalInfoResponse {\n");
    
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

