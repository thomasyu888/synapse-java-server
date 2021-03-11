package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DoiNameIdentifier;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for DOI Metadata Creator.
 */
@ApiModel(description = "JSON schema for DOI Metadata Creator.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class DoiCreator   {
  @JsonProperty("creatorName")
  private String creatorName;

  @JsonProperty("nameIdentifiers")
  @Valid
  private List<DoiNameIdentifier> nameIdentifiers = null;

  public DoiCreator creatorName(String creatorName) {
    this.creatorName = creatorName;
    return this;
  }

  /**
   * May be a corporate/institutional or personal name (\"Family, Given\").
   * @return creatorName
  */
  @ApiModelProperty(required = true, value = "May be a corporate/institutional or personal name (\"Family, Given\").")
  @NotNull


  public String getCreatorName() {
    return creatorName;
  }

  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }

  public DoiCreator nameIdentifiers(List<DoiNameIdentifier> nameIdentifiers) {
    this.nameIdentifiers = nameIdentifiers;
    return this;
  }

  public DoiCreator addNameIdentifiersItem(DoiNameIdentifier nameIdentifiersItem) {
    if (this.nameIdentifiers == null) {
      this.nameIdentifiers = new ArrayList<>();
    }
    this.nameIdentifiers.add(nameIdentifiersItem);
    return this;
  }

  /**
   * Uniquely identifies an individual or legal entity, according to various schemas.
   * @return nameIdentifiers
  */
  @ApiModelProperty(value = "Uniquely identifies an individual or legal entity, according to various schemas.")

  @Valid

  public List<DoiNameIdentifier> getNameIdentifiers() {
    return nameIdentifiers;
  }

  public void setNameIdentifiers(List<DoiNameIdentifier> nameIdentifiers) {
    this.nameIdentifiers = nameIdentifiers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoiCreator doiCreator = (DoiCreator) o;
    return Objects.equals(this.creatorName, doiCreator.creatorName) &&
        Objects.equals(this.nameIdentifiers, doiCreator.nameIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorName, nameIdentifiers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoiCreator {\n");
    
    sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
    sb.append("    nameIdentifiers: ").append(toIndentedString(nameIdentifiers)).append("\n");
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

