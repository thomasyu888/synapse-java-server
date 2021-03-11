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
 * The response for a batch SubmissionStatus upload.
 */
@ApiModel(description = "The response for a batch SubmissionStatus upload.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class BatchUploadResponse   {
  @JsonProperty("nextUploadToken")
  private String nextUploadToken;

  public BatchUploadResponse nextUploadToken(String nextUploadToken) {
    this.nextUploadToken = nextUploadToken;
    return this;
  }

  /**
   * The token required to be sent with the subsequent batch.
   * @return nextUploadToken
  */
  @ApiModelProperty(value = "The token required to be sent with the subsequent batch.")


  public String getNextUploadToken() {
    return nextUploadToken;
  }

  public void setNextUploadToken(String nextUploadToken) {
    this.nextUploadToken = nextUploadToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUploadResponse batchUploadResponse = (BatchUploadResponse) o;
    return Objects.equals(this.nextUploadToken, batchUploadResponse.nextUploadToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextUploadToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUploadResponse {\n");
    
    sb.append("    nextUploadToken: ").append(toIndentedString(nextUploadToken)).append("\n");
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

