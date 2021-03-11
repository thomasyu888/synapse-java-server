package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ColumnModel;
import org.openapitools.model.FacetColumnResult;
import org.openapitools.model.QueryResult;
import org.openapitools.model.SelectColumn;
import org.openapitools.model.SumFileSizes;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A bundle of information about a query result.
 */
@ApiModel(description = "A bundle of information about a query result.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class QueryResultBundle   {
  @JsonProperty("columnModels")
  @Valid
  private List<ColumnModel> columnModels = null;

  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("facets")
  @Valid
  private List<FacetColumnResult> facets = null;

  @JsonProperty("lastUpdatedOn")
  private String lastUpdatedOn;

  @JsonProperty("maxRowsPerPage")
  private Integer maxRowsPerPage;

  @JsonProperty("queryCount")
  private Integer queryCount;

  @JsonProperty("queryResult")
  private QueryResult queryResult;

  @JsonProperty("selectColumns")
  @Valid
  private List<SelectColumn> selectColumns = null;

  @JsonProperty("sumFileSizes")
  private SumFileSizes sumFileSizes;

  public QueryResultBundle columnModels(List<ColumnModel> columnModels) {
    this.columnModels = columnModels;
    return this;
  }

  public QueryResultBundle addColumnModelsItem(ColumnModel columnModelsItem) {
    if (this.columnModels == null) {
      this.columnModels = new ArrayList<>();
    }
    this.columnModels.add(columnModelsItem);
    return this;
  }

  /**
   * The list of ColumnModels for the table. Use mask = 0x10 to include in the bundle.
   * @return columnModels
  */
  @ApiModelProperty(value = "The list of ColumnModels for the table. Use mask = 0x10 to include in the bundle.")

  @Valid

  public List<ColumnModel> getColumnModels() {
    return columnModels;
  }

  public void setColumnModels(List<ColumnModel> columnModels) {
    this.columnModels = columnModels;
  }

  public QueryResultBundle concreteType(String concreteType) {
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

  public QueryResultBundle facets(List<FacetColumnResult> facets) {
    this.facets = facets;
    return this;
  }

  public QueryResultBundle addFacetsItem(FacetColumnResult facetsItem) {
    if (this.facets == null) {
      this.facets = new ArrayList<>();
    }
    this.facets.add(facetsItem);
    return this;
  }

  /**
   * The list of facets for the search results
   * @return facets
  */
  @ApiModelProperty(value = "The list of facets for the search results")

  @Valid

  public List<FacetColumnResult> getFacets() {
    return facets;
  }

  public void setFacets(List<FacetColumnResult> facets) {
    this.facets = facets;
  }

  public QueryResultBundle lastUpdatedOn(String lastUpdatedOn) {
    this.lastUpdatedOn = lastUpdatedOn;
    return this;
  }

  /**
   * The date-time when this table/view was last updated. Note: Since views are eventually consistent a view might still be out-of-date even if it was recently updated. Use mask = 0x80 to include in the bundle. 
   * @return lastUpdatedOn
  */
  @ApiModelProperty(value = "The date-time when this table/view was last updated. Note: Since views are eventually consistent a view might still be out-of-date even if it was recently updated. Use mask = 0x80 to include in the bundle. ")


  public String getLastUpdatedOn() {
    return lastUpdatedOn;
  }

  public void setLastUpdatedOn(String lastUpdatedOn) {
    this.lastUpdatedOn = lastUpdatedOn;
  }

  public QueryResultBundle maxRowsPerPage(Integer maxRowsPerPage) {
    this.maxRowsPerPage = maxRowsPerPage;
    return this;
  }

  /**
   * The maximum number of rows that can be retrieved in a single call. This is a function of the columns that are selected in the query. Use mask = 0x8 to include in the bundle.
   * @return maxRowsPerPage
  */
  @ApiModelProperty(value = "The maximum number of rows that can be retrieved in a single call. This is a function of the columns that are selected in the query. Use mask = 0x8 to include in the bundle.")


  public Integer getMaxRowsPerPage() {
    return maxRowsPerPage;
  }

  public void setMaxRowsPerPage(Integer maxRowsPerPage) {
    this.maxRowsPerPage = maxRowsPerPage;
  }

  public QueryResultBundle queryCount(Integer queryCount) {
    this.queryCount = queryCount;
    return this;
  }

  /**
   * The total number of rows that match the query. Use mask = 0x2 to include in the bundle.
   * @return queryCount
  */
  @ApiModelProperty(value = "The total number of rows that match the query. Use mask = 0x2 to include in the bundle.")


  public Integer getQueryCount() {
    return queryCount;
  }

  public void setQueryCount(Integer queryCount) {
    this.queryCount = queryCount;
  }

  public QueryResultBundle queryResult(QueryResult queryResult) {
    this.queryResult = queryResult;
    return this;
  }

  /**
   * Get queryResult
   * @return queryResult
  */
  @ApiModelProperty(value = "")

  @Valid

  public QueryResult getQueryResult() {
    return queryResult;
  }

  public void setQueryResult(QueryResult queryResult) {
    this.queryResult = queryResult;
  }

  public QueryResultBundle selectColumns(List<SelectColumn> selectColumns) {
    this.selectColumns = selectColumns;
    return this;
  }

  public QueryResultBundle addSelectColumnsItem(SelectColumn selectColumnsItem) {
    if (this.selectColumns == null) {
      this.selectColumns = new ArrayList<>();
    }
    this.selectColumns.add(selectColumnsItem);
    return this;
  }

  /**
   * The list of SelectColumns from the select clause. Use mask = 0x4 to include in the bundle.
   * @return selectColumns
  */
  @ApiModelProperty(value = "The list of SelectColumns from the select clause. Use mask = 0x4 to include in the bundle.")

  @Valid

  public List<SelectColumn> getSelectColumns() {
    return selectColumns;
  }

  public void setSelectColumns(List<SelectColumn> selectColumns) {
    this.selectColumns = selectColumns;
  }

  public QueryResultBundle sumFileSizes(SumFileSizes sumFileSizes) {
    this.sumFileSizes = sumFileSizes;
    return this;
  }

  /**
   * Get sumFileSizes
   * @return sumFileSizes
  */
  @ApiModelProperty(value = "")

  @Valid

  public SumFileSizes getSumFileSizes() {
    return sumFileSizes;
  }

  public void setSumFileSizes(SumFileSizes sumFileSizes) {
    this.sumFileSizes = sumFileSizes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryResultBundle queryResultBundle = (QueryResultBundle) o;
    return Objects.equals(this.columnModels, queryResultBundle.columnModels) &&
        Objects.equals(this.concreteType, queryResultBundle.concreteType) &&
        Objects.equals(this.facets, queryResultBundle.facets) &&
        Objects.equals(this.lastUpdatedOn, queryResultBundle.lastUpdatedOn) &&
        Objects.equals(this.maxRowsPerPage, queryResultBundle.maxRowsPerPage) &&
        Objects.equals(this.queryCount, queryResultBundle.queryCount) &&
        Objects.equals(this.queryResult, queryResultBundle.queryResult) &&
        Objects.equals(this.selectColumns, queryResultBundle.selectColumns) &&
        Objects.equals(this.sumFileSizes, queryResultBundle.sumFileSizes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnModels, concreteType, facets, lastUpdatedOn, maxRowsPerPage, queryCount, queryResult, selectColumns, sumFileSizes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryResultBundle {\n");
    
    sb.append("    columnModels: ").append(toIndentedString(columnModels)).append("\n");
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    facets: ").append(toIndentedString(facets)).append("\n");
    sb.append("    lastUpdatedOn: ").append(toIndentedString(lastUpdatedOn)).append("\n");
    sb.append("    maxRowsPerPage: ").append(toIndentedString(maxRowsPerPage)).append("\n");
    sb.append("    queryCount: ").append(toIndentedString(queryCount)).append("\n");
    sb.append("    queryResult: ").append(toIndentedString(queryResult)).append("\n");
    sb.append("    selectColumns: ").append(toIndentedString(selectColumns)).append("\n");
    sb.append("    sumFileSizes: ").append(toIndentedString(sumFileSizes)).append("\n");
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

