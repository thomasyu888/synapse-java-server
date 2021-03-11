package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.WikiPageKey;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A single question in a Quiz
 */
@ApiModel(description = "A single question in a Quiz")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Question   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("docLink")
  private String docLink;

  @JsonProperty("helpText")
  private String helpText;

  @JsonProperty("prompt")
  private String prompt;

  @JsonProperty("questionIndex")
  private Integer questionIndex;

  @JsonProperty("reference")
  private WikiPageKey reference;

  public Question concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * Concrete Type
   * @return concreteType
  */
  @ApiModelProperty(value = "Concrete Type")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public Question docLink(String docLink) {
    this.docLink = docLink;
    return this;
  }

  /**
   * Link to the document that contains information for background reading related to the question.
   * @return docLink
  */
  @ApiModelProperty(value = "Link to the document that contains information for background reading related to the question.")


  public String getDocLink() {
    return docLink;
  }

  public void setDocLink(String docLink) {
    this.docLink = docLink;
  }

  public Question helpText(String helpText) {
    this.helpText = helpText;
    return this;
  }

  /**
   * A short text that provides a snippet of help to answer the question.
   * @return helpText
  */
  @ApiModelProperty(value = "A short text that provides a snippet of help to answer the question.")


  public String getHelpText() {
    return helpText;
  }

  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  public Question prompt(String prompt) {
    this.prompt = prompt;
    return this;
  }

  /**
   * the user-readable prompt for this question
   * @return prompt
  */
  @ApiModelProperty(value = "the user-readable prompt for this question")


  public String getPrompt() {
    return prompt;
  }

  public void setPrompt(String prompt) {
    this.prompt = prompt;
  }

  public Question questionIndex(Integer questionIndex) {
    this.questionIndex = questionIndex;
    return this;
  }

  /**
   * An index unique in the Quiz, used to refer to this question
   * @return questionIndex
  */
  @ApiModelProperty(value = "An index unique in the Quiz, used to refer to this question")


  public Integer getQuestionIndex() {
    return questionIndex;
  }

  public void setQuestionIndex(Integer questionIndex) {
    this.questionIndex = questionIndex;
  }

  public Question reference(WikiPageKey reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Get reference
   * @return reference
  */
  @ApiModelProperty(value = "")

  @Valid

  public WikiPageKey getReference() {
    return reference;
  }

  public void setReference(WikiPageKey reference) {
    this.reference = reference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Question question = (Question) o;
    return Objects.equals(this.concreteType, question.concreteType) &&
        Objects.equals(this.docLink, question.docLink) &&
        Objects.equals(this.helpText, question.helpText) &&
        Objects.equals(this.prompt, question.prompt) &&
        Objects.equals(this.questionIndex, question.questionIndex) &&
        Objects.equals(this.reference, question.reference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, docLink, helpText, prompt, questionIndex, reference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Question {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    docLink: ").append(toIndentedString(docLink)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
    sb.append("    questionIndex: ").append(toIndentedString(questionIndex)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
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

