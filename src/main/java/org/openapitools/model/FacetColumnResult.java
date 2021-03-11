package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FacetType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Resulting information about a faceted column
 */
@ApiModel(description = "Resulting information about a faceted column")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class FacetColumnResult   {
  @JsonProperty("columnName")
  private String columnName;

  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("facetType")
  private FacetType facetType;

  public FacetColumnResult columnName(String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * The name of the faceted column
   * @return columnName
  */
  @ApiModelProperty(value = "The name of the faceted column")


  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public FacetColumnResult concreteType(String concreteType) {
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

  public FacetColumnResult facetType(FacetType facetType) {
    this.facetType = facetType;
    return this;
  }

  /**
   * Get facetType
   * @return facetType
  */
  @ApiModelProperty(value = "")

  @Valid

  public FacetType getFacetType() {
    return facetType;
  }

  public void setFacetType(FacetType facetType) {
    this.facetType = facetType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FacetColumnResult facetColumnResult = (FacetColumnResult) o;
    return Objects.equals(this.columnName, facetColumnResult.columnName) &&
        Objects.equals(this.concreteType, facetColumnResult.concreteType) &&
        Objects.equals(this.facetType, facetColumnResult.facetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, concreteType, facetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FacetColumnResult {\n");
    
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    facetType: ").append(toIndentedString(facetType)).append("\n");
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

