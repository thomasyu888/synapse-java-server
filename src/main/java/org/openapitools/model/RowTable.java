package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents a single row of a TableEntity
 */
@ApiModel(description = "Represents a single row of a TableEntity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class RowTable   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("rowId")
  private Integer rowId;

  @JsonProperty("values")
  @Valid
  private List<String> values = null;

  @JsonProperty("versionNumber")
  private Integer versionNumber;

  public RowTable etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * For queries against EntityViews with query.includeEtag=true, this field will contain the etag of the entity. Will be null for all other cases.
   * @return etag
  */
  @ApiModelProperty(value = "For queries against EntityViews with query.includeEtag=true, this field will contain the etag of the entity. Will be null for all other cases.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public RowTable rowId(Integer rowId) {
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

  public RowTable values(List<String> values) {
    this.values = values;
    return this;
  }

  public RowTable addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * The values for each column of this row. To delete a row, set this to an empty list: []
   * @return values
  */
  @ApiModelProperty(value = "The values for each column of this row. To delete a row, set this to an empty list: []")


  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }

  public RowTable versionNumber(Integer versionNumber) {
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
    RowTable rowTable = (RowTable) o;
    return Objects.equals(this.etag, rowTable.etag) &&
        Objects.equals(this.rowId, rowTable.rowId) &&
        Objects.equals(this.values, rowTable.values) &&
        Objects.equals(this.versionNumber, rowTable.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, rowId, values, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RowTable {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

