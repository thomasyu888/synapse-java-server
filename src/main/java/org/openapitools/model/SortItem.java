package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SortDirection;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Sort schema
 */
@ApiModel(description = "Sort schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SortItem   {
  @JsonProperty("column")
  private String column;

  @JsonProperty("direction")
  private SortDirection direction;

  public SortItem column(String column) {
    this.column = column;
    return this;
  }

  /**
   * The column to sort on.
   * @return column
  */
  @ApiModelProperty(value = "The column to sort on.")


  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public SortItem direction(SortDirection direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
  */
  @ApiModelProperty(value = "")

  @Valid

  public SortDirection getDirection() {
    return direction;
  }

  public void setDirection(SortDirection direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SortItem sortItem = (SortItem) o;
    return Objects.equals(this.column, sortItem.column) &&
        Objects.equals(this.direction, sortItem.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(column, direction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SortItem {\n");
    
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

