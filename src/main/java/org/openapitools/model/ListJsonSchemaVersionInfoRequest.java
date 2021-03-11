package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request to get a single page of schema version metadata for the given organization and schema name.
 */
@ApiModel(description = "Request to get a single page of schema version metadata for the given organization and schema name.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ListJsonSchemaVersionInfoRequest   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("organizationName")
  private String organizationName;

  @JsonProperty("schemaName")
  private String schemaName;

  public ListJsonSchemaVersionInfoRequest nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Forward the returned 'nextPageToken' to get the next page of results. 
   * @return nextPageToken
  */
  @ApiModelProperty(value = "Forward the returned 'nextPageToken' to get the next page of results. ")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public ListJsonSchemaVersionInfoRequest organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  /**
   * The name of the Organization.
   * @return organizationName
  */
  @ApiModelProperty(value = "The name of the Organization.")


  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }

  public ListJsonSchemaVersionInfoRequest schemaName(String schemaName) {
    this.schemaName = schemaName;
    return this;
  }

  /**
   * The name of the JsonSchema to list versions to list schemas for.
   * @return schemaName
  */
  @ApiModelProperty(value = "The name of the JsonSchema to list versions to list schemas for.")


  public String getSchemaName() {
    return schemaName;
  }

  public void setSchemaName(String schemaName) {
    this.schemaName = schemaName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListJsonSchemaVersionInfoRequest listJsonSchemaVersionInfoRequest = (ListJsonSchemaVersionInfoRequest) o;
    return Objects.equals(this.nextPageToken, listJsonSchemaVersionInfoRequest.nextPageToken) &&
        Objects.equals(this.organizationName, listJsonSchemaVersionInfoRequest.organizationName) &&
        Objects.equals(this.schemaName, listJsonSchemaVersionInfoRequest.schemaName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, organizationName, schemaName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListJsonSchemaVersionInfoRequest {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
    sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
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

