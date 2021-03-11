package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Describes the scheme of the nameIdentifier. Required if nameIdentifier is used.
 */
public enum NameIdentifierScheme {
  
  ORCID("ORCID"),
  
  ISNI("ISNI");

  private String value;

  NameIdentifierScheme(String value) {
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
  public static NameIdentifierScheme fromValue(String value) {
    for (NameIdentifierScheme b : NameIdentifierScheme.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

