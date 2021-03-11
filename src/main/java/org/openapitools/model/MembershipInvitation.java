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
 * JSON schema for MembershipInvitation POJO
 */
@ApiModel(description = "JSON schema for MembershipInvitation POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class MembershipInvitation   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("expiresOn")
  private String expiresOn;

  @JsonProperty("id")
  private String id;

  @JsonProperty("inviteeEmail")
  private String inviteeEmail;

  @JsonProperty("inviteeId")
  private String inviteeId;

  @JsonProperty("message")
  private String message;

  @JsonProperty("teamId")
  private String teamId;

  public MembershipInvitation createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that created this MembershipInvitation.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that created this MembershipInvitation.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public MembershipInvitation createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this MembershipInvitation was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this MembershipInvitation was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public MembershipInvitation expiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
    return this;
  }

  /**
   * The date this invitation expires (optional).
   * @return expiresOn
  */
  @ApiModelProperty(value = "The date this invitation expires (optional).")


  public String getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
  }

  public MembershipInvitation id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the MembershipInvitation.
   * @return id
  */
  @ApiModelProperty(value = "The id of the MembershipInvitation.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MembershipInvitation inviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
    return this;
  }

  /**
   * The email address of the user being invited to join the Team.
   * @return inviteeEmail
  */
  @ApiModelProperty(value = "The email address of the user being invited to join the Team.")


  public String getInviteeEmail() {
    return inviteeEmail;
  }

  public void setInviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
  }

  public MembershipInvitation inviteeId(String inviteeId) {
    this.inviteeId = inviteeId;
    return this;
  }

  /**
   * The principal ID of the user being invited to join the Team.
   * @return inviteeId
  */
  @ApiModelProperty(value = "The principal ID of the user being invited to join the Team.")


  public String getInviteeId() {
    return inviteeId;
  }

  public void setInviteeId(String inviteeId) {
    this.inviteeId = inviteeId;
  }

  public MembershipInvitation message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The invitation message (optional).
   * @return message
  */
  @ApiModelProperty(value = "The invitation message (optional).")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MembershipInvitation teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The id of the Team which the user is invited to join.
   * @return teamId
  */
  @ApiModelProperty(value = "The id of the Team which the user is invited to join.")


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
    MembershipInvitation membershipInvitation = (MembershipInvitation) o;
    return Objects.equals(this.createdBy, membershipInvitation.createdBy) &&
        Objects.equals(this.createdOn, membershipInvitation.createdOn) &&
        Objects.equals(this.expiresOn, membershipInvitation.expiresOn) &&
        Objects.equals(this.id, membershipInvitation.id) &&
        Objects.equals(this.inviteeEmail, membershipInvitation.inviteeEmail) &&
        Objects.equals(this.inviteeId, membershipInvitation.inviteeId) &&
        Objects.equals(this.message, membershipInvitation.message) &&
        Objects.equals(this.teamId, membershipInvitation.teamId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, expiresOn, id, inviteeEmail, inviteeId, message, teamId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipInvitation {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inviteeEmail: ").append(toIndentedString(inviteeEmail)).append("\n");
    sb.append("    inviteeId: ").append(toIndentedString(inviteeId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

