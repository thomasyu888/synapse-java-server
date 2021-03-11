package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.EvaluationRoundLimitType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Round limit
 */
@ApiModel(description = "Round limit")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EvaluationRoundLimit   {
  @JsonProperty("limitType")
  private EvaluationRoundLimitType limitType;

  @JsonProperty("maximumSubmissions")
  private Integer maximumSubmissions;

  public EvaluationRoundLimit limitType(EvaluationRoundLimitType limitType) {
    this.limitType = limitType;
    return this;
  }

  /**
   * Get limitType
   * @return limitType
  */
  @ApiModelProperty(value = "")

  @Valid

  public EvaluationRoundLimitType getLimitType() {
    return limitType;
  }

  public void setLimitType(EvaluationRoundLimitType limitType) {
    this.limitType = limitType;
  }

  public EvaluationRoundLimit maximumSubmissions(Integer maximumSubmissions) {
    this.maximumSubmissions = maximumSubmissions;
    return this;
  }

  /**
   * Max number of submissions
   * @return maximumSubmissions
  */
  @ApiModelProperty(value = "Max number of submissions")


  public Integer getMaximumSubmissions() {
    return maximumSubmissions;
  }

  public void setMaximumSubmissions(Integer maximumSubmissions) {
    this.maximumSubmissions = maximumSubmissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationRoundLimit evaluationRoundLimit = (EvaluationRoundLimit) o;
    return Objects.equals(this.limitType, evaluationRoundLimit.limitType) &&
        Objects.equals(this.maximumSubmissions, evaluationRoundLimit.maximumSubmissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limitType, maximumSubmissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationRoundLimit {\n");
    
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
    sb.append("    maximumSubmissions: ").append(toIndentedString(maximumSubmissions)).append("\n");
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

