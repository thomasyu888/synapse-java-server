package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.UserProfile;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of User Profiles.
 */
@ApiModel(description = "List of User Profiles.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ListWrapperOfUserProfile   {
  @JsonProperty("list")
  @Valid
  private List<UserProfile> list = null;

  public ListWrapperOfUserProfile list(List<UserProfile> list) {
    this.list = list;
    return this;
  }

  public ListWrapperOfUserProfile addListItem(UserProfile listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

  /**
   * List of UserProfiles.
   * @return list
  */
  @ApiModelProperty(value = "List of UserProfiles.")

  @Valid

  public List<UserProfile> getList() {
    return list;
  }

  public void setList(List<UserProfile> list) {
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
    ListWrapperOfUserProfile listWrapperOfUserProfile = (ListWrapperOfUserProfile) o;
    return Objects.equals(this.list, listWrapperOfUserProfile.list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListWrapperOfUserProfile {\n");
    
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

