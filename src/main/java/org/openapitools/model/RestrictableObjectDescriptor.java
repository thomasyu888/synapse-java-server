package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RestrictableObjectType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Restrictable object descriptor
 */
@ApiModel(description = "Restrictable object descriptor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class RestrictableObjectDescriptor   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("type")
  private RestrictableObjectType type;

  public RestrictableObjectDescriptor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Id
   * @return id
  */
  @ApiModelProperty(value = "Id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RestrictableObjectDescriptor type(RestrictableObjectType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public RestrictableObjectType getType() {
    return type;
  }

  public void setType(RestrictableObjectType type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestrictableObjectDescriptor restrictableObjectDescriptor = (RestrictableObjectDescriptor) o;
    return Objects.equals(this.id, restrictableObjectDescriptor.id) &&
        Objects.equals(this.type, restrictableObjectDescriptor.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestrictableObjectDescriptor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

