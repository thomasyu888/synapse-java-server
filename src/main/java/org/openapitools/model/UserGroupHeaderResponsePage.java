package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.UserGroupHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single page of a users/groups info query response.
 */
@ApiModel(description = "A single page of a users/groups info query response.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class UserGroupHeaderResponsePage   {
  @JsonProperty("children")
  @Valid
  private List<UserGroupHeader> children = null;

  @JsonProperty("prefixFilter")
  private String prefixFilter;

  @JsonProperty("totalNumberOfResults")
  private BigDecimal totalNumberOfResults;

  public UserGroupHeaderResponsePage children(List<UserGroupHeader> children) {
    this.children = children;
    return this;
  }

  public UserGroupHeaderResponsePage addChildrenItem(UserGroupHeader childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<>();
    }
    this.children.add(childrenItem);
    return this;
  }

  /**
   * The list of children that match the requested concept.
   * @return children
  */
  @ApiModelProperty(value = "The list of children that match the requested concept.")

  @Valid

  public List<UserGroupHeader> getChildren() {
    return children;
  }

  public void setChildren(List<UserGroupHeader> children) {
    this.children = children;
  }

  public UserGroupHeaderResponsePage prefixFilter(String prefixFilter) {
    this.prefixFilter = prefixFilter;
    return this;
  }

  /**
   * The prefix filter used to generate this result.
   * @return prefixFilter
  */
  @ApiModelProperty(value = "The prefix filter used to generate this result.")


  public String getPrefixFilter() {
    return prefixFilter;
  }

  public void setPrefixFilter(String prefixFilter) {
    this.prefixFilter = prefixFilter;
  }

  public UserGroupHeaderResponsePage totalNumberOfResults(BigDecimal totalNumberOfResults) {
    this.totalNumberOfResults = totalNumberOfResults;
    return this;
  }

  /**
   * Total number of results
   * @return totalNumberOfResults
  */
  @ApiModelProperty(value = "Total number of results")

  @Valid

  public BigDecimal getTotalNumberOfResults() {
    return totalNumberOfResults;
  }

  public void setTotalNumberOfResults(BigDecimal totalNumberOfResults) {
    this.totalNumberOfResults = totalNumberOfResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroupHeaderResponsePage userGroupHeaderResponsePage = (UserGroupHeaderResponsePage) o;
    return Objects.equals(this.children, userGroupHeaderResponsePage.children) &&
        Objects.equals(this.prefixFilter, userGroupHeaderResponsePage.prefixFilter) &&
        Objects.equals(this.totalNumberOfResults, userGroupHeaderResponsePage.totalNumberOfResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(children, prefixFilter, totalNumberOfResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroupHeaderResponsePage {\n");
    
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    prefixFilter: ").append(toIndentedString(prefixFilter)).append("\n");
    sb.append("    totalNumberOfResults: ").append(toIndentedString(totalNumberOfResults)).append("\n");
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

