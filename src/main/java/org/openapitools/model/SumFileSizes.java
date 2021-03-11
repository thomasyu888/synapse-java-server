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
 * The sum of the file size for all files in the given view query. Use mask &#x3D; 0x40 to include in the bundle. 
 */
@ApiModel(description = "The sum of the file size for all files in the given view query. Use mask = 0x40 to include in the bundle. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class SumFileSizes   {
  @JsonProperty("greaterThan")
  private Boolean greaterThan;

  @JsonProperty("sumFileSizesBytes")
  private Integer sumFileSizesBytes;

  public SumFileSizes greaterThan(Boolean greaterThan) {
    this.greaterThan = greaterThan;
    return this;
  }

  /**
   * When true, the actual sum of the files sizes is greater than the value provided with 'sumFileSizesBytes'. When false, the actual sum of the files sizes is equlas the value provided with 'sumFileSizesBytes' 
   * @return greaterThan
  */
  @ApiModelProperty(value = "When true, the actual sum of the files sizes is greater than the value provided with 'sumFileSizesBytes'. When false, the actual sum of the files sizes is equlas the value provided with 'sumFileSizesBytes' ")


  public Boolean getGreaterThan() {
    return greaterThan;
  }

  public void setGreaterThan(Boolean greaterThan) {
    this.greaterThan = greaterThan;
  }

  public SumFileSizes sumFileSizesBytes(Integer sumFileSizesBytes) {
    this.sumFileSizesBytes = sumFileSizesBytes;
    return this;
  }

  /**
   * The sum of the file size in bytes.
   * @return sumFileSizesBytes
  */
  @ApiModelProperty(value = "The sum of the file size in bytes.")


  public Integer getSumFileSizesBytes() {
    return sumFileSizesBytes;
  }

  public void setSumFileSizesBytes(Integer sumFileSizesBytes) {
    this.sumFileSizesBytes = sumFileSizesBytes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SumFileSizes sumFileSizes = (SumFileSizes) o;
    return Objects.equals(this.greaterThan, sumFileSizes.greaterThan) &&
        Objects.equals(this.sumFileSizesBytes, sumFileSizes.sumFileSizesBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(greaterThan, sumFileSizesBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SumFileSizes {\n");
    
    sb.append("    greaterThan: ").append(toIndentedString(greaterThan)).append("\n");
    sb.append("    sumFileSizesBytes: ").append(toIndentedString(sumFileSizesBytes)).append("\n");
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

