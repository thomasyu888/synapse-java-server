package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.JsonSchemaVersionInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single page of schema version metadata for the provided organization and schema name
 */
@ApiModel(description = "A single page of schema version metadata for the provided organization and schema name")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ListJsonSchemaVersionInfoResponse   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("page")
  @Valid
  private List<JsonSchemaVersionInfo> page = null;

  public ListJsonSchemaVersionInfoResponse nextPageToken(String nextPageToken) {
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

  public ListJsonSchemaVersionInfoResponse page(List<JsonSchemaVersionInfo> page) {
    this.page = page;
    return this;
  }

  public ListJsonSchemaVersionInfoResponse addPageItem(JsonSchemaVersionInfo pageItem) {
    if (this.page == null) {
      this.page = new ArrayList<>();
    }
    this.page.add(pageItem);
    return this;
  }

  /**
   * Page of JSON Schema version info
   * @return page
  */
  @ApiModelProperty(value = "Page of JSON Schema version info")

  @Valid

  public List<JsonSchemaVersionInfo> getPage() {
    return page;
  }

  public void setPage(List<JsonSchemaVersionInfo> page) {
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
    ListJsonSchemaVersionInfoResponse listJsonSchemaVersionInfoResponse = (ListJsonSchemaVersionInfoResponse) o;
    return Objects.equals(this.nextPageToken, listJsonSchemaVersionInfoResponse.nextPageToken) &&
        Objects.equals(this.page, listJsonSchemaVersionInfoResponse.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListJsonSchemaVersionInfoResponse {\n");
    
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

