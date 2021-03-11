package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The permission a User has for a given Entity
 */
@ApiModel(description = "The permission a User has for a given Entity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class UserEntityPermissions   {
  @JsonProperty("canAddChild")
  private Boolean canAddChild;

  @JsonProperty("canCertifiedUserAddChild")
  private Boolean canCertifiedUserAddChild;

  @JsonProperty("canCertifiedUserEdit")
  private Boolean canCertifiedUserEdit;

  @JsonProperty("canChangePermissions")
  private Boolean canChangePermissions;

  @JsonProperty("canChangeSettings")
  private Boolean canChangeSettings;

  @JsonProperty("canDelete")
  private Boolean canDelete;

  @JsonProperty("canDownload")
  private Boolean canDownload;

  @JsonProperty("canEdit")
  private Boolean canEdit;

  @JsonProperty("canEnableInheritance")
  private Boolean canEnableInheritance;

  @JsonProperty("canModerate")
  private Boolean canModerate;

  @JsonProperty("canPublicRead")
  private Boolean canPublicRead;

  @JsonProperty("canUpload")
  private Boolean canUpload;

  @JsonProperty("canView")
  private Boolean canView;

  @JsonProperty("isCertificationRequired")
  private Boolean isCertificationRequired;

  @JsonProperty("isCertifiedUser")
  private Boolean isCertifiedUser;

  @JsonProperty("ownerPrincipalId")
  private BigDecimal ownerPrincipalId;

  public UserEntityPermissions canAddChild(Boolean canAddChild) {
    this.canAddChild = canAddChild;
    return this;
  }

  /**
   * Can the user add a child entity to this entity?
   * @return canAddChild
  */
  @ApiModelProperty(value = "Can the user add a child entity to this entity?")


  public Boolean getCanAddChild() {
    return canAddChild;
  }

  public void setCanAddChild(Boolean canAddChild) {
    this.canAddChild = canAddChild;
  }

  public UserEntityPermissions canCertifiedUserAddChild(Boolean canCertifiedUserAddChild) {
    this.canCertifiedUserAddChild = canCertifiedUserAddChild;
    return this;
  }

  /**
   * Can the user add a child entity to this entity once they become a Certified User?
   * @return canCertifiedUserAddChild
  */
  @ApiModelProperty(value = "Can the user add a child entity to this entity once they become a Certified User?")


  public Boolean getCanCertifiedUserAddChild() {
    return canCertifiedUserAddChild;
  }

  public void setCanCertifiedUserAddChild(Boolean canCertifiedUserAddChild) {
    this.canCertifiedUserAddChild = canCertifiedUserAddChild;
  }

  public UserEntityPermissions canCertifiedUserEdit(Boolean canCertifiedUserEdit) {
    this.canCertifiedUserEdit = canCertifiedUserEdit;
    return this;
  }

  /**
   * Can the user edit this entity once they become a Certified User?
   * @return canCertifiedUserEdit
  */
  @ApiModelProperty(value = "Can the user edit this entity once they become a Certified User?")


  public Boolean getCanCertifiedUserEdit() {
    return canCertifiedUserEdit;
  }

  public void setCanCertifiedUserEdit(Boolean canCertifiedUserEdit) {
    this.canCertifiedUserEdit = canCertifiedUserEdit;
  }

  public UserEntityPermissions canChangePermissions(Boolean canChangePermissions) {
    this.canChangePermissions = canChangePermissions;
    return this;
  }

  /**
   * Can the user change the permissions of this entity?
   * @return canChangePermissions
  */
  @ApiModelProperty(value = "Can the user change the permissions of this entity?")


  public Boolean getCanChangePermissions() {
    return canChangePermissions;
  }

  public void setCanChangePermissions(Boolean canChangePermissions) {
    this.canChangePermissions = canChangePermissions;
  }

  public UserEntityPermissions canChangeSettings(Boolean canChangeSettings) {
    this.canChangeSettings = canChangeSettings;
    return this;
  }

  /**
   * Can the user change the settings of this entity?
   * @return canChangeSettings
  */
  @ApiModelProperty(value = "Can the user change the settings of this entity?")


  public Boolean getCanChangeSettings() {
    return canChangeSettings;
  }

  public void setCanChangeSettings(Boolean canChangeSettings) {
    this.canChangeSettings = canChangeSettings;
  }

  public UserEntityPermissions canDelete(Boolean canDelete) {
    this.canDelete = canDelete;
    return this;
  }

  /**
   * Can the user delete this entity?
   * @return canDelete
  */
  @ApiModelProperty(value = "Can the user delete this entity?")


  public Boolean getCanDelete() {
    return canDelete;
  }

  public void setCanDelete(Boolean canDelete) {
    this.canDelete = canDelete;
  }

  public UserEntityPermissions canDownload(Boolean canDownload) {
    this.canDownload = canDownload;
    return this;
  }

  /**
   * Are there any access requirements precluding the user from downloading this entity?
   * @return canDownload
  */
  @ApiModelProperty(value = "Are there any access requirements precluding the user from downloading this entity?")


  public Boolean getCanDownload() {
    return canDownload;
  }

  public void setCanDownload(Boolean canDownload) {
    this.canDownload = canDownload;
  }

  public UserEntityPermissions canEdit(Boolean canEdit) {
    this.canEdit = canEdit;
    return this;
  }

  /**
   * Can the user edit this entity?
   * @return canEdit
  */
  @ApiModelProperty(value = "Can the user edit this entity?")


  public Boolean getCanEdit() {
    return canEdit;
  }

  public void setCanEdit(Boolean canEdit) {
    this.canEdit = canEdit;
  }

  public UserEntityPermissions canEnableInheritance(Boolean canEnableInheritance) {
    this.canEnableInheritance = canEnableInheritance;
    return this;
  }

  /**
   * Can the user delete the entity's access control list (so it inherits settings from an ancestor)?' 
   * @return canEnableInheritance
  */
  @ApiModelProperty(value = "Can the user delete the entity's access control list (so it inherits settings from an ancestor)?' ")


  public Boolean getCanEnableInheritance() {
    return canEnableInheritance;
  }

  public void setCanEnableInheritance(Boolean canEnableInheritance) {
    this.canEnableInheritance = canEnableInheritance;
  }

  public UserEntityPermissions canModerate(Boolean canModerate) {
    this.canModerate = canModerate;
    return this;
  }

  /**
   * Can the user moderate the forum associated with this entity? Note that only project entity has forum.
   * @return canModerate
  */
  @ApiModelProperty(value = "Can the user moderate the forum associated with this entity? Note that only project entity has forum.")


  public Boolean getCanModerate() {
    return canModerate;
  }

  public void setCanModerate(Boolean canModerate) {
    this.canModerate = canModerate;
  }

  public UserEntityPermissions canPublicRead(Boolean canPublicRead) {
    this.canPublicRead = canPublicRead;
    return this;
  }

  /**
   * Is this entity considered public?
   * @return canPublicRead
  */
  @ApiModelProperty(value = "Is this entity considered public?")


  public Boolean getCanPublicRead() {
    return canPublicRead;
  }

  public void setCanPublicRead(Boolean canPublicRead) {
    this.canPublicRead = canPublicRead;
  }

  public UserEntityPermissions canUpload(Boolean canUpload) {
    this.canUpload = canUpload;
    return this;
  }

  /**
   * Are there any access requirements precluding the user from uploading into this entity (folder or project)?
   * @return canUpload
  */
  @ApiModelProperty(value = "Are there any access requirements precluding the user from uploading into this entity (folder or project)?")


  public Boolean getCanUpload() {
    return canUpload;
  }

  public void setCanUpload(Boolean canUpload) {
    this.canUpload = canUpload;
  }

  public UserEntityPermissions canView(Boolean canView) {
    this.canView = canView;
    return this;
  }

  /**
   * Can the user view this entity?
   * @return canView
  */
  @ApiModelProperty(value = "Can the user view this entity?")


  public Boolean getCanView() {
    return canView;
  }

  public void setCanView(Boolean canView) {
    this.canView = canView;
  }

  public UserEntityPermissions isCertificationRequired(Boolean isCertificationRequired) {
    this.isCertificationRequired = isCertificationRequired;
    return this;
  }

  /**
   * Is the certification requirement enabled for the project of the entity?
   * @return isCertificationRequired
  */
  @ApiModelProperty(value = "Is the certification requirement enabled for the project of the entity?")


  public Boolean getIsCertificationRequired() {
    return isCertificationRequired;
  }

  public void setIsCertificationRequired(Boolean isCertificationRequired) {
    this.isCertificationRequired = isCertificationRequired;
  }

  public UserEntityPermissions isCertifiedUser(Boolean isCertifiedUser) {
    this.isCertifiedUser = isCertifiedUser;
    return this;
  }

  /**
   * Is this user certified?
   * @return isCertifiedUser
  */
  @ApiModelProperty(value = "Is this user certified?")


  public Boolean getIsCertifiedUser() {
    return isCertifiedUser;
  }

  public void setIsCertifiedUser(Boolean isCertifiedUser) {
    this.isCertifiedUser = isCertifiedUser;
  }

  public UserEntityPermissions ownerPrincipalId(BigDecimal ownerPrincipalId) {
    this.ownerPrincipalId = ownerPrincipalId;
    return this;
  }

  /**
   * The principal ID of the entity's owner (i.e. the entity's 'createdBy')' 
   * @return ownerPrincipalId
  */
  @ApiModelProperty(value = "The principal ID of the entity's owner (i.e. the entity's 'createdBy')' ")

  @Valid

  public BigDecimal getOwnerPrincipalId() {
    return ownerPrincipalId;
  }

  public void setOwnerPrincipalId(BigDecimal ownerPrincipalId) {
    this.ownerPrincipalId = ownerPrincipalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserEntityPermissions userEntityPermissions = (UserEntityPermissions) o;
    return Objects.equals(this.canAddChild, userEntityPermissions.canAddChild) &&
        Objects.equals(this.canCertifiedUserAddChild, userEntityPermissions.canCertifiedUserAddChild) &&
        Objects.equals(this.canCertifiedUserEdit, userEntityPermissions.canCertifiedUserEdit) &&
        Objects.equals(this.canChangePermissions, userEntityPermissions.canChangePermissions) &&
        Objects.equals(this.canChangeSettings, userEntityPermissions.canChangeSettings) &&
        Objects.equals(this.canDelete, userEntityPermissions.canDelete) &&
        Objects.equals(this.canDownload, userEntityPermissions.canDownload) &&
        Objects.equals(this.canEdit, userEntityPermissions.canEdit) &&
        Objects.equals(this.canEnableInheritance, userEntityPermissions.canEnableInheritance) &&
        Objects.equals(this.canModerate, userEntityPermissions.canModerate) &&
        Objects.equals(this.canPublicRead, userEntityPermissions.canPublicRead) &&
        Objects.equals(this.canUpload, userEntityPermissions.canUpload) &&
        Objects.equals(this.canView, userEntityPermissions.canView) &&
        Objects.equals(this.isCertificationRequired, userEntityPermissions.isCertificationRequired) &&
        Objects.equals(this.isCertifiedUser, userEntityPermissions.isCertifiedUser) &&
        Objects.equals(this.ownerPrincipalId, userEntityPermissions.ownerPrincipalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canAddChild, canCertifiedUserAddChild, canCertifiedUserEdit, canChangePermissions, canChangeSettings, canDelete, canDownload, canEdit, canEnableInheritance, canModerate, canPublicRead, canUpload, canView, isCertificationRequired, isCertifiedUser, ownerPrincipalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserEntityPermissions {\n");
    
    sb.append("    canAddChild: ").append(toIndentedString(canAddChild)).append("\n");
    sb.append("    canCertifiedUserAddChild: ").append(toIndentedString(canCertifiedUserAddChild)).append("\n");
    sb.append("    canCertifiedUserEdit: ").append(toIndentedString(canCertifiedUserEdit)).append("\n");
    sb.append("    canChangePermissions: ").append(toIndentedString(canChangePermissions)).append("\n");
    sb.append("    canChangeSettings: ").append(toIndentedString(canChangeSettings)).append("\n");
    sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
    sb.append("    canDownload: ").append(toIndentedString(canDownload)).append("\n");
    sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
    sb.append("    canEnableInheritance: ").append(toIndentedString(canEnableInheritance)).append("\n");
    sb.append("    canModerate: ").append(toIndentedString(canModerate)).append("\n");
    sb.append("    canPublicRead: ").append(toIndentedString(canPublicRead)).append("\n");
    sb.append("    canUpload: ").append(toIndentedString(canUpload)).append("\n");
    sb.append("    canView: ").append(toIndentedString(canView)).append("\n");
    sb.append("    isCertificationRequired: ").append(toIndentedString(isCertificationRequired)).append("\n");
    sb.append("    isCertifiedUser: ").append(toIndentedString(isCertifiedUser)).append("\n");
    sb.append("    ownerPrincipalId: ").append(toIndentedString(ownerPrincipalId)).append("\n");
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

