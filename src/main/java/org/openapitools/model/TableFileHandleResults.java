package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.FileHandleResults;
import org.openapitools.model.SelectColumn;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for TableFileHandleResults.
 */
@ApiModel(description = "JSON schema for TableFileHandleResults.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class TableFileHandleResults   {
  @JsonProperty("headers")
  @Valid
  private List<SelectColumn> headers = null;

  @JsonProperty("rows")
  @Valid
  private List<FileHandleResults> rows = null;

  @JsonProperty("tableId")
  private String tableId;

  public TableFileHandleResults headers(List<SelectColumn> headers) {
    this.headers = headers;
    return this;
  }

  public TableFileHandleResults addHeadersItem(SelectColumn headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    return this;
  }

  /**
   * The list of ColumnModels ID that describes the rows of this set.
   * @return headers
  */
  @ApiModelProperty(value = "The list of ColumnModels ID that describes the rows of this set.")

  @Valid

  public List<SelectColumn> getHeaders() {
    return headers;
  }

  public void setHeaders(List<SelectColumn> headers) {
    this.headers = headers;
  }

  public TableFileHandleResults rows(List<FileHandleResults> rows) {
    this.rows = rows;
    return this;
  }

  public TableFileHandleResults addRowsItem(FileHandleResults rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * For each row a list of file handles for each requested column
   * @return rows
  */
  @ApiModelProperty(value = "For each row a list of file handles for each requested column")

  @Valid

  public List<FileHandleResults> getRows() {
    return rows;
  }

  public void setRows(List<FileHandleResults> rows) {
    this.rows = rows;
  }

  public TableFileHandleResults tableId(String tableId) {
    this.tableId = tableId;
    return this;
  }

  /**
   * The ID of the TableEntity than owns these rows
   * @return tableId
  */
  @ApiModelProperty(value = "The ID of the TableEntity than owns these rows")


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
    TableFileHandleResults tableFileHandleResults = (TableFileHandleResults) o;
    return Objects.equals(this.headers, tableFileHandleResults.headers) &&
        Objects.equals(this.rows, tableFileHandleResults.rows) &&
        Objects.equals(this.tableId, tableFileHandleResults.tableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(headers, rows, tableId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableFileHandleResults {\n");
    
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

