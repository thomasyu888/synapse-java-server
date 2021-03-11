package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TeamMember;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A list of Teams
 */
@ApiModel(description = "A list of Teams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ListWrapperOfTeamMember   {
  @JsonProperty("list")
  @Valid
  private List<TeamMember> list = null;

  public ListWrapperOfTeamMember list(List<TeamMember> list) {
    this.list = list;
    return this;
  }

  public ListWrapperOfTeamMember addListItem(TeamMember listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * List of teams
   * @return list
  */
  @ApiModelProperty(value = "List of teams")

  @Valid

  public List<TeamMember> getList() {
    return list;
  }

  public void setList(List<TeamMember> list) {
    this.list = list;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListWrapperOfTeamMember listWrapperOfTeamMember = (ListWrapperOfTeamMember) o;
    return Objects.equals(this.list, listWrapperOfTeamMember.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWrapperOfTeamMember {\n");
    
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

