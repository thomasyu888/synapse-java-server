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
 * Maximum submissions per team/participant per submission round. If round information is omitted, then this indicates the overall submission limit per team/participant.
 */
@ApiModel(description = "Maximum submissions per team/participant per submission round. If round information is omitted, then this indicates the overall submission limit per team/participant.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionQuota   {
  @JsonProperty("firstRoundStart")
  private String firstRoundStart;

  @JsonProperty("numberOfRounds")
  private Integer numberOfRounds;

  @JsonProperty("roundDurationMillis")
  private Integer roundDurationMillis;

  @JsonProperty("submissionLimit")
  private Integer submissionLimit;

  public SubmissionQuota firstRoundStart(String firstRoundStart) {
    this.firstRoundStart = firstRoundStart;
    return this;
  }

  /**
   * The date/time at which the first round begins.
   * @return firstRoundStart
  */
  @ApiModelProperty(value = "The date/time at which the first round begins.")


  public String getFirstRoundStart() {
    return firstRoundStart;
  }

  public void setFirstRoundStart(String firstRoundStart) {
    this.firstRoundStart = firstRoundStart;
  }

  public SubmissionQuota numberOfRounds(Integer numberOfRounds) {
    this.numberOfRounds = numberOfRounds;
    return this;
  }

  /**
   * The number of rounds, or null if there is no end.
   * @return numberOfRounds
  */
  @ApiModelProperty(value = "The number of rounds, or null if there is no end.")


  public Integer getNumberOfRounds() {
    return numberOfRounds;
  }

  public void setNumberOfRounds(Integer numberOfRounds) {
    this.numberOfRounds = numberOfRounds;
  }

  public SubmissionQuota roundDurationMillis(Integer roundDurationMillis) {
    this.roundDurationMillis = roundDurationMillis;
    return this;
  }

  /**
   * The duration of each round in milliseconds
   * @return roundDurationMillis
  */
  @ApiModelProperty(value = "The duration of each round in milliseconds")


  public Integer getRoundDurationMillis() {
    return roundDurationMillis;
  }

  public void setRoundDurationMillis(Integer roundDurationMillis) {
    this.roundDurationMillis = roundDurationMillis;
  }

  public SubmissionQuota submissionLimit(Integer submissionLimit) {
    this.submissionLimit = submissionLimit;
    return this;
  }

  /**
   * the maximum number of submissions per team/participant per round.
   * @return submissionLimit
  */
  @ApiModelProperty(value = "the maximum number of submissions per team/participant per round.")


  public Integer getSubmissionLimit() {
    return submissionLimit;
  }

  public void setSubmissionLimit(Integer submissionLimit) {
    this.submissionLimit = submissionLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionQuota submissionQuota = (SubmissionQuota) o;
    return Objects.equals(this.firstRoundStart, submissionQuota.firstRoundStart) &&
        Objects.equals(this.numberOfRounds, submissionQuota.numberOfRounds) &&
        Objects.equals(this.roundDurationMillis, submissionQuota.roundDurationMillis) &&
        Objects.equals(this.submissionLimit, submissionQuota.submissionLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstRoundStart, numberOfRounds, roundDurationMillis, submissionLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionQuota {\n");
    
    sb.append("    firstRoundStart: ").append(toIndentedString(firstRoundStart)).append("\n");
    sb.append("    numberOfRounds: ").append(toIndentedString(numberOfRounds)).append("\n");
    sb.append("    roundDurationMillis: ").append(toIndentedString(roundDurationMillis)).append("\n");
    sb.append("    submissionLimit: ").append(toIndentedString(submissionLimit)).append("\n");
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

