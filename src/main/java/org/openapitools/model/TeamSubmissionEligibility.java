package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.MemberSubmissionEligibility;
import org.openapitools.model.SubmissionEligibility;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the eligibility of a Challenge Team to submit to an Evalution queue, reflecting the queue&#39;s submission quotas and current submissions. 
 */
@ApiModel(description = "Describes the eligibility of a Challenge Team to submit to an Evalution queue, reflecting the queue's submission quotas and current submissions. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class TeamSubmissionEligibility   {
  @JsonProperty("eligibilityStateHash")
  private Integer eligibilityStateHash;

  @JsonProperty("evaluationId")
  private String evaluationId;

  @JsonProperty("membersEligibility")
  @Valid
  private List<MemberSubmissionEligibility> membersEligibility = null;

  @JsonProperty("teamEligibility")
  private SubmissionEligibility teamEligibility;

  @JsonProperty("teamId")
  private String teamId;

  public TeamSubmissionEligibility eligibilityStateHash(Integer eligibilityStateHash) {
    this.eligibilityStateHash = eligibilityStateHash;
    return this;
  }

  /**
   * A hash of this object, used for optimistic concurrency.
   * @return eligibilityStateHash
  */
  @ApiModelProperty(value = "A hash of this object, used for optimistic concurrency.")


  public Integer getEligibilityStateHash() {
    return eligibilityStateHash;
  }

  public void setEligibilityStateHash(Integer eligibilityStateHash) {
    this.eligibilityStateHash = eligibilityStateHash;
  }

  public TeamSubmissionEligibility evaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

  /**
   * The ID of the Evaluation of interest
   * @return evaluationId
  */
  @ApiModelProperty(value = "The ID of the Evaluation of interest")


  public String getEvaluationId() {
    return evaluationId;
  }

  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }

  public TeamSubmissionEligibility membersEligibility(List<MemberSubmissionEligibility> membersEligibility) {
    this.membersEligibility = membersEligibility;
    return this;
  }

  public TeamSubmissionEligibility addMembersEligibilityItem(MemberSubmissionEligibility membersEligibilityItem) {
    if (this.membersEligibility == null) {
      this.membersEligibility = new ArrayList<>();
    }
    this.membersEligibility.add(membersEligibilityItem);
    return this;
  }

  /**
   * Describes the submission eligibility of the contributors to the Submission.
   * @return membersEligibility
  */
  @ApiModelProperty(value = "Describes the submission eligibility of the contributors to the Submission.")

  @Valid

  public List<MemberSubmissionEligibility> getMembersEligibility() {
    return membersEligibility;
  }

  public void setMembersEligibility(List<MemberSubmissionEligibility> membersEligibility) {
    this.membersEligibility = membersEligibility;
  }

  public TeamSubmissionEligibility teamEligibility(SubmissionEligibility teamEligibility) {
    this.teamEligibility = teamEligibility;
    return this;
  }

  /**
   * Get teamEligibility
   * @return teamEligibility
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubmissionEligibility getTeamEligibility() {
    return teamEligibility;
  }

  public void setTeamEligibility(SubmissionEligibility teamEligibility) {
    this.teamEligibility = teamEligibility;
  }

  public TeamSubmissionEligibility teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The ID of the Team of interest
   * @return teamId
  */
  @ApiModelProperty(value = "The ID of the Team of interest")


  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamSubmissionEligibility teamSubmissionEligibility = (TeamSubmissionEligibility) o;
    return Objects.equals(this.eligibilityStateHash, teamSubmissionEligibility.eligibilityStateHash) &&
        Objects.equals(this.evaluationId, teamSubmissionEligibility.evaluationId) &&
        Objects.equals(this.membersEligibility, teamSubmissionEligibility.membersEligibility) &&
        Objects.equals(this.teamEligibility, teamSubmissionEligibility.teamEligibility) &&
        Objects.equals(this.teamId, teamSubmissionEligibility.teamId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eligibilityStateHash, evaluationId, membersEligibility, teamEligibility, teamId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamSubmissionEligibility {\n");
    
    sb.append("    eligibilityStateHash: ").append(toIndentedString(eligibilityStateHash)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    membersEligibility: ").append(toIndentedString(membersEligibility)).append("\n");
    sb.append("    teamEligibility: ").append(toIndentedString(teamEligibility)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
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

