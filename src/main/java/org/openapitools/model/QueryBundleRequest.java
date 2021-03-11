package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Query;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Query Bundle Request
 */
@ApiModel(description = "Query Bundle Request")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class QueryBundleRequest   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("partMask")
  private Integer partMask;

  @JsonProperty("query")
  private Query query;

  public QueryBundleRequest concreteType(String concreteType) {
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

  public QueryBundleRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Entity Id
   * @return entityId
  */
  @ApiModelProperty(value = "Entity Id")


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public QueryBundleRequest partMask(Integer partMask) {
    this.partMask = partMask;
    return this;
  }

  /**
   * Optional, default all. The 'partsMask' is an integer mask that can be combined into to request any desired part. The mask is defined as follows: * Query Results (queryResults) = 0x1 * Query Count (queryCount) = 0x2 * Select Columns (selectColumns) = 0x4 * Max Rows Per Page (maxRowsPerPage) = 0x8 * The Table Columns (columnModels) = 0x10 * Facet statistics for each faceted column (facetStatistics) = 0x20 * The sum of the file sizes (sumFileSizesBytes) = 0x40 
   * @return partMask
  */
  @ApiModelProperty(value = "Optional, default all. The 'partsMask' is an integer mask that can be combined into to request any desired part. The mask is defined as follows: * Query Results (queryResults) = 0x1 * Query Count (queryCount) = 0x2 * Select Columns (selectColumns) = 0x4 * Max Rows Per Page (maxRowsPerPage) = 0x8 * The Table Columns (columnModels) = 0x10 * Facet statistics for each faceted column (facetStatistics) = 0x20 * The sum of the file sizes (sumFileSizesBytes) = 0x40 ")


  public Integer getPartMask() {
    return partMask;
  }

  public void setPartMask(Integer partMask) {
    this.partMask = partMask;
  }

  public QueryBundleRequest query(Query query) {
    this.query = query;
    return this;
  }

  /**
   * Get query
   * @return query
  */
  @ApiModelProperty(value = "")

  @Valid

  public Query getQuery() {
    return query;
  }

  public void setQuery(Query query) {
    this.query = query;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryBundleRequest queryBundleRequest = (QueryBundleRequest) o;
    return Objects.equals(this.concreteType, queryBundleRequest.concreteType) &&
        Objects.equals(this.entityId, queryBundleRequest.entityId) &&
        Objects.equals(this.partMask, queryBundleRequest.partMask) &&
        Objects.equals(this.query, queryBundleRequest.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, entityId, partMask, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryBundleRequest {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    partMask: ").append(toIndentedString(partMask)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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

