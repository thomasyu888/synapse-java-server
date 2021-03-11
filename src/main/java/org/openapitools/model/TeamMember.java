package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserGroupHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for Team Member, which bundles UserGroupHeader and isAdmin
 */
@ApiModel(description = "JSON schema for Team Member, which bundles UserGroupHeader and isAdmin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class TeamMember   {
  @JsonProperty("isAdmin")
  private Boolean isAdmin;

  @JsonProperty("member")
  private UserGroupHeader member;

  @JsonProperty("teamId")
  private String teamId;

  public TeamMember isAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
    return this;
  }

  /**
   * True if the user is an administrator in the Team.
   * @return isAdmin
  */
  @ApiModelProperty(value = "True if the user is an administrator in the Team.")


  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }

  public TeamMember member(UserGroupHeader member) {
    this.member = member;
    return this;
  }

  /**
   * Get member
   * @return member
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserGroupHeader getMember() {
    return member;
  }

  public void setMember(UserGroupHeader member) {
    this.member = member;
  }

  public TeamMember teamId(String teamId) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamMember teamMember = (TeamMember) o;
    return Objects.equals(this.isAdmin, teamMember.isAdmin) &&
        Objects.equals(this.member, teamMember.member) &&
        Objects.equals(this.teamId, teamMember.teamId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAdmin, member, teamId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamMember {\n");
    
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    member: ").append(toIndentedString(member)).append("\n");
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

