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
 * Signed token containing the information needed to update the inviteeId of a MembershipInvitation.
 */
@ApiModel(description = "Signed token containing the information needed to update the inviteeId of a MembershipInvitation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class InviteeVerificationSignedToken   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("expiresOn")
  private String expiresOn;

  @JsonProperty("hmac")
  private String hmac;

  @JsonProperty("inviteeId")
  private String inviteeId;

  @JsonProperty("membershipInvitationId")
  private String membershipInvitationId;

  @JsonProperty("version")
  private Integer version;

  public InviteeVerificationSignedToken concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * Concrete Type
   * @return concreteType
  */
  @ApiModelProperty(value = "Concrete Type")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public InviteeVerificationSignedToken createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date-time the token was generated.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date-time the token was generated.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public InviteeVerificationSignedToken expiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
    return this;
  }

  /**
   * The date-time when this token expires.
   * @return expiresOn
  */
  @ApiModelProperty(value = "The date-time when this token expires.")


  public String getExpiresOn() {
    return expiresOn;
  }

  public void setExpiresOn(String expiresOn) {
    this.expiresOn = expiresOn;
  }

  public InviteeVerificationSignedToken hmac(String hmac) {
    this.hmac = hmac;
    return this;
  }

  /**
   * The hash message authentication code for the message.
   * @return hmac
  */
  @ApiModelProperty(value = "The hash message authentication code for the message.")


  public String getHmac() {
    return hmac;
  }

  public void setHmac(String hmac) {
    this.hmac = hmac;
  }

  public InviteeVerificationSignedToken inviteeId(String inviteeId) {
    this.inviteeId = inviteeId;
    return this;
  }

  /**
   * The ID of the invitee.
   * @return inviteeId
  */
  @ApiModelProperty(value = "The ID of the invitee.")


  public String getInviteeId() {
    return inviteeId;
  }

  public void setInviteeId(String inviteeId) {
    this.inviteeId = inviteeId;
  }

  public InviteeVerificationSignedToken membershipInvitationId(String membershipInvitationId) {
    this.membershipInvitationId = membershipInvitationId;
    return this;
  }

  /**
   * The ID of the MembershipInvitation to update.
   * @return membershipInvitationId
  */
  @ApiModelProperty(value = "The ID of the MembershipInvitation to update.")


  public String getMembershipInvitationId() {
    return membershipInvitationId;
  }

  public void setMembershipInvitationId(String membershipInvitationId) {
    this.membershipInvitationId = membershipInvitationId;
  }

  public InviteeVerificationSignedToken version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the key used to generate the HMAC.
   * @return version
  */
  @ApiModelProperty(value = "The version of the key used to generate the HMAC.")


  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteeVerificationSignedToken inviteeVerificationSignedToken = (InviteeVerificationSignedToken) o;
    return Objects.equals(this.concreteType, inviteeVerificationSignedToken.concreteType) &&
        Objects.equals(this.createdOn, inviteeVerificationSignedToken.createdOn) &&
        Objects.equals(this.expiresOn, inviteeVerificationSignedToken.expiresOn) &&
        Objects.equals(this.hmac, inviteeVerificationSignedToken.hmac) &&
        Objects.equals(this.inviteeId, inviteeVerificationSignedToken.inviteeId) &&
        Objects.equals(this.membershipInvitationId, inviteeVerificationSignedToken.membershipInvitationId) &&
        Objects.equals(this.version, inviteeVerificationSignedToken.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, createdOn, expiresOn, hmac, inviteeId, membershipInvitationId, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteeVerificationSignedToken {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    expiresOn: ").append(toIndentedString(expiresOn)).append("\n");
    sb.append("    hmac: ").append(toIndentedString(hmac)).append("\n");
    sb.append("    inviteeId: ").append(toIndentedString(inviteeId)).append("\n");
    sb.append("    membershipInvitationId: ").append(toIndentedString(membershipInvitationId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

