package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AccessApprovalNotification;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains the response for an AccessApprovalNotificationRequest.
 */
@ApiModel(description = "Contains the response for an AccessApprovalNotificationRequest.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessApprovalNotificationResponse   {
  @JsonProperty("requirementId")
  private BigDecimal requirementId;

  @JsonProperty("results")
  @Valid
  private List<AccessApprovalNotification> results = null;

  public AccessApprovalNotificationResponse requirementId(BigDecimal requirementId) {
    this.requirementId = requirementId;
    return this;
  }

  /**
   * The id of the requested access requirement.
   * @return requirementId
  */
  @ApiModelProperty(value = "The id of the requested access requirement.")

  @Valid

  public BigDecimal getRequirementId() {
    return requirementId;
  }

  public void setRequirementId(BigDecimal requirementId) {
    this.requirementId = requirementId;
  }

  public AccessApprovalNotificationResponse results(List<AccessApprovalNotification> results) {
    this.results = results;
    return this;
  }

  public AccessApprovalNotificationResponse addResultsItem(AccessApprovalNotification resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The list of notifications, sorted by the recipient and the sentOn date.
   * @return results
  */
  @ApiModelProperty(value = "The list of notifications, sorted by the recipient and the sentOn date.")

  @Valid

  public List<AccessApprovalNotification> getResults() {
    return results;
  }

  public void setResults(List<AccessApprovalNotification> results) {
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
    AccessApprovalNotificationResponse accessApprovalNotificationResponse = (AccessApprovalNotificationResponse) o;
    return Objects.equals(this.requirementId, accessApprovalNotificationResponse.requirementId) &&
        Objects.equals(this.results, accessApprovalNotificationResponse.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirementId, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessApprovalNotificationResponse {\n");
    
    sb.append("    requirementId: ").append(toIndentedString(requirementId)).append("\n");
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

