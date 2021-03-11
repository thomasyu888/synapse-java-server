package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.EvaluationRoundLimit;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Evaluation Round
 */
@ApiModel(description = "Evaluation Round")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class EvaluationRound   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("evaluationId")
  private String evaluationId;

  @JsonProperty("id")
  private String id;

  @JsonProperty("limits")
  @Valid
  private List<EvaluationRoundLimit> limits = null;

  @JsonProperty("roundEnd")
  private String roundEnd;

  @JsonProperty("roundStart")
  private String roundStart;

  public EvaluationRound etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Synapse etag
   * @return etag
  */
  @ApiModelProperty(value = "Synapse etag")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public EvaluationRound evaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
    return this;
  }

  /**
   * The unique immutable ID for this Evaluation.
   * @return evaluationId
  */
  @ApiModelProperty(value = "The unique immutable ID for this Evaluation.")


  public String getEvaluationId() {
    return evaluationId;
  }

  public void setEvaluationId(String evaluationId) {
    this.evaluationId = evaluationId;
  }

  public EvaluationRound id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Evaluation round Id
   * @return id
  */
  @ApiModelProperty(value = "Evaluation round Id")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public EvaluationRound limits(List<EvaluationRoundLimit> limits) {
    this.limits = limits;
    return this;
  }

  public EvaluationRound addLimitsItem(EvaluationRoundLimit limitsItem) {
    if (this.limits == null) {
      this.limits = new ArrayList<>();
    }
    this.limits.add(limitsItem);
    return this;
  }

  /**
   * List of round limits
   * @return limits
  */
  @ApiModelProperty(value = "List of round limits")

  @Valid

  public List<EvaluationRoundLimit> getLimits() {
    return limits;
  }

  public void setLimits(List<EvaluationRoundLimit> limits) {
    this.limits = limits;
  }

  public EvaluationRound roundEnd(String roundEnd) {
    this.roundEnd = roundEnd;
    return this;
  }

  /**
   * End of round
   * @return roundEnd
  */
  @ApiModelProperty(value = "End of round")


  public String getRoundEnd() {
    return roundEnd;
  }

  public void setRoundEnd(String roundEnd) {
    this.roundEnd = roundEnd;
  }

  public EvaluationRound roundStart(String roundStart) {
    this.roundStart = roundStart;
    return this;
  }

  /**
   * Start of round
   * @return roundStart
  */
  @ApiModelProperty(value = "Start of round")


  public String getRoundStart() {
    return roundStart;
  }

  public void setRoundStart(String roundStart) {
    this.roundStart = roundStart;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationRound evaluationRound = (EvaluationRound) o;
    return Objects.equals(this.etag, evaluationRound.etag) &&
        Objects.equals(this.evaluationId, evaluationRound.evaluationId) &&
        Objects.equals(this.id, evaluationRound.id) &&
        Objects.equals(this.limits, evaluationRound.limits) &&
        Objects.equals(this.roundEnd, evaluationRound.roundEnd) &&
        Objects.equals(this.roundStart, evaluationRound.roundStart);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, evaluationId, id, limits, roundEnd, roundStart);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationRound {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    evaluationId: ").append(toIndentedString(evaluationId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    roundEnd: ").append(toIndentedString(roundEnd)).append("\n");
    sb.append("    roundStart: ").append(toIndentedString(roundStart)).append("\n");
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

