package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ColumnType;
import org.openapitools.model.FacetType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A column model contains the metadata of a single column of a TableEntity
 */
@ApiModel(description = "A column model contains the metadata of a single column of a TableEntity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ColumnModel   {
  @JsonProperty("columnType")
  private ColumnType columnType;

  @JsonProperty("defaultValue")
  private String defaultValue;

  @JsonProperty("enumValues")
  @Valid
  private List<String> enumValues = null;

  @JsonProperty("facetType")
  private FacetType facetType;

  @JsonProperty("id")
  private String id;

  @JsonProperty("maximumListLength")
  private Integer maximumListLength = 100;

  @JsonProperty("maximumSize")
  private BigDecimal maximumSize;

  @JsonProperty("name")
  private String name;

  public ColumnModel columnType(ColumnType columnType) {
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

  public ColumnModel defaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * The default value for this column. Columns of type ENTITYID, FILEHANDLEID, USERID, and LARGETEXT are not allowed to have default values. 
   * @return defaultValue
  */
  @ApiModelProperty(value = "The default value for this column. Columns of type ENTITYID, FILEHANDLEID, USERID, and LARGETEXT are not allowed to have default values. ")


  public String getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  public ColumnModel enumValues(List<String> enumValues) {
    this.enumValues = enumValues;
    return this;
  }

  public ColumnModel addEnumValuesItem(String enumValuesItem) {
    if (this.enumValues == null) {
      this.enumValues = new ArrayList<>();
    }
    this.enumValues.add(enumValuesItem);
    return this;
  }

  /**
   * Columns of type STRING can be constrained to an enumeration values set on this list. The maximum number of entries for an enum is 100 
   * @return enumValues
  */
  @ApiModelProperty(value = "Columns of type STRING can be constrained to an enumeration values set on this list. The maximum number of entries for an enum is 100 ")


  public List<String> getEnumValues() {
    return enumValues;
  }

  public void setEnumValues(List<String> enumValues) {
    this.enumValues = enumValues;
  }

  public ColumnModel facetType(FacetType facetType) {
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

  public ColumnModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The immutable ID issued to new columns
   * @return id
  */
  @ApiModelProperty(value = "The immutable ID issued to new columns")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ColumnModel maximumListLength(Integer maximumListLength) {
    this.maximumListLength = maximumListLength;
    return this;
  }

  /**
   * Required if using a columnType with a \"_LIST\" suffix. Describes the maximum number of values that will appear in that list. 
   * minimum: 1
   * maximum: 100
   * @return maximumListLength
  */
  @ApiModelProperty(value = "Required if using a columnType with a \"_LIST\" suffix. Describes the maximum number of values that will appear in that list. ")

@Min(1) @Max(100) 
  public Integer getMaximumListLength() {
    return maximumListLength;
  }

  public void setMaximumListLength(Integer maximumListLength) {
    this.maximumListLength = maximumListLength;
  }

  public ColumnModel maximumSize(BigDecimal maximumSize) {
    this.maximumSize = maximumSize;
    return this;
  }

  /**
   * A parameter for columnTypes with a maximum size. For example, ColumnType. STRINGs have a default maximum size of 50 characters, but can be set to a maximumSize of 1 to 1000 characters. For columnType of STRING_LIST, this limits the size of individual string elements in the list 
   * @return maximumSize
  */
  @ApiModelProperty(value = "A parameter for columnTypes with a maximum size. For example, ColumnType. STRINGs have a default maximum size of 50 characters, but can be set to a maximumSize of 1 to 1000 characters. For columnType of STRING_LIST, this limits the size of individual string elements in the list ")

  @Valid

  public BigDecimal getMaximumSize() {
    return maximumSize;
  }

  public void setMaximumSize(BigDecimal maximumSize) {
    this.maximumSize = maximumSize;
  }

  public ColumnModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the column
   * @return name
  */
  @ApiModelProperty(value = "The display name of the column")


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
    ColumnModel columnModel = (ColumnModel) o;
    return Objects.equals(this.columnType, columnModel.columnType) &&
        Objects.equals(this.defaultValue, columnModel.defaultValue) &&
        Objects.equals(this.enumValues, columnModel.enumValues) &&
        Objects.equals(this.facetType, columnModel.facetType) &&
        Objects.equals(this.id, columnModel.id) &&
        Objects.equals(this.maximumListLength, columnModel.maximumListLength) &&
        Objects.equals(this.maximumSize, columnModel.maximumSize) &&
        Objects.equals(this.name, columnModel.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnType, defaultValue, enumValues, facetType, id, maximumListLength, maximumSize, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ColumnModel {\n");
    
    sb.append("    columnType: ").append(toIndentedString(columnType)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    enumValues: ").append(toIndentedString(enumValues)).append("\n");
    sb.append("    facetType: ").append(toIndentedString(facetType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maximumListLength: ").append(toIndentedString(maximumListLength)).append("\n");
    sb.append("    maximumSize: ").append(toIndentedString(maximumSize)).append("\n");
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

