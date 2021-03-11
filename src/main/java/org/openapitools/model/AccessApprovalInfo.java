package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about whether or not a user has an AccessApproval for an AccessRequirement. 
 */
@ApiModel(description = "Information about whether or not a user has an AccessApproval for an AccessRequirement. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessApprovalInfo   {
  @JsonProperty("accessRequirementId")
  private String accessRequirementId;

  @JsonProperty("hasAccessApproval")
  private Boolean hasAccessApproval;

  @JsonProperty("userId")
  private String userId;

  public AccessApprovalInfo accessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
    return this;
  }

  /**
   * The ID of the access requirement.
   * @return accessRequirementId
  */
  @ApiModelProperty(value = "The ID of the access requirement.")


  public String getAccessRequirementId() {
    return accessRequirementId;
  }

  public void setAccessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
  }

  public AccessApprovalInfo hasAccessApproval(Boolean hasAccessApproval) {
    this.hasAccessApproval = hasAccessApproval;
    return this;
  }

  /**
   * True if userId has an AccessApproval for the specified accessRequirementId; false otherwise.
   * @return hasAccessApproval
  */
  @ApiModelProperty(value = "True if userId has an AccessApproval for the specified accessRequirementId; false otherwise.")


  public Boolean getHasAccessApproval() {
    return hasAccessApproval;
  }

  public void setHasAccessApproval(Boolean hasAccessApproval) {
    this.hasAccessApproval = hasAccessApproval;
  }

  public AccessApprovalInfo userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user.
   * @return userId
  */
  @ApiModelProperty(value = "The ID of the user.")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessApprovalInfo accessApprovalInfo = (AccessApprovalInfo) o;
    return Objects.equals(this.accessRequirementId, accessApprovalInfo.accessRequirementId) &&
        Objects.equals(this.hasAccessApproval, accessApprovalInfo.hasAccessApproval) &&
        Objects.equals(this.userId, accessApprovalInfo.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementId, hasAccessApproval, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessApprovalInfo {\n");
    
    sb.append("    accessRequirementId: ").append(toIndentedString(accessRequirementId)).append("\n");
    sb.append("    hasAccessApproval: ").append(toIndentedString(hasAccessApproval)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

