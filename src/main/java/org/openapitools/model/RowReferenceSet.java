package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.RowReference;
import org.openapitools.model.SelectColumn;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a set of RowReferences of a TableEntity
 */
@ApiModel(description = "Represents a set of RowReferences of a TableEntity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class RowReferenceSet   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("headers")
  @Valid
  private List<SelectColumn> headers = null;

  @JsonProperty("rows")
  @Valid
  private List<RowReference> rows = null;

  @JsonProperty("tableId")
  private String tableId;

  public RowReferenceSet etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * When a RowReferenceSet is returned from a table update, this will be set to the current etag of the table.
   * @return etag
  */
  @ApiModelProperty(value = "When a RowReferenceSet is returned from a table update, this will be set to the current etag of the table.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public RowReferenceSet headers(List<SelectColumn> headers) {
    this.headers = headers;
    return this;
  }

  public RowReferenceSet addHeadersItem(SelectColumn headersItem) {
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

  public RowReferenceSet rows(List<RowReference> rows) {
    this.rows = rows;
    return this;
  }

  public RowReferenceSet addRowsItem(RowReference rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * Each RowReference of this list refers to a single version of a single row of a TableEntity.
   * @return rows
  */
  @ApiModelProperty(value = "Each RowReference of this list refers to a single version of a single row of a TableEntity.")

  @Valid

  public List<RowReference> getRows() {
    return rows;
  }

  public void setRows(List<RowReference> rows) {
    this.rows = rows;
  }

  public RowReferenceSet tableId(String tableId) {
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
    RowReferenceSet rowReferenceSet = (RowReferenceSet) o;
    return Objects.equals(this.etag, rowReferenceSet.etag) &&
        Objects.equals(this.headers, rowReferenceSet.headers) &&
        Objects.equals(this.rows, rowReferenceSet.rows) &&
        Objects.equals(this.tableId, rowReferenceSet.tableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, headers, rows, tableId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowReferenceSet {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

