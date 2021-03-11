package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An Annotation containing a Integer value
 */
@ApiModel(description = "An Annotation containing a Integer value")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class LongAnnotation   {
  @JsonProperty("isPrivate")
  private Boolean isPrivate;

  @JsonProperty("key")
  private String key;

  @JsonProperty("value")
  private Integer value;

  public LongAnnotation isPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
    return this;
  }

  /**
   * Flag denoting whether this Annotation should be private.
   * @return isPrivate
  */
  @ApiModelProperty(value = "Flag denoting whether this Annotation should be private.")


  public Boolean getIsPrivate() {
    return isPrivate;
  }

  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }

  public LongAnnotation key(String key) {
    this.key = key;
    return this;
  }

  /**
   * The key of this Annotation
   * @return key
  */
  @ApiModelProperty(value = "The key of this Annotation")


  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public LongAnnotation value(Integer value) {
    this.value = value;
    return this;
  }

  /**
   * The value of this Annotation
   * @return value
  */
  @ApiModelProperty(value = "The value of this Annotation")


  public Integer getValue() {
    return value;
  }

  public void setValue(Integer value) {
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
    LongAnnotation longAnnotation = (LongAnnotation) o;
    return Objects.equals(this.isPrivate, longAnnotation.isPrivate) &&
        Objects.equals(this.key, longAnnotation.key) &&
        Objects.equals(this.value, longAnnotation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isPrivate, key, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongAnnotation {\n");
    
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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

