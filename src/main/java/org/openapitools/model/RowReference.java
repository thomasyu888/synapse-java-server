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
 * Reference for a single Row of a TableEntity
 */
@ApiModel(description = "Reference for a single Row of a TableEntity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class RowReference   {
  @JsonProperty("rowId")
  private Integer rowId;

  @JsonProperty("versionNumber")
  private Integer versionNumber;

  public RowReference rowId(Integer rowId) {
    this.rowId = rowId;
    return this;
  }

  /**
   * The immutable ID issued to a new row.
   * @return rowId
  */
  @ApiModelProperty(value = "The immutable ID issued to a new row.")


  public Integer getRowId() {
    return rowId;
  }

  public void setRowId(Integer rowId) {
    this.rowId = rowId;
  }

  public RowReference versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * The version number of this row. Each row version is immutable, so when a row is updated a new version is created.
   * @return versionNumber
  */
  @ApiModelProperty(value = "The version number of this row. Each row version is immutable, so when a row is updated a new version is created.")


  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RowReference rowReference = (RowReference) o;
    return Objects.equals(this.rowId, rowReference.rowId) &&
        Objects.equals(this.versionNumber, rowReference.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowId, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowReference {\n");
    
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

