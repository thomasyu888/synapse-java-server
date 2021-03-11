package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * https://json-schema.org/draft/2019-09/json-schema-core.html#rfc.section.4.2.1 null: A JSON \"null\" production boolean: A \"true\" or \"false\" value, from the JSON \"true\" or \"false\" productions object: An unordered set of properties mapping a string to an instance, from the JSON \"object\" production. If a \"type\" is not provided in a schema definition it will default to \"object\". array: An ordered list of instances, from the JSON \"array\" production number: An arbitrary-precision, base-10 decimal number value, from the JSON \"number\" production string: A string of Unicode code points, from the JSON \"string\" production integer: A number with no fractional part (no decimals). 
 */
public enum TYPE {
  
  NULL("null"),
  
  BOOLEAN("boolean"),
  
  OBJECT("object"),
  
  ARRAY("array"),
  
  NUMBER("number"),
  
  STRING("string"),
  
  INTEGER("integer");

  private String value;

  TYPE(String value) {
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
  public static TYPE fromValue(String value) {
    for (TYPE b : TYPE.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

