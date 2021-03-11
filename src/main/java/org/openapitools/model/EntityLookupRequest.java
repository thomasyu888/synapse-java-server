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
 * A request to look up an entity given parentId and the entity name.
 */
@ApiModel(description = "A request to look up an entity given parentId and the entity name.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EntityLookupRequest   {
  @JsonProperty("entityName")
  private String entityName;

  @JsonProperty("parentId")
  private String parentId;

  public EntityLookupRequest entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * The entity name
   * @return entityName
  */
  @ApiModelProperty(value = "The entity name")


  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public EntityLookupRequest parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The parentID
   * @return parentId
  */
  @ApiModelProperty(value = "The parentID")


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityLookupRequest entityLookupRequest = (EntityLookupRequest) o;
    return Objects.equals(this.entityName, entityLookupRequest.entityName) &&
        Objects.equals(this.parentId, entityLookupRequest.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityLookupRequest {\n");
    
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
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

