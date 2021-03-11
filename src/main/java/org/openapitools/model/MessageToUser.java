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
 * JSON schema for a message to another user
 */
@ApiModel(description = "JSON schema for a message to another user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class MessageToUser   {
  @JsonProperty("bcc")
  private String bcc;

  @JsonProperty("cc")
  private String cc;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("fileHandleId")
  private String fileHandleId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("inReplyTo")
  private String inReplyTo;

  @JsonProperty("inReplyToRoot")
  private String inReplyToRoot;

  @JsonProperty("isNotificationMessage")
  private Boolean isNotificationMessage;

  @JsonProperty("notificationUnsubscribeEndpoint")
  private String notificationUnsubscribeEndpoint;

  @JsonProperty("recipients")
  @Valid
  private List<String> recipients = null;

  @JsonProperty("subject")
  private String subject;

  @JsonProperty("to")
  private String to;

  @JsonProperty("userProfileSettingEndpoint")
  private String userProfileSettingEndpoint;

  @JsonProperty("withProfileSettingLink")
  private Boolean withProfileSettingLink;

  @JsonProperty("withUnsubscribeLink")
  private Boolean withUnsubscribeLink;

  public MessageToUser bcc(String bcc) {
    this.bcc = bcc;
    return this;
  }

  /**
   * The email addresses in the 'bcc' field of the email message 
   * @return bcc
  */
  @ApiModelProperty(value = "The email addresses in the 'bcc' field of the email message ")


  public String getBcc() {
    return bcc;
  }

  public void setBcc(String bcc) {
    this.bcc = bcc;
  }

  public MessageToUser cc(String cc) {
    this.cc = cc;
    return this;
  }

  /**
   * The email addresses in the 'cc' field of the email message 
   * @return cc
  */
  @ApiModelProperty(value = "The email addresses in the 'cc' field of the email message ")


  public String getCc() {
    return cc;
  }

  public void setCc(String cc) {
    this.cc = cc;
  }

  public MessageToUser createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The unique identifier of the sender of this message
   * @return createdBy
  */
  @ApiModelProperty(value = "The unique identifier of the sender of this message")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public MessageToUser createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * When this message was created
   * @return createdOn
  */
  @ApiModelProperty(value = "When this message was created")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public MessageToUser fileHandleId(String fileHandleId) {
    this.fileHandleId = fileHandleId;
    return this;
  }

  /**
   * The S3 file handle storing the body of this message. Note: The file's mime type should be 'text/plain' or 'text/html'. If no character encoding is specified, then UTF-8 is assumed. 
   * @return fileHandleId
  */
  @ApiModelProperty(value = "The S3 file handle storing the body of this message. Note: The file's mime type should be 'text/plain' or 'text/html'. If no character encoding is specified, then UTF-8 is assumed. ")


  public String getFileHandleId() {
    return fileHandleId;
  }

  public void setFileHandleId(String fileHandleId) {
    this.fileHandleId = fileHandleId;
  }

  public MessageToUser id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the message or comment
   * @return id
  */
  @ApiModelProperty(value = "The unique identifier of the message or comment")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public MessageToUser inReplyTo(String inReplyTo) {
    this.inReplyTo = inReplyTo;
    return this;
  }

  /**
   * The unique identifier of the message being replied to. Can be null
   * @return inReplyTo
  */
  @ApiModelProperty(value = "The unique identifier of the message being replied to. Can be null")


  public String getInReplyTo() {
    return inReplyTo;
  }

  public void setInReplyTo(String inReplyTo) {
    this.inReplyTo = inReplyTo;
  }

  public MessageToUser inReplyToRoot(String inReplyToRoot) {
    this.inReplyToRoot = inReplyToRoot;
    return this;
  }

  /**
   * The unique identifier of the root message being replied to
   * @return inReplyToRoot
  */
  @ApiModelProperty(value = "The unique identifier of the root message being replied to")


  public String getInReplyToRoot() {
    return inReplyToRoot;
  }

  public void setInReplyToRoot(String inReplyToRoot) {
    this.inReplyToRoot = inReplyToRoot;
  }

  public MessageToUser isNotificationMessage(Boolean isNotificationMessage) {
    this.isNotificationMessage = isNotificationMessage;
    return this;
  }

  /**
   * A notification message is sent from a noreply email address, delivery failures are not sent back to the sender
   * @return isNotificationMessage
  */
  @ApiModelProperty(value = "A notification message is sent from a noreply email address, delivery failures are not sent back to the sender")


  public Boolean getIsNotificationMessage() {
    return isNotificationMessage;
  }

  public void setIsNotificationMessage(Boolean isNotificationMessage) {
    this.isNotificationMessage = isNotificationMessage;
  }

  public MessageToUser notificationUnsubscribeEndpoint(String notificationUnsubscribeEndpoint) {
    this.notificationUnsubscribeEndpoint = notificationUnsubscribeEndpoint;
    return this;
  }

  /**
   * the portal prefix for one-click email unsubscription. A signed, serialized token is appended to create the complete URL. If omitted, the default endpoint will be used. 
   * @return notificationUnsubscribeEndpoint
  */
  @ApiModelProperty(value = "the portal prefix for one-click email unsubscription. A signed, serialized token is appended to create the complete URL. If omitted, the default endpoint will be used. ")


  public String getNotificationUnsubscribeEndpoint() {
    return notificationUnsubscribeEndpoint;
  }

  public void setNotificationUnsubscribeEndpoint(String notificationUnsubscribeEndpoint) {
    this.notificationUnsubscribeEndpoint = notificationUnsubscribeEndpoint;
  }

  public MessageToUser recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public MessageToUser addRecipientsItem(String recipientsItem) {
    if (this.recipients == null) {
      this.recipients = new ArrayList<>();
    }
    this.recipients.add(recipientsItem);
    return this;
  }

  /**
   * The unique identifiers of the intended recipients of a message
   * @return recipients
  */
  @ApiModelProperty(value = "The unique identifiers of the intended recipients of a message")


  public List<String> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }

  public MessageToUser subject(String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Topic of this message. Optional
   * @return subject
  */
  @ApiModelProperty(value = "Topic of this message. Optional")


  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MessageToUser to(String to) {
    this.to = to;
    return this;
  }

  /**
   * The email addresses in the 'to' field of the email message 
   * @return to
  */
  @ApiModelProperty(value = "The email addresses in the 'to' field of the email message ")


  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public MessageToUser userProfileSettingEndpoint(String userProfileSettingEndpoint) {
    this.userProfileSettingEndpoint = userProfileSettingEndpoint;
    return this;
  }

  /**
   * the portal link to user profile setting page. If omitted, the default endpoint will be used.
   * @return userProfileSettingEndpoint
  */
  @ApiModelProperty(value = "the portal link to user profile setting page. If omitted, the default endpoint will be used.")


  public String getUserProfileSettingEndpoint() {
    return userProfileSettingEndpoint;
  }

  public void setUserProfileSettingEndpoint(String userProfileSettingEndpoint) {
    this.userProfileSettingEndpoint = userProfileSettingEndpoint;
  }

  public MessageToUser withProfileSettingLink(Boolean withProfileSettingLink) {
    this.withProfileSettingLink = withProfileSettingLink;
    return this;
  }

  /**
   * should the user profile setting link be included in the email?
   * @return withProfileSettingLink
  */
  @ApiModelProperty(value = "should the user profile setting link be included in the email?")


  public Boolean getWithProfileSettingLink() {
    return withProfileSettingLink;
  }

  public void setWithProfileSettingLink(Boolean withProfileSettingLink) {
    this.withProfileSettingLink = withProfileSettingLink;
  }

  public MessageToUser withUnsubscribeLink(Boolean withUnsubscribeLink) {
    this.withUnsubscribeLink = withUnsubscribeLink;
    return this;
  }

  /**
   * should the unsubscribe link be included in the email?
   * @return withUnsubscribeLink
  */
  @ApiModelProperty(value = "should the unsubscribe link be included in the email?")


  public Boolean getWithUnsubscribeLink() {
    return withUnsubscribeLink;
  }

  public void setWithUnsubscribeLink(Boolean withUnsubscribeLink) {
    this.withUnsubscribeLink = withUnsubscribeLink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageToUser messageToUser = (MessageToUser) o;
    return Objects.equals(this.bcc, messageToUser.bcc) &&
        Objects.equals(this.cc, messageToUser.cc) &&
        Objects.equals(this.createdBy, messageToUser.createdBy) &&
        Objects.equals(this.createdOn, messageToUser.createdOn) &&
        Objects.equals(this.fileHandleId, messageToUser.fileHandleId) &&
        Objects.equals(this.id, messageToUser.id) &&
        Objects.equals(this.inReplyTo, messageToUser.inReplyTo) &&
        Objects.equals(this.inReplyToRoot, messageToUser.inReplyToRoot) &&
        Objects.equals(this.isNotificationMessage, messageToUser.isNotificationMessage) &&
        Objects.equals(this.notificationUnsubscribeEndpoint, messageToUser.notificationUnsubscribeEndpoint) &&
        Objects.equals(this.recipients, messageToUser.recipients) &&
        Objects.equals(this.subject, messageToUser.subject) &&
        Objects.equals(this.to, messageToUser.to) &&
        Objects.equals(this.userProfileSettingEndpoint, messageToUser.userProfileSettingEndpoint) &&
        Objects.equals(this.withProfileSettingLink, messageToUser.withProfileSettingLink) &&
        Objects.equals(this.withUnsubscribeLink, messageToUser.withUnsubscribeLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bcc, cc, createdBy, createdOn, fileHandleId, id, inReplyTo, inReplyToRoot, isNotificationMessage, notificationUnsubscribeEndpoint, recipients, subject, to, userProfileSettingEndpoint, withProfileSettingLink, withUnsubscribeLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageToUser {\n");
    
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    fileHandleId: ").append(toIndentedString(fileHandleId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inReplyTo: ").append(toIndentedString(inReplyTo)).append("\n");
    sb.append("    inReplyToRoot: ").append(toIndentedString(inReplyToRoot)).append("\n");
    sb.append("    isNotificationMessage: ").append(toIndentedString(isNotificationMessage)).append("\n");
    sb.append("    notificationUnsubscribeEndpoint: ").append(toIndentedString(notificationUnsubscribeEndpoint)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    userProfileSettingEndpoint: ").append(toIndentedString(userProfileSettingEndpoint)).append("\n");
    sb.append("    withProfileSettingLink: ").append(toIndentedString(withProfileSettingLink)).append("\n");
    sb.append("    withUnsubscribeLink: ").append(toIndentedString(withUnsubscribeLink)).append("\n");
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

