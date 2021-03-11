package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * ACT restriction levels
 */
public enum RestrictionLevel {
  
  OPEN("OPEN"),
  
  RESTRICTED_BY_TERMS_OF_USE("RESTRICTED_BY_TERMS_OF_USE"),
  
  CONTROLLED_BY_ACT("CONTROLLED_BY_ACT");

  private String value;

  RestrictionLevel(String value) {
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
  public static RestrictionLevel fromValue(String value) {
    for (RestrictionLevel b : RestrictionLevel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

