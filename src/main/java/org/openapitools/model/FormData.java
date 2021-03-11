package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.SubmissionStatusForm;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User&#39;s data gathered from a form template. All FormData belongs to a single FormGroup. 
 */
@ApiModel(description = "User's data gathered from a form template. All FormData belongs to a single FormGroup. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class FormData   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("dataFileHandleId")
  private String dataFileHandleId;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("formDataId")
  private String formDataId;

  @JsonProperty("groupId")
  private String groupId;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("name")
  private String name;

  @JsonProperty("submissionStatus")
  private SubmissionStatusForm submissionStatus;

  public FormData createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Id of the user that created this object
   * @return createdBy
  */
  @ApiModelProperty(value = "Id of the user that created this object")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public FormData createdOn(String createdOn) {
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

  public FormData dataFileHandleId(String dataFileHandleId) {
    this.dataFileHandleId = dataFileHandleId;
    return this;
  }

  /**
   * The identifier of the data FileHandle for this object.
   * @return dataFileHandleId
  */
  @ApiModelProperty(value = "The identifier of the data FileHandle for this object.")


  public String getDataFileHandleId() {
    return dataFileHandleId;
  }

  public void setDataFileHandleId(String dataFileHandleId) {
    this.dataFileHandleId = dataFileHandleId;
  }

  public FormData etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Will change whenever there is a change to the this data or its status.
   * @return etag
  */
  @ApiModelProperty(value = "Will change whenever there is a change to the this data or its status.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public FormData formDataId(String formDataId) {
    this.formDataId = formDataId;
    return this;
  }

  /**
   * The system issued identifier that uniquely identifies this object.
   * @return formDataId
  */
  @ApiModelProperty(value = "The system issued identifier that uniquely identifies this object.")


  public String getFormDataId() {
    return formDataId;
  }

  public void setFormDataId(String formDataId) {
    this.formDataId = formDataId;
  }

  public FormData groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

  /**
   * The identifier of the group that manages this data. Required.
   * @return groupId
  */
  @ApiModelProperty(value = "The identifier of the group that manages this data. Required.")


  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public FormData modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date this object was last modified.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date this object was last modified.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public FormData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * User provided name for this submission. Required.
   * @return name
  */
  @ApiModelProperty(value = "User provided name for this submission. Required.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormData submissionStatus(SubmissionStatusForm submissionStatus) {
    this.submissionStatus = submissionStatus;
    return this;
  }

  /**
   * Get submissionStatus
   * @return submissionStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public SubmissionStatusForm getSubmissionStatus() {
    return submissionStatus;
  }

  public void setSubmissionStatus(SubmissionStatusForm submissionStatus) {
    this.submissionStatus = submissionStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormData formData = (FormData) o;
    return Objects.equals(this.createdBy, formData.createdBy) &&
        Objects.equals(this.createdOn, formData.createdOn) &&
        Objects.equals(this.dataFileHandleId, formData.dataFileHandleId) &&
        Objects.equals(this.etag, formData.etag) &&
        Objects.equals(this.formDataId, formData.formDataId) &&
        Objects.equals(this.groupId, formData.groupId) &&
        Objects.equals(this.modifiedOn, formData.modifiedOn) &&
        Objects.equals(this.name, formData.name) &&
        Objects.equals(this.submissionStatus, formData.submissionStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, dataFileHandleId, etag, formDataId, groupId, modifiedOn, name, submissionStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormData {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    dataFileHandleId: ").append(toIndentedString(dataFileHandleId)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    formDataId: ").append(toIndentedString(formDataId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    submissionStatus: ").append(toIndentedString(submissionStatus)).append("\n");
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

