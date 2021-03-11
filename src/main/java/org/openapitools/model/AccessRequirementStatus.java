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
 * The status of a user meeting an AccessRequirement.
 */
@ApiModel(description = "The status of a user meeting an AccessRequirement.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessRequirementStatus   {
  @JsonProperty("accessRequirementId")
  private String accessRequirementId;

  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("expiredOn")
  private String expiredOn;

  @JsonProperty("isApproved")
  private Boolean isApproved;

  public AccessRequirementStatus accessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
    return this;
  }

  /**
   * The ID of the requested AccessRequirement.
   * @return accessRequirementId
  */
  @ApiModelProperty(value = "The ID of the requested AccessRequirement.")


  public String getAccessRequirementId() {
    return accessRequirementId;
  }

  public void setAccessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
  }

  public AccessRequirementStatus concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * Indicates which implementation of AccessRequirementStatus this object represents.
   * @return concreteType
  */
  @ApiModelProperty(value = "Indicates which implementation of AccessRequirementStatus this object represents.")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public AccessRequirementStatus expiredOn(String expiredOn) {
    this.expiredOn = expiredOn;
    return this;
  }

  /**
   * The date that the user no longer have access to the data.
   * @return expiredOn
  */
  @ApiModelProperty(value = "The date that the user no longer have access to the data.")


  public String getExpiredOn() {
    return expiredOn;
  }

  public void setExpiredOn(String expiredOn) {
    this.expiredOn = expiredOn;
  }

  public AccessRequirementStatus isApproved(Boolean isApproved) {
    this.isApproved = isApproved;
    return this;
  }

  /**
   * True if there is an AccessApproval for the user for the given AccessRequirement.
   * @return isApproved
  */
  @ApiModelProperty(value = "True if there is an AccessApproval for the user for the given AccessRequirement.")


  public Boolean getIsApproved() {
    return isApproved;
  }

  public void setIsApproved(Boolean isApproved) {
    this.isApproved = isApproved;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessRequirementStatus accessRequirementStatus = (AccessRequirementStatus) o;
    return Objects.equals(this.accessRequirementId, accessRequirementStatus.accessRequirementId) &&
        Objects.equals(this.concreteType, accessRequirementStatus.concreteType) &&
        Objects.equals(this.expiredOn, accessRequirementStatus.expiredOn) &&
        Objects.equals(this.isApproved, accessRequirementStatus.isApproved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementId, concreteType, expiredOn, isApproved);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRequirementStatus {\n");
    
    sb.append("    accessRequirementId: ").append(toIndentedString(accessRequirementId)).append("\n");
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    expiredOn: ").append(toIndentedString(expiredOn)).append("\n");
    sb.append("    isApproved: ").append(toIndentedString(isApproved)).append("\n");
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

