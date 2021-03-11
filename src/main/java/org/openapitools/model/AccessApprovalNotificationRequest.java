package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A request to retrieve the notifications for an access requirement and a list of recipients.
 */
@ApiModel(description = "A request to retrieve the notifications for an access requirement and a list of recipients.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessApprovalNotificationRequest   {
  @JsonProperty("recipientIds")
  @Valid
  private List<BigDecimal> recipientIds = null;

  @JsonProperty("requirementId")
  private BigDecimal requirementId;

  public AccessApprovalNotificationRequest recipientIds(List<BigDecimal> recipientIds) {
    this.recipientIds = recipientIds;
    return this;
  }

  public AccessApprovalNotificationRequest addRecipientIdsItem(BigDecimal recipientIdsItem) {
    if (this.recipientIds == null) {
      this.recipientIds = new ArrayList<>();
    }
    this.recipientIds.add(recipientIdsItem);
    return this;
  }

  /**
   * The list of recipient ids.
   * @return recipientIds
  */
  @ApiModelProperty(value = "The list of recipient ids.")

  @Valid
@Size(max=25) 
  public List<BigDecimal> getRecipientIds() {
    return recipientIds;
  }

  public void setRecipientIds(List<BigDecimal> recipientIds) {
    this.recipientIds = recipientIds;
  }

  public AccessApprovalNotificationRequest requirementId(BigDecimal requirementId) {
    this.requirementId = requirementId;
    return this;
  }

  /**
   * The id of the access requirement.
   * @return requirementId
  */
  @ApiModelProperty(value = "The id of the access requirement.")

  @Valid

  public BigDecimal getRequirementId() {
    return requirementId;
  }

  public void setRequirementId(BigDecimal requirementId) {
    this.requirementId = requirementId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessApprovalNotificationRequest accessApprovalNotificationRequest = (AccessApprovalNotificationRequest) o;
    return Objects.equals(this.recipientIds, accessApprovalNotificationRequest.recipientIds) &&
        Objects.equals(this.requirementId, accessApprovalNotificationRequest.requirementId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientIds, requirementId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessApprovalNotificationRequest {\n");
    
    sb.append("    recipientIds: ").append(toIndentedString(recipientIds)).append("\n");
    sb.append("    requirementId: ").append(toIndentedString(requirementId)).append("\n");
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

