package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * The type of access change for this user. Users can gain access, renew access, or have access revoked.
 */
public enum AccessType {
  
  GAIN_ACCESS("GAIN_ACCESS"),
  
  RENEW_ACCESS("RENEW_ACCESS"),
  
  REVOKE_ACCESS("REVOKE_ACCESS");

  private String value;

  AccessType(String value) {
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
  public static AccessType fromValue(String value) {
    for (AccessType b : AccessType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

