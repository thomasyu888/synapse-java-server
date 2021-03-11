package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A recursive ValidationException that describes all schema violations for an entire schema tree.
 */
@ApiModel(description = "A recursive ValidationException that describes all schema violations for an entire schema tree.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ValidationException   {
  @JsonProperty("causingExceptions")
  @Valid
  private List<ValidationException> causingExceptions = null;

  @JsonProperty("keyword")
  private String keyword;

  @JsonProperty("message")
  private String message;

  @JsonProperty("pointerToViolation")
  private String pointerToViolation;

  @JsonProperty("schemaLocation")
  private String schemaLocation;

  public ValidationException causingExceptions(List<ValidationException> causingExceptions) {
    this.causingExceptions = causingExceptions;
    return this;
  }

  public ValidationException addCausingExceptionsItem(ValidationException causingExceptionsItem) {
    if (this.causingExceptions == null) {
      this.causingExceptions = new ArrayList<>();
    }
    this.causingExceptions.add(causingExceptionsItem);
    return this;
  }

  /**
   * An array of sub-exceptions.
   * @return causingExceptions
  */
  @ApiModelProperty(value = "An array of sub-exceptions.")

  @Valid

  public List<ValidationException> getCausingExceptions() {
    return causingExceptions;
  }

  public void setCausingExceptions(List<ValidationException> causingExceptions) {
    this.causingExceptions = causingExceptions;
  }

  public ValidationException keyword(String keyword) {
    this.keyword = keyword;
    return this;
  }

  /**
   * The JSON schema keyword which was violated.
   * @return keyword
  */
  @ApiModelProperty(value = "The JSON schema keyword which was violated.")


  public String getKeyword() {
    return keyword;
  }

  public void setKeyword(String keyword) {
    this.keyword = keyword;
  }

  public ValidationException message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The description of the validation failure.
   * @return message
  */
  @ApiModelProperty(value = "The description of the validation failure.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ValidationException pointerToViolation(String pointerToViolation) {
    this.pointerToViolation = pointerToViolation;
    return this;
  }

  /**
   * A JSON Pointer denoting the path from the input document root to its fragment which caused the validation failure.
   * @return pointerToViolation
  */
  @ApiModelProperty(value = "A JSON Pointer denoting the path from the input document root to its fragment which caused the validation failure.")


  public String getPointerToViolation() {
    return pointerToViolation;
  }

  public void setPointerToViolation(String pointerToViolation) {
    this.pointerToViolation = pointerToViolation;
  }

  public ValidationException schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A JSON Pointer denoting the path from the schema JSON root to the violated keyword.
   * @return schemaLocation
  */
  @ApiModelProperty(value = "A JSON Pointer denoting the path from the schema JSON root to the violated keyword.")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationException validationException = (ValidationException) o;
    return Objects.equals(this.causingExceptions, validationException.causingExceptions) &&
        Objects.equals(this.keyword, validationException.keyword) &&
        Objects.equals(this.message, validationException.message) &&
        Objects.equals(this.pointerToViolation, validationException.pointerToViolation) &&
        Objects.equals(this.schemaLocation, validationException.schemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(causingExceptions, keyword, message, pointerToViolation, schemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationException {\n");
    
    sb.append("    causingExceptions: ").append(toIndentedString(causingExceptions)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    pointerToViolation: ").append(toIndentedString(pointerToViolation)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
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

