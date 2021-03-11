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
 * The model object represents a single Thread creation.
 */
@ApiModel(description = "The model object represents a single Thread creation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class CreateDiscussionThread   {
  @JsonProperty("forumId")
  private String forumId;

  @JsonProperty("messageMarkdown")
  private String messageMarkdown;

  @JsonProperty("title")
  private String title;

  public CreateDiscussionThread forumId(String forumId) {
    this.forumId = forumId;
    return this;
  }

  /**
   * The ID of the forum this CreateThread belongs to
   * @return forumId
  */
  @ApiModelProperty(value = "The ID of the forum this CreateThread belongs to")


  public String getForumId() {
    return forumId;
  }

  public void setForumId(String forumId) {
    this.forumId = forumId;
  }

  public CreateDiscussionThread messageMarkdown(String messageMarkdown) {
    this.messageMarkdown = messageMarkdown;
    return this;
  }

  /**
   * The markdown of the Thread's message 
   * @return messageMarkdown
  */
  @ApiModelProperty(value = "The markdown of the Thread's message ")


  public String getMessageMarkdown() {
    return messageMarkdown;
  }

  public void setMessageMarkdown(String messageMarkdown) {
    this.messageMarkdown = messageMarkdown;
  }

  public CreateDiscussionThread title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the Thread
   * @return title
  */
  @ApiModelProperty(value = "The title of the Thread")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDiscussionThread createDiscussionThread = (CreateDiscussionThread) o;
    return Objects.equals(this.forumId, createDiscussionThread.forumId) &&
        Objects.equals(this.messageMarkdown, createDiscussionThread.messageMarkdown) &&
        Objects.equals(this.title, createDiscussionThread.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forumId, messageMarkdown, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDiscussionThread {\n");
    
    sb.append("    forumId: ").append(toIndentedString(forumId)).append("\n");
    sb.append("    messageMarkdown: ").append(toIndentedString(messageMarkdown)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

