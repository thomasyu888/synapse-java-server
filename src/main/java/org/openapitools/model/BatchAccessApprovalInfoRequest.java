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
 * Request for a batch of AccessApprovalInfo.
 */
@ApiModel(description = "Request for a batch of AccessApprovalInfo.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class BatchAccessApprovalInfoRequest   {
  @JsonProperty("accessRequirementIds")
  @Valid
  private List<String> accessRequirementIds = null;

  @JsonProperty("userId")
  private String userId;

  public BatchAccessApprovalInfoRequest accessRequirementIds(List<String> accessRequirementIds) {
    this.accessRequirementIds = accessRequirementIds;
    return this;
  }

  public BatchAccessApprovalInfoRequest addAccessRequirementIdsItem(String accessRequirementIdsItem) {
    if (this.accessRequirementIds == null) {
      this.accessRequirementIds = new ArrayList<>();
    }
    this.accessRequirementIds.add(accessRequirementIdsItem);
    return this;
  }

  /**
   * The ID of the access requirements.
   * @return accessRequirementIds
  */
  @ApiModelProperty(value = "The ID of the access requirements.")


  public List<String> getAccessRequirementIds() {
    return accessRequirementIds;
  }

  public void setAccessRequirementIds(List<String> accessRequirementIds) {
    this.accessRequirementIds = accessRequirementIds;
  }

  public BatchAccessApprovalInfoRequest userId(String userId) {
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
    BatchAccessApprovalInfoRequest batchAccessApprovalInfoRequest = (BatchAccessApprovalInfoRequest) o;
    return Objects.equals(this.accessRequirementIds, batchAccessApprovalInfoRequest.accessRequirementIds) &&
        Objects.equals(this.userId, batchAccessApprovalInfoRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementIds, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchAccessApprovalInfoRequest {\n");
    
    sb.append("    accessRequirementIds: ").append(toIndentedString(accessRequirementIds)).append("\n");
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

