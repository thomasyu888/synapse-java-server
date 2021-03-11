package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * JSON enum for the types of objects in Synapse.
 */
public enum ObjectType {
  
  ENTITY("ENTITY"),
  
  ENTITY_CONTAINER("ENTITY_CONTAINER"),
  
  PRINCIPAL("PRINCIPAL"),
  
  ACTIVITY("ACTIVITY"),
  
  EVALUATION("EVALUATION"),
  
  EVALUATION_ROUND("EVALUATION_ROUND"),
  
  SUBMISSION("SUBMISSION"),
  
  EVALUATION_SUBMISSIONS("EVALUATION_SUBMISSIONS"),
  
  FILE("FILE"),
  
  MESSAGE("MESSAGE"),
  
  WIKI("WIKI"),
  
  FAVORITE("FAVORITE"),
  
  ACCESS_REQUIREMENT("ACCESS_REQUIREMENT"),
  
  ACCESS_APPROVAL("ACCESS_APPROVAL"),
  
  TEAM("TEAM"),
  
  TABLE("TABLE"),
  
  ACCESS_CONTROL_LIST("ACCESS_CONTROL_LIST"),
  
  PROJECT_SETTING("PROJECT_SETTING"),
  
  VERIFICATION_SUBMISSION("VERIFICATION_SUBMISSION"),
  
  CERTIFIED_USER_PASSING_RECORD("CERTIFIED_USER_PASSING_RECORD"),
  
  FORUM("FORUM"),
  
  THREAD("THREAD"),
  
  REPLY("REPLY"),
  
  FORM_GROUP("FORM_GROUP"),
  
  ORGANIZATION("ORGANIZATION"),
  
  FORM_DATA("FORM_DATA"),
  
  ENTITY_VIEW("ENTITY_VIEW"),
  
  USER_PROFILE("USER_PROFILE"),
  
  DATA_ACCESS_REQUEST("DATA_ACCESS_REQUEST"),
  
  DATA_ACCESS_SUBMISSION("DATA_ACCESS_SUBMISSION"),
  
  DATA_ACCESS_SUBMISSION_STATUS("DATA_ACCESS_SUBMISSION_STATUS"),
  
  MEMBERSHIP_INVITATION("MEMBERSHIP_INVITATION");

  private String value;

  ObjectType(String value) {
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
  public static ObjectType fromValue(String value) {
    for (ObjectType b : ObjectType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

