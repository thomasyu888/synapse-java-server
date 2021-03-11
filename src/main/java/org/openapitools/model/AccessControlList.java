package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ResourceAccess;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains list of principals who can access the data with the allowed types of access for each.
 */
@ApiModel(description = "Contains list of principals who can access the data with the allowed types of access for each.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessControlList   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("resourceAccess")
  @Valid
  private List<ResourceAccess> resourceAccess = null;

  public AccessControlList createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * UNUSED -- maintained only for backwards compatibility with archived objects
   * @return createdBy
  */
  @ApiModelProperty(value = "UNUSED -- maintained only for backwards compatibility with archived objects")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public AccessControlList creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Created Date
   * @return creationDate
  */
  @ApiModelProperty(value = "Created Date")


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public AccessControlList etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Synapse etag value
   * @return etag
  */
  @ApiModelProperty(value = "Synapse etag value")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public AccessControlList id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The entity id
   * @return id
  */
  @ApiModelProperty(value = "The entity id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AccessControlList modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * UNUSED -- maintained only for backwards compatibility with archived objects
   * @return modifiedBy
  */
  @ApiModelProperty(value = "UNUSED -- maintained only for backwards compatibility with archived objects")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public AccessControlList modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * UNUSED -- maintained only for backwards compatibility with archived objects
   * @return modifiedOn
  */
  @ApiModelProperty(value = "UNUSED -- maintained only for backwards compatibility with archived objects")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public AccessControlList resourceAccess(List<ResourceAccess> resourceAccess) {
    this.resourceAccess = resourceAccess;
    return this;
  }

  public AccessControlList addResourceAccessItem(ResourceAccess resourceAccessItem) {
    if (this.resourceAccess == null) {
      this.resourceAccess = new ArrayList<>();
    }
    this.resourceAccess.add(resourceAccessItem);
    return this;
  }

  /**
   * The list of principals who can access the data with the allowed types of access for each.
   * @return resourceAccess
  */
  @ApiModelProperty(value = "The list of principals who can access the data with the allowed types of access for each.")

  @Valid

  public List<ResourceAccess> getResourceAccess() {
    return resourceAccess;
  }

  public void setResourceAccess(List<ResourceAccess> resourceAccess) {
    this.resourceAccess = resourceAccess;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessControlList accessControlList = (AccessControlList) o;
    return Objects.equals(this.createdBy, accessControlList.createdBy) &&
        Objects.equals(this.creationDate, accessControlList.creationDate) &&
        Objects.equals(this.etag, accessControlList.etag) &&
        Objects.equals(this.id, accessControlList.id) &&
        Objects.equals(this.modifiedBy, accessControlList.modifiedBy) &&
        Objects.equals(this.modifiedOn, accessControlList.modifiedOn) &&
        Objects.equals(this.resourceAccess, accessControlList.resourceAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, creationDate, etag, id, modifiedBy, modifiedOn, resourceAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessControlList {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    resourceAccess: ").append(toIndentedString(resourceAccess)).append("\n");
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

