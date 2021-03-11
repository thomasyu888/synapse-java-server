package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AccessControlList;
import org.openapitools.model.AnnotationsV2;
import org.openapitools.model.Entity;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Used to create Entity and associated metadata in a single transaction
 */
@ApiModel(description = "Used to create Entity and associated metadata in a single transaction")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EntityBundleCreateV2   {
  @JsonProperty("accessControlList")
  private AccessControlList accessControlList;

  @JsonProperty("annotations")
  private AnnotationsV2 annotations;

  @JsonProperty("entity")
  private Entity entity;

  public EntityBundleCreateV2 accessControlList(AccessControlList accessControlList) {
    this.accessControlList = accessControlList;
    return this;
  }

  /**
   * Get accessControlList
   * @return accessControlList
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessControlList getAccessControlList() {
    return accessControlList;
  }

  public void setAccessControlList(AccessControlList accessControlList) {
    this.accessControlList = accessControlList;
  }

  public EntityBundleCreateV2 annotations(AnnotationsV2 annotations) {
    this.annotations = annotations;
    return this;
  }

  /**
   * Get annotations
   * @return annotations
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnnotationsV2 getAnnotations() {
    return annotations;
  }

  public void setAnnotations(AnnotationsV2 annotations) {
    this.annotations = annotations;
  }

  public EntityBundleCreateV2 entity(Entity entity) {
    this.entity = entity;
    return this;
  }

  /**
   * Get entity
   * @return entity
  */
  @ApiModelProperty(value = "")

  @Valid

  public Entity getEntity() {
    return entity;
  }

  public void setEntity(Entity entity) {
    this.entity = entity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityBundleCreateV2 entityBundleCreateV2 = (EntityBundleCreateV2) o;
    return Objects.equals(this.accessControlList, entityBundleCreateV2.accessControlList) &&
        Objects.equals(this.annotations, entityBundleCreateV2.annotations) &&
        Objects.equals(this.entity, entityBundleCreateV2.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, annotations, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityBundleCreateV2 {\n");
    
    sb.append("    accessControlList: ").append(toIndentedString(accessControlList)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

