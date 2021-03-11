package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the eligibility of an indivdiual to submit to an Evaluation queue, reflecting the queue&#39;s submission quotas and current submissions. 
 */
@ApiModel(description = "Describes the eligibility of an indivdiual to submit to an Evaluation queue, reflecting the queue's submission quotas and current submissions. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class MemberSubmissionEligibility   {
  @JsonProperty("hasConflictingSubmission")
  private Boolean hasConflictingSubmission;

  @JsonProperty("isEligible")
  private Boolean isEligible;

  @JsonProperty("isQuotaFilled")
  private Boolean isQuotaFilled;

  @JsonProperty("isRegistered")
  private Boolean isRegistered;

  @JsonProperty("principalId")
  private BigDecimal principalId;

  public MemberSubmissionEligibility hasConflictingSubmission(Boolean hasConflictingSubmission) {
    this.hasConflictingSubmission = hasConflictingSubmission;
    return this;
  }

  /**
   * true if the individual has submitted alone or with another team
   * @return hasConflictingSubmission
  */
  @ApiModelProperty(value = "true if the individual has submitted alone or with another team")


  public Boolean getHasConflictingSubmission() {
    return hasConflictingSubmission;
  }

  public void setHasConflictingSubmission(Boolean hasConflictingSubmission) {
    this.hasConflictingSubmission = hasConflictingSubmission;
  }

  public MemberSubmissionEligibility isEligible(Boolean isEligible) {
    this.isEligible = isEligible;
    return this;
  }

  /**
   * true if all criteria are met
   * @return isEligible
  */
  @ApiModelProperty(value = "true if all criteria are met")


  public Boolean getIsEligible() {
    return isEligible;
  }

  public void setIsEligible(Boolean isEligible) {
    this.isEligible = isEligible;
  }

  public MemberSubmissionEligibility isQuotaFilled(Boolean isQuotaFilled) {
    this.isQuotaFilled = isQuotaFilled;
    return this;
  }

  /**
   * true if team/individual has reached the submission quota (for the given submission round)
   * @return isQuotaFilled
  */
  @ApiModelProperty(value = "true if team/individual has reached the submission quota (for the given submission round)")


  public Boolean getIsQuotaFilled() {
    return isQuotaFilled;
  }

  public void setIsQuotaFilled(Boolean isQuotaFilled) {
    this.isQuotaFilled = isQuotaFilled;
  }

  public MemberSubmissionEligibility isRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
    return this;
  }

  /**
   * true if team/individual is registered for challenge
   * @return isRegistered
  */
  @ApiModelProperty(value = "true if team/individual is registered for challenge")


  public Boolean getIsRegistered() {
    return isRegistered;
  }

  public void setIsRegistered(Boolean isRegistered) {
    this.isRegistered = isRegistered;
  }

  public MemberSubmissionEligibility principalId(BigDecimal principalId) {
    this.principalId = principalId;
    return this;
  }

  /**
   * Synapse user id
   * @return principalId
  */
  @ApiModelProperty(value = "Synapse user id")

  @Valid

  public BigDecimal getPrincipalId() {
    return principalId;
  }

  public void setPrincipalId(BigDecimal principalId) {
    this.principalId = principalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberSubmissionEligibility memberSubmissionEligibility = (MemberSubmissionEligibility) o;
    return Objects.equals(this.hasConflictingSubmission, memberSubmissionEligibility.hasConflictingSubmission) &&
        Objects.equals(this.isEligible, memberSubmissionEligibility.isEligible) &&
        Objects.equals(this.isQuotaFilled, memberSubmissionEligibility.isQuotaFilled) &&
        Objects.equals(this.isRegistered, memberSubmissionEligibility.isRegistered) &&
        Objects.equals(this.principalId, memberSubmissionEligibility.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasConflictingSubmission, isEligible, isQuotaFilled, isRegistered, principalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberSubmissionEligibility {\n");
    
    sb.append("    hasConflictingSubmission: ").append(toIndentedString(hasConflictingSubmission)).append("\n");
    sb.append("    isEligible: ").append(toIndentedString(isEligible)).append("\n");
    sb.append("    isQuotaFilled: ").append(toIndentedString(isQuotaFilled)).append("\n");
    sb.append("    isRegistered: ").append(toIndentedString(isRegistered)).append("\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
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

