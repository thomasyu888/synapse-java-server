package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.SnapshotRequest;
import org.openapitools.model.TableUpdateRequest;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An AsynchronousRequestBody to used make multiple changes to a table as a single &#39;transaction&#39;. All changes will either succeed or fail as a unit. 
 */
@ApiModel(description = "An AsynchronousRequestBody to used make multiple changes to a table as a single 'transaction'. All changes will either succeed or fail as a unit. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class TableUpdateTransactionRequest   {
  @JsonProperty("changes")
  @Valid
  private List<TableUpdateRequest> changes = null;

  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("createSnapshot")
  private Boolean createSnapshot;

  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("snapshotOptions")
  private SnapshotRequest snapshotOptions;

  public TableUpdateTransactionRequest changes(List<TableUpdateRequest> changes) {
    this.changes = changes;
    return this;
  }

  public TableUpdateTransactionRequest addChangesItem(TableUpdateRequest changesItem) {
    if (this.changes == null) {
      this.changes = new ArrayList<>();
    }
    this.changes.add(changesItem);
    return this;
  }

  /**
   * List of changes that describes schema and/or row changes to a table.
   * @return changes
  */
  @ApiModelProperty(value = "List of changes that describes schema and/or row changes to a table.")

  @Valid

  public List<TableUpdateRequest> getChanges() {
    return changes;
  }

  public void setChanges(List<TableUpdateRequest> changes) {
    this.changes = changes;
  }

  public TableUpdateTransactionRequest concreteType(String concreteType) {
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

  public TableUpdateTransactionRequest createSnapshot(Boolean createSnapshot) {
    this.createSnapshot = createSnapshot;
    return this;
  }

  /**
   * When set to 'true', a snapshot of the table will be created after the change from this transaction request are applied to the table. 
   * @return createSnapshot
  */
  @ApiModelProperty(value = "When set to 'true', a snapshot of the table will be created after the change from this transaction request are applied to the table. ")


  public Boolean getCreateSnapshot() {
    return createSnapshot;
  }

  public void setCreateSnapshot(Boolean createSnapshot) {
    this.createSnapshot = createSnapshot;
  }

  public TableUpdateTransactionRequest entityId(String entityId) {
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

  public TableUpdateTransactionRequest snapshotOptions(SnapshotRequest snapshotOptions) {
    this.snapshotOptions = snapshotOptions;
    return this;
  }

  /**
   * Get snapshotOptions
   * @return snapshotOptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public SnapshotRequest getSnapshotOptions() {
    return snapshotOptions;
  }

  public void setSnapshotOptions(SnapshotRequest snapshotOptions) {
    this.snapshotOptions = snapshotOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableUpdateTransactionRequest tableUpdateTransactionRequest = (TableUpdateTransactionRequest) o;
    return Objects.equals(this.changes, tableUpdateTransactionRequest.changes) &&
        Objects.equals(this.concreteType, tableUpdateTransactionRequest.concreteType) &&
        Objects.equals(this.createSnapshot, tableUpdateTransactionRequest.createSnapshot) &&
        Objects.equals(this.entityId, tableUpdateTransactionRequest.entityId) &&
        Objects.equals(this.snapshotOptions, tableUpdateTransactionRequest.snapshotOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, concreteType, createSnapshot, entityId, snapshotOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableUpdateTransactionRequest {\n");
    
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    createSnapshot: ").append(toIndentedString(createSnapshot)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    snapshotOptions: ").append(toIndentedString(snapshotOptions)).append("\n");
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

