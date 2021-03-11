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
 * The first step in creating new type schema in Synapse is to setup and configure an organization. The name of the organization serves as the root for each schema&#39;s $id managed by that organization. The organization name &#39;org.sagebionetworks&#39; is reserved for the core Synapse model objects. Each organization also has an Access Control List (ACL) that controls who can add schemas to an organization. All schemas created under an Organization will be considered publicly readable and reference-able. Organizations are immutable 
 */
@ApiModel(description = "The first step in creating new type schema in Synapse is to setup and configure an organization. The name of the organization serves as the root for each schema's $id managed by that organization. The organization name 'org.sagebionetworks' is reserved for the core Synapse model objects. Each organization also has an Access Control List (ACL) that controls who can add schemas to an organization. All schemas created under an Organization will be considered publicly readable and reference-able. Organizations are immutable ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Organization   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  public Organization createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that created this Organization.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that created this Organization.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Organization createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this Organization was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this Organization was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public Organization id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The Synapse identifier issued to the Organization.
   * @return id
  */
  @ApiModelProperty(value = "The Synapse identifier issued to the Organization.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Organization name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the organization servers as the root for each schema's $id managed under an organization, and each name must be unique. 
   * @return name
  */
  @ApiModelProperty(value = "The name of the organization servers as the root for each schema's $id managed under an organization, and each name must be unique. ")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Organization organization = (Organization) o;
    return Objects.equals(this.createdBy, organization.createdBy) &&
        Objects.equals(this.createdOn, organization.createdOn) &&
        Objects.equals(this.id, organization.id) &&
        Objects.equals(this.name, organization.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Organization {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

