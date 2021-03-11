package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Question;
import org.openapitools.model.QuestionResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A user response and whether it is correct.
 */
@ApiModel(description = "A user response and whether it is correct.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ResponseCorrectness   {
  @JsonProperty("isCorrect")
  private Boolean isCorrect;

  @JsonProperty("question")
  private Question question;

  @JsonProperty("response")
  private QuestionResponse response;

  public ResponseCorrectness isCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
    return this;
  }

  /**
   * Is the response correct?
   * @return isCorrect
  */
  @ApiModelProperty(value = "Is the response correct?")


  public Boolean getIsCorrect() {
    return isCorrect;
  }

  public void setIsCorrect(Boolean isCorrect) {
    this.isCorrect = isCorrect;
  }

  public ResponseCorrectness question(Question question) {
    this.question = question;
    return this;
  }

  /**
   * Get question
   * @return question
  */
  @ApiModelProperty(value = "")

  @Valid

  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }

  public ResponseCorrectness response(QuestionResponse response) {
    this.response = response;
    return this;
  }

  /**
   * Get response
   * @return response
  */
  @ApiModelProperty(value = "")

  @Valid

  public QuestionResponse getResponse() {
    return response;
  }

  public void setResponse(QuestionResponse response) {
    this.response = response;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCorrectness responseCorrectness = (ResponseCorrectness) o;
    return Objects.equals(this.isCorrect, responseCorrectness.isCorrect) &&
        Objects.equals(this.question, responseCorrectness.question) &&
        Objects.equals(this.response, responseCorrectness.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isCorrect, question, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCorrectness {\n");
    
    sb.append("    isCorrect: ").append(toIndentedString(isCorrect)).append("\n");
    sb.append("    question: ").append(toIndentedString(question)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

