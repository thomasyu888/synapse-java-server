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
 * All form data belongs to a form group. Access to the group is managed via the ACL of the group.
 */
@ApiModel(description = "All form data belongs to a form group. Access to the group is managed via the ACL of the group.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class FormGroup   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("name")
  private String name;

  public FormGroup createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Id of the user that created this group
   * @return createdBy
  */
  @ApiModelProperty(value = "Id of the user that created this group")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public FormGroup createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this object was originally created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this object was originally created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public FormGroup groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * Unique identifier provided by the system.
   * @return groupId
  */
  @ApiModelProperty(value = "Unique identifier provided by the system.")


  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public FormGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique name for the group provided by the caller.
   * @return name
  */
  @ApiModelProperty(value = "Unique name for the group provided by the caller.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormGroup formGroup = (FormGroup) o;
    return Objects.equals(this.createdBy, formGroup.createdBy) &&
        Objects.equals(this.createdOn, formGroup.createdOn) &&
        Objects.equals(this.groupId, formGroup.groupId) &&
        Objects.equals(this.name, formGroup.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, groupId, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormGroup {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

