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
 * Request to create a new Organization.
 */
@ApiModel(description = "Request to create a new Organization.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class CreateOrganizationRequest   {
  @JsonProperty("organizationName")
  private String organizationName;

  public CreateOrganizationRequest organizationName(String organizationName) {
    this.organizationName = organizationName;
    return this;
  }

  /**
   * An organization name must be one or more alphanumeric strings each separated by a dot [ ('.')]. An alphanumeric string must start with a letter followed by one or more letters or digits a-z. Names are case insensitive. Names cannot contain the reserved word 'sagebionetworks' 
   * @return organizationName
  */
  @ApiModelProperty(value = "An organization name must be one or more alphanumeric strings each separated by a dot [ ('.')]. An alphanumeric string must start with a letter followed by one or more letters or digits a-z. Names are case insensitive. Names cannot contain the reserved word 'sagebionetworks' ")

@Pattern(regexp="^((?!sagebionetworks)[a-zA-Z0-9.])*$") @Size(min=6,max=250) 
  public String getOrganizationName() {
    return organizationName;
  }

  public void setOrganizationName(String organizationName) {
    this.organizationName = organizationName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrganizationRequest createOrganizationRequest = (CreateOrganizationRequest) o;
    return Objects.equals(this.organizationName, createOrganizationRequest.organizationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrganizationRequest {\n");
    
    sb.append("    organizationName: ").append(toIndentedString(organizationName)).append("\n");
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

