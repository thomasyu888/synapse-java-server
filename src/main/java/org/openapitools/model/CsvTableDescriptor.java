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
 * The description of a csv for upload or download.
 */
@ApiModel(description = "The description of a csv for upload or download.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class CsvTableDescriptor   {
  @JsonProperty("escapeCharacter")
  private String escapeCharacter;

  @JsonProperty("isFirstLineHeader")
  private Boolean isFirstLineHeader;

  @JsonProperty("lineEnd")
  private String lineEnd;

  @JsonProperty("quoteCharacter")
  private String quoteCharacter;

  @JsonProperty("separator")
  private String separator;

  public CsvTableDescriptor escapeCharacter(String escapeCharacter) {
    this.escapeCharacter = escapeCharacter;
    return this;
  }

  /**
   * The escape character to be used for escaping a separator or quote in the resulting file. The default character '\\\\' will be used if this is not provided by the caller. 
   * @return escapeCharacter
  */
  @ApiModelProperty(value = "The escape character to be used for escaping a separator or quote in the resulting file. The default character '\\\\' will be used if this is not provided by the caller. ")


  public String getEscapeCharacter() {
    return escapeCharacter;
  }

  public void setEscapeCharacter(String escapeCharacter) {
    this.escapeCharacter = escapeCharacter;
  }

  public CsvTableDescriptor isFirstLineHeader(Boolean isFirstLineHeader) {
    this.isFirstLineHeader = isFirstLineHeader;
    return this;
  }

  /**
   * Is the first line a header? The default value of 'true' will be used if this is not provided by the caller. 
   * @return isFirstLineHeader
  */
  @ApiModelProperty(value = "Is the first line a header? The default value of 'true' will be used if this is not provided by the caller. ")


  public Boolean getIsFirstLineHeader() {
    return isFirstLineHeader;
  }

  public void setIsFirstLineHeader(Boolean isFirstLineHeader) {
    this.isFirstLineHeader = isFirstLineHeader;
  }

  public CsvTableDescriptor lineEnd(String lineEnd) {
    this.lineEnd = lineEnd;
    return this;
  }

  /**
   * The line feed terminator to be used for the resulting file. The default value of '\\n' will be used if this is not provided by the caller. 
   * @return lineEnd
  */
  @ApiModelProperty(value = "The line feed terminator to be used for the resulting file. The default value of '\\n' will be used if this is not provided by the caller. ")


  public String getLineEnd() {
    return lineEnd;
  }

  public void setLineEnd(String lineEnd) {
    this.lineEnd = lineEnd;
  }

  public CsvTableDescriptor quoteCharacter(String quoteCharacter) {
    this.quoteCharacter = quoteCharacter;
    return this;
  }

  /**
   * The character to be used for quoted elements in the resulting file. The default character '\"' will be used if this is not provided by the caller. 
   * @return quoteCharacter
  */
  @ApiModelProperty(value = "The character to be used for quoted elements in the resulting file. The default character '\"' will be used if this is not provided by the caller. ")


  public String getQuoteCharacter() {
    return quoteCharacter;
  }

  public void setQuoteCharacter(String quoteCharacter) {
    this.quoteCharacter = quoteCharacter;
  }

  public CsvTableDescriptor separator(String separator) {
    this.separator = separator;
    return this;
  }

  /**
   * The delimiter to be used for separating entries in the resulting file. The default character ',' will be used if this is not provided by the caller. For tab-separated values use '\\t' 
   * @return separator
  */
  @ApiModelProperty(value = "The delimiter to be used for separating entries in the resulting file. The default character ',' will be used if this is not provided by the caller. For tab-separated values use '\\t' ")


  public String getSeparator() {
    return separator;
  }

  public void setSeparator(String separator) {
    this.separator = separator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsvTableDescriptor csvTableDescriptor = (CsvTableDescriptor) o;
    return Objects.equals(this.escapeCharacter, csvTableDescriptor.escapeCharacter) &&
        Objects.equals(this.isFirstLineHeader, csvTableDescriptor.isFirstLineHeader) &&
        Objects.equals(this.lineEnd, csvTableDescriptor.lineEnd) &&
        Objects.equals(this.quoteCharacter, csvTableDescriptor.quoteCharacter) &&
        Objects.equals(this.separator, csvTableDescriptor.separator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(escapeCharacter, isFirstLineHeader, lineEnd, quoteCharacter, separator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsvTableDescriptor {\n");
    
    sb.append("    escapeCharacter: ").append(toIndentedString(escapeCharacter)).append("\n");
    sb.append("    isFirstLineHeader: ").append(toIndentedString(isFirstLineHeader)).append("\n");
    sb.append("    lineEnd: ").append(toIndentedString(lineEnd)).append("\n");
    sb.append("    quoteCharacter: ").append(toIndentedString(quoteCharacter)).append("\n");
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
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

