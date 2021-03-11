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
 * Summary statistics for the JSON schema validation results for the children of an Entity container (Project or Folder)
 */
@ApiModel(description = "Summary statistics for the JSON schema validation results for the children of an Entity container (Project or Folder)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class ValidationSummaryStatistics   {
  @JsonProperty("containerId")
  private String containerId;

  @JsonProperty("generatedOn")
  private String generatedOn;

  @JsonProperty("numberOfInvalidChildren")
  private Integer numberOfInvalidChildren;

  @JsonProperty("numberOfUnknownChildren")
  private Integer numberOfUnknownChildren;

  @JsonProperty("numberOfValidChildren")
  private Integer numberOfValidChildren;

  @JsonProperty("totalNumberOfChildren")
  private Integer totalNumberOfChildren;

  public ValidationSummaryStatistics containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

  /**
   * The ID of the container Entity.
   * @return containerId
  */
  @ApiModelProperty(value = "The ID of the container Entity.")


  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public ValidationSummaryStatistics generatedOn(String generatedOn) {
    this.generatedOn = generatedOn;
    return this;
  }

  /**
   * The date-time when the statistics were calculated.
   * @return generatedOn
  */
  @ApiModelProperty(value = "The date-time when the statistics were calculated.")


  public String getGeneratedOn() {
    return generatedOn;
  }

  public void setGeneratedOn(String generatedOn) {
    this.generatedOn = generatedOn;
  }

  public ValidationSummaryStatistics numberOfInvalidChildren(Integer numberOfInvalidChildren) {
    this.numberOfInvalidChildren = numberOfInvalidChildren;
    return this;
  }

  /**
   * The total number of children that are invalid according to their bound JSON schema.
   * @return numberOfInvalidChildren
  */
  @ApiModelProperty(value = "The total number of children that are invalid according to their bound JSON schema.")


  public Integer getNumberOfInvalidChildren() {
    return numberOfInvalidChildren;
  }

  public void setNumberOfInvalidChildren(Integer numberOfInvalidChildren) {
    this.numberOfInvalidChildren = numberOfInvalidChildren;
  }

  public ValidationSummaryStatistics numberOfUnknownChildren(Integer numberOfUnknownChildren) {
    this.numberOfUnknownChildren = numberOfUnknownChildren;
    return this;
  }

  /**
   * The total number of children that do not have validation results. This can occur when a child does not have a bound JSON schema or when a child has not been validated yet.
   * @return numberOfUnknownChildren
  */
  @ApiModelProperty(value = "The total number of children that do not have validation results. This can occur when a child does not have a bound JSON schema or when a child has not been validated yet.")


  public Integer getNumberOfUnknownChildren() {
    return numberOfUnknownChildren;
  }

  public void setNumberOfUnknownChildren(Integer numberOfUnknownChildren) {
    this.numberOfUnknownChildren = numberOfUnknownChildren;
  }

  public ValidationSummaryStatistics numberOfValidChildren(Integer numberOfValidChildren) {
    this.numberOfValidChildren = numberOfValidChildren;
    return this;
  }

  /**
   * The total number of children that are valid according to their bound JSON schema.
   * @return numberOfValidChildren
  */
  @ApiModelProperty(value = "The total number of children that are valid according to their bound JSON schema.")


  public Integer getNumberOfValidChildren() {
    return numberOfValidChildren;
  }

  public void setNumberOfValidChildren(Integer numberOfValidChildren) {
    this.numberOfValidChildren = numberOfValidChildren;
  }

  public ValidationSummaryStatistics totalNumberOfChildren(Integer totalNumberOfChildren) {
    this.totalNumberOfChildren = totalNumberOfChildren;
    return this;
  }

  /**
   * The total number of children in the container.
   * @return totalNumberOfChildren
  */
  @ApiModelProperty(value = "The total number of children in the container.")


  public Integer getTotalNumberOfChildren() {
    return totalNumberOfChildren;
  }

  public void setTotalNumberOfChildren(Integer totalNumberOfChildren) {
    this.totalNumberOfChildren = totalNumberOfChildren;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValidationSummaryStatistics validationSummaryStatistics = (ValidationSummaryStatistics) o;
    return Objects.equals(this.containerId, validationSummaryStatistics.containerId) &&
        Objects.equals(this.generatedOn, validationSummaryStatistics.generatedOn) &&
        Objects.equals(this.numberOfInvalidChildren, validationSummaryStatistics.numberOfInvalidChildren) &&
        Objects.equals(this.numberOfUnknownChildren, validationSummaryStatistics.numberOfUnknownChildren) &&
        Objects.equals(this.numberOfValidChildren, validationSummaryStatistics.numberOfValidChildren) &&
        Objects.equals(this.totalNumberOfChildren, validationSummaryStatistics.totalNumberOfChildren);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerId, generatedOn, numberOfInvalidChildren, numberOfUnknownChildren, numberOfValidChildren, totalNumberOfChildren);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValidationSummaryStatistics {\n");
    
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    generatedOn: ").append(toIndentedString(generatedOn)).append("\n");
    sb.append("    numberOfInvalidChildren: ").append(toIndentedString(numberOfInvalidChildren)).append("\n");
    sb.append("    numberOfUnknownChildren: ").append(toIndentedString(numberOfUnknownChildren)).append("\n");
    sb.append("    numberOfValidChildren: ").append(toIndentedString(numberOfValidChildren)).append("\n");
    sb.append("    totalNumberOfChildren: ").append(toIndentedString(totalNumberOfChildren)).append("\n");
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

