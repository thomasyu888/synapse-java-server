package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ACCESSTYPE;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for a ResourceAccess POJO
 */
@ApiModel(description = "JSON schema for a ResourceAccess POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ResourceAccess   {
  @JsonProperty("accessType")
  @Valid
  private List<ACCESSTYPE> accessType = null;

  @JsonProperty("principalId")
  private Integer principalId;

  public ResourceAccess accessType(List<ACCESSTYPE> accessType) {
    this.accessType = accessType;
    return this;
  }

  public ResourceAccess addAccessTypeItem(ACCESSTYPE accessTypeItem) {
    if (this.accessType == null) {
      this.accessType = new ArrayList<>();
    }
    this.accessType.add(accessTypeItem);
    return this;
  }

  /**
   * A list of types of access granted to the given principal
   * @return accessType
  */
  @ApiModelProperty(value = "A list of types of access granted to the given principal")

  @Valid

  public List<ACCESSTYPE> getAccessType() {
    return accessType;
  }

  public void setAccessType(List<ACCESSTYPE> accessType) {
    this.accessType = accessType;
  }

  public ResourceAccess principalId(Integer principalId) {
    this.principalId = principalId;
    return this;
  }

  /**
   * The id of the principal who is granted access
   * @return principalId
  */
  @ApiModelProperty(value = "The id of the principal who is granted access")


  public Integer getPrincipalId() {
    return principalId;
  }

  public void setPrincipalId(Integer principalId) {
    this.principalId = principalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceAccess resourceAccess = (ResourceAccess) o;
    return Objects.equals(this.accessType, resourceAccess.accessType) &&
        Objects.equals(this.principalId, resourceAccess.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, principalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceAccess {\n");
    
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
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

