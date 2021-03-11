package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.Doi;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An response to a DOI mint or update request.
 */
@ApiModel(description = "An response to a DOI mint or update request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class DoiResponse   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("doi")
  private Doi doi = null;

  public DoiResponse concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * concrete type
   * @return concreteType
  */
  @ApiModelProperty(value = "concrete type")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public DoiResponse doi(Doi doi) {
    this.doi = doi;
    return this;
  }

  /**
   * Get doi
   * @return doi
  */
  @ApiModelProperty(value = "")

  @Valid

  public Doi getDoi() {
    return doi;
  }

  public void setDoi(Doi doi) {
    this.doi = doi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoiResponse doiResponse = (DoiResponse) o;
    return Objects.equals(this.concreteType, doiResponse.concreteType) &&
        Objects.equals(this.doi, doiResponse.doi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, doi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoiResponse {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    doi: ").append(toIndentedString(doi)).append("\n");
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

