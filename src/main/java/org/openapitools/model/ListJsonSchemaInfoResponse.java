package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.JsonSchemaInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single page of the currently registered Organizations
 */
@ApiModel(description = "A single page of the currently registered Organizations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ListJsonSchemaInfoResponse   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("page")
  @Valid
  private List<JsonSchemaInfo> page = null;

  public ListJsonSchemaInfoResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Forward this token to get the next page of results.
   * @return nextPageToken
  */
  @ApiModelProperty(value = "Forward this token to get the next page of results.")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public ListJsonSchemaInfoResponse page(List<JsonSchemaInfo> page) {
    this.page = page;
    return this;
  }

  public ListJsonSchemaInfoResponse addPageItem(JsonSchemaInfo pageItem) {
    if (this.page == null) {
      this.page = new ArrayList<>();
    }
    this.page.add(pageItem);
    return this;
  }

  /**
   * Page of JsonSchemaInfo.
   * @return page
  */
  @ApiModelProperty(value = "Page of JsonSchemaInfo.")

  @Valid

  public List<JsonSchemaInfo> getPage() {
    return page;
  }

  public void setPage(List<JsonSchemaInfo> page) {
    this.page = page;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListJsonSchemaInfoResponse listJsonSchemaInfoResponse = (ListJsonSchemaInfoResponse) o;
    return Objects.equals(this.nextPageToken, listJsonSchemaInfoResponse.nextPageToken) &&
        Objects.equals(this.page, listJsonSchemaInfoResponse.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListJsonSchemaInfoResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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

