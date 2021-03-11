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
 * Settings for a Challenge Project.
 */
@ApiModel(description = "Settings for a Challenge Project.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Challenge   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("projectId")
  private String projectId;

  @JsonProperty("participantTeamId")
  private String participantTeamId;

  @JsonProperty("id")
  private String id;

  public Challenge etag(String etag) {
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

  public Challenge projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the Project the challenge is used with.
   * @return projectId
  */
  @ApiModelProperty(value = "The ID of the Project the challenge is used with.")


  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public Challenge participantTeamId(String participantTeamId) {
    this.participantTeamId = participantTeamId;
    return this;
  }

  /**
   * The ID of the Team which users join to participate in the Challenge
   * @return participantTeamId
  */
  @ApiModelProperty(value = "The ID of the Team which users join to participate in the Challenge")


  public String getParticipantTeamId() {
    return participantTeamId;
  }

  public void setParticipantTeamId(String participantTeamId) {
    this.participantTeamId = participantTeamId;
  }

  public Challenge id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this Challenge object
   * @return id
  */
  @ApiModelProperty(value = "The ID of this Challenge object")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Challenge challenge = (Challenge) o;
    return Objects.equals(this.etag, challenge.etag) &&
        Objects.equals(this.projectId, challenge.projectId) &&
        Objects.equals(this.participantTeamId, challenge.participantTeamId) &&
        Objects.equals(this.id, challenge.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, projectId, participantTeamId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Challenge {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    participantTeamId: ").append(toIndentedString(participantTeamId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

