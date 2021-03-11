package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DataType;
import org.openapitools.model.ObjectType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response for an Object&#39;s DataType. 
 */
@ApiModel(description = "Response for an Object's DataType. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class DataTypeResponse   {
  @JsonProperty("dataType")
  private DataType dataType;

  @JsonProperty("objectId")
  private String objectId;

  @JsonProperty("objectType")
  private ObjectType objectType;

  @JsonProperty("updatedBy")
  private String updatedBy;

  @JsonProperty("updatedOn")
  private String updatedOn;

  public DataTypeResponse dataType(DataType dataType) {
    this.dataType = dataType;
    return this;
  }

  /**
   * Get dataType
   * @return dataType
  */
  @ApiModelProperty(value = "")

  @Valid

  public DataType getDataType() {
    return dataType;
  }

  public void setDataType(DataType dataType) {
    this.dataType = dataType;
  }

  public DataTypeResponse objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The ID of the object.
   * @return objectId
  */
  @ApiModelProperty(value = "The ID of the object.")


  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public DataTypeResponse objectType(ObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Get objectType
   * @return objectType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ObjectType getObjectType() {
    return objectType;
  }

  public void setObjectType(ObjectType objectType) {
    this.objectType = objectType;
  }

  public DataTypeResponse updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * The user that last updated this object's DataType. 
   * @return updatedBy
  */
  @ApiModelProperty(value = "The user that last updated this object's DataType. ")


  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public DataTypeResponse updatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

  /**
   * The date this object's DataType was last updated. 
   * @return updatedOn
  */
  @ApiModelProperty(value = "The date this object's DataType was last updated. ")


  public String getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataTypeResponse dataTypeResponse = (DataTypeResponse) o;
    return Objects.equals(this.dataType, dataTypeResponse.dataType) &&
        Objects.equals(this.objectId, dataTypeResponse.objectId) &&
        Objects.equals(this.objectType, dataTypeResponse.objectType) &&
        Objects.equals(this.updatedBy, dataTypeResponse.updatedBy) &&
        Objects.equals(this.updatedOn, dataTypeResponse.updatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, objectId, objectType, updatedBy, updatedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataTypeResponse {\n");
    
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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

