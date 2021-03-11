package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.JsonSchema;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response body containing the resulting compiled validation schema.
 */
@ApiModel(description = "Response body containing the resulting compiled validation schema.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class GetValidationSchemaResponse   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("validationSchema")
  private JsonSchema validationSchema;

  public GetValidationSchemaResponse concreteType(String concreteType) {
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

  public GetValidationSchemaResponse validationSchema(JsonSchema validationSchema) {
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
    GetValidationSchemaResponse getValidationSchemaResponse = (GetValidationSchemaResponse) o;
    return Objects.equals(this.concreteType, getValidationSchemaResponse.concreteType) &&
        Objects.equals(this.validationSchema, getValidationSchemaResponse.validationSchema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, validationSchema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetValidationSchemaResponse {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
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

