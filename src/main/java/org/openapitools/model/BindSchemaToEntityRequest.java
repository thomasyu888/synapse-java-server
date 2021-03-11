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
 * Request to bind an Entity to a JSON schema.
 */
@ApiModel(description = "Request to bind an Entity to a JSON schema.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class BindSchemaToEntityRequest   {
  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("schema$id")
  private String schema$id;

  public BindSchemaToEntityRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The ID of the the entity.
   * @return entityId
  */
  @ApiModelProperty(value = "The ID of the the entity.")


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public BindSchemaToEntityRequest schema$id(String schema$id) {
    this.schema$id = schema$id;
    return this;
  }

  /**
   * The $id of the JSON schema to bind to the entity. Note: If the $id includes a semantic version then entity will be bound to that specific version. If the $id excludes the semantic version then the entity will be bound to the latest version of that schema. 
   * @return schema$id
  */
  @ApiModelProperty(value = "The $id of the JSON schema to bind to the entity. Note: If the $id includes a semantic version then entity will be bound to that specific version. If the $id excludes the semantic version then the entity will be bound to the latest version of that schema. ")


  public String getSchema$id() {
    return schema$id;
  }

  public void setSchema$id(String schema$id) {
    this.schema$id = schema$id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BindSchemaToEntityRequest bindSchemaToEntityRequest = (BindSchemaToEntityRequest) o;
    return Objects.equals(this.entityId, bindSchemaToEntityRequest.entityId) &&
        Objects.equals(this.schema$id, bindSchemaToEntityRequest.schema$id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, schema$id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BindSchemaToEntityRequest {\n");
    
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    schema$id: ").append(toIndentedString(schema$id)).append("\n");
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

