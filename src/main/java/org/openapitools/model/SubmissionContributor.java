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
 * A contributor to an evaluation Submission
 */
@ApiModel(description = "A contributor to an evaluation Submission")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SubmissionContributor   {
  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("principalId")
  private String principalId;

  public SubmissionContributor createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * 'date when contributor was added to Submission. Normally this will match the creation date of the Submission, but administrative override is allowed.' 
   * @return createdOn
  */
  @ApiModelProperty(value = "'date when contributor was added to Submission. Normally this will match the creation date of the Submission, but administrative override is allowed.' ")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public SubmissionContributor principalId(String principalId) {
    this.principalId = principalId;
    return this;
  }

  /**
   * ID of the contributor
   * @return principalId
  */
  @ApiModelProperty(value = "ID of the contributor")


  public String getPrincipalId() {
    return principalId;
  }

  public void setPrincipalId(String principalId) {
    this.principalId = principalId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubmissionContributor submissionContributor = (SubmissionContributor) o;
    return Objects.equals(this.createdOn, submissionContributor.createdOn) &&
        Objects.equals(this.principalId, submissionContributor.principalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdOn, principalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubmissionContributor {\n");
    
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    principalId: ").append(toIndentedString(principalId)).append("\n");
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

