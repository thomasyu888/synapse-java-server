package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SubmissionContributor;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A Submission to a Synapse Evaluation is a pointer to a versioned Entity. Submissions are immutable, so we archive a copy of the EntityBundle at the time of submission. 
 */
@ApiModel(description = "A Submission to a Synapse Evaluation is a pointer to a versioned Entity. Submissions are immutable, so we archive a copy of the EntityBundle at the time of submission. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionModel   {
  @JsonProperty("contributors")
  @Valid
  private List<SubmissionContributor> contributors = null;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("dockerDigest")
  private String dockerDigest;

  @JsonProperty("dockerRepositoryName")
  private String dockerRepositoryName;

  @JsonProperty("entityBundleJSON")
  private String entityBundleJSON;

  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("evaluationId")
  private String evaluationId;

  @JsonProperty("evaluationRoundId")
  private String evaluationRoundId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("submitterAlias")
  private String submitterAlias;

  @JsonProperty("teamId")
  private String teamId;

  @JsonProperty("userId")
  private String userId;

  @JsonProperty("versionNumber")
  private Integer versionNumber;

  public SubmissionModel contributors(List<SubmissionContributor> contributors) {
    this.contributors = contributors;
    return this;
  }

  public SubmissionModel addContributorsItem(SubmissionContributor contributorsItem) {
    if (this.contributors == null) {
      this.contributors = new ArrayList<>();
    }
    this.contributors.add(contributorsItem);
    return this;
  }

  /**
   * User ids of the submitter and (if a team submission) the team members involved in creating the submission. 
   * @return contributors
  */
  @ApiModelProperty(value = "User ids of the submitter and (if a team submission) the team members involved in creating the submission. ")

  @Valid

  public List<SubmissionContributor> getContributors() {
    return contributors;
  }

  public void setContributors(List<SubmissionContributor> contributors) {
    this.contributors = contributors;
  }

  public SubmissionModel createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date on which Submission was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date on which Submission was created.")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public SubmissionModel dockerDigest(String dockerDigest) {
    this.dockerDigest = dockerDigest;
    return this;
  }

  /**
   * For Docker repositories, the digest from the commit. Null for other entity types.
   * @return dockerDigest
  */
  @ApiModelProperty(value = "For Docker repositories, the digest from the commit. Null for other entity types.")


  public String getDockerDigest() {
    return dockerDigest;
  }

  public void setDockerDigest(String dockerDigest) {
    this.dockerDigest = dockerDigest;
  }

  public SubmissionModel dockerRepositoryName(String dockerRepositoryName) {
    this.dockerRepositoryName = dockerRepositoryName;
    return this;
  }

  /**
   * For Docker repositories, the name of the submitted repository. Null for other entity types.
   * @return dockerRepositoryName
  */
  @ApiModelProperty(value = "For Docker repositories, the name of the submitted repository. Null for other entity types.")


  public String getDockerRepositoryName() {
    return dockerRepositoryName;
  }

  public void setDockerRepositoryName(String dockerRepositoryName) {
    this.dockerRepositoryName = dockerRepositoryName;
  }

  public SubmissionModel entityBundleJSON(String entityBundleJSON) {
    this.entityBundleJSON = entityBundleJSON;
    return this;
  }

  /**
   * The Bundled Entity and Annotations JSON at the time of submission.
   * @return entityBundleJSON
  */
  @ApiModelProperty(value = "The Bundled Entity and Annotations JSON at the time of submission.")


  public String getEntityBundleJSON() {
    return entityBundleJSON;
  }

  public void setEntityBundleJSON(String entityBundleJSON) {
    this.entityBundleJSON = entityBundleJSON;
  }

  public SubmissionModel entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The Synapse ID of the Entity in this Submission.
   * @return entityId
  */
  @ApiModelProperty(value = "The Synapse ID of the Entity in this Submission.")


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public SubmissionModel evaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

  /**
   * The Synapse ID of the Evaluation this Submission is for.
   * @return evaluationId
  */
  @ApiModelProperty(value = "The Synapse ID of the Evaluation this Submission is for.")


  public String getEvaluationId() {
    return evaluationId;
  }

  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }

  public SubmissionModel evaluationRoundId(String evaluationRoundId) {
    this.evaluationRoundId = evaluationRoundId;
    return this;
  }

  /**
   * The Synapse ID of the EvaluationRound to which this was submitted. DO NOT specify a value for this. It will be filled in automatically upon creation of the Submission if the Evaluation is configured with an EvaluationRound.
   * @return evaluationRoundId
  */
  @ApiModelProperty(value = "The Synapse ID of the EvaluationRound to which this was submitted. DO NOT specify a value for this. It will be filled in automatically upon creation of the Submission if the Evaluation is configured with an EvaluationRound.")


  public String getEvaluationRoundId() {
    return evaluationRoundId;
  }

  public void setEvaluationRoundId(String evaluationRoundId) {
    this.evaluationRoundId = evaluationRoundId;
  }

  public SubmissionModel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique, immutable Synapse ID of this Submission.
   * @return id
  */
  @ApiModelProperty(value = "The unique, immutable Synapse ID of this Submission.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SubmissionModel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The title of this Submission.
   * @return name
  */
  @ApiModelProperty(value = "The title of this Submission.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubmissionModel submitterAlias(String submitterAlias) {
    this.submitterAlias = submitterAlias;
    return this;
  }

  /**
   * The alias for the user or team creating the submission.
   * @return submitterAlias
  */
  @ApiModelProperty(value = "The alias for the user or team creating the submission.")


  public String getSubmitterAlias() {
    return submitterAlias;
  }

  public void setSubmitterAlias(String submitterAlias) {
    this.submitterAlias = submitterAlias;
  }

  public SubmissionModel teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * optional Team which collaborated on the submission
   * @return teamId
  */
  @ApiModelProperty(value = "optional Team which collaborated on the submission")


  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public SubmissionModel userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The Synapse ID of the user who created this Submission.
   * @return userId
  */
  @ApiModelProperty(value = "The Synapse ID of the user who created this Submission.")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public SubmissionModel versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * The submitted version number of the Entity.
   * @return versionNumber
  */
  @ApiModelProperty(value = "The submitted version number of the Entity.")


  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionModel submissionModel = (SubmissionModel) o;
    return Objects.equals(this.contributors, submissionModel.contributors) &&
        Objects.equals(this.createdOn, submissionModel.createdOn) &&
        Objects.equals(this.dockerDigest, submissionModel.dockerDigest) &&
        Objects.equals(this.dockerRepositoryName, submissionModel.dockerRepositoryName) &&
        Objects.equals(this.entityBundleJSON, submissionModel.entityBundleJSON) &&
        Objects.equals(this.entityId, submissionModel.entityId) &&
        Objects.equals(this.evaluationId, submissionModel.evaluationId) &&
        Objects.equals(this.evaluationRoundId, submissionModel.evaluationRoundId) &&
        Objects.equals(this.id, submissionModel.id) &&
        Objects.equals(this.name, submissionModel.name) &&
        Objects.equals(this.submitterAlias, submissionModel.submitterAlias) &&
        Objects.equals(this.teamId, submissionModel.teamId) &&
        Objects.equals(this.userId, submissionModel.userId) &&
        Objects.equals(this.versionNumber, submissionModel.versionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contributors, createdOn, dockerDigest, dockerRepositoryName, entityBundleJSON, entityId, evaluationId, evaluationRoundId, id, name, submitterAlias, teamId, userId, versionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionModel {\n");
    
    sb.append("    contributors: ").append(toIndentedString(contributors)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    dockerDigest: ").append(toIndentedString(dockerDigest)).append("\n");
    sb.append("    dockerRepositoryName: ").append(toIndentedString(dockerRepositoryName)).append("\n");
    sb.append("    entityBundleJSON: ").append(toIndentedString(entityBundleJSON)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    evaluationRoundId: ").append(toIndentedString(evaluationRoundId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    submitterAlias: ").append(toIndentedString(submitterAlias)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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

