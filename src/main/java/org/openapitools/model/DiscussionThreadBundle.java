package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The Thread model object represents a single Thread.
 */
@ApiModel(description = "The Thread model object represents a single Thread.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class DiscussionThreadBundle   {
  @JsonProperty("activeAuthors")
  @Valid
  private List<String> activeAuthors = null;

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

  @JsonProperty("isPinned")
  private Boolean isPinned;

  @JsonProperty("lastActivity")
  private String lastActivity;

  @JsonProperty("messageKey")
  private String messageKey;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("numberOfReplies")
  private Integer numberOfReplies;

  @JsonProperty("numberOfViews")
  private Integer numberOfViews;

  @JsonProperty("projectId")
  private String projectId;

  @JsonProperty("title")
  private String title;

  public DiscussionThreadBundle activeAuthors(List<String> activeAuthors) {
    this.activeAuthors = activeAuthors;
    return this;
  }

  public DiscussionThreadBundle addActiveAuthorsItem(String activeAuthorsItem) {
    if (this.activeAuthors == null) {
      this.activeAuthors = new ArrayList<>();
    }
    this.activeAuthors.add(activeAuthorsItem);
    return this;
  }

  /**
   * The list of userId whose most active on this Thread
   * @return activeAuthors
  */
  @ApiModelProperty(value = "The list of userId whose most active on this Thread")


  public List<String> getActiveAuthors() {
    return activeAuthors;
  }

  public void setActiveAuthors(List<String> activeAuthors) {
    this.activeAuthors = activeAuthors;
  }

  public DiscussionThreadBundle createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The id of the user that created this Thread
   * @return createdBy
  */
  @ApiModelProperty(value = "The id of the user that created this Thread")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public DiscussionThreadBundle createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The timestamp when this Thread was created
   * @return createdOn
  */
  @ApiModelProperty(value = "The timestamp when this Thread was created")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public DiscussionThreadBundle etag(String etag) {
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

  public DiscussionThreadBundle forumId(String forumId) {
    this.forumId = forumId;
    return this;
  }

  /**
   * The ID of the forum this Thread belongs to
   * @return forumId
  */
  @ApiModelProperty(value = "The ID of the forum this Thread belongs to")


  public String getForumId() {
    return forumId;
  }

  public void setForumId(String forumId) {
    this.forumId = forumId;
  }

  public DiscussionThreadBundle id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the Thread
   * @return id
  */
  @ApiModelProperty(value = "The ID of the Thread")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DiscussionThreadBundle isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Has this Thread been deleted?
   * @return isDeleted
  */
  @ApiModelProperty(value = "Has this Thread been deleted?")


  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public DiscussionThreadBundle isEdited(Boolean isEdited) {
    this.isEdited = isEdited;
    return this;
  }

  /**
   * Has the author edited this Thread?
   * @return isEdited
  */
  @ApiModelProperty(value = "Has the author edited this Thread?")


  public Boolean getIsEdited() {
    return isEdited;
  }

  public void setIsEdited(Boolean isEdited) {
    this.isEdited = isEdited;
  }

  public DiscussionThreadBundle isPinned(Boolean isPinned) {
    this.isPinned = isPinned;
    return this;
  }

  /**
   * Has this Thread been pinned?
   * @return isPinned
  */
  @ApiModelProperty(value = "Has this Thread been pinned?")


  public Boolean getIsPinned() {
    return isPinned;
  }

  public void setIsPinned(Boolean isPinned) {
    this.isPinned = isPinned;
  }

  public DiscussionThreadBundle lastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
    return this;
  }

  /**
   * The timestamp when the last activity occurs on this Thread
   * @return lastActivity
  */
  @ApiModelProperty(value = "The timestamp when the last activity occurs on this Thread")


  public String getLastActivity() {
    return lastActivity;
  }

  public void setLastActivity(String lastActivity) {
    this.lastActivity = lastActivity;
  }

  public DiscussionThreadBundle messageKey(String messageKey) {
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

  public DiscussionThreadBundle modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The timestamp when this Thread was last modified
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The timestamp when this Thread was last modified")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public DiscussionThreadBundle numberOfReplies(Integer numberOfReplies) {
    this.numberOfReplies = numberOfReplies;
    return this;
  }

  /**
   * The number of replies to this thread
   * @return numberOfReplies
  */
  @ApiModelProperty(value = "The number of replies to this thread")


  public Integer getNumberOfReplies() {
    return numberOfReplies;
  }

  public void setNumberOfReplies(Integer numberOfReplies) {
    this.numberOfReplies = numberOfReplies;
  }

  public DiscussionThreadBundle numberOfViews(Integer numberOfViews) {
    this.numberOfViews = numberOfViews;
    return this;
  }

  /**
   * The number of unique users who has viewed this thread
   * @return numberOfViews
  */
  @ApiModelProperty(value = "The number of unique users who has viewed this thread")


  public Integer getNumberOfViews() {
    return numberOfViews;
  }

  public void setNumberOfViews(Integer numberOfViews) {
    this.numberOfViews = numberOfViews;
  }

  public DiscussionThreadBundle projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project this Thread belongs to
   * @return projectId
  */
  @ApiModelProperty(value = "The ID of the project this Thread belongs to")


  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public DiscussionThreadBundle title(String title) {
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
    DiscussionThreadBundle discussionThreadBundle = (DiscussionThreadBundle) o;
    return Objects.equals(this.activeAuthors, discussionThreadBundle.activeAuthors) &&
        Objects.equals(this.createdBy, discussionThreadBundle.createdBy) &&
        Objects.equals(this.createdOn, discussionThreadBundle.createdOn) &&
        Objects.equals(this.etag, discussionThreadBundle.etag) &&
        Objects.equals(this.forumId, discussionThreadBundle.forumId) &&
        Objects.equals(this.id, discussionThreadBundle.id) &&
        Objects.equals(this.isDeleted, discussionThreadBundle.isDeleted) &&
        Objects.equals(this.isEdited, discussionThreadBundle.isEdited) &&
        Objects.equals(this.isPinned, discussionThreadBundle.isPinned) &&
        Objects.equals(this.lastActivity, discussionThreadBundle.lastActivity) &&
        Objects.equals(this.messageKey, discussionThreadBundle.messageKey) &&
        Objects.equals(this.modifiedOn, discussionThreadBundle.modifiedOn) &&
        Objects.equals(this.numberOfReplies, discussionThreadBundle.numberOfReplies) &&
        Objects.equals(this.numberOfViews, discussionThreadBundle.numberOfViews) &&
        Objects.equals(this.projectId, discussionThreadBundle.projectId) &&
        Objects.equals(this.title, discussionThreadBundle.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeAuthors, createdBy, createdOn, etag, forumId, id, isDeleted, isEdited, isPinned, lastActivity, messageKey, modifiedOn, numberOfReplies, numberOfViews, projectId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscussionThreadBundle {\n");
    
    sb.append("    activeAuthors: ").append(toIndentedString(activeAuthors)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    forumId: ").append(toIndentedString(forumId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isEdited: ").append(toIndentedString(isEdited)).append("\n");
    sb.append("    isPinned: ").append(toIndentedString(isPinned)).append("\n");
    sb.append("    lastActivity: ").append(toIndentedString(lastActivity)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    numberOfReplies: ").append(toIndentedString(numberOfReplies)).append("\n");
    sb.append("    numberOfViews: ").append(toIndentedString(numberOfViews)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

