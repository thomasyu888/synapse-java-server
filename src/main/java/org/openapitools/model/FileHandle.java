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
 * The FileHandle interface defines all of the fields that are common to all implementations.
 */
@ApiModel(description = "The FileHandle interface defines all of the fields that are common to all implementations.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class FileHandle   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("contentMd5")
  private String contentMd5;

  @JsonProperty("contentSize")
  private Integer contentSize;

  @JsonProperty("contentType")
  private String contentType;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("id")
  private String id;

  @JsonProperty("storageLocationId")
  private Integer storageLocationId;

  public FileHandle concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * This is used to indicate the implementation of this interface. For example, an S3FileHandle should be set to: org.sagebionetworks.repo.model.file.S3FileHandle 
   * @return concreteType
  */
  @ApiModelProperty(value = "This is used to indicate the implementation of this interface. For example, an S3FileHandle should be set to: org.sagebionetworks.repo.model.file.S3FileHandle ")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public FileHandle contentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
    return this;
  }

  /**
   * The file's content MD5. 
   * @return contentMd5
  */
  @ApiModelProperty(value = "The file's content MD5. ")


  public String getContentMd5() {
    return contentMd5;
  }

  public void setContentMd5(String contentMd5) {
    this.contentMd5 = contentMd5;
  }

  public FileHandle contentSize(Integer contentSize) {
    this.contentSize = contentSize;
    return this;
  }

  /**
   * The size of the file in bytes.
   * @return contentSize
  */
  @ApiModelProperty(value = "The size of the file in bytes.")


  public Integer getContentSize() {
    return contentSize;
  }

  public void setContentSize(Integer contentSize) {
    this.contentSize = contentSize;
  }

  public FileHandle contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Must be: http://en.wikipedia.org/wiki/Internet_media_type 
   * @return contentType
  */
  @ApiModelProperty(value = "Must be: http://en.wikipedia.org/wiki/Internet_media_type ")


  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public FileHandle createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID Of the user that created this file.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID Of the user that created this file.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public FileHandle createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date when this file was uploaded.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date when this file was uploaded.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public FileHandle etag(String etag) {
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

  public FileHandle fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The short, user visible name for this file.
   * @return fileName
  */
  @ApiModelProperty(value = "The short, user visible name for this file.")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public FileHandle id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this FileHandle. All references to this FileHandle will use this ID. Synapse will generate this ID when the FileHandle is created. 
   * @return id
  */
  @ApiModelProperty(value = "The ID of this FileHandle. All references to this FileHandle will use this ID. Synapse will generate this ID when the FileHandle is created. ")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FileHandle storageLocationId(Integer storageLocationId) {
    this.storageLocationId = storageLocationId;
    return this;
  }

  /**
   * The optional storage location descriptor
   * @return storageLocationId
  */
  @ApiModelProperty(value = "The optional storage location descriptor")


  public Integer getStorageLocationId() {
    return storageLocationId;
  }

  public void setStorageLocationId(Integer storageLocationId) {
    this.storageLocationId = storageLocationId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileHandle fileHandle = (FileHandle) o;
    return Objects.equals(this.concreteType, fileHandle.concreteType) &&
        Objects.equals(this.contentMd5, fileHandle.contentMd5) &&
        Objects.equals(this.contentSize, fileHandle.contentSize) &&
        Objects.equals(this.contentType, fileHandle.contentType) &&
        Objects.equals(this.createdBy, fileHandle.createdBy) &&
        Objects.equals(this.createdOn, fileHandle.createdOn) &&
        Objects.equals(this.etag, fileHandle.etag) &&
        Objects.equals(this.fileName, fileHandle.fileName) &&
        Objects.equals(this.id, fileHandle.id) &&
        Objects.equals(this.storageLocationId, fileHandle.storageLocationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, contentMd5, contentSize, contentType, createdBy, createdOn, etag, fileName, id, storageLocationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileHandle {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    contentMd5: ").append(toIndentedString(contentMd5)).append("\n");
    sb.append("    contentSize: ").append(toIndentedString(contentSize)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    storageLocationId: ").append(toIndentedString(storageLocationId)).append("\n");
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

