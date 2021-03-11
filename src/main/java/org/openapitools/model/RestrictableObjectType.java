package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * JSON enum for the types of objects which can be restricted by an AccessRequirement.
 */
public enum RestrictableObjectType {
  
  ENTITY("ENTITY"),
  
  EVALUATION("EVALUATION"),
  
  TEAM("TEAM");

  private String value;

  RestrictableObjectType(String value) {
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
  public static RestrictableObjectType fromValue(String value) {
    for (RestrictableObjectType b : RestrictableObjectType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

