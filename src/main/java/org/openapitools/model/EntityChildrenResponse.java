package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EntityHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response of EntityHeaders for the children of a given parent Entity
 */
@ApiModel(description = "Response of EntityHeaders for the children of a given parent Entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EntityChildrenResponse   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("page")
  @Valid
  private List<EntityHeader> page = null;

  @JsonProperty("sumFileSizesBytes")
  private Integer sumFileSizesBytes;

  @JsonProperty("totalChildCount")
  private Integer totalChildCount;

  public EntityChildrenResponse nextPageToken(String nextPageToken) {
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

  public EntityChildrenResponse page(List<EntityHeader> page) {
    this.page = page;
    return this;
  }

  public EntityChildrenResponse addPageItem(EntityHeader pageItem) {
    if (this.page == null) {
      this.page = new ArrayList<>();
    }
    this.page.add(pageItem);
    return this;
  }

  /**
   * The headers of each child.
   * @return page
  */
  @ApiModelProperty(value = "The headers of each child.")

  @Valid

  public List<EntityHeader> getPage() {
    return page;
  }

  public void setPage(List<EntityHeader> page) {
    this.page = page;
  }

  public EntityChildrenResponse sumFileSizesBytes(Integer sumFileSizesBytes) {
    this.sumFileSizesBytes = sumFileSizesBytes;
    return this;
  }

  /**
   * The sum of the file sizes (bytes) with the requested parentId and types. Only returned if requested.
   * @return sumFileSizesBytes
  */
  @ApiModelProperty(value = "The sum of the file sizes (bytes) with the requested parentId and types. Only returned if requested.")


  public Integer getSumFileSizesBytes() {
    return sumFileSizesBytes;
  }

  public void setSumFileSizesBytes(Integer sumFileSizesBytes) {
    this.sumFileSizesBytes = sumFileSizesBytes;
  }

  public EntityChildrenResponse totalChildCount(Integer totalChildCount) {
    this.totalChildCount = totalChildCount;
    return this;
  }

  /**
   * The total number of children with the requested parentId and types. Only returned if requested.
   * @return totalChildCount
  */
  @ApiModelProperty(value = "The total number of children with the requested parentId and types. Only returned if requested.")


  public Integer getTotalChildCount() {
    return totalChildCount;
  }

  public void setTotalChildCount(Integer totalChildCount) {
    this.totalChildCount = totalChildCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityChildrenResponse entityChildrenResponse = (EntityChildrenResponse) o;
    return Objects.equals(this.nextPageToken, entityChildrenResponse.nextPageToken) &&
        Objects.equals(this.page, entityChildrenResponse.page) &&
        Objects.equals(this.sumFileSizesBytes, entityChildrenResponse.sumFileSizesBytes) &&
        Objects.equals(this.totalChildCount, entityChildrenResponse.totalChildCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, page, sumFileSizesBytes, totalChildCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityChildrenResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    sumFileSizesBytes: ").append(toIndentedString(sumFileSizesBytes)).append("\n");
    sb.append("    totalChildCount: ").append(toIndentedString(totalChildCount)).append("\n");
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

