package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccessType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Request for a single user change access to a resource.
 */
@ApiModel(description = "Request for a single user change access to a resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessorChange   {
  @JsonProperty("type")
  private AccessType type;

  @JsonProperty("userId")
  private String userId;

  public AccessorChange type(AccessType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessType getType() {
    return type;
  }

  public void setType(AccessType type) {
    this.type = type;
  }

  public AccessorChange userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user.
   * @return userId
  */
  @ApiModelProperty(value = "The ID of the user.")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessorChange accessorChange = (AccessorChange) o;
    return Objects.equals(this.type, accessorChange.type) &&
        Objects.equals(this.userId, accessorChange.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessorChange {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

