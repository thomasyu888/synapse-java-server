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
 * Reuqest that can be used to update the file handle of an FileEntity
 */
@ApiModel(description = "Reuqest that can be used to update the file handle of an FileEntity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class FileHandleUpdateRequest   {
  @JsonProperty("newFileHandleId")
  private String newFileHandleId;

  @JsonProperty("oldFileHandleId")
  private String oldFileHandleId;

  public FileHandleUpdateRequest newFileHandleId(String newFileHandleId) {
    this.newFileHandleId = newFileHandleId;
    return this;
  }

  /**
   * The id of the new file handle to be associated with the FileEntity. The user performing the request must be the owner of the file handle. 
   * @return newFileHandleId
  */
  @ApiModelProperty(value = "The id of the new file handle to be associated with the FileEntity. The user performing the request must be the owner of the file handle. ")


  public String getNewFileHandleId() {
    return newFileHandleId;
  }

  public void setNewFileHandleId(String newFileHandleId) {
    this.newFileHandleId = newFileHandleId;
  }

  public FileHandleUpdateRequest oldFileHandleId(String oldFileHandleId) {
    this.oldFileHandleId = oldFileHandleId;
    return this;
  }

  /**
   * The id of the file handle currently associated to the FileEntity. Used to avoid conflicting cuncurrent updates, if the id does not match the current file handle id the request will be rejected with a PRECONDITION_FAILED (412) response. 
   * @return oldFileHandleId
  */
  @ApiModelProperty(value = "The id of the file handle currently associated to the FileEntity. Used to avoid conflicting cuncurrent updates, if the id does not match the current file handle id the request will be rejected with a PRECONDITION_FAILED (412) response. ")


  public String getOldFileHandleId() {
    return oldFileHandleId;
  }

  public void setOldFileHandleId(String oldFileHandleId) {
    this.oldFileHandleId = oldFileHandleId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileHandleUpdateRequest fileHandleUpdateRequest = (FileHandleUpdateRequest) o;
    return Objects.equals(this.newFileHandleId, fileHandleUpdateRequest.newFileHandleId) &&
        Objects.equals(this.oldFileHandleId, fileHandleUpdateRequest.oldFileHandleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newFileHandleId, oldFileHandleId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileHandleUpdateRequest {\n");
    
    sb.append("    newFileHandleId: ").append(toIndentedString(newFileHandleId)).append("\n");
    sb.append("    oldFileHandleId: ").append(toIndentedString(oldFileHandleId)).append("\n");
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

