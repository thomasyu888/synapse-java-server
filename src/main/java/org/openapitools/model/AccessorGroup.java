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
 * A group of accessors who gained access by the same submitter.
 */
@ApiModel(description = "A group of accessors who gained access by the same submitter.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessorGroup   {
  @JsonProperty("accessRequirementId")
  private String accessRequirementId;

  @JsonProperty("accessorIds")
  @Valid
  private List<String> accessorIds = null;

  @JsonProperty("expiredOn")
  private String expiredOn;

  @JsonProperty("submitterId")
  private String submitterId;

  public AccessorGroup accessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
    return this;
  }

  /**
   * The ID of an AccessRequirement.
   * @return accessRequirementId
  */
  @ApiModelProperty(value = "The ID of an AccessRequirement.")


  public String getAccessRequirementId() {
    return accessRequirementId;
  }

  public void setAccessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
  }

  public AccessorGroup accessorIds(List<String> accessorIds) {
    this.accessorIds = accessorIds;
    return this;
  }

  public AccessorGroup addAccessorIdsItem(String accessorIdsItem) {
    if (this.accessorIds == null) {
      this.accessorIds = new ArrayList<>();
    }
    this.accessorIds.add(accessorIdsItem);
    return this;
  }

  /**
   * The ID of accessors.
   * @return accessorIds
  */
  @ApiModelProperty(value = "The ID of accessors.")


  public List<String> getAccessorIds() {
    return accessorIds;
  }

  public void setAccessorIds(List<String> accessorIds) {
    this.accessorIds = accessorIds;
  }

  public AccessorGroup expiredOn(String expiredOn) {
    this.expiredOn = expiredOn;
    return this;
  }

  /**
   * The date this group will be expired.
   * @return expiredOn
  */
  @ApiModelProperty(value = "The date this group will be expired.")


  public String getExpiredOn() {
    return expiredOn;
  }

  public void setExpiredOn(String expiredOn) {
    this.expiredOn = expiredOn;
  }

  public AccessorGroup submitterId(String submitterId) {
    this.submitterId = submitterId;
    return this;
  }

  /**
   * The ID of the submitter.
   * @return submitterId
  */
  @ApiModelProperty(value = "The ID of the submitter.")


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
    AccessorGroup accessorGroup = (AccessorGroup) o;
    return Objects.equals(this.accessRequirementId, accessorGroup.accessRequirementId) &&
        Objects.equals(this.accessorIds, accessorGroup.accessorIds) &&
        Objects.equals(this.expiredOn, accessorGroup.expiredOn) &&
        Objects.equals(this.submitterId, accessorGroup.submitterId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementId, accessorIds, expiredOn, submitterId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessorGroup {\n");
    
    sb.append("    accessRequirementId: ").append(toIndentedString(accessRequirementId)).append("\n");
    sb.append("    accessorIds: ").append(toIndentedString(accessorIds)).append("\n");
    sb.append("    expiredOn: ").append(toIndentedString(expiredOn)).append("\n");
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

