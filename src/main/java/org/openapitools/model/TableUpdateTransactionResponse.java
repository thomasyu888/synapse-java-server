package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.TableUpdateResponse;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An AsynchronousResponseBody returned from a table update transaction.
 */
@ApiModel(description = "An AsynchronousResponseBody returned from a table update transaction.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class TableUpdateTransactionResponse   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("results")
  @Valid
  private List<TableUpdateResponse> results = null;

  @JsonProperty("snapshotVersionNumber")
  private BigDecimal snapshotVersionNumber;

  public TableUpdateTransactionResponse concreteType(String concreteType) {
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

  public TableUpdateTransactionResponse results(List<TableUpdateResponse> results) {
    this.results = results;
    return this;
  }

  public TableUpdateTransactionResponse addResultsItem(TableUpdateResponse resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * List of responses. There will be one response for each request in the transaction.
   * @return results
  */
  @ApiModelProperty(value = "List of responses. There will be one response for each request in the transaction.")

  @Valid

  public List<TableUpdateResponse> getResults() {
    return results;
  }

  public void setResults(List<TableUpdateResponse> results) {
    this.results = results;
  }

  public TableUpdateTransactionResponse snapshotVersionNumber(BigDecimal snapshotVersionNumber) {
    this.snapshotVersionNumber = snapshotVersionNumber;
    return this;
  }

  /**
   * The version number of the snapshot. Returned only, if a new snapshot was requested.
   * @return snapshotVersionNumber
  */
  @ApiModelProperty(value = "The version number of the snapshot. Returned only, if a new snapshot was requested.")

  @Valid

  public BigDecimal getSnapshotVersionNumber() {
    return snapshotVersionNumber;
  }

  public void setSnapshotVersionNumber(BigDecimal snapshotVersionNumber) {
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
    TableUpdateTransactionResponse tableUpdateTransactionResponse = (TableUpdateTransactionResponse) o;
    return Objects.equals(this.concreteType, tableUpdateTransactionResponse.concreteType) &&
        Objects.equals(this.results, tableUpdateTransactionResponse.results) &&
        Objects.equals(this.snapshotVersionNumber, tableUpdateTransactionResponse.snapshotVersionNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, results, snapshotVersionNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableUpdateTransactionResponse {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

