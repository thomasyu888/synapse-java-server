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
 * JSON schema for VersionInfo POJO
 */
@ApiModel(description = "JSON schema for VersionInfo POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class VersionInfo   {
  @JsonProperty("contentMd5")
  private String contentMd5;

  @JsonProperty("contentSize")
  private String contentSize;

  @JsonProperty("id")
  private String id;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("modifiedByPrincipalId")
  private String modifiedByPrincipalId;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("versionComment")
  private String versionComment;

  @JsonProperty("versionLabel")
  private String versionLabel;

  @JsonProperty("versionNumber")
  private Integer versionNumber;

  public VersionInfo contentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
    return this;
  }

  /**
   * Calculated md5 of the associated file (when applicable and available).
   * @return contentMd5
  */
  @ApiModelProperty(value = "Calculated md5 of the associated file (when applicable and available).")


  public String getContentMd5() {
    return contentMd5;
  }

  public void setContentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
  }

  public VersionInfo contentSize(String contentSize) {
    this.contentSize = contentSize;
    return this;
  }

  /**
   * The size of the associated file (when applicable and available).
   * @return contentSize
  */
  @ApiModelProperty(value = "The size of the associated file (when applicable and available).")


  public String getContentSize() {
    return contentSize;
  }

  public void setContentSize(String contentSize) {
    this.contentSize = contentSize;
  }

  public VersionInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of the entity
   * @return id
  */
  @ApiModelProperty(value = "The id of the entity")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VersionInfo modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The display name of the user that last modified this entity.
   * @return modifiedBy
  */
  @ApiModelProperty(value = "The display name of the user that last modified this entity.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public VersionInfo modifiedByPrincipalId(String modifiedByPrincipalId) {
    this.modifiedByPrincipalId = modifiedByPrincipalId;
    return this;
  }

  /**
   * The user that last modified this entity.
   * @return modifiedByPrincipalId
  */
  @ApiModelProperty(value = "The user that last modified this entity.")


  public String getModifiedByPrincipalId() {
    return modifiedByPrincipalId;
  }

  public void setModifiedByPrincipalId(String modifiedByPrincipalId) {
    this.modifiedByPrincipalId = modifiedByPrincipalId;
  }

  public VersionInfo modifiedOn(String modifiedOn) {
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

  public VersionInfo versionComment(String versionComment) {
    this.versionComment = versionComment;
    return this;
  }

  /**
   * The user defined version label of the entity
   * @return versionComment
  */
  @ApiModelProperty(value = "The user defined version label of the entity")


  public String getVersionComment() {
    return versionComment;
  }

  public void setVersionComment(String versionComment) {
    this.versionComment = versionComment;
  }

  public VersionInfo versionLabel(String versionLabel) {
    this.versionLabel = versionLabel;
    return this;
  }

  /**
   * The user defined version label of the entity
   * @return versionLabel
  */
  @ApiModelProperty(value = "The user defined version label of the entity")


  public String getVersionLabel() {
    return versionLabel;
  }

  public void setVersionLabel(String versionLabel) {
    this.versionLabel = versionLabel;
  }

  public VersionInfo versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * The version number of the entity
   * @return versionNumber
  */
  @ApiModelProperty(value = "The version number of the entity")


  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionInfo versionInfo = (VersionInfo) o;
    return Objects.equals(this.contentMd5, versionInfo.contentMd5) &&
        Objects.equals(this.contentSize, versionInfo.contentSize) &&
        Objects.equals(this.id, versionInfo.id) &&
        Objects.equals(this.modifiedBy, versionInfo.modifiedBy) &&
        Objects.equals(this.modifiedByPrincipalId, versionInfo.modifiedByPrincipalId) &&
        Objects.equals(this.modifiedOn, versionInfo.modifiedOn) &&
        Objects.equals(this.versionComment, versionInfo.versionComment) &&
        Objects.equals(this.versionLabel, versionInfo.versionLabel) &&
        Objects.equals(this.versionNumber, versionInfo.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentMd5, contentSize, id, modifiedBy, modifiedByPrincipalId, modifiedOn, versionComment, versionLabel, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionInfo {\n");
    
    sb.append("    contentMd5: ").append(toIndentedString(contentMd5)).append("\n");
    sb.append("    contentSize: ").append(toIndentedString(contentSize)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedByPrincipalId: ").append(toIndentedString(modifiedByPrincipalId)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    versionComment: ").append(toIndentedString(versionComment)).append("\n");
    sb.append("    versionLabel: ").append(toIndentedString(versionLabel)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

