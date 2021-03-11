package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The model object represents the number of threads that mentioned a particular entity.
 */
@ApiModel(description = "The model object represents the number of threads that mentioned a particular entity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EntityThreadCount   {
  @JsonProperty("count")
  private BigDecimal count;

  @JsonProperty("entityId")
  private String entityId;

  public EntityThreadCount count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * The number of threads that the current user can view.
   * @return count
  */
  @ApiModelProperty(value = "The number of threads that the current user can view.")

  @Valid

  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public EntityThreadCount entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The ID of an Entity.
   * @return entityId
  */
  @ApiModelProperty(value = "The ID of an Entity.")


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityThreadCount entityThreadCount = (EntityThreadCount) o;
    return Objects.equals(this.count, entityThreadCount.count) &&
        Objects.equals(this.entityId, entityThreadCount.entityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, entityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityThreadCount {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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

