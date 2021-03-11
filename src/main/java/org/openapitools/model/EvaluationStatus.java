package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The possible states of a Synapse Evaluation.
 */
public enum EvaluationStatus {
  
  PLANNED("PLANNED"),
  
  OPEN("OPEN"),
  
  CLOSED("CLOSED"),
  
  COMPLETED("COMPLETED");

  private String value;

  EvaluationStatus(String value) {
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
  public static EvaluationStatus fromValue(String value) {
    for (EvaluationStatus b : EvaluationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

