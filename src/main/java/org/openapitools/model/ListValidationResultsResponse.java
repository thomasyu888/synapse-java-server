package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ValidationResults;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single page of the JSON schema validation results.
 */
@ApiModel(description = "A single page of the JSON schema validation results.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ListValidationResultsResponse   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("page")
  @Valid
  private List<ValidationResults> page = null;

  public ListValidationResultsResponse nextPageToken(String nextPageToken) {
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

  public ListValidationResultsResponse page(List<ValidationResults> page) {
    this.page = page;
    return this;
  }

  public ListValidationResultsResponse addPageItem(ValidationResults pageItem) {
    if (this.page == null) {
      this.page = new ArrayList<>();
    }
    this.page.add(pageItem);
    return this;
  }

  /**
   * Page of results
   * @return page
  */
  @ApiModelProperty(value = "Page of results")

  @Valid

  public List<ValidationResults> getPage() {
    return page;
  }

  public void setPage(List<ValidationResults> page) {
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
    ListValidationResultsResponse listValidationResultsResponse = (ListValidationResultsResponse) o;
    return Objects.equals(this.nextPageToken, listValidationResultsResponse.nextPageToken) &&
        Objects.equals(this.page, listValidationResultsResponse.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListValidationResultsResponse {\n");
    
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

