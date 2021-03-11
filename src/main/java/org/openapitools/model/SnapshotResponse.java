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
 * Response to creating a snapshot of a table of view.
 */
@ApiModel(description = "Response to creating a snapshot of a table of view.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SnapshotResponse   {
  @JsonProperty("snapshotVersionNumber")
  private Integer snapshotVersionNumber;

  public SnapshotResponse snapshotVersionNumber(Integer snapshotVersionNumber) {
    this.snapshotVersionNumber = snapshotVersionNumber;
    return this;
  }

  /**
   * The version number of the resulting snapshot.
   * @return snapshotVersionNumber
  */
  @ApiModelProperty(value = "The version number of the resulting snapshot.")


  public Integer getSnapshotVersionNumber() {
    return snapshotVersionNumber;
  }

  public void setSnapshotVersionNumber(Integer snapshotVersionNumber) {
    this.snapshotVersionNumber = snapshotVersionNumber;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotResponse snapshotResponse = (SnapshotResponse) o;
    return Objects.equals(this.snapshotVersionNumber, snapshotResponse.snapshotVersionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotVersionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotResponse {\n");
    
    sb.append("    snapshotVersionNumber: ").append(toIndentedString(snapshotVersionNumber)).append("\n");
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

