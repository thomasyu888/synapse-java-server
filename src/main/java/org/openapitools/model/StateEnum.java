package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The enumeration of possible FormData submission states.
 */
public enum StateEnum {
  
  WAITING_FOR_SUBMISSION("WAITING_FOR_SUBMISSION"),
  
  SUBMITTED_WAITING_FOR_REVIEW("SUBMITTED_WAITING_FOR_REVIEW"),
  
  ACCEPTED("ACCEPTED"),
  
  REJECTED("REJECTED");

  private String value;

  StateEnum(String value) {
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
  public static StateEnum fromValue(String value) {
    for (StateEnum b : StateEnum.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

