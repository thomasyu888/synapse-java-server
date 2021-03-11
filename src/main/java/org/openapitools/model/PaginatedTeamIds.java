package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Container for a page of team IDs.
 */
@ApiModel(description = "Container for a page of team IDs.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class PaginatedTeamIds   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("teamIds")
  @Valid
  private List<String> teamIds = null;

  public PaginatedTeamIds nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Token that can be used to get the next page. Null if there are no more results.
   * @return nextPageToken
  */
  @ApiModelProperty(value = "Token that can be used to get the next page. Null if there are no more results.")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public PaginatedTeamIds teamIds(List<String> teamIds) {
    this.teamIds = teamIds;
    return this;
  }

  public PaginatedTeamIds addTeamIdsItem(String teamIdsItem) {
    if (this.teamIds == null) {
      this.teamIds = new ArrayList<>();
    }
    this.teamIds.add(teamIdsItem);
    return this;
  }

  /**
   * The requested team IDs.
   * @return teamIds
  */
  @ApiModelProperty(value = "The requested team IDs.")


  public List<String> getTeamIds() {
    return teamIds;
  }

  public void setTeamIds(List<String> teamIds) {
    this.teamIds = teamIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginatedTeamIds paginatedTeamIds = (PaginatedTeamIds) o;
    return Objects.equals(this.nextPageToken, paginatedTeamIds.nextPageToken) &&
        Objects.equals(this.teamIds, paginatedTeamIds.teamIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, teamIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginatedTeamIds {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
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

