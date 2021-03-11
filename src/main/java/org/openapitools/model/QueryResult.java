package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.QueryNextPageToken;
import org.openapitools.model.RowSet;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A page of query result.
 */
@ApiModel(description = "A page of query result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class QueryResult   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("nextPageToken")
  private QueryNextPageToken nextPageToken;

  @JsonProperty("queryResults")
  private RowSet queryResults;

  public QueryResult concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * Concrete Type
   * @return concreteType
  */
  @ApiModelProperty(value = "Concrete Type")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public QueryResult nextPageToken(QueryNextPageToken nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Get nextPageToken
   * @return nextPageToken
  */
  @ApiModelProperty(value = "")

  @Valid

  public QueryNextPageToken getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(QueryNextPageToken nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public QueryResult queryResults(RowSet queryResults) {
    this.queryResults = queryResults;
    return this;
  }

  /**
   * Get queryResults
   * @return queryResults
  */
  @ApiModelProperty(value = "")

  @Valid

  public RowSet getQueryResults() {
    return queryResults;
  }

  public void setQueryResults(RowSet queryResults) {
    this.queryResults = queryResults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResult queryResult = (QueryResult) o;
    return Objects.equals(this.concreteType, queryResult.concreteType) &&
        Objects.equals(this.nextPageToken, queryResult.nextPageToken) &&
        Objects.equals(this.queryResults, queryResult.queryResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, nextPageToken, queryResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResult {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    queryResults: ").append(toIndentedString(queryResults)).append("\n");
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

