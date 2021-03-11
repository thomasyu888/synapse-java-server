package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SelectColumn;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The response body of an asynchronous CSV table download job.
 */
@ApiModel(description = "The response body of an asynchronous CSV table download job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class DownloadFromTableResult   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("headers")
  @Valid
  private List<SelectColumn> headers = null;

  @JsonProperty("resultsFileHandleId")
  private String resultsFileHandleId;

  @JsonProperty("tableId")
  private String tableId;

  public DownloadFromTableResult concreteType(String concreteType) {
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

  public DownloadFromTableResult etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Any RowSet returned from Synapse will contain the current etag of the change set. To update any rows from a RowSet the etag must be provided with the POST. 
   * @return etag
  */
  @ApiModelProperty(value = "Any RowSet returned from Synapse will contain the current etag of the change set. To update any rows from a RowSet the etag must be provided with the POST. ")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public DownloadFromTableResult headers(List<SelectColumn> headers) {
    this.headers = headers;
    return this;
  }

  public DownloadFromTableResult addHeadersItem(SelectColumn headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

  /**
   * The list of SelectColumns that describes the rows of this set.
   * @return headers
  */
  @ApiModelProperty(value = "The list of SelectColumns that describes the rows of this set.")

  @Valid

  public List<SelectColumn> getHeaders() {
    return headers;
  }

  public void setHeaders(List<SelectColumn> headers) {
    this.headers = headers;
  }

  public DownloadFromTableResult resultsFileHandleId(String resultsFileHandleId) {
    this.resultsFileHandleId = resultsFileHandleId;
    return this;
  }

  /**
   * The resulting file handle ID can be used to download the CSV file created by this job. The file will contain all of the data requested in the query SQL provided when the job was started. 
   * @return resultsFileHandleId
  */
  @ApiModelProperty(value = "The resulting file handle ID can be used to download the CSV file created by this job. The file will contain all of the data requested in the query SQL provided when the job was started. ")


  public String getResultsFileHandleId() {
    return resultsFileHandleId;
  }

  public void setResultsFileHandleId(String resultsFileHandleId) {
    this.resultsFileHandleId = resultsFileHandleId;
  }

  public DownloadFromTableResult tableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * The ID of the table identified in the from clause of the table query.
   * @return tableId
  */
  @ApiModelProperty(value = "The ID of the table identified in the from clause of the table query.")


  public String getTableId() {
    return tableId;
  }

  public void setTableId(String tableId) {
    this.tableId = tableId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadFromTableResult downloadFromTableResult = (DownloadFromTableResult) o;
    return Objects.equals(this.concreteType, downloadFromTableResult.concreteType) &&
        Objects.equals(this.etag, downloadFromTableResult.etag) &&
        Objects.equals(this.headers, downloadFromTableResult.headers) &&
        Objects.equals(this.resultsFileHandleId, downloadFromTableResult.resultsFileHandleId) &&
        Objects.equals(this.tableId, downloadFromTableResult.tableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, etag, headers, resultsFileHandleId, tableId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadFromTableResult {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    resultsFileHandleId: ").append(toIndentedString(resultsFileHandleId)).append("\n");
    sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
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

