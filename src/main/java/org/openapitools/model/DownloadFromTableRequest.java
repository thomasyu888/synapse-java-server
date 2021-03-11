package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.CsvTableDescriptor;
import org.openapitools.model.DownloadFromTableRequestAllOf;
import org.openapitools.model.FacetColumnRequest;
import org.openapitools.model.Query;
import org.openapitools.model.SortItem;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A CSV table download request.
 */
@ApiModel(description = "A CSV table download request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class DownloadFromTableRequest extends Query  {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("csvTableDescriptor")
  private CsvTableDescriptor csvTableDescriptor;

  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("includeRowIdAndRowVersion")
  private Boolean includeRowIdAndRowVersion = true;

  @JsonProperty("writeHeader")
  private Boolean writeHeader = true;

  public DownloadFromTableRequest concreteType(String concreteType) {
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

  public DownloadFromTableRequest csvTableDescriptor(CsvTableDescriptor csvTableDescriptor) {
    this.csvTableDescriptor = csvTableDescriptor;
    return this;
  }

  /**
   * Get csvTableDescriptor
   * @return csvTableDescriptor
  */
  @ApiModelProperty(value = "")

  @Valid

  public CsvTableDescriptor getCsvTableDescriptor() {
    return csvTableDescriptor;
  }

  public void setCsvTableDescriptor(CsvTableDescriptor csvTableDescriptor) {
    this.csvTableDescriptor = csvTableDescriptor;
  }

  public DownloadFromTableRequest entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Entity Id
   * @return entityId
  */
  @ApiModelProperty(value = "Entity Id")


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public DownloadFromTableRequest includeRowIdAndRowVersion(Boolean includeRowIdAndRowVersion) {
    this.includeRowIdAndRowVersion = includeRowIdAndRowVersion;
    return this;
  }

  /**
   * Should the first two columns contain the row ID and row version? The default value is 'true'. 
   * @return includeRowIdAndRowVersion
  */
  @ApiModelProperty(value = "Should the first two columns contain the row ID and row version? The default value is 'true'. ")


  public Boolean getIncludeRowIdAndRowVersion() {
    return includeRowIdAndRowVersion;
  }

  public void setIncludeRowIdAndRowVersion(Boolean includeRowIdAndRowVersion) {
    this.includeRowIdAndRowVersion = includeRowIdAndRowVersion;
  }

  public DownloadFromTableRequest writeHeader(Boolean writeHeader) {
    this.writeHeader = writeHeader;
    return this;
  }

  /**
   * Should the first line contain the columns names as a header in the resulting file? Set to 'true' to include the headers else, 'false'. The default value is 'true'. 
   * @return writeHeader
  */
  @ApiModelProperty(value = "Should the first line contain the columns names as a header in the resulting file? Set to 'true' to include the headers else, 'false'. The default value is 'true'. ")


  public Boolean getWriteHeader() {
    return writeHeader;
  }

  public void setWriteHeader(Boolean writeHeader) {
    this.writeHeader = writeHeader;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DownloadFromTableRequest downloadFromTableRequest = (DownloadFromTableRequest) o;
    return Objects.equals(this.concreteType, downloadFromTableRequest.concreteType) &&
        Objects.equals(this.csvTableDescriptor, downloadFromTableRequest.csvTableDescriptor) &&
        Objects.equals(this.entityId, downloadFromTableRequest.entityId) &&
        Objects.equals(this.includeRowIdAndRowVersion, downloadFromTableRequest.includeRowIdAndRowVersion) &&
        Objects.equals(this.writeHeader, downloadFromTableRequest.writeHeader) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, csvTableDescriptor, entityId, includeRowIdAndRowVersion, writeHeader, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DownloadFromTableRequest {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    csvTableDescriptor: ").append(toIndentedString(csvTableDescriptor)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    includeRowIdAndRowVersion: ").append(toIndentedString(includeRowIdAndRowVersion)).append("\n");
    sb.append("    writeHeader: ").append(toIndentedString(writeHeader)).append("\n");
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

