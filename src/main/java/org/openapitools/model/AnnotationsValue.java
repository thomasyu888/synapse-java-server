package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AnnotationsValueType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains a AnnotationV2&#39;s value and its type 
 */
@ApiModel(description = "Contains a AnnotationV2's value and its type ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AnnotationsValue   {
  @JsonProperty("type")
  private AnnotationsValueType type;

  @JsonProperty("value")
  @Valid
  private List<String> value = null;

  public AnnotationsValue type(AnnotationsValueType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public AnnotationsValueType getType() {
    return type;
  }

  public void setType(AnnotationsValueType type) {
    this.type = type;
  }

  public AnnotationsValue value(List<String> value) {
    this.value = value;
    return this;
  }

  public AnnotationsValue addValueItem(String valueItem) {
    if (this.value == null) {
      this.value = new ArrayList<>();
    }
    this.value.add(valueItem);
    return this;
  }

  /**
   * List of values as strings. Clients should use the \"type\" field to determine how to interpret the strings. Single values Annotations are represented as a list of size 1, and multiple values size > 1. Empty list or null is not allowed 
   * @return value
  */
  @ApiModelProperty(value = "List of values as strings. Clients should use the \"type\" field to determine how to interpret the strings. Single values Annotations are represented as a list of size 1, and multiple values size > 1. Empty list or null is not allowed ")


  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationsValue annotationsValue = (AnnotationsValue) o;
    return Objects.equals(this.type, annotationsValue.type) &&
        Objects.equals(this.value, annotationsValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationsValue {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

