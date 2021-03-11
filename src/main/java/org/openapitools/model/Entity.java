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
 * This is the base interface that all Entities implement.
 */
@ApiModel(description = "This is the base interface that all Entities implement.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Entity   {
  @JsonProperty("concreteType")
  private String concreteType;

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

  @JsonProperty("parentId")
  private String parentId;

  public Entity concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * Indicates which implementation of Entity this object represents. It should be set to one of the following: org.sagebionetworks.repo.model.Project, org.sagebionetworks.repo.model.Folder, or org.sagebionetworks.repo.model.FileEntity. 
   * @return concreteType
  */
  @ApiModelProperty(value = "Indicates which implementation of Entity this object represents. It should be set to one of the following: org.sagebionetworks.repo.model.Project, org.sagebionetworks.repo.model.Folder, or org.sagebionetworks.repo.model.FileEntity. ")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public Entity createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that created this entity.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that created this entity.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Entity createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this entity was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this entity was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public Entity description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of this entity.
   * @return description
  */
  @ApiModelProperty(value = "The description of this entity.")

@Size(max=1000) 
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Entity etag(String etag) {
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

  public Entity id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique immutable ID for this entity. A new ID will be generated for new Entities. Once issued, this ID is guaranteed to never change or be re-issued 
   * @return id
  */
  @ApiModelProperty(value = "The unique immutable ID for this entity. A new ID will be generated for new Entities. Once issued, this ID is guaranteed to never change or be re-issued ")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Entity modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The ID of the user that last modified this entity.
   * @return modifiedBy
  */
  @ApiModelProperty(value = "The ID of the user that last modified this entity.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public Entity modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date this entity was last modified.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date this entity was last modified.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public Entity name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this entity. Names may only contain: letters, numbers, spaces, underscores, hyphens, periods, plus signs, apostrophes, and parentheses 
   * @return name
  */
  @ApiModelProperty(value = "The name of this entity. Names may only contain: letters, numbers, spaces, underscores, hyphens, periods, plus signs, apostrophes, and parentheses ")

@Pattern(regexp="^[a-zA-Z0-9 +.'(_)]*$") @Size(min=1,max=256) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Entity parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * The ID of the Entity that is the parent of this Entity.
   * @return parentId
  */
  @ApiModelProperty(value = "The ID of the Entity that is the parent of this Entity.")


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
    Entity entity = (Entity) o;
    return Objects.equals(this.concreteType, entity.concreteType) &&
        Objects.equals(this.createdBy, entity.createdBy) &&
        Objects.equals(this.createdOn, entity.createdOn) &&
        Objects.equals(this.description, entity.description) &&
        Objects.equals(this.etag, entity.etag) &&
        Objects.equals(this.id, entity.id) &&
        Objects.equals(this.modifiedBy, entity.modifiedBy) &&
        Objects.equals(this.modifiedOn, entity.modifiedOn) &&
        Objects.equals(this.name, entity.name) &&
        Objects.equals(this.parentId, entity.parentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, createdBy, createdOn, description, etag, id, modifiedBy, modifiedOn, name, parentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entity {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

