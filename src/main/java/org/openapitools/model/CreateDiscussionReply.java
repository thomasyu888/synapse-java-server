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
 * The model object represents a single Reply creation.
 */
@ApiModel(description = "The model object represents a single Reply creation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class CreateDiscussionReply   {
  @JsonProperty("messageMarkdown")
  private String messageMarkdown;

  @JsonProperty("threadId")
  private String threadId;

  public CreateDiscussionReply messageMarkdown(String messageMarkdown) {
    this.messageMarkdown = messageMarkdown;
    return this;
  }

  /**
   * The markdown of the Reply's message 
   * @return messageMarkdown
  */
  @ApiModelProperty(value = "The markdown of the Reply's message ")


  public String getMessageMarkdown() {
    return messageMarkdown;
  }

  public void setMessageMarkdown(String messageMarkdown) {
    this.messageMarkdown = messageMarkdown;
  }

  public CreateDiscussionReply threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

  /**
   * The ID of the thread this Reply belongs to
   * @return threadId
  */
  @ApiModelProperty(value = "The ID of the thread this Reply belongs to")


  public String getThreadId() {
    return threadId;
  }

  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDiscussionReply createDiscussionReply = (CreateDiscussionReply) o;
    return Objects.equals(this.messageMarkdown, createDiscussionReply.messageMarkdown) &&
        Objects.equals(this.threadId, createDiscussionReply.threadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageMarkdown, threadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDiscussionReply {\n");
    
    sb.append("    messageMarkdown: ").append(toIndentedString(messageMarkdown)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
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

