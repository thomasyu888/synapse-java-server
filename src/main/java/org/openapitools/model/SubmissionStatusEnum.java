package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The possible states of a Synapse Submission.
 */
public enum SubmissionStatusEnum {
  
  OPEN("OPEN"),
  
  CLOSED("CLOSED"),
  
  SCORED("SCORED"),
  
  INVALID("INVALID"),
  
  VALIDATED("VALIDATED"),
  
  EVALUATION_IN_PROGRESS("EVALUATION_IN_PROGRESS"),
  
  RECEIVED("RECEIVED"),
  
  REJECTED("REJECTED"),
  
  ACCEPTED("ACCEPTED");

  private String value;

  SubmissionStatusEnum(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SubmissionStatusEnum fromValue(String value) {
    for (SubmissionStatusEnum b : SubmissionStatusEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

