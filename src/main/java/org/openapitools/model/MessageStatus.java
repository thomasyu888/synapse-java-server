package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessageStatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for a user message bundled with a status
 */
@ApiModel(description = "JSON schema for a user message bundled with a status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class MessageStatus   {
  @JsonProperty("messageId")
  private String messageId;

  @JsonProperty("recipientId")
  private String recipientId;

  @JsonProperty("status")
  private MessageStatusType status;

  public MessageStatus messageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  /**
   * The unique identifier of the message.
   * @return messageId
  */
  @ApiModelProperty(value = "The unique identifier of the message.")


  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public MessageStatus recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * The unique identifier of the recipient of this message.
   * @return recipientId
  */
  @ApiModelProperty(value = "The unique identifier of the recipient of this message.")


  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public MessageStatus status(MessageStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public MessageStatusType getStatus() {
    return status;
  }

  public void setStatus(MessageStatusType status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageStatus messageStatus = (MessageStatus) o;
    return Objects.equals(this.messageId, messageStatus.messageId) &&
        Objects.equals(this.recipientId, messageStatus.recipientId) &&
        Objects.equals(this.status, messageStatus.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageId, recipientId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageStatus {\n");
    
    sb.append("    messageId: ").append(toIndentedString(messageId)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

