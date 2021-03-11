package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.StateEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request for a list of FormData matching the provided filters.
 */
@ApiModel(description = "Request for a list of FormData matching the provided filters.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ListRequest   {
  @JsonProperty("filterByState")
  @Valid
  private List<StateEnum> filterByState = null;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("nextPageToken")
  private String nextPageToken;

  public ListRequest filterByState(List<StateEnum> filterByState) {
    this.filterByState = filterByState;
    return this;
  }

  public ListRequest addFilterByStateItem(StateEnum filterByStateItem) {
    if (this.filterByState == null) {
      this.filterByState = new ArrayList<>();
    }
    this.filterByState.add(filterByStateItem);
    return this;
  }

  /**
   * Only return results with a state that matches elements from this set. Required. Must include at least one element. 
   * @return filterByState
  */
  @ApiModelProperty(value = "Only return results with a state that matches elements from this set. Required. Must include at least one element. ")

  @Valid

  public List<StateEnum> getFilterByState() {
    return filterByState;
  }

  public void setFilterByState(List<StateEnum> filterByState) {
    this.filterByState = filterByState;
  }

  public ListRequest groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The group identifier. Required.
   * @return groupId
  */
  @ApiModelProperty(value = "The group identifier. Required.")


  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ListRequest nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The results are automatically paginated. To get the next page, forward the nextPageToken returned from the last request. 
   * @return nextPageToken
  */
  @ApiModelProperty(value = "The results are automatically paginated. To get the next page, forward the nextPageToken returned from the last request. ")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRequest listRequest = (ListRequest) o;
    return Objects.equals(this.filterByState, listRequest.filterByState) &&
        Objects.equals(this.groupId, listRequest.groupId) &&
        Objects.equals(this.nextPageToken, listRequest.nextPageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filterByState, groupId, nextPageToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRequest {\n");
    
    sb.append("    filterByState: ").append(toIndentedString(filterByState)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
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

