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
 * JSON schema for MembershipRequest POJO
 */
@ApiModel(description = "JSON schema for MembershipRequest POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class MembershipRequest   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("expiresOn")
  private String expiresOn;

  @JsonProperty("id")
  private String id;

  @JsonProperty("message")
  private String message;

  @JsonProperty("teamId")
  private String teamId;

  @JsonProperty("userId")
  private String userId;

  public MembershipRequest createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that created this MembershipRequest.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that created this MembershipRequest.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public MembershipRequest createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this MembershipRequest was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this MembershipRequest was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public MembershipRequest expiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
    return this;
  }

  /**
   * The date this MembershipRequest expires (optional).
   * @return expiresOn
  */
  @ApiModelProperty(value = "The date this MembershipRequest expires (optional).")


  public String getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
  }

  public MembershipRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the MembershipRequest.
   * @return id
  */
  @ApiModelProperty(value = "The id of the MembershipRequest.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MembershipRequest message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The request message (optional).
   * @return message
  */
  @ApiModelProperty(value = "The request message (optional).")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public MembershipRequest teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The id of the Team to which the request is sent.
   * @return teamId
  */
  @ApiModelProperty(value = "The id of the Team to which the request is sent.")


  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public MembershipRequest userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The id of the user for whom membership is requested.
   * @return userId
  */
  @ApiModelProperty(value = "The id of the user for whom membership is requested.")


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
    MembershipRequest membershipRequest = (MembershipRequest) o;
    return Objects.equals(this.createdBy, membershipRequest.createdBy) &&
        Objects.equals(this.createdOn, membershipRequest.createdOn) &&
        Objects.equals(this.expiresOn, membershipRequest.expiresOn) &&
        Objects.equals(this.id, membershipRequest.id) &&
        Objects.equals(this.message, membershipRequest.message) &&
        Objects.equals(this.teamId, membershipRequest.teamId) &&
        Objects.equals(this.userId, membershipRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, expiresOn, id, message, teamId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembershipRequest {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

