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
 * The response to a question
 */
@ApiModel(description = "The response to a question")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class QuestionResponse   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("questionIndex")
  private Integer questionIndex;

  public QuestionResponse concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * Concrete Type.
   * @return concreteType
  */
  @ApiModelProperty(value = "Concrete Type.")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public QuestionResponse questionIndex(Integer questionIndex) {
    this.questionIndex = questionIndex;
    return this;
  }

  /**
   * An index unique in the Quiz, used to refer to the question being answered
   * @return questionIndex
  */
  @ApiModelProperty(value = "An index unique in the Quiz, used to refer to the question being answered")


  public Integer getQuestionIndex() {
    return questionIndex;
  }

  public void setQuestionIndex(Integer questionIndex) {
    this.questionIndex = questionIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QuestionResponse questionResponse = (QuestionResponse) o;
    return Objects.equals(this.concreteType, questionResponse.concreteType) &&
        Objects.equals(this.questionIndex, questionResponse.questionIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, questionIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionResponse {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    questionIndex: ").append(toIndentedString(questionIndex)).append("\n");
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

