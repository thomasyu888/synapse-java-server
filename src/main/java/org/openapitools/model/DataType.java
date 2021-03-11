package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Enumeration of data types the describe the contents of objects like Tables and Files.  * SENSITIVE_DATA: The default type assigned to all Tables and Files. Sensitive_data indicates that the contents 'might' contain Protected Health Data (PHI), data with access restriction, data with special terms-of-use, or data that should not be released to the public.  * OPEN_DATA: Open_data is data that is safe to release to the public. Open_data must not include Protected Health Data (PHI), data with access restrictions, or any type of terms-of-use. 
 */
public enum DataType {
  
  SENSITIVE_DATA("SENSITIVE_DATA"),
  
  OPEN_DATA("OPEN_DATA");

  private String value;

  DataType(String value) {
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
  public static DataType fromValue(String value) {
    for (DataType b : DataType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

