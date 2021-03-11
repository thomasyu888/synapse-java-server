package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Round limit type
 */
public enum EvaluationRoundLimitType {
  
  TOTAL("TOTAL"),
  
  DAILY("DAILY"),
  
  WEEKLY("WEEKLY"),
  
  MONTHLY("MONTHLY");

  private String value;

  EvaluationRoundLimitType(String value) {
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
  public static EvaluationRoundLimitType fromValue(String value) {
    for (EvaluationRoundLimitType b : EvaluationRoundLimitType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

