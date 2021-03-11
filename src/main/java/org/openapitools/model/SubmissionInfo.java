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
 * Information about a request to access controlled data and its related Research Project
 */
@ApiModel(description = "Information about a request to access controlled data and its related Research Project")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionInfo   {
  @JsonProperty("institution")
  private String institution;

  @JsonProperty("intendedDataUseStatement")
  private String intendedDataUseStatement;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("projectLead")
  private String projectLead;

  public SubmissionInfo institution(String institution) {
    this.institution = institution;
    return this;
  }

  /**
   * The institution that the research project belongs to.
   * @return institution
  */
  @ApiModelProperty(value = "The institution that the research project belongs to.")


  public String getInstitution() {
    return institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }

  public SubmissionInfo intendedDataUseStatement(String intendedDataUseStatement) {
    this.intendedDataUseStatement = intendedDataUseStatement;
    return this;
  }

  /**
   * A few short paragraph that explains how the controlled data will be used.
   * @return intendedDataUseStatement
  */
  @ApiModelProperty(value = "A few short paragraph that explains how the controlled data will be used.")


  public String getIntendedDataUseStatement() {
    return intendedDataUseStatement;
  }

  public void setIntendedDataUseStatement(String intendedDataUseStatement) {
    this.intendedDataUseStatement = intendedDataUseStatement;
  }

  public SubmissionInfo modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date the request submission was last modified.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date the request submission was last modified.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public SubmissionInfo projectLead(String projectLead) {
    this.projectLead = projectLead;
    return this;
  }

  /**
   * The person who is leading the research project.
   * @return projectLead
  */
  @ApiModelProperty(value = "The person who is leading the research project.")


  public String getProjectLead() {
    return projectLead;
  }

  public void setProjectLead(String projectLead) {
    this.projectLead = projectLead;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionInfo submissionInfo = (SubmissionInfo) o;
    return Objects.equals(this.institution, submissionInfo.institution) &&
        Objects.equals(this.intendedDataUseStatement, submissionInfo.intendedDataUseStatement) &&
        Objects.equals(this.modifiedOn, submissionInfo.modifiedOn) &&
        Objects.equals(this.projectLead, submissionInfo.projectLead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institution, intendedDataUseStatement, modifiedOn, projectLead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionInfo {\n");
    
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    intendedDataUseStatement: ").append(toIndentedString(intendedDataUseStatement)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    projectLead: ").append(toIndentedString(projectLead)).append("\n");
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

