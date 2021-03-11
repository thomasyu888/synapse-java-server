package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ColumnModel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Metadata about a TableEntity that can be included in an EntityBundle
 */
@ApiModel(description = "Metadata about a TableEntity that can be included in an EntityBundle")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class TableBundle   {
  @JsonProperty("columnModels")
  @Valid
  private List<ColumnModel> columnModels = null;

  @JsonProperty("maxRowsPerPage")
  private BigDecimal maxRowsPerPage;

  public TableBundle columnModels(List<ColumnModel> columnModels) {
    this.columnModels = columnModels;
    return this;
  }

  public TableBundle addColumnModelsItem(ColumnModel columnModelsItem) {
    if (this.columnModels == null) {
      this.columnModels = new ArrayList<>();
    }
    this.columnModels.add(columnModelsItem);
    return this;
  }

  /**
   * The list of ColumnModels currently used by this table.
   * @return columnModels
  */
  @ApiModelProperty(value = "The list of ColumnModels currently used by this table.")

  @Valid

  public List<ColumnModel> getColumnModels() {
    return columnModels;
  }

  public void setColumnModels(List<ColumnModel> columnModels) {
    this.columnModels = columnModels;
  }

  public TableBundle maxRowsPerPage(BigDecimal maxRowsPerPage) {
    this.maxRowsPerPage = maxRowsPerPage;
    return this;
  }

  /**
   * The maximum number of rows that can be requested or posted for this table in a single call. This is a function of the columns that are currently assigned to this table. 
   * @return maxRowsPerPage
  */
  @ApiModelProperty(value = "The maximum number of rows that can be requested or posted for this table in a single call. This is a function of the columns that are currently assigned to this table. ")

  @Valid

  public BigDecimal getMaxRowsPerPage() {
    return maxRowsPerPage;
  }

  public void setMaxRowsPerPage(BigDecimal maxRowsPerPage) {
    this.maxRowsPerPage = maxRowsPerPage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableBundle tableBundle = (TableBundle) o;
    return Objects.equals(this.columnModels, tableBundle.columnModels) &&
        Objects.equals(this.maxRowsPerPage, tableBundle.maxRowsPerPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnModels, maxRowsPerPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableBundle {\n");
    
    sb.append("    columnModels: ").append(toIndentedString(columnModels)).append("\n");
    sb.append("    maxRowsPerPage: ").append(toIndentedString(maxRowsPerPage)).append("\n");
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

