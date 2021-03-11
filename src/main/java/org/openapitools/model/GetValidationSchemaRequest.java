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
 * To use a JSON schema for validation, the JSON schema plus all of its dependency schemas must be provided to a JSON schema validator. The &#39;validation&#39; schema is simply a JSON schema with all of its dependencies added to the &#39;definitions&#39; section of the schema, making the schema self-contained. 
 */
@ApiModel(description = "To use a JSON schema for validation, the JSON schema plus all of its dependency schemas must be provided to a JSON schema validator. The 'validation' schema is simply a JSON schema with all of its dependencies added to the 'definitions' section of the schema, making the schema self-contained. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class GetValidationSchemaRequest   {
  @JsonProperty("$id")
  private String $id;

  @JsonProperty("concreteType")
  private String concreteType;

  public GetValidationSchemaRequest $id(String $id) {
    this.$id = $id;
    return this;
  }

  /**
   * The $id of the JSON schema to get the validation schema for.
   * @return $id
  */
  @ApiModelProperty(value = "The $id of the JSON schema to get the validation schema for.")


  public String get$Id() {
    return $id;
  }

  public void set$Id(String $id) {
    this.$id = $id;
  }

  public GetValidationSchemaRequest concreteType(String concreteType) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetValidationSchemaRequest getValidationSchemaRequest = (GetValidationSchemaRequest) o;
    return Objects.equals(this.$id, getValidationSchemaRequest.$id) &&
        Objects.equals(this.concreteType, getValidationSchemaRequest.concreteType);
  }

  @Override
  public int hashCode() {
    return Objects.hash($id, concreteType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetValidationSchemaRequest {\n");
    
    sb.append("    $id: ").append(toIndentedString($id)).append("\n");
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
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

