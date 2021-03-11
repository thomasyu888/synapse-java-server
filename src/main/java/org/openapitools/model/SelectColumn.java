package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ColumnType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A column model contains the metadata of a single column of a TableEntity
 */
@ApiModel(description = "A column model contains the metadata of a single column of a TableEntity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SelectColumn   {
  @JsonProperty("columnType")
  private ColumnType columnType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  public SelectColumn columnType(ColumnType columnType) {
    this.columnType = columnType;
    return this;
  }

  /**
   * Get columnType
   * @return columnType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ColumnType getColumnType() {
    return columnType;
  }

  public void setColumnType(ColumnType columnType) {
    this.columnType = columnType;
  }

  public SelectColumn id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The optional ID of the select column, if this is a direct column selected
   * @return id
  */
  @ApiModelProperty(value = "The optional ID of the select column, if this is a direct column selected")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SelectColumn name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The required display name of the column
   * @return name
  */
  @ApiModelProperty(value = "The required display name of the column")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectColumn selectColumn = (SelectColumn) o;
    return Objects.equals(this.columnType, selectColumn.columnType) &&
        Objects.equals(this.id, selectColumn.id) &&
        Objects.equals(this.name, selectColumn.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnType, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectColumn {\n");
    
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

