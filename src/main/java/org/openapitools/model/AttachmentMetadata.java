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
 * The metadata of a file attached to a Verification Submission
 */
@ApiModel(description = "The metadata of a file attached to a Verification Submission")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AttachmentMetadata   {
  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("id")
  private String id;

  public AttachmentMetadata fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * The name of a file
   * @return fileName
  */
  @ApiModelProperty(value = "The name of a file")


  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public AttachmentMetadata id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of a file
   * @return id
  */
  @ApiModelProperty(value = "The identifier of a file")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentMetadata attachmentMetadata = (AttachmentMetadata) o;
    return Objects.equals(this.fileName, attachmentMetadata.fileName) &&
        Objects.equals(this.id, attachmentMetadata.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentMetadata {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

