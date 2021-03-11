package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.ObjectTypeSchema;
import org.openapitools.model.ValidationException;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Results of validating an object against a schema
 */
@ApiModel(description = "Results of validating an object against a schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ValidationResults   {
  @JsonProperty("allValidationMessages")
  @Valid
  private List<String> allValidationMessages = null;

  @JsonProperty("isValid")
  private Boolean isValid;

  @JsonProperty("objectEtag")
  private String objectEtag;

  @JsonProperty("objectId")
  private String objectId;

  @JsonProperty("objectType")
  private ObjectTypeSchema objectType;

  @JsonProperty("schema$id")
  private String schema$id;

  @JsonProperty("validatedOn")
  private String validatedOn;

  @JsonProperty("validationErrorMessage")
  private String validationErrorMessage;

  @JsonProperty("validationException")
  private ValidationException validationException;

  public ValidationResults allValidationMessages(List<String> allValidationMessages) {
    this.allValidationMessages = allValidationMessages;
    return this;
  }

  public ValidationResults addAllValidationMessagesItem(String allValidationMessagesItem) {
    if (this.allValidationMessages == null) {
      this.allValidationMessages = new ArrayList<>();
    }
    this.allValidationMessages.add(allValidationMessagesItem);
    return this;
  }

  /**
   * If the object is not valid according to the schema, a the flat list of error messages will be provided with one error message per sub-schema. 
   * @return allValidationMessages
  */
  @ApiModelProperty(value = "If the object is not valid according to the schema, a the flat list of error messages will be provided with one error message per sub-schema. ")


  public List<String> getAllValidationMessages() {
    return allValidationMessages;
  }

  public void setAllValidationMessages(List<String> allValidationMessages) {
    this.allValidationMessages = allValidationMessages;
  }

  public ValidationResults isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

  /**
   * True if the object is currently valid according to the schema.
   * @return isValid
  */
  @ApiModelProperty(value = "True if the object is currently valid according to the schema.")


  public Boolean getIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public ValidationResults objectEtag(String objectEtag) {
    this.objectEtag = objectEtag;
    return this;
  }

  /**
   * The etag of the object at the time of validation. Note: If this etag does not match the current etag of the object then these validation results should be considered out of date. 
   * @return objectEtag
  */
  @ApiModelProperty(value = "The etag of the object at the time of validation. Note: If this etag does not match the current etag of the object then these validation results should be considered out of date. ")


  public String getObjectEtag() {
    return objectEtag;
  }

  public void setObjectEtag(String objectEtag) {
    this.objectEtag = objectEtag;
  }

  public ValidationResults objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The identifier of the object that was validated.
   * @return objectId
  */
  @ApiModelProperty(value = "The identifier of the object that was validated.")


  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public ValidationResults objectType(ObjectTypeSchema objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Get objectType
   * @return objectType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ObjectTypeSchema getObjectType() {
    return objectType;
  }

  public void setObjectType(ObjectTypeSchema objectType) {
    this.objectType = objectType;
  }

  public ValidationResults schema$id(String schema$id) {
    this.schema$id = schema$id;
    return this;
  }

  /**
   * The $id of the schema that the object was validated against.
   * @return schema$id
  */
  @ApiModelProperty(value = "The $id of the schema that the object was validated against.")


  public String getSchema$id() {
    return schema$id;
  }

  public void setSchema$id(String schema$id) {
    this.schema$id = schema$id;
  }

  public ValidationResults validatedOn(String validatedOn) {
    this.validatedOn = validatedOn;
    return this;
  }

  /**
   * The date-time this object was validated
   * @return validatedOn
  */
  @ApiModelProperty(value = "The date-time this object was validated")


  public String getValidatedOn() {
    return validatedOn;
  }

  public void setValidatedOn(String validatedOn) {
    this.validatedOn = validatedOn;
  }

  public ValidationResults validationErrorMessage(String validationErrorMessage) {
    this.validationErrorMessage = validationErrorMessage;
    return this;
  }

  /**
   * If the object is not valid according to the schema, a simple one line error message will be provided. 
   * @return validationErrorMessage
  */
  @ApiModelProperty(value = "If the object is not valid according to the schema, a simple one line error message will be provided. ")


  public String getValidationErrorMessage() {
    return validationErrorMessage;
  }

  public void setValidationErrorMessage(String validationErrorMessage) {
    this.validationErrorMessage = validationErrorMessage;
  }

  public ValidationResults validationException(ValidationException validationException) {
    this.validationException = validationException;
    return this;
  }

  /**
   * Get validationException
   * @return validationException
  */
  @ApiModelProperty(value = "")

  @Valid

  public ValidationException getValidationException() {
    return validationException;
  }

  public void setValidationException(ValidationException validationException) {
    this.validationException = validationException;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationResults validationResults = (ValidationResults) o;
    return Objects.equals(this.allValidationMessages, validationResults.allValidationMessages) &&
        Objects.equals(this.isValid, validationResults.isValid) &&
        Objects.equals(this.objectEtag, validationResults.objectEtag) &&
        Objects.equals(this.objectId, validationResults.objectId) &&
        Objects.equals(this.objectType, validationResults.objectType) &&
        Objects.equals(this.schema$id, validationResults.schema$id) &&
        Objects.equals(this.validatedOn, validationResults.validatedOn) &&
        Objects.equals(this.validationErrorMessage, validationResults.validationErrorMessage) &&
        Objects.equals(this.validationException, validationResults.validationException);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allValidationMessages, isValid, objectEtag, objectId, objectType, schema$id, validatedOn, validationErrorMessage, validationException);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationResults {\n");
    
    sb.append("    allValidationMessages: ").append(toIndentedString(allValidationMessages)).append("\n");
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    objectEtag: ").append(toIndentedString(objectEtag)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    schema$id: ").append(toIndentedString(schema$id)).append("\n");
    sb.append("    validatedOn: ").append(toIndentedString(validatedOn)).append("\n");
    sb.append("    validationErrorMessage: ").append(toIndentedString(validationErrorMessage)).append("\n");
    sb.append("    validationException: ").append(toIndentedString(validationException)).append("\n");
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

