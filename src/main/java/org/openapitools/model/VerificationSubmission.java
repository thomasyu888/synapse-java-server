package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AttachmentMetadata;
import org.openapitools.model.VerificationState;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User info submitted for verification by Synapse ACT
 */
@ApiModel(description = "User info submitted for verification by Synapse ACT")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class VerificationSubmission   {
  @JsonProperty("attachments")
  @Valid
  private List<AttachmentMetadata> attachments = null;

  @JsonProperty("company")
  private String company;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("emails")
  @Valid
  private List<String> emails = null;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("id")
  private String id;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("location")
  private String location;

  @JsonProperty("notificationEmail")
  private String notificationEmail;

  @JsonProperty("orcid")
  private String orcid;

  @JsonProperty("stateHistory")
  @Valid
  private List<VerificationState> stateHistory = null;

  public VerificationSubmission attachments(List<AttachmentMetadata> attachments) {
    this.attachments = attachments;
    return this;
  }

  public VerificationSubmission addAttachmentsItem(AttachmentMetadata attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * Metadata of Files attached to the submission. The list will be emptied after the state is APPROVED or REJECTED. 
   * @return attachments
  */
  @ApiModelProperty(value = "Metadata of Files attached to the submission. The list will be emptied after the state is APPROVED or REJECTED. ")

  @Valid

  public List<AttachmentMetadata> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<AttachmentMetadata> attachments) {
    this.attachments = attachments;
  }

  public VerificationSubmission company(String company) {
    this.company = company;
    return this;
  }

  /**
   * This person's current affiliation 
   * @return company
  */
  @ApiModelProperty(value = "This person's current affiliation ")


  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public VerificationSubmission createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The principal ID of the user requesting verification
   * @return createdBy
  */
  @ApiModelProperty(value = "The principal ID of the user requesting verification")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public VerificationSubmission createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date and time this object was created
   * @return createdOn
  */
  @ApiModelProperty(value = "The date and time this object was created")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public VerificationSubmission emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public VerificationSubmission addEmailsItem(String emailsItem) {
    if (this.emails == null) {
      this.emails = new ArrayList<>();
    }
    this.emails.add(emailsItem);
    return this;
  }

  /**
   * The list of user email addresses registered to this user.
   * @return emails
  */
  @ApiModelProperty(value = "The list of user email addresses registered to this user.")


  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public VerificationSubmission firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * This person's given name (forename) 
   * @return firstName
  */
  @ApiModelProperty(value = "This person's given name (forename) ")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public VerificationSubmission id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this object
   * @return id
  */
  @ApiModelProperty(value = "The ID of this object")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public VerificationSubmission lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * This person's family name (surname) 
   * @return lastName
  */
  @ApiModelProperty(value = "This person's family name (surname) ")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public VerificationSubmission location(String location) {
    this.location = location;
    return this;
  }

  /**
   * This person's location 
   * @return location
  */
  @ApiModelProperty(value = "This person's location ")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public VerificationSubmission notificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
    return this;
  }

  /**
   * The primary (notification) email address registered to this user.
   * @return notificationEmail
  */
  @ApiModelProperty(value = "The primary (notification) email address registered to this user.")


  public String getNotificationEmail() {
    return notificationEmail;
  }

  public void setNotificationEmail(String notificationEmail) {
    this.notificationEmail = notificationEmail;
  }

  public VerificationSubmission orcid(String orcid) {
    this.orcid = orcid;
    return this;
  }

  /**
   * The user's ORCID URI 
   * @return orcid
  */
  @ApiModelProperty(value = "The user's ORCID URI ")


  public String getOrcid() {
    return orcid;
  }

  public void setOrcid(String orcid) {
    this.orcid = orcid;
  }

  public VerificationSubmission stateHistory(List<VerificationState> stateHistory) {
    this.stateHistory = stateHistory;
    return this;
  }

  public VerificationSubmission addStateHistoryItem(VerificationState stateHistoryItem) {
    if (this.stateHistory == null) {
      this.stateHistory = new ArrayList<>();
    }
    this.stateHistory.add(stateHistoryItem);
    return this;
  }

  /**
   * List of state changes the submission has passed through, ordered by time. The last in the list contains the current state of the submission. 
   * @return stateHistory
  */
  @ApiModelProperty(value = "List of state changes the submission has passed through, ordered by time. The last in the list contains the current state of the submission. ")

  @Valid

  public List<VerificationState> getStateHistory() {
    return stateHistory;
  }

  public void setStateHistory(List<VerificationState> stateHistory) {
    this.stateHistory = stateHistory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationSubmission verificationSubmission = (VerificationSubmission) o;
    return Objects.equals(this.attachments, verificationSubmission.attachments) &&
        Objects.equals(this.company, verificationSubmission.company) &&
        Objects.equals(this.createdBy, verificationSubmission.createdBy) &&
        Objects.equals(this.createdOn, verificationSubmission.createdOn) &&
        Objects.equals(this.emails, verificationSubmission.emails) &&
        Objects.equals(this.firstName, verificationSubmission.firstName) &&
        Objects.equals(this.id, verificationSubmission.id) &&
        Objects.equals(this.lastName, verificationSubmission.lastName) &&
        Objects.equals(this.location, verificationSubmission.location) &&
        Objects.equals(this.notificationEmail, verificationSubmission.notificationEmail) &&
        Objects.equals(this.orcid, verificationSubmission.orcid) &&
        Objects.equals(this.stateHistory, verificationSubmission.stateHistory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, company, createdBy, createdOn, emails, firstName, id, lastName, location, notificationEmail, orcid, stateHistory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationSubmission {\n");
    
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    notificationEmail: ").append(toIndentedString(notificationEmail)).append("\n");
    sb.append("    orcid: ").append(toIndentedString(orcid)).append("\n");
    sb.append("    stateHistory: ").append(toIndentedString(stateHistory)).append("\n");
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

