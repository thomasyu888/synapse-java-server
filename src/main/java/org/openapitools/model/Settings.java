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
 * Contains a user&#39;s notification settings 
 */
@ApiModel(description = "Contains a user's notification settings ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Settings   {
  @JsonProperty("markEmailedMessagesAsRead")
  private Boolean markEmailedMessagesAsRead = false;

  @JsonProperty("sendEmailNotifications")
  private Boolean sendEmailNotifications = true;

  public Settings markEmailedMessagesAsRead(Boolean markEmailedMessagesAsRead) {
    this.markEmailedMessagesAsRead = markEmailedMessagesAsRead;
    return this;
  }

  /**
   * Should messages that are emailed to the user be marked as READ in Synapse? Default false.
   * @return markEmailedMessagesAsRead
  */
  @ApiModelProperty(value = "Should messages that are emailed to the user be marked as READ in Synapse? Default false.")


  public Boolean getMarkEmailedMessagesAsRead() {
    return markEmailedMessagesAsRead;
  }

  public void setMarkEmailedMessagesAsRead(Boolean markEmailedMessagesAsRead) {
    this.markEmailedMessagesAsRead = markEmailedMessagesAsRead;
  }

  public Settings sendEmailNotifications(Boolean sendEmailNotifications) {
    this.sendEmailNotifications = sendEmailNotifications;
    return this;
  }

  /**
   * Should the user receive email notifications? Default true.
   * @return sendEmailNotifications
  */
  @ApiModelProperty(value = "Should the user receive email notifications? Default true.")


  public Boolean getSendEmailNotifications() {
    return sendEmailNotifications;
  }

  public void setSendEmailNotifications(Boolean sendEmailNotifications) {
    this.sendEmailNotifications = sendEmailNotifications;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Settings settings = (Settings) o;
    return Objects.equals(this.markEmailedMessagesAsRead, settings.markEmailedMessagesAsRead) &&
        Objects.equals(this.sendEmailNotifications, settings.sendEmailNotifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(markEmailedMessagesAsRead, sendEmailNotifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Settings {\n");
    
    sb.append("    markEmailedMessagesAsRead: ").append(toIndentedString(markEmailedMessagesAsRead)).append("\n");
    sb.append("    sendEmailNotifications: ").append(toIndentedString(sendEmailNotifications)).append("\n");
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

