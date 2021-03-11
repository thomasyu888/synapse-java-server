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
 * JSON schema for the possible status of a User with respect to Team membership.
 */
@ApiModel(description = "JSON schema for the possible status of a User with respect to Team membership.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class TeamMembershipStatus   {
  @JsonProperty("canJoin")
  private Boolean canJoin;

  @JsonProperty("canSendEmail")
  private Boolean canSendEmail;

  @JsonProperty("hasOpenInvitation")
  private Boolean hasOpenInvitation;

  @JsonProperty("hasOpenRequest")
  private Boolean hasOpenRequest;

  @JsonProperty("hasUnmetAccessRequirement")
  private Boolean hasUnmetAccessRequirement;

  @JsonProperty("isMember")
  private Boolean isMember;

  @JsonProperty("membershipApprovalRequired")
  private Boolean membershipApprovalRequired;

  @JsonProperty("teamId")
  private String teamId;

  @JsonProperty("userId")
  private String userId;

  public TeamMembershipStatus canJoin(Boolean canJoin) {
    this.canJoin = canJoin;
    return this;
  }

  /**
   * true if and only if the user requesting this status information can join the user to the team
   * @return canJoin
  */
  @ApiModelProperty(value = "true if and only if the user requesting this status information can join the user to the team")


  public Boolean getCanJoin() {
    return canJoin;
  }

  public void setCanJoin(Boolean canJoin) {
    this.canJoin = canJoin;
  }

  public TeamMembershipStatus canSendEmail(Boolean canSendEmail) {
    this.canSendEmail = canSendEmail;
    return this;
  }

  /**
   * true if and only if the user can send an email to the team
   * @return canSendEmail
  */
  @ApiModelProperty(value = "true if and only if the user can send an email to the team")


  public Boolean getCanSendEmail() {
    return canSendEmail;
  }

  public void setCanSendEmail(Boolean canSendEmail) {
    this.canSendEmail = canSendEmail;
  }

  public TeamMembershipStatus hasOpenInvitation(Boolean hasOpenInvitation) {
    this.hasOpenInvitation = hasOpenInvitation;
    return this;
  }

  /**
   * true if and only if the user has an open invitation to join the team
   * @return hasOpenInvitation
  */
  @ApiModelProperty(value = "true if and only if the user has an open invitation to join the team")


  public Boolean getHasOpenInvitation() {
    return hasOpenInvitation;
  }

  public void setHasOpenInvitation(Boolean hasOpenInvitation) {
    this.hasOpenInvitation = hasOpenInvitation;
  }

  public TeamMembershipStatus hasOpenRequest(Boolean hasOpenRequest) {
    this.hasOpenRequest = hasOpenRequest;
    return this;
  }

  /**
   * true if and only if the user has an open request to join the team
   * @return hasOpenRequest
  */
  @ApiModelProperty(value = "true if and only if the user has an open request to join the team")


  public Boolean getHasOpenRequest() {
    return hasOpenRequest;
  }

  public void setHasOpenRequest(Boolean hasOpenRequest) {
    this.hasOpenRequest = hasOpenRequest;
  }

  public TeamMembershipStatus hasUnmetAccessRequirement(Boolean hasUnmetAccessRequirement) {
    this.hasUnmetAccessRequirement = hasUnmetAccessRequirement;
    return this;
  }

  /**
   * true if and only if there is at least one unmet access requirement for the user on the team
   * @return hasUnmetAccessRequirement
  */
  @ApiModelProperty(value = "true if and only if there is at least one unmet access requirement for the user on the team")


  public Boolean getHasUnmetAccessRequirement() {
    return hasUnmetAccessRequirement;
  }

  public void setHasUnmetAccessRequirement(Boolean hasUnmetAccessRequirement) {
    this.hasUnmetAccessRequirement = hasUnmetAccessRequirement;
  }

  public TeamMembershipStatus isMember(Boolean isMember) {
    this.isMember = isMember;
    return this;
  }

  /**
   * true if and only if the user is a member of the team
   * @return isMember
  */
  @ApiModelProperty(value = "true if and only if the user is a member of the team")


  public Boolean getIsMember() {
    return isMember;
  }

  public void setIsMember(Boolean isMember) {
    this.isMember = isMember;
  }

  public TeamMembershipStatus membershipApprovalRequired(Boolean membershipApprovalRequired) {
    this.membershipApprovalRequired = membershipApprovalRequired;
    return this;
  }

  /**
   * true if and only if team admin approval is required for the user to join the team
   * @return membershipApprovalRequired
  */
  @ApiModelProperty(value = "true if and only if team admin approval is required for the user to join the team")


  public Boolean getMembershipApprovalRequired() {
    return membershipApprovalRequired;
  }

  public void setMembershipApprovalRequired(Boolean membershipApprovalRequired) {
    this.membershipApprovalRequired = membershipApprovalRequired;
  }

  public TeamMembershipStatus teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The id of the Team.
   * @return teamId
  */
  @ApiModelProperty(value = "The id of the Team.")


  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public TeamMembershipStatus userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The principal id of the user.
   * @return userId
  */
  @ApiModelProperty(value = "The principal id of the user.")


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
    TeamMembershipStatus teamMembershipStatus = (TeamMembershipStatus) o;
    return Objects.equals(this.canJoin, teamMembershipStatus.canJoin) &&
        Objects.equals(this.canSendEmail, teamMembershipStatus.canSendEmail) &&
        Objects.equals(this.hasOpenInvitation, teamMembershipStatus.hasOpenInvitation) &&
        Objects.equals(this.hasOpenRequest, teamMembershipStatus.hasOpenRequest) &&
        Objects.equals(this.hasUnmetAccessRequirement, teamMembershipStatus.hasUnmetAccessRequirement) &&
        Objects.equals(this.isMember, teamMembershipStatus.isMember) &&
        Objects.equals(this.membershipApprovalRequired, teamMembershipStatus.membershipApprovalRequired) &&
        Objects.equals(this.teamId, teamMembershipStatus.teamId) &&
        Objects.equals(this.userId, teamMembershipStatus.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canJoin, canSendEmail, hasOpenInvitation, hasOpenRequest, hasUnmetAccessRequirement, isMember, membershipApprovalRequired, teamId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMembershipStatus {\n");
    
    sb.append("    canJoin: ").append(toIndentedString(canJoin)).append("\n");
    sb.append("    canSendEmail: ").append(toIndentedString(canSendEmail)).append("\n");
    sb.append("    hasOpenInvitation: ").append(toIndentedString(hasOpenInvitation)).append("\n");
    sb.append("    hasOpenRequest: ").append(toIndentedString(hasOpenRequest)).append("\n");
    sb.append("    hasUnmetAccessRequirement: ").append(toIndentedString(hasUnmetAccessRequirement)).append("\n");
    sb.append("    isMember: ").append(toIndentedString(isMember)).append("\n");
    sb.append("    membershipApprovalRequired: ").append(toIndentedString(membershipApprovalRequired)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
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

