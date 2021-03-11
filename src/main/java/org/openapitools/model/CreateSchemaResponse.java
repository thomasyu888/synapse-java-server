package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.JsonSchema;
import org.openapitools.model.JsonSchemaVersionInfo;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The response of a create JsonSchema request.
 */
@ApiModel(description = "The response of a create JsonSchema request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class CreateSchemaResponse   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("newVersionInfo")
  private JsonSchemaVersionInfo newVersionInfo;

  @JsonProperty("validationSchema")
  private JsonSchema validationSchema;

  public CreateSchemaResponse concreteType(String concreteType) {
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

  public CreateSchemaResponse newVersionInfo(JsonSchemaVersionInfo newVersionInfo) {
    this.newVersionInfo = newVersionInfo;
    return this;
  }

  /**
   * Get newVersionInfo
   * @return newVersionInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonSchemaVersionInfo getNewVersionInfo() {
    return newVersionInfo;
  }

  public void setNewVersionInfo(JsonSchemaVersionInfo newVersionInfo) {
    this.newVersionInfo = newVersionInfo;
  }

  public CreateSchemaResponse validationSchema(JsonSchema validationSchema) {
    this.validationSchema = validationSchema;
    return this;
  }

  /**
   * Get validationSchema
   * @return validationSchema
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonSchema getValidationSchema() {
    return validationSchema;
  }

  public void setValidationSchema(JsonSchema validationSchema) {
    this.validationSchema = validationSchema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSchemaResponse createSchemaResponse = (CreateSchemaResponse) o;
    return Objects.equals(this.concreteType, createSchemaResponse.concreteType) &&
        Objects.equals(this.newVersionInfo, createSchemaResponse.newVersionInfo) &&
        Objects.equals(this.validationSchema, createSchemaResponse.validationSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, newVersionInfo, validationSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSchemaResponse {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    newVersionInfo: ").append(toIndentedString(newVersionInfo)).append("\n");
    sb.append("    validationSchema: ").append(toIndentedString(validationSchema)).append("\n");
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

