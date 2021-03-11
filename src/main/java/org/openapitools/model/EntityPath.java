package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EntityHeader;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * All entities in this Entity&#39;s path 
 */
@ApiModel(description = "All entities in this Entity's path ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EntityPath   {
  @JsonProperty("path")
  @Valid
  private List<EntityHeader> path = null;

  public EntityPath path(List<EntityHeader> path) {
    this.path = path;
    return this;
  }

  public EntityPath addPathItem(EntityHeader pathItem) {
    if (this.path == null) {
      this.path = new ArrayList<>();
    }
    this.path.add(pathItem);
    return this;
  }

  /**
   * The list of all entities in this entites path. The first element is the root parent and the last element (n) is the entity. 
   * @return path
  */
  @ApiModelProperty(value = "The list of all entities in this entites path. The first element is the root parent and the last element (n) is the entity. ")

  @Valid

  public List<EntityHeader> getPath() {
    return path;
  }

  public void setPath(List<EntityHeader> path) {
    this.path = path;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityPath entityPath = (EntityPath) o;
    return Objects.equals(this.path, entityPath.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityPath {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

