package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Used;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Interface for JSON schema for Activity POJO.
 */
@ApiModel(description = "Interface for JSON schema for Activity POJO.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Activity   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("description")
  private String description;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("name")
  private String name;

  @JsonProperty("used")
  @Valid
  private List<Used> used = null;

  public Activity createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The user that created this object.
   * @return createdBy
  */
  @ApiModelProperty(value = "The user that created this object.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Activity createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this object was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this object was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public Activity description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of this Activity.
   * @return description
  */
  @ApiModelProperty(value = "A description of this Activity.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Activity etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time an entity is updated it is used to detect when a client's current representation of an entity is out-of-date. 
   * @return etag
  */
  @ApiModelProperty(value = "Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time an entity is updated it is used to detect when a client's current representation of an entity is out-of-date. ")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Activity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique immutable ID
   * @return id
  */
  @ApiModelProperty(value = "The unique immutable ID")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Activity modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The user that last modified this object.
   * @return modifiedBy
  */
  @ApiModelProperty(value = "The user that last modified this object.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Activity modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date this object was last modified.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date this object was last modified.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public Activity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A name for this Activity.
   * @return name
  */
  @ApiModelProperty(value = "A name for this Activity.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Activity used(List<Used> used) {
    this.used = used;
    return this;
  }

  public Activity addUsedItem(Used usedItem) {
    if (this.used == null) {
      this.used = new ArrayList<>();
    }
    this.used.add(usedItem);
    return this;
  }

  /**
   * The entities used by this Activity.
   * @return used
  */
  @ApiModelProperty(value = "The entities used by this Activity.")

  @Valid

  public List<Used> getUsed() {
    return used;
  }

  public void setUsed(List<Used> used) {
    this.used = used;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.createdBy, activity.createdBy) &&
        Objects.equals(this.createdOn, activity.createdOn) &&
        Objects.equals(this.description, activity.description) &&
        Objects.equals(this.etag, activity.etag) &&
        Objects.equals(this.id, activity.id) &&
        Objects.equals(this.modifiedBy, activity.modifiedBy) &&
        Objects.equals(this.modifiedOn, activity.modifiedOn) &&
        Objects.equals(this.name, activity.name) &&
        Objects.equals(this.used, activity.used);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, description, etag, id, modifiedBy, modifiedOn, name, used);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    used: ").append(toIndentedString(used)).append("\n");
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

