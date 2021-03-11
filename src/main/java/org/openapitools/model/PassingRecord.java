package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ResponseCorrectness;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A record of whether a given user passed a given test
 */
@ApiModel(description = "A record of whether a given user passed a given test")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class PassingRecord   {
  @JsonProperty("corrections")
  @Valid
  private List<ResponseCorrectness> corrections = null;

  @JsonProperty("passed")
  private Boolean passed;

  @JsonProperty("passedOn")
  private String passedOn;

  @JsonProperty("quizId")
  private Integer quizId;

  @JsonProperty("responseId")
  private Integer responseId;

  @JsonProperty("score")
  private Integer score;

  @JsonProperty("userId")
  private String userId;

  public PassingRecord corrections(List<ResponseCorrectness> corrections) {
    this.corrections = corrections;
    return this;
  }

  public PassingRecord addCorrectionsItem(ResponseCorrectness correctionsItem) {
    if (this.corrections == null) {
      this.corrections = new ArrayList<>();
    }
    this.corrections.add(correctionsItem);
    return this;
  }

  /**
   * For each response, whether it was correct
   * @return corrections
  */
  @ApiModelProperty(value = "For each response, whether it was correct")

  @Valid

  public List<ResponseCorrectness> getCorrections() {
    return corrections;
  }

  public void setCorrections(List<ResponseCorrectness> corrections) {
    this.corrections = corrections;
  }

  public PassingRecord passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

  /**
   * Whether the user passed the given test
   * @return passed
  */
  @ApiModelProperty(value = "Whether the user passed the given test")


  public Boolean getPassed() {
    return passed;
  }

  public void setPassed(Boolean passed) {
    this.passed = passed;
  }

  public PassingRecord passedOn(String passedOn) {
    this.passedOn = passedOn;
    return this;
  }

  /**
   * Date/time when the user passed the test (omitted if the user has not passed)
   * @return passedOn
  */
  @ApiModelProperty(value = "Date/time when the user passed the test (omitted if the user has not passed)")


  public String getPassedOn() {
    return passedOn;
  }

  public void setPassedOn(String passedOn) {
    this.passedOn = passedOn;
  }

  public PassingRecord quizId(Integer quizId) {
    this.quizId = quizId;
    return this;
  }

  /**
   * The id of the quiz
   * @return quizId
  */
  @ApiModelProperty(value = "The id of the quiz")


  public Integer getQuizId() {
    return quizId;
  }

  public void setQuizId(Integer quizId) {
    this.quizId = quizId;
  }

  public PassingRecord responseId(Integer responseId) {
    this.responseId = responseId;
    return this;
  }

  /**
   * The id of the user's response 
   * @return responseId
  */
  @ApiModelProperty(value = "The id of the user's response ")


  public Integer getResponseId() {
    return responseId;
  }

  public void setResponseId(Integer responseId) {
    this.responseId = responseId;
  }

  public PassingRecord score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * The score the user received on the test
   * @return score
  */
  @ApiModelProperty(value = "The score the user received on the test")


  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public PassingRecord userId(String userId) {
    this.userId = userId;
    return this;
  }

  /**
   * The principal id of the user
   * @return userId
  */
  @ApiModelProperty(value = "The principal id of the user")


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PassingRecord passingRecord = (PassingRecord) o;
    return Objects.equals(this.corrections, passingRecord.corrections) &&
        Objects.equals(this.passed, passingRecord.passed) &&
        Objects.equals(this.passedOn, passingRecord.passedOn) &&
        Objects.equals(this.quizId, passingRecord.quizId) &&
        Objects.equals(this.responseId, passingRecord.responseId) &&
        Objects.equals(this.score, passingRecord.score) &&
        Objects.equals(this.userId, passingRecord.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corrections, passed, passedOn, quizId, responseId, score, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PassingRecord {\n");
    
    sb.append("    corrections: ").append(toIndentedString(corrections)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    passedOn: ").append(toIndentedString(passedOn)).append("\n");
    sb.append("    quizId: ").append(toIndentedString(quizId)).append("\n");
    sb.append("    responseId: ").append(toIndentedString(responseId)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

