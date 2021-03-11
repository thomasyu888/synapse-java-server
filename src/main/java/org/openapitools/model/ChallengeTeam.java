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
 * Relationship between a Challenge and registered Team
 */
@ApiModel(description = "Relationship between a Challenge and registered Team")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ChallengeTeam   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("teamId")
  private String teamId;

  @JsonProperty("challengeId")
  private String challengeId;

  @JsonProperty("message")
  private String message;

  @JsonProperty("etag")
  private String etag;

  public ChallengeTeam id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this ChallengeTeam object
   * @return id
  */
  @ApiModelProperty(value = "The ID of this ChallengeTeam object")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChallengeTeam teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The ID of the Team
   * @return teamId
  */
  @ApiModelProperty(value = "The ID of the Team")


  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public ChallengeTeam challengeId(String challengeId) {
    this.challengeId = challengeId;
    return this;
  }

  /**
   * The ID of the Challenge
   * @return challengeId
  */
  @ApiModelProperty(value = "The ID of the Challenge")


  public String getChallengeId() {
    return challengeId;
  }

  public void setChallengeId(String challengeId) {
    this.challengeId = challengeId;
  }

  public ChallengeTeam message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A descriptive message for the Team in the context of the Challenge. Limited to 500 characters.
   * @return message
  */
  @ApiModelProperty(value = "A descriptive message for the Team in the context of the Challenge. Limited to 500 characters.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ChallengeTeam etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time an entity is updated it is used to detect when a client's current representation of an entity is out-of-date.
   * @return etag
  */
  @ApiModelProperty(value = "Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time an entity is updated it is used to detect when a client's current representation of an entity is out-of-date.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChallengeTeam challengeTeam = (ChallengeTeam) o;
    return Objects.equals(this.id, challengeTeam.id) &&
        Objects.equals(this.teamId, challengeTeam.teamId) &&
        Objects.equals(this.challengeId, challengeTeam.challengeId) &&
        Objects.equals(this.message, challengeTeam.message) &&
        Objects.equals(this.etag, challengeTeam.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, teamId, challengeId, message, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChallengeTeam {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    challengeId: ").append(toIndentedString(challengeId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

