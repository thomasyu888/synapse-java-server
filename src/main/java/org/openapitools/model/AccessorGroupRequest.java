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
 * A request to retrieve a page of accessor groups. Accessors will be group by submitter and access requirement.
 */
@ApiModel(description = "A request to retrieve a page of accessor groups. Accessors will be group by submitter and access requirement.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessorGroupRequest   {
  @JsonProperty("accessRequirementId")
  private String accessRequirementId;

  @JsonProperty("expireBefore")
  private String expireBefore;

  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("submitterId")
  private String submitterId;

  public AccessorGroupRequest accessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
    return this;
  }

  /**
   * The condition to filter by AccessRequirement. Use null to ignore this filter.' 
   * @return accessRequirementId
  */
  @ApiModelProperty(value = "The condition to filter by AccessRequirement. Use null to ignore this filter.' ")


  public String getAccessRequirementId() {
    return accessRequirementId;
  }

  public void setAccessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
  }

  public AccessorGroupRequest expireBefore(String expireBefore) {
    this.expireBefore = expireBefore;
    return this;
  }

  /**
   * The condition to filter by expiration. Use null to ignore this filter.' 
   * @return expireBefore
  */
  @ApiModelProperty(value = "The condition to filter by expiration. Use null to ignore this filter.' ")


  public String getExpireBefore() {
    return expireBefore;
  }

  public void setExpireBefore(String expireBefore) {
    this.expireBefore = expireBefore;
  }

  public AccessorGroupRequest nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The token to get the next page result. Use null to get the first page.' 
   * @return nextPageToken
  */
  @ApiModelProperty(value = "The token to get the next page result. Use null to get the first page.' ")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public AccessorGroupRequest submitterId(String submitterId) {
    this.submitterId = submitterId;
    return this;
  }

  /**
   * The condition to filter by submitter. Use null to ignore this filter.' 
   * @return submitterId
  */
  @ApiModelProperty(value = "The condition to filter by submitter. Use null to ignore this filter.' ")


  public String getSubmitterId() {
    return submitterId;
  }

  public void setSubmitterId(String submitterId) {
    this.submitterId = submitterId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessorGroupRequest accessorGroupRequest = (AccessorGroupRequest) o;
    return Objects.equals(this.accessRequirementId, accessorGroupRequest.accessRequirementId) &&
        Objects.equals(this.expireBefore, accessorGroupRequest.expireBefore) &&
        Objects.equals(this.nextPageToken, accessorGroupRequest.nextPageToken) &&
        Objects.equals(this.submitterId, accessorGroupRequest.submitterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementId, expireBefore, nextPageToken, submitterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessorGroupRequest {\n");
    
    sb.append("    accessRequirementId: ").append(toIndentedString(accessRequirementId)).append("\n");
    sb.append("    expireBefore: ").append(toIndentedString(expireBefore)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    submitterId: ").append(toIndentedString(submitterId)).append("\n");
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

