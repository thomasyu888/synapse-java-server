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
 * A request to convert an ACTAccessRequirement to a ManagedACTAccessRequirement.
 */
@ApiModel(description = "A request to convert an ACTAccessRequirement to a ManagedACTAccessRequirement.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AccessRequirementConversionRequest   {
  @JsonProperty("accessRequirementId")
  private String accessRequirementId;

  @JsonProperty("currentVersion")
  private BigDecimal currentVersion;

  @JsonProperty("etag")
  private String etag;

  public AccessRequirementConversionRequest accessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
    return this;
  }

  /**
   * The ID of an ACTAccessRequirement.
   * @return accessRequirementId
  */
  @ApiModelProperty(value = "The ID of an ACTAccessRequirement.")


  public String getAccessRequirementId() {
    return accessRequirementId;
  }

  public void setAccessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
  }

  public AccessRequirementConversionRequest currentVersion(BigDecimal currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

  /**
   * The current version of the AccessRequirement. This field is used for concurrency check.
   * @return currentVersion
  */
  @ApiModelProperty(value = "The current version of the AccessRequirement. This field is used for concurrency check.")

  @Valid

  public BigDecimal getCurrentVersion() {
    return currentVersion;
  }

  public void setCurrentVersion(BigDecimal currentVersion) {
    this.currentVersion = currentVersion;
  }

  public AccessRequirementConversionRequest etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The etag of the AccessRequirement. This field is used for concurrency check.
   * @return etag
  */
  @ApiModelProperty(value = "The etag of the AccessRequirement. This field is used for concurrency check.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessRequirementConversionRequest accessRequirementConversionRequest = (AccessRequirementConversionRequest) o;
    return Objects.equals(this.accessRequirementId, accessRequirementConversionRequest.accessRequirementId) &&
        Objects.equals(this.currentVersion, accessRequirementConversionRequest.currentVersion) &&
        Objects.equals(this.etag, accessRequirementConversionRequest.etag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementId, currentVersion, etag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRequirementConversionRequest {\n");
    
    sb.append("    accessRequirementId: ").append(toIndentedString(accessRequirementId)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
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

