package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FormData;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single page of results from a ListRequest.
 */
@ApiModel(description = "A single page of results from a ListRequest.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ListResponse   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("page")
  @Valid
  private List<FormData> page = null;

  public ListResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The results are automatically paginated. If another page of results exists then a nextPageToken will be provided. Forward the provided nextPageTokens in a subsequent list request to get the next page. 
   * @return nextPageToken
  */
  @ApiModelProperty(value = "The results are automatically paginated. If another page of results exists then a nextPageToken will be provided. Forward the provided nextPageTokens in a subsequent list request to get the next page. ")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public ListResponse page(List<FormData> page) {
    this.page = page;
    return this;
  }

  public ListResponse addPageItem(FormData pageItem) {
    if (this.page == null) {
      this.page = new ArrayList<>();
    }
    this.page.add(pageItem);
    return this;
  }

  /**
   * A single page of results matching the request.
   * @return page
  */
  @ApiModelProperty(value = "A single page of results matching the request.")

  @Valid

  public List<FormData> getPage() {
    return page;
  }

  public void setPage(List<FormData> page) {
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
    ListResponse listResponse = (ListResponse) o;
    return Objects.equals(this.nextPageToken, listResponse.nextPageToken) &&
        Objects.equals(this.page, listResponse.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListResponse {\n");
    
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

