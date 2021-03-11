package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Describes the general type of media that DOI Metadata refers to.
 */
public enum DoiResourceTypeGeneral {
  
  AUDIOVISUAL("Audiovisual"),
  
  COLLECTION("Collection"),
  
  DATAPAPER("DataPaper"),
  
  DATASET("Dataset"),
  
  EVENT("Event"),
  
  IMAGE("Image"),
  
  INTERACTIVERESOURCE("InteractiveResource"),
  
  MODEL("Model"),
  
  PHYSICALOBJECT("PhysicalObject"),
  
  SERVICE("Service"),
  
  SOFTWARE("Software"),
  
  SOUND("Sound"),
  
  TEXT("Text"),
  
  WORKFLOW("Workflow"),
  
  OTHER("Other");

  private String value;

  DoiResourceTypeGeneral(String value) {
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
  public static DoiResourceTypeGeneral fromValue(String value) {
    for (DoiResourceTypeGeneral b : DoiResourceTypeGeneral.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

