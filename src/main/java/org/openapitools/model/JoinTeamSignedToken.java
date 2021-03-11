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
 * Signed token containing the information needed to join a new user to a team.
 */
@ApiModel(description = "Signed token containing the information needed to join a new user to a team.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class JoinTeamSignedToken   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("expiresOn")
  private String expiresOn;

  @JsonProperty("hmac")
  private String hmac;

  @JsonProperty("memberId")
  private String memberId;

  @JsonProperty("teamId")
  private String teamId;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("version")
  private Integer version;

  public JoinTeamSignedToken concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * Concrete Type
   * @return concreteType
  */
  @ApiModelProperty(value = "Concrete Type")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public JoinTeamSignedToken createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date-time the token was generated.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date-time the token was generated.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public JoinTeamSignedToken expiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
    return this;
  }

  /**
   * The date-time when this token expires.
   * @return expiresOn
  */
  @ApiModelProperty(value = "The date-time when this token expires.")


  public String getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
  }

  public JoinTeamSignedToken hmac(String hmac) {
    this.hmac = hmac;
    return this;
  }

  /**
   * The hash message authentication code for the message.
   * @return hmac
  */
  @ApiModelProperty(value = "The hash message authentication code for the message.")


  public String getHmac() {
    return hmac;
  }

  public void setHmac(String hmac) {
    this.hmac = hmac;
  }

  public JoinTeamSignedToken memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * The ID of the new team member.
   * @return memberId
  */
  @ApiModelProperty(value = "The ID of the new team member.")


  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public JoinTeamSignedToken teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The ID of the team which the user was invited to join.
   * @return teamId
  */
  @ApiModelProperty(value = "The ID of the team which the user was invited to join.")


  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public JoinTeamSignedToken userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user who is acting to add the new member to the Team. The HMAC in the token authenticates that the request is being made by this user.' 
   * @return userId
  */
  @ApiModelProperty(value = "The ID of the user who is acting to add the new member to the Team. The HMAC in the token authenticates that the request is being made by this user.' ")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public JoinTeamSignedToken version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the key used to generate the HMAC.
   * @return version
  */
  @ApiModelProperty(value = "The version of the key used to generate the HMAC.")


  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JoinTeamSignedToken joinTeamSignedToken = (JoinTeamSignedToken) o;
    return Objects.equals(this.concreteType, joinTeamSignedToken.concreteType) &&
        Objects.equals(this.createdOn, joinTeamSignedToken.createdOn) &&
        Objects.equals(this.expiresOn, joinTeamSignedToken.expiresOn) &&
        Objects.equals(this.hmac, joinTeamSignedToken.hmac) &&
        Objects.equals(this.memberId, joinTeamSignedToken.memberId) &&
        Objects.equals(this.teamId, joinTeamSignedToken.teamId) &&
        Objects.equals(this.userId, joinTeamSignedToken.userId) &&
        Objects.equals(this.version, joinTeamSignedToken.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, createdOn, expiresOn, hmac, memberId, teamId, userId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JoinTeamSignedToken {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    hmac: ").append(toIndentedString(hmac)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

