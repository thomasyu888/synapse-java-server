package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DoiResourceTypeGeneral;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Describes the type of media that the DOI Metadata refers to.
 */
@ApiModel(description = "Describes the type of media that the DOI Metadata refers to.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class DoiResourceType   {
  @JsonProperty("resourceTypeGeneral")
  private DoiResourceTypeGeneral resourceTypeGeneral;

  public DoiResourceType resourceTypeGeneral(DoiResourceTypeGeneral resourceTypeGeneral) {
    this.resourceTypeGeneral = resourceTypeGeneral;
    return this;
  }

  /**
   * Get resourceTypeGeneral
   * @return resourceTypeGeneral
  */
  @ApiModelProperty(value = "")

  @Valid

  public DoiResourceTypeGeneral getResourceTypeGeneral() {
    return resourceTypeGeneral;
  }

  public void setResourceTypeGeneral(DoiResourceTypeGeneral resourceTypeGeneral) {
    this.resourceTypeGeneral = resourceTypeGeneral;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoiResourceType doiResourceType = (DoiResourceType) o;
    return Objects.equals(this.resourceTypeGeneral, doiResourceType.resourceTypeGeneral);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceTypeGeneral);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoiResourceType {\n");
    
    sb.append("    resourceTypeGeneral: ").append(toIndentedString(resourceTypeGeneral)).append("\n");
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

