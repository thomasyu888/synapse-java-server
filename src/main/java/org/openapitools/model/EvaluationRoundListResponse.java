package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EvaluationRound;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of evaluation rounds
 */
@ApiModel(description = "List of evaluation rounds")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EvaluationRoundListResponse   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("page")
  @Valid
  private List<EvaluationRound> page = null;

  public EvaluationRoundListResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The token required to be sent with the subsequent batch.
   * @return nextPageToken
  */
  @ApiModelProperty(value = "The token required to be sent with the subsequent batch.")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public EvaluationRoundListResponse page(List<EvaluationRound> page) {
    this.page = page;
    return this;
  }

  public EvaluationRoundListResponse addPageItem(EvaluationRound pageItem) {
    if (this.page == null) {
      this.page = new ArrayList<>();
    }
    this.page.add(pageItem);
    return this;
  }

  /**
   * Evaluation round
   * @return page
  */
  @ApiModelProperty(value = "Evaluation round")

  @Valid

  public List<EvaluationRound> getPage() {
    return page;
  }

  public void setPage(List<EvaluationRound> page) {
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
    EvaluationRoundListResponse evaluationRoundListResponse = (EvaluationRoundListResponse) o;
    return Objects.equals(this.nextPageToken, evaluationRoundListResponse.nextPageToken) &&
        Objects.equals(this.page, evaluationRoundListResponse.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, page);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationRoundListResponse {\n");
    
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

