package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AccessControlList;
import org.openapitools.model.AnnotationsV2;
import org.openapitools.model.DoiAssociation;
import org.openapitools.model.Entity;
import org.openapitools.model.EntityPath;
import org.openapitools.model.EntityType;
import org.openapitools.model.FileHandle;
import org.openapitools.model.RestrictionInformationResponse;
import org.openapitools.model.TableBundle;
import org.openapitools.model.UserEntityPermissions;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Bundle to transport an Entity and related data objects
 */
@ApiModel(description = "Bundle to transport an Entity and related data objects")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EntityBundleV2   {
  @JsonProperty("accessControlList")
  private AccessControlList accessControlList;

  @JsonProperty("annotations")
  private AnnotationsV2 annotations;

  @JsonProperty("benefactorAcl")
  private AccessControlList benefactorAcl;

  @JsonProperty("doiAssociation")
  private DoiAssociation doiAssociation;

  @JsonProperty("entity")
  private Entity entity;

  @JsonProperty("entityType")
  private EntityType entityType;

  @JsonProperty("fileHandles")
  @Valid
  private List<FileHandle> fileHandles = null;

  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("hasChildren")
  private Boolean hasChildren;

  @JsonProperty("path")
  private EntityPath path;

  @JsonProperty("permissions")
  private UserEntityPermissions permissions;

  @JsonProperty("restrictionInformation")
  private RestrictionInformationResponse restrictionInformation;

  @JsonProperty("rootWikiId")
  private String rootWikiId;

  @JsonProperty("tableBundle")
  private TableBundle tableBundle;

  @JsonProperty("threadCount")
  private BigDecimal threadCount;

  public EntityBundleV2 accessControlList(AccessControlList accessControlList) {
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

  public EntityBundleV2 annotations(AnnotationsV2 annotations) {
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

  public EntityBundleV2 benefactorAcl(AccessControlList benefactorAcl) {
    this.benefactorAcl = benefactorAcl;
    return this;
  }

  /**
   * Get benefactorAcl
   * @return benefactorAcl
  */
  @ApiModelProperty(value = "")

  @Valid

  public AccessControlList getBenefactorAcl() {
    return benefactorAcl;
  }

  public void setBenefactorAcl(AccessControlList benefactorAcl) {
    this.benefactorAcl = benefactorAcl;
  }

  public EntityBundleV2 doiAssociation(DoiAssociation doiAssociation) {
    this.doiAssociation = doiAssociation;
    return this;
  }

  /**
   * Get doiAssociation
   * @return doiAssociation
  */
  @ApiModelProperty(value = "")

  @Valid

  public DoiAssociation getDoiAssociation() {
    return doiAssociation;
  }

  public void setDoiAssociation(DoiAssociation doiAssociation) {
    this.doiAssociation = doiAssociation;
  }

  public EntityBundleV2 entity(Entity entity) {
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

  public EntityBundleV2 entityType(EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Get entityType
   * @return entityType
  */
  @ApiModelProperty(value = "")

  @Valid

  public EntityType getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }

  public EntityBundleV2 fileHandles(List<FileHandle> fileHandles) {
    this.fileHandles = fileHandles;
    return this;
  }

  public EntityBundleV2 addFileHandlesItem(FileHandle fileHandlesItem) {
    if (this.fileHandles == null) {
      this.fileHandles = new ArrayList<>();
    }
    this.fileHandles.add(fileHandlesItem);
    return this;
  }

  /**
   * FileHandles associated with this Entity
   * @return fileHandles
  */
  @ApiModelProperty(value = "FileHandles associated with this Entity")

  @Valid

  public List<FileHandle> getFileHandles() {
    return fileHandles;
  }

  public void setFileHandles(List<FileHandle> fileHandles) {
    this.fileHandles = fileHandles;
  }

  public EntityBundleV2 fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * If this Entity is a FileEntity, this is its filename
   * @return fileName
  */
  @ApiModelProperty(value = "If this Entity is a FileEntity, this is its filename")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public EntityBundleV2 hasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
    return this;
  }

  /**
   * Whether or not this Entity has children
   * @return hasChildren
  */
  @ApiModelProperty(value = "Whether or not this Entity has children")


  public Boolean getHasChildren() {
    return hasChildren;
  }

  public void setHasChildren(Boolean hasChildren) {
    this.hasChildren = hasChildren;
  }

  public EntityBundleV2 path(EntityPath path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @ApiModelProperty(value = "")

  @Valid

  public EntityPath getPath() {
    return path;
  }

  public void setPath(EntityPath path) {
    this.path = path;
  }

  public EntityBundleV2 permissions(UserEntityPermissions permissions) {
    this.permissions = permissions;
    return this;
  }

  /**
   * Get permissions
   * @return permissions
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserEntityPermissions getPermissions() {
    return permissions;
  }

  public void setPermissions(UserEntityPermissions permissions) {
    this.permissions = permissions;
  }

  public EntityBundleV2 restrictionInformation(RestrictionInformationResponse restrictionInformation) {
    this.restrictionInformation = restrictionInformation;
    return this;
  }

  /**
   * Get restrictionInformation
   * @return restrictionInformation
  */
  @ApiModelProperty(value = "")

  @Valid

  public RestrictionInformationResponse getRestrictionInformation() {
    return restrictionInformation;
  }

  public void setRestrictionInformation(RestrictionInformationResponse restrictionInformation) {
    this.restrictionInformation = restrictionInformation;
  }

  public EntityBundleV2 rootWikiId(String rootWikiId) {
    this.rootWikiId = rootWikiId;
    return this;
  }

  /**
   * Id of the root Wiki associated with this Entity
   * @return rootWikiId
  */
  @ApiModelProperty(value = "Id of the root Wiki associated with this Entity")


  public String getRootWikiId() {
    return rootWikiId;
  }

  public void setRootWikiId(String rootWikiId) {
    this.rootWikiId = rootWikiId;
  }

  public EntityBundleV2 tableBundle(TableBundle tableBundle) {
    this.tableBundle = tableBundle;
    return this;
  }

  /**
   * Get tableBundle
   * @return tableBundle
  */
  @ApiModelProperty(value = "")

  @Valid

  public TableBundle getTableBundle() {
    return tableBundle;
  }

  public void setTableBundle(TableBundle tableBundle) {
    this.tableBundle = tableBundle;
  }

  public EntityBundleV2 threadCount(BigDecimal threadCount) {
    this.threadCount = threadCount;
    return this;
  }

  /**
   * Number of disucssion threads that reference this Entity
   * @return threadCount
  */
  @ApiModelProperty(value = "Number of disucssion threads that reference this Entity")

  @Valid

  public BigDecimal getThreadCount() {
    return threadCount;
  }

  public void setThreadCount(BigDecimal threadCount) {
    this.threadCount = threadCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityBundleV2 entityBundleV2 = (EntityBundleV2) o;
    return Objects.equals(this.accessControlList, entityBundleV2.accessControlList) &&
        Objects.equals(this.annotations, entityBundleV2.annotations) &&
        Objects.equals(this.benefactorAcl, entityBundleV2.benefactorAcl) &&
        Objects.equals(this.doiAssociation, entityBundleV2.doiAssociation) &&
        Objects.equals(this.entity, entityBundleV2.entity) &&
        Objects.equals(this.entityType, entityBundleV2.entityType) &&
        Objects.equals(this.fileHandles, entityBundleV2.fileHandles) &&
        Objects.equals(this.fileName, entityBundleV2.fileName) &&
        Objects.equals(this.hasChildren, entityBundleV2.hasChildren) &&
        Objects.equals(this.path, entityBundleV2.path) &&
        Objects.equals(this.permissions, entityBundleV2.permissions) &&
        Objects.equals(this.restrictionInformation, entityBundleV2.restrictionInformation) &&
        Objects.equals(this.rootWikiId, entityBundleV2.rootWikiId) &&
        Objects.equals(this.tableBundle, entityBundleV2.tableBundle) &&
        Objects.equals(this.threadCount, entityBundleV2.threadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessControlList, annotations, benefactorAcl, doiAssociation, entity, entityType, fileHandles, fileName, hasChildren, path, permissions, restrictionInformation, rootWikiId, tableBundle, threadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityBundleV2 {\n");
    
    sb.append("    accessControlList: ").append(toIndentedString(accessControlList)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    benefactorAcl: ").append(toIndentedString(benefactorAcl)).append("\n");
    sb.append("    doiAssociation: ").append(toIndentedString(doiAssociation)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    fileHandles: ").append(toIndentedString(fileHandles)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    hasChildren: ").append(toIndentedString(hasChildren)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    restrictionInformation: ").append(toIndentedString(restrictionInformation)).append("\n");
    sb.append("    rootWikiId: ").append(toIndentedString(rootWikiId)).append("\n");
    sb.append("    tableBundle: ").append(toIndentedString(tableBundle)).append("\n");
    sb.append("    threadCount: ").append(toIndentedString(threadCount)).append("\n");
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

