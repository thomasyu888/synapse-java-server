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
 * The Reply model object represents a single reply in a thread.
 */
@ApiModel(description = "The Reply model object represents a single reply in a thread.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class DiscussionReplyBundle   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("forumId")
  private String forumId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("isDeleted")
  private Boolean isDeleted;

  @JsonProperty("isEdited")
  private Boolean isEdited;

  @JsonProperty("messageKey")
  private String messageKey;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("projectId")
  private String projectId;

  @JsonProperty("threadId")
  private String threadId;

  public DiscussionReplyBundle createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The id of the user that created this Reply
   * @return createdBy
  */
  @ApiModelProperty(value = "The id of the user that created this Reply")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public DiscussionReplyBundle createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The timestamp when this Reply was created
   * @return createdOn
  */
  @ApiModelProperty(value = "The timestamp when this Reply was created")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public DiscussionReplyBundle etag(String etag) {
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

  public DiscussionReplyBundle forumId(String forumId) {
    this.forumId = forumId;
    return this;
  }

  /**
   * The ID of the forum this Reply belongs to
   * @return forumId
  */
  @ApiModelProperty(value = "The ID of the forum this Reply belongs to")


  public String getForumId() {
    return forumId;
  }

  public void setForumId(String forumId) {
    this.forumId = forumId;
  }

  public DiscussionReplyBundle id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the reply
   * @return id
  */
  @ApiModelProperty(value = "The ID of the reply")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DiscussionReplyBundle isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Has this Reply been deleted?
   * @return isDeleted
  */
  @ApiModelProperty(value = "Has this Reply been deleted?")


  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public DiscussionReplyBundle isEdited(Boolean isEdited) {
    this.isEdited = isEdited;
    return this;
  }

  /**
   * Has the author edited this Reply?
   * @return isEdited
  */
  @ApiModelProperty(value = "Has the author edited this Reply?")


  public Boolean getIsEdited() {
    return isEdited;
  }

  public void setIsEdited(Boolean isEdited) {
    this.isEdited = isEdited;
  }

  public DiscussionReplyBundle messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

  /**
   * The S3 key where the actual message stored
   * @return messageKey
  */
  @ApiModelProperty(value = "The S3 key where the actual message stored")


  public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  public DiscussionReplyBundle modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The timestamp when this Reply was last modified
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The timestamp when this Reply was last modified")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public DiscussionReplyBundle projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project this Reply belongs to
   * @return projectId
  */
  @ApiModelProperty(value = "The ID of the project this Reply belongs to")


  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public DiscussionReplyBundle threadId(String threadId) {
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
    DiscussionReplyBundle discussionReplyBundle = (DiscussionReplyBundle) o;
    return Objects.equals(this.createdBy, discussionReplyBundle.createdBy) &&
        Objects.equals(this.createdOn, discussionReplyBundle.createdOn) &&
        Objects.equals(this.etag, discussionReplyBundle.etag) &&
        Objects.equals(this.forumId, discussionReplyBundle.forumId) &&
        Objects.equals(this.id, discussionReplyBundle.id) &&
        Objects.equals(this.isDeleted, discussionReplyBundle.isDeleted) &&
        Objects.equals(this.isEdited, discussionReplyBundle.isEdited) &&
        Objects.equals(this.messageKey, discussionReplyBundle.messageKey) &&
        Objects.equals(this.modifiedOn, discussionReplyBundle.modifiedOn) &&
        Objects.equals(this.projectId, discussionReplyBundle.projectId) &&
        Objects.equals(this.threadId, discussionReplyBundle.threadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, etag, forumId, id, isDeleted, isEdited, messageKey, modifiedOn, projectId, threadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscussionReplyBundle {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    forumId: ").append(toIndentedString(forumId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isEdited: ").append(toIndentedString(isEdited)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

