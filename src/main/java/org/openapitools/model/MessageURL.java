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
 * The URL to download the file which contains the message.
 */
@ApiModel(description = "The URL to download the file which contains the message.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class MessageURL   {
  @JsonProperty("messageUrl")
  private String messageUrl;

  public MessageURL messageUrl(String messageUrl) {
    this.messageUrl = messageUrl;
    return this;
  }

  /**
   * The URL to download the file which contains the message.
   * @return messageUrl
  */
  @ApiModelProperty(value = "The URL to download the file which contains the message.")


  public String getMessageUrl() {
    return messageUrl;
  }

  public void setMessageUrl(String messageUrl) {
    this.messageUrl = messageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageURL messageURL = (MessageURL) o;
    return Objects.equals(this.messageUrl, messageURL.messageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(messageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageURL {\n");
    
    sb.append("    messageUrl: ").append(toIndentedString(messageUrl)).append("\n");
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

