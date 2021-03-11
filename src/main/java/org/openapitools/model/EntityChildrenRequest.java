package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EntityType;
import org.openapitools.model.SortBy;
import org.openapitools.model.SortDirection;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request for EntityHeaders of the children of a given parent Entity
 */
@ApiModel(description = "Request for EntityHeaders of the children of a given parent Entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EntityChildrenRequest   {
  @JsonProperty("includeSumFileSizes")
  private Boolean includeSumFileSizes = false;

  @JsonProperty("includeTotalChildCount")
  private Boolean includeTotalChildCount = false;

  @JsonProperty("includeTypes")
  @Valid
  private List<EntityType> includeTypes = null;

  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("parentId")
  private String parentId;

  @JsonProperty("sortBy")
  private SortBy sortBy;

  @JsonProperty("sortDirection")
  private SortDirection sortDirection;

  public EntityChildrenRequest includeSumFileSizes(Boolean includeSumFileSizes) {
    this.includeSumFileSizes = includeSumFileSizes;
    return this;
  }

  /**
   * When true, the sum of the files sizes (bytes) with the given parentId and types will be included. False by default
   * @return includeSumFileSizes
  */
  @ApiModelProperty(value = "When true, the sum of the files sizes (bytes) with the given parentId and types will be included. False by default")


  public Boolean getIncludeSumFileSizes() {
    return includeSumFileSizes;
  }

  public void setIncludeSumFileSizes(Boolean includeSumFileSizes) {
    this.includeSumFileSizes = includeSumFileSizes;
  }

  public EntityChildrenRequest includeTotalChildCount(Boolean includeTotalChildCount) {
    this.includeTotalChildCount = includeTotalChildCount;
    return this;
  }

  /**
   * When true, the total number of children with the givenparentId and types will be included. False by default
   * @return includeTotalChildCount
  */
  @ApiModelProperty(value = "When true, the total number of children with the givenparentId and types will be included. False by default")


  public Boolean getIncludeTotalChildCount() {
    return includeTotalChildCount;
  }

  public void setIncludeTotalChildCount(Boolean includeTotalChildCount) {
    this.includeTotalChildCount = includeTotalChildCount;
  }

  public EntityChildrenRequest includeTypes(List<EntityType> includeTypes) {
    this.includeTypes = includeTypes;
    return this;
  }

  public EntityChildrenRequest addIncludeTypesItem(EntityType includeTypesItem) {
    if (this.includeTypes == null) {
      this.includeTypes = new ArrayList<>();
    }
    this.includeTypes.add(includeTypesItem);
    return this;
  }

  /**
   * The types of children to be include. Must include at least one type.
   * @return includeTypes
  */
  @ApiModelProperty(value = "The types of children to be include. Must include at least one type.")

  @Valid

  public List<EntityType> getIncludeTypes() {
    return includeTypes;
  }

  public void setIncludeTypes(List<EntityType> includeTypes) {
    this.includeTypes = includeTypes;
  }

  public EntityChildrenRequest nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Optional parameter used to fetch the next page of results. When NULL, the first page will be returned. The nextPageToken is provided with the results if there is another page of results.
   * @return nextPageToken
  */
  @ApiModelProperty(value = "Optional parameter used to fetch the next page of results. When NULL, the first page will be returned. The nextPageToken is provided with the results if there is another page of results.")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public EntityChildrenRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The ID of the parent. Set to null to list projects.
   * @return parentId
  */
  @ApiModelProperty(value = "The ID of the parent. Set to null to list projects.")


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public EntityChildrenRequest sortBy(SortBy sortBy) {
    this.sortBy = sortBy;
    return this;
  }

  /**
   * Get sortBy
   * @return sortBy
  */
  @ApiModelProperty(value = "")

  @Valid

  public SortBy getSortBy() {
    return sortBy;
  }

  public void setSortBy(SortBy sortBy) {
    this.sortBy = sortBy;
  }

  public EntityChildrenRequest sortDirection(SortDirection sortDirection) {
    this.sortDirection = sortDirection;
    return this;
  }

  /**
   * Get sortDirection
   * @return sortDirection
  */
  @ApiModelProperty(value = "")

  @Valid

  public SortDirection getSortDirection() {
    return sortDirection;
  }

  public void setSortDirection(SortDirection sortDirection) {
    this.sortDirection = sortDirection;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityChildrenRequest entityChildrenRequest = (EntityChildrenRequest) o;
    return Objects.equals(this.includeSumFileSizes, entityChildrenRequest.includeSumFileSizes) &&
        Objects.equals(this.includeTotalChildCount, entityChildrenRequest.includeTotalChildCount) &&
        Objects.equals(this.includeTypes, entityChildrenRequest.includeTypes) &&
        Objects.equals(this.nextPageToken, entityChildrenRequest.nextPageToken) &&
        Objects.equals(this.parentId, entityChildrenRequest.parentId) &&
        Objects.equals(this.sortBy, entityChildrenRequest.sortBy) &&
        Objects.equals(this.sortDirection, entityChildrenRequest.sortDirection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeSumFileSizes, includeTotalChildCount, includeTypes, nextPageToken, parentId, sortBy, sortDirection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityChildrenRequest {\n");
    
    sb.append("    includeSumFileSizes: ").append(toIndentedString(includeSumFileSizes)).append("\n");
    sb.append("    includeTotalChildCount: ").append(toIndentedString(includeTotalChildCount)).append("\n");
    sb.append("    includeTypes: ").append(toIndentedString(includeTypes)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    sortDirection: ").append(toIndentedString(sortDirection)).append("\n");
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

