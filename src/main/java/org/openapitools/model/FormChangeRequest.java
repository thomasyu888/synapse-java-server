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
 * Request changes to a FormData object.
 */
@ApiModel(description = "Request changes to a FormData object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class FormChangeRequest   {
  @JsonProperty("fileHandleId")
  private String fileHandleId;

  @JsonProperty("name")
  private String name;

  public FormChangeRequest fileHandleId(String fileHandleId) {
    this.fileHandleId = fileHandleId;
    return this;
  }

  /**
   * The fileHandleId for the data of the form.
   * @return fileHandleId
  */
  @ApiModelProperty(value = "The fileHandleId for the data of the form.")


  public String getFileHandleId() {
    return fileHandleId;
  }

  public void setFileHandleId(String fileHandleId) {
    this.fileHandleId = fileHandleId;
  }

  public FormChangeRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the form. Required for FormData create. Optional for FormData update. Between 3 and 256 characters' 
   * @return name
  */
  @ApiModelProperty(value = "The name of the form. Required for FormData create. Optional for FormData update. Between 3 and 256 characters' ")

@Size(min=3,max=256) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormChangeRequest formChangeRequest = (FormChangeRequest) o;
    return Objects.equals(this.fileHandleId, formChangeRequest.fileHandleId) &&
        Objects.equals(this.name, formChangeRequest.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileHandleId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormChangeRequest {\n");
    
    sb.append("    fileHandleId: ").append(toIndentedString(fileHandleId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

