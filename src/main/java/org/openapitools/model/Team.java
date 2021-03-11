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
 * JSON schema for Team POJO
 */
@ApiModel(description = "JSON schema for Team POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Team   {
  @JsonProperty("canPublicJoin")
  private Boolean canPublicJoin;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("description")
  private String description;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("icon")
  private String icon;

  @JsonProperty("id")
  private String id;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("name")
  private String name;

  public Team canPublicJoin(Boolean canPublicJoin) {
    this.canPublicJoin = canPublicJoin;
    return this;
  }

  /**
   * true for teams which members can join without an invitation or approval
   * @return canPublicJoin
  */
  @ApiModelProperty(value = "true for teams which members can join without an invitation or approval")


  public Boolean getCanPublicJoin() {
    return canPublicJoin;
  }

  public void setCanPublicJoin(Boolean canPublicJoin) {
    this.canPublicJoin = canPublicJoin;
  }

  public Team createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that created this Team.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that created this Team.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Team createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this Team was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this Team was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public Team description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A short description of this Team.
   * @return description
  */
  @ApiModelProperty(value = "A short description of this Team.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Team etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time a Team is updated it is used to detect when a client's current representation of a Team is out-of-date. 
   * @return etag
  */
  @ApiModelProperty(value = "Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time a Team is updated it is used to detect when a client's current representation of a Team is out-of-date. ")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Team icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * fileHandleId for icon image of the Team
   * @return icon
  */
  @ApiModelProperty(value = "fileHandleId for icon image of the Team")


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public Team id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the Team.
   * @return id
  */
  @ApiModelProperty(value = "The id of the Team.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Team modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The ID of the user that last modified this Team.
   * @return modifiedBy
  */
  @ApiModelProperty(value = "The ID of the user that last modified this Team.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Team modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date this Team was last modified.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date this Team was last modified.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public Team name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the Team.
   * @return name
  */
  @ApiModelProperty(value = "The name of the Team.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Team team = (Team) o;
    return Objects.equals(this.canPublicJoin, team.canPublicJoin) &&
        Objects.equals(this.createdBy, team.createdBy) &&
        Objects.equals(this.createdOn, team.createdOn) &&
        Objects.equals(this.description, team.description) &&
        Objects.equals(this.etag, team.etag) &&
        Objects.equals(this.icon, team.icon) &&
        Objects.equals(this.id, team.id) &&
        Objects.equals(this.modifiedBy, team.modifiedBy) &&
        Objects.equals(this.modifiedOn, team.modifiedOn) &&
        Objects.equals(this.name, team.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canPublicJoin, createdBy, createdOn, description, etag, icon, id, modifiedBy, modifiedOn, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Team {\n");
    
    sb.append("    canPublicJoin: ").append(toIndentedString(canPublicJoin)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

