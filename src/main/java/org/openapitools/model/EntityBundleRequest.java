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
 * Specifies what fields to include in an EntityBundle
 */
@ApiModel(description = "Specifies what fields to include in an EntityBundle")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EntityBundleRequest   {
  @JsonProperty("includeAccessControlList")
  private Boolean includeAccessControlList;

  @JsonProperty("includeAnnotations")
  private Boolean includeAnnotations;

  @JsonProperty("includeBenefactorACL")
  private Boolean includeBenefactorACL;

  @JsonProperty("includeDOIAssociation")
  private Boolean includeDOIAssociation;

  @JsonProperty("includeEntity")
  private Boolean includeEntity;

  @JsonProperty("includeEntityPath")
  private Boolean includeEntityPath;

  @JsonProperty("includeFileHandles")
  private Boolean includeFileHandles;

  @JsonProperty("includeFileName")
  private Boolean includeFileName;

  @JsonProperty("includeHasChildren")
  private Boolean includeHasChildren;

  @JsonProperty("includePermissions")
  private Boolean includePermissions;

  @JsonProperty("includeRestrictionInformation")
  private Boolean includeRestrictionInformation;

  @JsonProperty("includeRootWikiId")
  private Boolean includeRootWikiId;

  @JsonProperty("includeTableBundle")
  private Boolean includeTableBundle;

  @JsonProperty("includeThreadCount")
  private Boolean includeThreadCount;

  public EntityBundleRequest includeAccessControlList(Boolean includeAccessControlList) {
    this.includeAccessControlList = includeAccessControlList;
    return this;
  }

  /**
   * Include the AccessControlList for this Entity
   * @return includeAccessControlList
  */
  @ApiModelProperty(value = "Include the AccessControlList for this Entity")


  public Boolean getIncludeAccessControlList() {
    return includeAccessControlList;
  }

  public void setIncludeAccessControlList(Boolean includeAccessControlList) {
    this.includeAccessControlList = includeAccessControlList;
  }

  public EntityBundleRequest includeAnnotations(Boolean includeAnnotations) {
    this.includeAnnotations = includeAnnotations;
    return this;
  }

  /**
   * Include Annotations associated with the Entity in the response.
   * @return includeAnnotations
  */
  @ApiModelProperty(value = "Include Annotations associated with the Entity in the response.")


  public Boolean getIncludeAnnotations() {
    return includeAnnotations;
  }

  public void setIncludeAnnotations(Boolean includeAnnotations) {
    this.includeAnnotations = includeAnnotations;
  }

  public EntityBundleRequest includeBenefactorACL(Boolean includeBenefactorACL) {
    this.includeBenefactorACL = includeBenefactorACL;
    return this;
  }

  /**
   * Include the ACL of the Entity from which this Entity inherits its AccessControlList
   * @return includeBenefactorACL
  */
  @ApiModelProperty(value = "Include the ACL of the Entity from which this Entity inherits its AccessControlList")


  public Boolean getIncludeBenefactorACL() {
    return includeBenefactorACL;
  }

  public void setIncludeBenefactorACL(Boolean includeBenefactorACL) {
    this.includeBenefactorACL = includeBenefactorACL;
  }

  public EntityBundleRequest includeDOIAssociation(Boolean includeDOIAssociation) {
    this.includeDOIAssociation = includeDOIAssociation;
    return this;
  }

  /**
   * Include DOIs associated with this Entity
   * @return includeDOIAssociation
  */
  @ApiModelProperty(value = "Include DOIs associated with this Entity")


  public Boolean getIncludeDOIAssociation() {
    return includeDOIAssociation;
  }

  public void setIncludeDOIAssociation(Boolean includeDOIAssociation) {
    this.includeDOIAssociation = includeDOIAssociation;
  }

  public EntityBundleRequest includeEntity(Boolean includeEntity) {
    this.includeEntity = includeEntity;
    return this;
  }

  /**
   * Include the Entity in the response.
   * @return includeEntity
  */
  @ApiModelProperty(value = "Include the Entity in the response.")


  public Boolean getIncludeEntity() {
    return includeEntity;
  }

  public void setIncludeEntity(Boolean includeEntity) {
    this.includeEntity = includeEntity;
  }

  public EntityBundleRequest includeEntityPath(Boolean includeEntityPath) {
    this.includeEntityPath = includeEntityPath;
    return this;
  }

  /**
   * Include EntityHeaders for all Entities in this Entity's path 
   * @return includeEntityPath
  */
  @ApiModelProperty(value = "Include EntityHeaders for all Entities in this Entity's path ")


  public Boolean getIncludeEntityPath() {
    return includeEntityPath;
  }

  public void setIncludeEntityPath(Boolean includeEntityPath) {
    this.includeEntityPath = includeEntityPath;
  }

  public EntityBundleRequest includeFileHandles(Boolean includeFileHandles) {
    this.includeFileHandles = includeFileHandles;
    return this;
  }

  /**
   * Include all FileHandles associated with this Entity.
   * @return includeFileHandles
  */
  @ApiModelProperty(value = "Include all FileHandles associated with this Entity.")


  public Boolean getIncludeFileHandles() {
    return includeFileHandles;
  }

  public void setIncludeFileHandles(Boolean includeFileHandles) {
    this.includeFileHandles = includeFileHandles;
  }

  public EntityBundleRequest includeFileName(Boolean includeFileName) {
    this.includeFileName = includeFileName;
    return this;
  }

  /**
   * If this Entity is a FileEntity, include its filename
   * @return includeFileName
  */
  @ApiModelProperty(value = "If this Entity is a FileEntity, include its filename")


  public Boolean getIncludeFileName() {
    return includeFileName;
  }

  public void setIncludeFileName(Boolean includeFileName) {
    this.includeFileName = includeFileName;
  }

  public EntityBundleRequest includeHasChildren(Boolean includeHasChildren) {
    this.includeHasChildren = includeHasChildren;
    return this;
  }

  /**
   * Include boolean indicating whether this Entity has children
   * @return includeHasChildren
  */
  @ApiModelProperty(value = "Include boolean indicating whether this Entity has children")


  public Boolean getIncludeHasChildren() {
    return includeHasChildren;
  }

  public void setIncludeHasChildren(Boolean includeHasChildren) {
    this.includeHasChildren = includeHasChildren;
  }

  public EntityBundleRequest includePermissions(Boolean includePermissions) {
    this.includePermissions = includePermissions;
    return this;
  }

  /**
   * Include permissions of the current user on the entity.
   * @return includePermissions
  */
  @ApiModelProperty(value = "Include permissions of the current user on the entity.")


  public Boolean getIncludePermissions() {
    return includePermissions;
  }

  public void setIncludePermissions(Boolean includePermissions) {
    this.includePermissions = includePermissions;
  }

  public EntityBundleRequest includeRestrictionInformation(Boolean includeRestrictionInformation) {
    this.includeRestrictionInformation = includeRestrictionInformation;
    return this;
  }

  /**
   * Include the RestrictionLevel of this Entity
   * @return includeRestrictionInformation
  */
  @ApiModelProperty(value = "Include the RestrictionLevel of this Entity")


  public Boolean getIncludeRestrictionInformation() {
    return includeRestrictionInformation;
  }

  public void setIncludeRestrictionInformation(Boolean includeRestrictionInformation) {
    this.includeRestrictionInformation = includeRestrictionInformation;
  }

  public EntityBundleRequest includeRootWikiId(Boolean includeRootWikiId) {
    this.includeRootWikiId = includeRootWikiId;
    return this;
  }

  /**
   * Include the id of the root Wiki associated with this Entity
   * @return includeRootWikiId
  */
  @ApiModelProperty(value = "Include the id of the root Wiki associated with this Entity")


  public Boolean getIncludeRootWikiId() {
    return includeRootWikiId;
  }

  public void setIncludeRootWikiId(Boolean includeRootWikiId) {
    this.includeRootWikiId = includeRootWikiId;
  }

  public EntityBundleRequest includeTableBundle(Boolean includeTableBundle) {
    this.includeTableBundle = includeTableBundle;
    return this;
  }

  /**
   * If the Entity is a TableEntity, include Table specific metadata.
   * @return includeTableBundle
  */
  @ApiModelProperty(value = "If the Entity is a TableEntity, include Table specific metadata.")


  public Boolean getIncludeTableBundle() {
    return includeTableBundle;
  }

  public void setIncludeTableBundle(Boolean includeTableBundle) {
    this.includeTableBundle = includeTableBundle;
  }

  public EntityBundleRequest includeThreadCount(Boolean includeThreadCount) {
    this.includeThreadCount = includeThreadCount;
    return this;
  }

  /**
   * Include the number of discussion threads that mention this Entity
   * @return includeThreadCount
  */
  @ApiModelProperty(value = "Include the number of discussion threads that mention this Entity")


  public Boolean getIncludeThreadCount() {
    return includeThreadCount;
  }

  public void setIncludeThreadCount(Boolean includeThreadCount) {
    this.includeThreadCount = includeThreadCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityBundleRequest entityBundleRequest = (EntityBundleRequest) o;
    return Objects.equals(this.includeAccessControlList, entityBundleRequest.includeAccessControlList) &&
        Objects.equals(this.includeAnnotations, entityBundleRequest.includeAnnotations) &&
        Objects.equals(this.includeBenefactorACL, entityBundleRequest.includeBenefactorACL) &&
        Objects.equals(this.includeDOIAssociation, entityBundleRequest.includeDOIAssociation) &&
        Objects.equals(this.includeEntity, entityBundleRequest.includeEntity) &&
        Objects.equals(this.includeEntityPath, entityBundleRequest.includeEntityPath) &&
        Objects.equals(this.includeFileHandles, entityBundleRequest.includeFileHandles) &&
        Objects.equals(this.includeFileName, entityBundleRequest.includeFileName) &&
        Objects.equals(this.includeHasChildren, entityBundleRequest.includeHasChildren) &&
        Objects.equals(this.includePermissions, entityBundleRequest.includePermissions) &&
        Objects.equals(this.includeRestrictionInformation, entityBundleRequest.includeRestrictionInformation) &&
        Objects.equals(this.includeRootWikiId, entityBundleRequest.includeRootWikiId) &&
        Objects.equals(this.includeTableBundle, entityBundleRequest.includeTableBundle) &&
        Objects.equals(this.includeThreadCount, entityBundleRequest.includeThreadCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeAccessControlList, includeAnnotations, includeBenefactorACL, includeDOIAssociation, includeEntity, includeEntityPath, includeFileHandles, includeFileName, includeHasChildren, includePermissions, includeRestrictionInformation, includeRootWikiId, includeTableBundle, includeThreadCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityBundleRequest {\n");
    
    sb.append("    includeAccessControlList: ").append(toIndentedString(includeAccessControlList)).append("\n");
    sb.append("    includeAnnotations: ").append(toIndentedString(includeAnnotations)).append("\n");
    sb.append("    includeBenefactorACL: ").append(toIndentedString(includeBenefactorACL)).append("\n");
    sb.append("    includeDOIAssociation: ").append(toIndentedString(includeDOIAssociation)).append("\n");
    sb.append("    includeEntity: ").append(toIndentedString(includeEntity)).append("\n");
    sb.append("    includeEntityPath: ").append(toIndentedString(includeEntityPath)).append("\n");
    sb.append("    includeFileHandles: ").append(toIndentedString(includeFileHandles)).append("\n");
    sb.append("    includeFileName: ").append(toIndentedString(includeFileName)).append("\n");
    sb.append("    includeHasChildren: ").append(toIndentedString(includeHasChildren)).append("\n");
    sb.append("    includePermissions: ").append(toIndentedString(includePermissions)).append("\n");
    sb.append("    includeRestrictionInformation: ").append(toIndentedString(includeRestrictionInformation)).append("\n");
    sb.append("    includeRootWikiId: ").append(toIndentedString(includeRootWikiId)).append("\n");
    sb.append("    includeTableBundle: ").append(toIndentedString(includeTableBundle)).append("\n");
    sb.append("    includeThreadCount: ").append(toIndentedString(includeThreadCount)).append("\n");
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

