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
 * Describes the eligibility of a to submit to an Evaluation queue, reflecting the queue&#39;s submission quotas and current submissions. 
 */
@ApiModel(description = "Describes the eligibility of a to submit to an Evaluation queue, reflecting the queue's submission quotas and current submissions. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionEligibility   {
  @JsonProperty("isEligible")
  private Boolean isEligible;

  @JsonProperty("isQuotaFilled")
  private Boolean isQuotaFilled;

  @JsonProperty("isRegistered")
  private Boolean isRegistered;

  public SubmissionEligibility isEligible(Boolean isEligible) {
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

  public SubmissionEligibility isQuotaFilled(Boolean isQuotaFilled) {
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

  public SubmissionEligibility isRegistered(Boolean isRegistered) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionEligibility submissionEligibility = (SubmissionEligibility) o;
    return Objects.equals(this.isEligible, submissionEligibility.isEligible) &&
        Objects.equals(this.isQuotaFilled, submissionEligibility.isQuotaFilled) &&
        Objects.equals(this.isRegistered, submissionEligibility.isRegistered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEligible, isQuotaFilled, isRegistered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionEligibility {\n");
    
    sb.append("    isEligible: ").append(toIndentedString(isEligible)).append("\n");
    sb.append("    isQuotaFilled: ").append(toIndentedString(isQuotaFilled)).append("\n");
    sb.append("    isRegistered: ").append(toIndentedString(isRegistered)).append("\n");
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

