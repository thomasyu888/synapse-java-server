package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Type of the Entity
 */
public enum EntityType {
  
  PROJECT("project"),
  
  FOLDER("folder"),
  
  FILE("file"),
  
  TABLE("table"),
  
  LINK("link"),
  
  ENTITYVIEW("entityview"),
  
  DOCKERREPO("dockerrepo"),
  
  SUBMISSIONVIEW("submissionview");

  private String value;

  EntityType(String value) {
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
  public static EntityType fromValue(String value) {
    for (EntityType b : EntityType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

