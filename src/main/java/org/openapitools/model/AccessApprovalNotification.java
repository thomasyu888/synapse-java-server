package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.NotificationType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about the a notification for an access approval.
 */
@ApiModel(description = "Information about the a notification for an access approval.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessApprovalNotification   {
  @JsonProperty("notificationType")
  private NotificationType notificationType;

  @JsonProperty("recipientId")
  private BigDecimal recipientId;

  @JsonProperty("requirementId")
  private BigDecimal requirementId;

  @JsonProperty("sentOn")
  private String sentOn;

  public AccessApprovalNotification notificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
    return this;
  }

  /**
   * Get notificationType
   * @return notificationType
  */
  @ApiModelProperty(value = "")

  @Valid

  public NotificationType getNotificationType() {
    return notificationType;
  }

  public void setNotificationType(NotificationType notificationType) {
    this.notificationType = notificationType;
  }

  public AccessApprovalNotification recipientId(BigDecimal recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * The id of the recipient.
   * @return recipientId
  */
  @ApiModelProperty(value = "The id of the recipient.")

  @Valid

  public BigDecimal getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(BigDecimal recipientId) {
    this.recipientId = recipientId;
  }

  public AccessApprovalNotification requirementId(BigDecimal requirementId) {
    this.requirementId = requirementId;
    return this;
  }

  /**
   * The id of the access requirement.
   * @return requirementId
  */
  @ApiModelProperty(value = "The id of the access requirement.")

  @Valid

  public BigDecimal getRequirementId() {
    return requirementId;
  }

  public void setRequirementId(BigDecimal requirementId) {
    this.requirementId = requirementId;
  }

  public AccessApprovalNotification sentOn(String sentOn) {
    this.sentOn = sentOn;
    return this;
  }

  /**
   * When the notification was sent.
   * @return sentOn
  */
  @ApiModelProperty(value = "When the notification was sent.")


  public String getSentOn() {
    return sentOn;
  }

  public void setSentOn(String sentOn) {
    this.sentOn = sentOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessApprovalNotification accessApprovalNotification = (AccessApprovalNotification) o;
    return Objects.equals(this.notificationType, accessApprovalNotification.notificationType) &&
        Objects.equals(this.recipientId, accessApprovalNotification.recipientId) &&
        Objects.equals(this.requirementId, accessApprovalNotification.requirementId) &&
        Objects.equals(this.sentOn, accessApprovalNotification.sentOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationType, recipientId, requirementId, sentOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessApprovalNotification {\n");
    
    sb.append("    notificationType: ").append(toIndentedString(notificationType)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    requirementId: ").append(toIndentedString(requirementId)).append("\n");
    sb.append("    sentOn: ").append(toIndentedString(sentOn)).append("\n");
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

