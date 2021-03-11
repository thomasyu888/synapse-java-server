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
 * Interface for JSON schema for a Used record in Provenance
 */
@ApiModel(description = "Interface for JSON schema for a Used record in Provenance")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Used   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("wasExecuted")
  private Boolean wasExecuted;

  public Used concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * Concrete Type
   * @return concreteType
  */
  @ApiModelProperty(value = "Concrete Type")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public Used wasExecuted(Boolean wasExecuted) {
    this.wasExecuted = wasExecuted;
    return this;
  }

  /**
   * The enclosed entity was used and also executed in the Activity
   * @return wasExecuted
  */
  @ApiModelProperty(value = "The enclosed entity was used and also executed in the Activity")


  public Boolean getWasExecuted() {
    return wasExecuted;
  }

  public void setWasExecuted(Boolean wasExecuted) {
    this.wasExecuted = wasExecuted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Used used = (Used) o;
    return Objects.equals(this.concreteType, used.concreteType) &&
        Objects.equals(this.wasExecuted, used.wasExecuted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, wasExecuted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Used {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    wasExecuted: ").append(toIndentedString(wasExecuted)).append("\n");
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

