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
 * Update Thread Message
 */
@ApiModel(description = "Update Thread Message")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class UpdateThreadMessage   {
  @JsonProperty("messageMarkdown")
  private String messageMarkdown;

  public UpdateThreadMessage messageMarkdown(String messageMarkdown) {
    this.messageMarkdown = messageMarkdown;
    return this;
  }

  /**
   * The new message markdown
   * @return messageMarkdown
  */
  @ApiModelProperty(value = "The new message markdown")


  public String getMessageMarkdown() {
    return messageMarkdown;
  }

  public void setMessageMarkdown(String messageMarkdown) {
    this.messageMarkdown = messageMarkdown;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateThreadMessage updateThreadMessage = (UpdateThreadMessage) o;
    return Objects.equals(this.messageMarkdown, updateThreadMessage.messageMarkdown);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageMarkdown);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateThreadMessage {\n");
    
    sb.append("    messageMarkdown: ").append(toIndentedString(messageMarkdown)).append("\n");
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

