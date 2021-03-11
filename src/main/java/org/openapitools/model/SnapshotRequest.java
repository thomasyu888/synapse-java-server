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
 * Request to create a new snapshot of a table or view. The provided comment, label, and activity ID will be applied to the current version thereby creating a snapshot and locking the current version. After the snapshot is created a new version will be started with an &#39;in-progress&#39; label. 
 */
@ApiModel(description = "Request to create a new snapshot of a table or view. The provided comment, label, and activity ID will be applied to the current version thereby creating a snapshot and locking the current version. After the snapshot is created a new version will be started with an 'in-progress' label. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SnapshotRequest   {
  @JsonProperty("snapshotActivityId")
  private String snapshotActivityId;

  @JsonProperty("snapshotComment")
  private String snapshotComment;

  @JsonProperty("snapshotLabel")
  private String snapshotLabel;

  public SnapshotRequest snapshotActivityId(String snapshotActivityId) {
    this.snapshotActivityId = snapshotActivityId;
    return this;
  }

  /**
   * Optional. If createNewSnapshot=true, the Activity ID to be applied to the snapshot version. Null by default 
   * @return snapshotActivityId
  */
  @ApiModelProperty(value = "Optional. If createNewSnapshot=true, the Activity ID to be applied to the snapshot version. Null by default ")


  public String getSnapshotActivityId() {
    return snapshotActivityId;
  }

  public void setSnapshotActivityId(String snapshotActivityId) {
    this.snapshotActivityId = snapshotActivityId;
  }

  public SnapshotRequest snapshotComment(String snapshotComment) {
    this.snapshotComment = snapshotComment;
    return this;
  }

  /**
   * Optional. If createNewSnapshot=true, the comment to be applied to the snapshot version. Null by default 
   * @return snapshotComment
  */
  @ApiModelProperty(value = "Optional. If createNewSnapshot=true, the comment to be applied to the snapshot version. Null by default ")


  public String getSnapshotComment() {
    return snapshotComment;
  }

  public void setSnapshotComment(String snapshotComment) {
    this.snapshotComment = snapshotComment;
  }

  public SnapshotRequest snapshotLabel(String snapshotLabel) {
    this.snapshotLabel = snapshotLabel;
    return this;
  }

  /**
   * Optional. If createNewSnapshot=true, the label to be applied to the snapshot version. Null by default 
   * @return snapshotLabel
  */
  @ApiModelProperty(value = "Optional. If createNewSnapshot=true, the label to be applied to the snapshot version. Null by default ")


  public String getSnapshotLabel() {
    return snapshotLabel;
  }

  public void setSnapshotLabel(String snapshotLabel) {
    this.snapshotLabel = snapshotLabel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotRequest snapshotRequest = (SnapshotRequest) o;
    return Objects.equals(this.snapshotActivityId, snapshotRequest.snapshotActivityId) &&
        Objects.equals(this.snapshotComment, snapshotRequest.snapshotComment) &&
        Objects.equals(this.snapshotLabel, snapshotRequest.snapshotLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotActivityId, snapshotComment, snapshotLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotRequest {\n");
    
    sb.append("    snapshotActivityId: ").append(toIndentedString(snapshotActivityId)).append("\n");
    sb.append("    snapshotComment: ").append(toIndentedString(snapshotComment)).append("\n");
    sb.append("    snapshotLabel: ").append(toIndentedString(snapshotLabel)).append("\n");
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

