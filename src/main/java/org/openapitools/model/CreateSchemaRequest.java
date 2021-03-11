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
 * An AsynchronousRequestBody to define a new JsonSchema.
 */
@ApiModel(description = "An AsynchronousRequestBody to define a new JsonSchema.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class CreateSchemaRequest   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("dryRun")
  private Boolean dryRun;

  @JsonProperty("schema")
  private JsonSchema schema;

  public CreateSchemaRequest concreteType(String concreteType) {
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

  public CreateSchemaRequest dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * When true, an attempt will be made to create the schema normally, but the resulting schema will not be retained. This can be used to validate a schema without actually registering it. The default value is false. 
   * @return dryRun
  */
  @ApiModelProperty(value = "When true, an attempt will be made to create the schema normally, but the resulting schema will not be retained. This can be used to validate a schema without actually registering it. The default value is false. ")


  public Boolean getDryRun() {
    return dryRun;
  }

  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }

  public CreateSchemaRequest schema(JsonSchema schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Get schema
   * @return schema
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonSchema getSchema() {
    return schema;
  }

  public void setSchema(JsonSchema schema) {
    this.schema = schema;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSchemaRequest createSchemaRequest = (CreateSchemaRequest) o;
    return Objects.equals(this.concreteType, createSchemaRequest.concreteType) &&
        Objects.equals(this.dryRun, createSchemaRequest.dryRun) &&
        Objects.equals(this.schema, createSchemaRequest.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, dryRun, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSchemaRequest {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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

