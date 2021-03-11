package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UserProfile;
import org.openapitools.model.VerificationSubmission;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for UserBundle POJO
 */
@ApiModel(description = "JSON schema for UserBundle POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class UserBundle   {
  @JsonProperty("ORCID")
  private String ORCID;

  @JsonProperty("isACTMember")
  private Boolean isACTMember;

  @JsonProperty("isCertified")
  private Boolean isCertified;

  @JsonProperty("isVerified")
  private Boolean isVerified;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("userProfile")
  private UserProfile userProfile;

  @JsonProperty("verificationSubmission")
  private VerificationSubmission verificationSubmission;

  public UserBundle ORCID(String ORCID) {
    this.ORCID = ORCID;
    return this;
  }

  /**
   * The ORCID ID for the user, if any
   * @return ORCID
  */
  @ApiModelProperty(value = "The ORCID ID for the user, if any")


  public String getORCID() {
    return ORCID;
  }

  public void setORCID(String ORCID) {
    this.ORCID = ORCID;
  }

  public UserBundle isACTMember(Boolean isACTMember) {
    this.isACTMember = isACTMember;
    return this;
  }

  /**
   * true if the user is an ACT member
   * @return isACTMember
  */
  @ApiModelProperty(value = "true if the user is an ACT member")


  public Boolean getIsACTMember() {
    return isACTMember;
  }

  public void setIsACTMember(Boolean isACTMember) {
    this.isACTMember = isACTMember;
  }

  public UserBundle isCertified(Boolean isCertified) {
    this.isCertified = isCertified;
    return this;
  }

  /**
   * true if the user is Certified
   * @return isCertified
  */
  @ApiModelProperty(value = "true if the user is Certified")


  public Boolean getIsCertified() {
    return isCertified;
  }

  public void setIsCertified(Boolean isCertified) {
    this.isCertified = isCertified;
  }

  public UserBundle isVerified(Boolean isVerified) {
    this.isVerified = isVerified;
    return this;
  }

  /**
   * true if the user is Verified
   * @return isVerified
  */
  @ApiModelProperty(value = "true if the user is Verified")


  public Boolean getIsVerified() {
    return isVerified;
  }

  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }

  public UserBundle userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The ID of the user described by this bundle
   * @return userId
  */
  @ApiModelProperty(value = "The ID of the user described by this bundle")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public UserBundle userProfile(UserProfile userProfile) {
    this.userProfile = userProfile;
    return this;
  }

  /**
   * Get userProfile
   * @return userProfile
  */
  @ApiModelProperty(value = "")

  @Valid

  public UserProfile getUserProfile() {
    return userProfile;
  }

  public void setUserProfile(UserProfile userProfile) {
    this.userProfile = userProfile;
  }

  public UserBundle verificationSubmission(VerificationSubmission verificationSubmission) {
    this.verificationSubmission = verificationSubmission;
    return this;
  }

  /**
   * Get verificationSubmission
   * @return verificationSubmission
  */
  @ApiModelProperty(value = "")

  @Valid

  public VerificationSubmission getVerificationSubmission() {
    return verificationSubmission;
  }

  public void setVerificationSubmission(VerificationSubmission verificationSubmission) {
    this.verificationSubmission = verificationSubmission;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserBundle userBundle = (UserBundle) o;
    return Objects.equals(this.ORCID, userBundle.ORCID) &&
        Objects.equals(this.isACTMember, userBundle.isACTMember) &&
        Objects.equals(this.isCertified, userBundle.isCertified) &&
        Objects.equals(this.isVerified, userBundle.isVerified) &&
        Objects.equals(this.userId, userBundle.userId) &&
        Objects.equals(this.userProfile, userBundle.userProfile) &&
        Objects.equals(this.verificationSubmission, userBundle.verificationSubmission);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ORCID, isACTMember, isCertified, isVerified, userId, userProfile, verificationSubmission);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserBundle {\n");
    
    sb.append("    ORCID: ").append(toIndentedString(ORCID)).append("\n");
    sb.append("    isACTMember: ").append(toIndentedString(isACTMember)).append("\n");
    sb.append("    isCertified: ").append(toIndentedString(isCertified)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userProfile: ").append(toIndentedString(userProfile)).append("\n");
    sb.append("    verificationSubmission: ").append(toIndentedString(verificationSubmission)).append("\n");
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

