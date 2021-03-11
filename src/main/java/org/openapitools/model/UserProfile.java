package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.Settings;
import org.openapitools.model.UserPreference;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for UserProfile POJO
 */
@ApiModel(description = "JSON schema for UserProfile POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class UserProfile   {
  @JsonProperty("RStudioUrl")
  private String rstudioUrl;

  @JsonProperty("company")
  private String company;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("emails")
  @Valid
  private List<String> emails = null;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("industry")
  private String industry;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("location")
  private String location;

  @JsonProperty("notificationSettings")
  private Settings notificationSettings;

  @JsonProperty("openIds")
  @Valid
  private List<String> openIds = null;

  @JsonProperty("ownerId")
  private String ownerId;

  @JsonProperty("position")
  private String position;

  @JsonProperty("preferences")
  @Valid
  private List<UserPreference> preferences = null;

  @JsonProperty("profilePicureFileHandleId")
  private String profilePicureFileHandleId;

  @JsonProperty("summary")
  private String summary;

  @JsonProperty("teamName")
  private String teamName;

  @JsonProperty("url")
  private String url;

  @JsonProperty("userName")
  private String userName;

  public UserProfile rstudioUrl(String rstudioUrl) {
    this.rstudioUrl = rstudioUrl;
    return this;
  }

  /**
   * URL for RStudio server assigned to the user
   * @return rstudioUrl
  */
  @ApiModelProperty(value = "URL for RStudio server assigned to the user")


  public String getRstudioUrl() {
    return rstudioUrl;
  }

  public void setRstudioUrl(String rstudioUrl) {
    this.rstudioUrl = rstudioUrl;
  }

  public UserProfile company(String company) {
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

  public UserProfile createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this profile was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this profile was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public UserProfile displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Will always be null.
   * @return displayName
  */
  @ApiModelProperty(value = "Will always be null.")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserProfile email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Users can have more than one email. See emails
   * @return email
  */
  @ApiModelProperty(value = "Users can have more than one email. See emails")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserProfile emails(List<String> emails) {
    this.emails = emails;
    return this;
  }

  public UserProfile addEmailsItem(String emailsItem) {
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

  public UserProfile etag(String etag) {
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

  public UserProfile firstName(String firstName) {
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

  public UserProfile industry(String industry) {
    this.industry = industry;
    return this;
  }

  /**
   * The industry/discipline that this person is associated with
   * @return industry
  */
  @ApiModelProperty(value = "The industry/discipline that this person is associated with")


  public String getIndustry() {
    return industry;
  }

  public void setIndustry(String industry) {
    this.industry = industry;
  }

  public UserProfile lastName(String lastName) {
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

  public UserProfile location(String location) {
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

  public UserProfile notificationSettings(Settings notificationSettings) {
    this.notificationSettings = notificationSettings;
    return this;
  }

  /**
   * Get notificationSettings
   * @return notificationSettings
  */
  @ApiModelProperty(value = "")

  @Valid

  public Settings getNotificationSettings() {
    return notificationSettings;
  }

  public void setNotificationSettings(Settings notificationSettings) {
    this.notificationSettings = notificationSettings;
  }

  public UserProfile openIds(List<String> openIds) {
    this.openIds = openIds;
    return this;
  }

  public UserProfile addOpenIdsItem(String openIdsItem) {
    if (this.openIds == null) {
      this.openIds = new ArrayList<>();
    }
    this.openIds.add(openIdsItem);
    return this;
  }

  /**
   * 'The list of OpenIds bound to this user's account.' 
   * @return openIds
  */
  @ApiModelProperty(value = "'The list of OpenIds bound to this user's account.' ")


  public List<String> getOpenIds() {
    return openIds;
  }

  public void setOpenIds(List<String> openIds) {
    this.openIds = openIds;
  }

  public UserProfile ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * 'A foreign key to the ID of the 'principal' object for the user.' 
   * @return ownerId
  */
  @ApiModelProperty(value = "'A foreign key to the ID of the 'principal' object for the user.' ")


  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public UserProfile position(String position) {
    this.position = position;
    return this;
  }

  /**
   * This person's current position title 
   * @return position
  */
  @ApiModelProperty(value = "This person's current position title ")


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public UserProfile preferences(List<UserPreference> preferences) {
    this.preferences = preferences;
    return this;
  }

  public UserProfile addPreferencesItem(UserPreference preferencesItem) {
    if (this.preferences == null) {
      this.preferences = new ArrayList<>();
    }
    this.preferences.add(preferencesItem);
    return this;
  }

  /**
   * User preferences
   * @return preferences
  */
  @ApiModelProperty(value = "User preferences")

  @Valid

  public List<UserPreference> getPreferences() {
    return preferences;
  }

  public void setPreferences(List<UserPreference> preferences) {
    this.preferences = preferences;
  }

  public UserProfile profilePicureFileHandleId(String profilePicureFileHandleId) {
    this.profilePicureFileHandleId = profilePicureFileHandleId;
    return this;
  }

  /**
   * The FileHandle.id of the user's profile picture. 
   * @return profilePicureFileHandleId
  */
  @ApiModelProperty(value = "The FileHandle.id of the user's profile picture. ")


  public String getProfilePicureFileHandleId() {
    return profilePicureFileHandleId;
  }

  public void setProfilePicureFileHandleId(String profilePicureFileHandleId) {
    this.profilePicureFileHandleId = profilePicureFileHandleId;
  }

  public UserProfile summary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * A summary description about this person
   * @return summary
  */
  @ApiModelProperty(value = "A summary description about this person")


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public UserProfile teamName(String teamName) {
    this.teamName = teamName;
    return this;
  }

  /**
   * This person's default team name 
   * @return teamName
  */
  @ApiModelProperty(value = "This person's default team name ")


  public String getTeamName() {
    return teamName;
  }

  public void setTeamName(String teamName) {
    this.teamName = teamName;
  }

  public UserProfile url(String url) {
    this.url = url;
    return this;
  }

  /**
   * A link to more information about this person
   * @return url
  */
  @ApiModelProperty(value = "A link to more information about this person")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public UserProfile userName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * A name chosen by the user that uniquely identifies them.
   * @return userName
  */
  @ApiModelProperty(value = "A name chosen by the user that uniquely identifies them.")


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserProfile userProfile = (UserProfile) o;
    return Objects.equals(this.rstudioUrl, userProfile.rstudioUrl) &&
        Objects.equals(this.company, userProfile.company) &&
        Objects.equals(this.createdOn, userProfile.createdOn) &&
        Objects.equals(this.displayName, userProfile.displayName) &&
        Objects.equals(this.email, userProfile.email) &&
        Objects.equals(this.emails, userProfile.emails) &&
        Objects.equals(this.etag, userProfile.etag) &&
        Objects.equals(this.firstName, userProfile.firstName) &&
        Objects.equals(this.industry, userProfile.industry) &&
        Objects.equals(this.lastName, userProfile.lastName) &&
        Objects.equals(this.location, userProfile.location) &&
        Objects.equals(this.notificationSettings, userProfile.notificationSettings) &&
        Objects.equals(this.openIds, userProfile.openIds) &&
        Objects.equals(this.ownerId, userProfile.ownerId) &&
        Objects.equals(this.position, userProfile.position) &&
        Objects.equals(this.preferences, userProfile.preferences) &&
        Objects.equals(this.profilePicureFileHandleId, userProfile.profilePicureFileHandleId) &&
        Objects.equals(this.summary, userProfile.summary) &&
        Objects.equals(this.teamName, userProfile.teamName) &&
        Objects.equals(this.url, userProfile.url) &&
        Objects.equals(this.userName, userProfile.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rstudioUrl, company, createdOn, displayName, email, emails, etag, firstName, industry, lastName, location, notificationSettings, openIds, ownerId, position, preferences, profilePicureFileHandleId, summary, teamName, url, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserProfile {\n");
    
    sb.append("    rstudioUrl: ").append(toIndentedString(rstudioUrl)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    industry: ").append(toIndentedString(industry)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    notificationSettings: ").append(toIndentedString(notificationSettings)).append("\n");
    sb.append("    openIds: ").append(toIndentedString(openIds)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    profilePicureFileHandleId: ").append(toIndentedString(profilePicureFileHandleId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    teamName: ").append(toIndentedString(teamName)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
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

