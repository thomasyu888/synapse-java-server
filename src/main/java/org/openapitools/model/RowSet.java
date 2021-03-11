package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.RowTable;
import org.openapitools.model.SelectColumn;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a set of row of a TableEntity
 */
@ApiModel(description = "Represents a set of row of a TableEntity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class RowSet   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("headers")
  @Valid
  private List<SelectColumn> headers = null;

  @JsonProperty("rows")
  @Valid
  private List<RowTable> rows = null;

  @JsonProperty("tableId")
  private String tableId;

  public RowSet concreteType(String concreteType) {
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

  public RowSet etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Any RowSet returned from Synapse will contain the current etag of the change set. To update any rows from a RowSet the etag must be provided with the POST.
   * @return etag
  */
  @ApiModelProperty(value = "Any RowSet returned from Synapse will contain the current etag of the change set. To update any rows from a RowSet the etag must be provided with the POST.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public RowSet headers(List<SelectColumn> headers) {
    this.headers = headers;
    return this;
  }

  public RowSet addHeadersItem(SelectColumn headersItem) {
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

  public RowSet rows(List<RowTable> rows) {
    this.rows = rows;
    return this;
  }

  public RowSet addRowsItem(RowTable rowsItem) {
    if (this.rows == null) {
      this.rows = new ArrayList<>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * The Rows of this set. The index of each row value aligns with the index of each header.
   * @return rows
  */
  @ApiModelProperty(value = "The Rows of this set. The index of each row value aligns with the index of each header.")

  @Valid

  public List<RowTable> getRows() {
    return rows;
  }

  public void setRows(List<RowTable> rows) {
    this.rows = rows;
  }

  public RowSet tableId(String tableId) {
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
    RowSet rowSet = (RowSet) o;
    return Objects.equals(this.concreteType, rowSet.concreteType) &&
        Objects.equals(this.etag, rowSet.etag) &&
        Objects.equals(this.headers, rowSet.headers) &&
        Objects.equals(this.rows, rowSet.rows) &&
        Objects.equals(this.tableId, rowSet.tableId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, etag, headers, rows, tableId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowSet {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
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

