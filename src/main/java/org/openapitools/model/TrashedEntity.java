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
 * JSON schema for the TrashEntity POJO. A trashed entity is an entity in the trash can.
 */
@ApiModel(description = "JSON schema for the TrashEntity POJO. A trashed entity is an entity in the trash can.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class TrashedEntity   {
  @JsonProperty("deletedByPrincipalId")
  private String deletedByPrincipalId;

  @JsonProperty("deletedOn")
  private String deletedOn;

  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("entityName")
  private String entityName;

  @JsonProperty("originalParentId")
  private String originalParentId;

  public TrashedEntity deletedByPrincipalId(String deletedByPrincipalId) {
    this.deletedByPrincipalId = deletedByPrincipalId;
    return this;
  }

  /**
   * The ID of the user who deleted the entity.
   * @return deletedByPrincipalId
  */
  @ApiModelProperty(value = "The ID of the user who deleted the entity.")


  public String getDeletedByPrincipalId() {
    return deletedByPrincipalId;
  }

  public void setDeletedByPrincipalId(String deletedByPrincipalId) {
    this.deletedByPrincipalId = deletedByPrincipalId;
  }

  public TrashedEntity deletedOn(String deletedOn) {
    this.deletedOn = deletedOn;
    return this;
  }

  /**
   * The date and time when the deletion occurred.
   * @return deletedOn
  */
  @ApiModelProperty(value = "The date and time when the deletion occurred.")


  public String getDeletedOn() {
    return deletedOn;
  }

  public void setDeletedOn(String deletedOn) {
    this.deletedOn = deletedOn;
  }

  public TrashedEntity entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The id of the entity.
   * @return entityId
  */
  @ApiModelProperty(value = "The id of the entity.")


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public TrashedEntity entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * The name of this entity
   * @return entityName
  */
  @ApiModelProperty(value = "The name of this entity")


  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public TrashedEntity originalParentId(String originalParentId) {
    this.originalParentId = originalParentId;
    return this;
  }

  /**
   * The ID of the original parent before deletion.
   * @return originalParentId
  */
  @ApiModelProperty(value = "The ID of the original parent before deletion.")


  public String getOriginalParentId() {
    return originalParentId;
  }

  public void setOriginalParentId(String originalParentId) {
    this.originalParentId = originalParentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrashedEntity trashedEntity = (TrashedEntity) o;
    return Objects.equals(this.deletedByPrincipalId, trashedEntity.deletedByPrincipalId) &&
        Objects.equals(this.deletedOn, trashedEntity.deletedOn) &&
        Objects.equals(this.entityId, trashedEntity.entityId) &&
        Objects.equals(this.entityName, trashedEntity.entityName) &&
        Objects.equals(this.originalParentId, trashedEntity.originalParentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletedByPrincipalId, deletedOn, entityId, entityName, originalParentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrashedEntity {\n");
    
    sb.append("    deletedByPrincipalId: ").append(toIndentedString(deletedByPrincipalId)).append("\n");
    sb.append("    deletedOn: ").append(toIndentedString(deletedOn)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    originalParentId: ").append(toIndentedString(originalParentId)).append("\n");
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

