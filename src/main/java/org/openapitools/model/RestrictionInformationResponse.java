package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.RestrictionLevel;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The information about restriction level on a restrict-able object.
 */
@ApiModel(description = "The information about restriction level on a restrict-able object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class RestrictionInformationResponse   {
  @JsonProperty("hasUnmetAccessRequirement")
  private Boolean hasUnmetAccessRequirement;

  @JsonProperty("restrictionLevel")
  private RestrictionLevel restrictionLevel;

  public RestrictionInformationResponse hasUnmetAccessRequirement(Boolean hasUnmetAccessRequirement) {
    this.hasUnmetAccessRequirement = hasUnmetAccessRequirement;
    return this;
  }

  /**
   * True if user has at least one unmet access requirement on this restrict-able object; false otherwise.
   * @return hasUnmetAccessRequirement
  */
  @ApiModelProperty(value = "True if user has at least one unmet access requirement on this restrict-able object; false otherwise.")


  public Boolean getHasUnmetAccessRequirement() {
    return hasUnmetAccessRequirement;
  }

  public void setHasUnmetAccessRequirement(Boolean hasUnmetAccessRequirement) {
    this.hasUnmetAccessRequirement = hasUnmetAccessRequirement;
  }

  public RestrictionInformationResponse restrictionLevel(RestrictionLevel restrictionLevel) {
    this.restrictionLevel = restrictionLevel;
    return this;
  }

  /**
   * Get restrictionLevel
   * @return restrictionLevel
  */
  @ApiModelProperty(value = "")

  @Valid

  public RestrictionLevel getRestrictionLevel() {
    return restrictionLevel;
  }

  public void setRestrictionLevel(RestrictionLevel restrictionLevel) {
    this.restrictionLevel = restrictionLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestrictionInformationResponse restrictionInformationResponse = (RestrictionInformationResponse) o;
    return Objects.equals(this.hasUnmetAccessRequirement, restrictionInformationResponse.hasUnmetAccessRequirement) &&
        Objects.equals(this.restrictionLevel, restrictionInformationResponse.restrictionLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasUnmetAccessRequirement, restrictionLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestrictionInformationResponse {\n");
    
    sb.append("    hasUnmetAccessRequirement: ").append(toIndentedString(hasUnmetAccessRequirement)).append("\n");
    sb.append("    restrictionLevel: ").append(toIndentedString(restrictionLevel)).append("\n");
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

