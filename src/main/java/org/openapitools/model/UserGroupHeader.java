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
 * JSON schema for UserHeader POJO
 */
@ApiModel(description = "JSON schema for UserHeader POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class UserGroupHeader   {
  @JsonProperty("displayName")
  private String displayName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("isIndividual")
  private Boolean isIndividual;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("ownerId")
  private String ownerId;

  @JsonProperty("userName")
  private String userName;

  public UserGroupHeader displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * This is deprecated and will always be null
   * @return displayName
  */
  @ApiModelProperty(value = "This is deprecated and will always be null")


  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public UserGroupHeader email(String email) {
    this.email = email;
    return this;
  }

  /**
   * User's current email address 
   * @return email
  */
  @ApiModelProperty(value = "User's current email address ")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserGroupHeader firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First Name
   * @return firstName
  */
  @ApiModelProperty(value = "First Name")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public UserGroupHeader isIndividual(Boolean isIndividual) {
    this.isIndividual = isIndividual;
    return this;
  }

  /**
   * True if this is a user, false if it is a group
   * @return isIndividual
  */
  @ApiModelProperty(value = "True if this is a user, false if it is a group")


  public Boolean getIsIndividual() {
    return isIndividual;
  }

  public void setIsIndividual(Boolean isIndividual) {
    this.isIndividual = isIndividual;
  }

  public UserGroupHeader lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last Name
   * @return lastName
  */
  @ApiModelProperty(value = "Last Name")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public UserGroupHeader ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * A foreign key to the ID of the 'principal' object for the user. 
   * @return ownerId
  */
  @ApiModelProperty(value = "A foreign key to the ID of the 'principal' object for the user. ")


  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public UserGroupHeader userName(String userName) {
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
    UserGroupHeader userGroupHeader = (UserGroupHeader) o;
    return Objects.equals(this.displayName, userGroupHeader.displayName) &&
        Objects.equals(this.email, userGroupHeader.email) &&
        Objects.equals(this.firstName, userGroupHeader.firstName) &&
        Objects.equals(this.isIndividual, userGroupHeader.isIndividual) &&
        Objects.equals(this.lastName, userGroupHeader.lastName) &&
        Objects.equals(this.ownerId, userGroupHeader.ownerId) &&
        Objects.equals(this.userName, userGroupHeader.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, email, firstName, isIndividual, lastName, ownerId, userName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroupHeader {\n");
    
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    isIndividual: ").append(toIndentedString(isIndividual)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

