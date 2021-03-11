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
 * A research project describes a project at an institution that used a controlled data set for the purposes that are stated in the Intended Data Use Statement.
 */
@ApiModel(description = "A research project describes a project at an institution that used a controlled data set for the purposes that are stated in the Intended Data Use Statement.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ResearchProject   {
  @JsonProperty("accessRequirementId")
  private String accessRequirementId;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("institution")
  private String institution;

  @JsonProperty("intendedDataUseStatement")
  private String intendedDataUseStatement;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("modifiedOn")
  private String modifiedOn;

  @JsonProperty("projectLead")
  private String projectLead;

  public ResearchProject accessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
    return this;
  }

  /**
   * The ID of the Access Requirement which this research project needs to meet to gain access to the data.
   * @return accessRequirementId
  */
  @ApiModelProperty(value = "The ID of the Access Requirement which this research project needs to meet to gain access to the data.")


  public String getAccessRequirementId() {
    return accessRequirementId;
  }

  public void setAccessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
  }

  public ResearchProject createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that created this research project.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that created this research project.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ResearchProject createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this research project was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this research project was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public ResearchProject etag(String etag) {
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

  public ResearchProject id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique immutable ID for this research project.
   * @return id
  */
  @ApiModelProperty(value = "The unique immutable ID for this research project.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResearchProject institution(String institution) {
    this.institution = institution;
    return this;
  }

  /**
   * The institution that this research project belongs to.
   * @return institution
  */
  @ApiModelProperty(value = "The institution that this research project belongs to.")


  public String getInstitution() {
    return institution;
  }

  public void setInstitution(String institution) {
    this.institution = institution;
  }

  public ResearchProject intendedDataUseStatement(String intendedDataUseStatement) {
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

  public ResearchProject modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The ID of the user that last modified this research project.
   * @return modifiedBy
  */
  @ApiModelProperty(value = "The ID of the user that last modified this research project.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public ResearchProject modifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date this research project was last modified.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date this research project was last modified.")


  public String getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(String modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public ResearchProject projectLead(String projectLead) {
    this.projectLead = projectLead;
    return this;
  }

  /**
   * The person who is leading the project.
   * @return projectLead
  */
  @ApiModelProperty(value = "The person who is leading the project.")


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
    ResearchProject researchProject = (ResearchProject) o;
    return Objects.equals(this.accessRequirementId, researchProject.accessRequirementId) &&
        Objects.equals(this.createdBy, researchProject.createdBy) &&
        Objects.equals(this.createdOn, researchProject.createdOn) &&
        Objects.equals(this.etag, researchProject.etag) &&
        Objects.equals(this.id, researchProject.id) &&
        Objects.equals(this.institution, researchProject.institution) &&
        Objects.equals(this.intendedDataUseStatement, researchProject.intendedDataUseStatement) &&
        Objects.equals(this.modifiedBy, researchProject.modifiedBy) &&
        Objects.equals(this.modifiedOn, researchProject.modifiedOn) &&
        Objects.equals(this.projectLead, researchProject.projectLead);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementId, createdBy, createdOn, etag, id, institution, intendedDataUseStatement, modifiedBy, modifiedOn, projectLead);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResearchProject {\n");
    
    sb.append("    accessRequirementId: ").append(toIndentedString(accessRequirementId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    intendedDataUseStatement: ").append(toIndentedString(intendedDataUseStatement)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
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

