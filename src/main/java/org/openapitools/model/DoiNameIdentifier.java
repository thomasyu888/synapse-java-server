package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.NameIdentifierScheme;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Uniquely identifies an individual or legal entity, according to various schemas.
 */
@ApiModel(description = "Uniquely identifies an individual or legal entity, according to various schemas.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class DoiNameIdentifier   {
  @JsonProperty("identifier")
  private String identifier;

  @JsonProperty("nameIdentifierScheme")
  private NameIdentifierScheme nameIdentifierScheme;

  public DoiNameIdentifier identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * The identifier belonging to the creator.
   * @return identifier
  */
  @ApiModelProperty(required = true, value = "The identifier belonging to the creator.")
  @NotNull


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public DoiNameIdentifier nameIdentifierScheme(NameIdentifierScheme nameIdentifierScheme) {
    this.nameIdentifierScheme = nameIdentifierScheme;
    return this;
  }

  /**
   * Get nameIdentifierScheme
   * @return nameIdentifierScheme
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public NameIdentifierScheme getNameIdentifierScheme() {
    return nameIdentifierScheme;
  }

  public void setNameIdentifierScheme(NameIdentifierScheme nameIdentifierScheme) {
    this.nameIdentifierScheme = nameIdentifierScheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoiNameIdentifier doiNameIdentifier = (DoiNameIdentifier) o;
    return Objects.equals(this.identifier, doiNameIdentifier.identifier) &&
        Objects.equals(this.nameIdentifierScheme, doiNameIdentifier.nameIdentifierScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, nameIdentifierScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoiNameIdentifier {\n");
    
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    nameIdentifierScheme: ").append(toIndentedString(nameIdentifierScheme)).append("\n");
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

