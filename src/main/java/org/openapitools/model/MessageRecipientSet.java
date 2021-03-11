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
 * Contains a set of IDs of the intended recipients of a message
 */
@ApiModel(description = "Contains a set of IDs of the intended recipients of a message")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class MessageRecipientSet   {
  @JsonProperty("recipients")
  @Valid
  private List<String> recipients = null;

  public MessageRecipientSet recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public MessageRecipientSet addRecipientsItem(String recipientsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageRecipientSet messageRecipientSet = (MessageRecipientSet) o;
    return Objects.equals(this.recipients, messageRecipientSet.recipients);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipients);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageRecipientSet {\n");
    
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
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

