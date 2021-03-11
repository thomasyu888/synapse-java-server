package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for Reference POJO
 */
@ApiModel(description = "JSON schema for Reference POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Reference   {
  @JsonProperty("targetId")
  private String targetId;

  @JsonProperty("targetVersionNumber")
  private BigDecimal targetVersionNumber;

  public Reference targetId(String targetId) {
    this.targetId = targetId;
    return this;
  }

  /**
   * The the id of the entity to which this reference refers
   * @return targetId
  */
  @ApiModelProperty(value = "The the id of the entity to which this reference refers")


  public String getTargetId() {
    return targetId;
  }

  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }

  public Reference targetVersionNumber(BigDecimal targetVersionNumber) {
    this.targetVersionNumber = targetVersionNumber;
    return this;
  }

  /**
   * The version number of the entity to which this reference refers
   * @return targetVersionNumber
  */
  @ApiModelProperty(value = "The version number of the entity to which this reference refers")

  @Valid

  public BigDecimal getTargetVersionNumber() {
    return targetVersionNumber;
  }

  public void setTargetVersionNumber(BigDecimal targetVersionNumber) {
    this.targetVersionNumber = targetVersionNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Reference reference = (Reference) o;
    return Objects.equals(this.targetId, reference.targetId) &&
        Objects.equals(this.targetVersionNumber, reference.targetVersionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetId, targetVersionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Reference {\n");
    
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetVersionNumber: ").append(toIndentedString(targetVersionNumber)).append("\n");
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

