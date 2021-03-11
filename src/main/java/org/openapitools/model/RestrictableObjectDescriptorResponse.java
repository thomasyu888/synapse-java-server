package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.RestrictableObjectDescriptor;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A page of subjects
 */
@ApiModel(description = "A page of subjects")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class RestrictableObjectDescriptorResponse   {
  @JsonProperty("nextPageToken")
  private String nextPageToken;

  @JsonProperty("subjects")
  @Valid
  private List<RestrictableObjectDescriptor> subjects = null;

  public RestrictableObjectDescriptorResponse nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Token that can be used to get the next page. Null if there are no more results.
   * @return nextPageToken
  */
  @ApiModelProperty(value = "Token that can be used to get the next page. Null if there are no more results.")


  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public RestrictableObjectDescriptorResponse subjects(List<RestrictableObjectDescriptor> subjects) {
    this.subjects = subjects;
    return this;
  }

  public RestrictableObjectDescriptorResponse addSubjectsItem(RestrictableObjectDescriptor subjectsItem) {
    if (this.subjects == null) {
      this.subjects = new ArrayList<>();
    }
    this.subjects.add(subjectsItem);
    return this;
  }

  /**
   * a page of subjects
   * @return subjects
  */
  @ApiModelProperty(value = "a page of subjects")

  @Valid

  public List<RestrictableObjectDescriptor> getSubjects() {
    return subjects;
  }

  public void setSubjects(List<RestrictableObjectDescriptor> subjects) {
    this.subjects = subjects;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestrictableObjectDescriptorResponse restrictableObjectDescriptorResponse = (RestrictableObjectDescriptorResponse) o;
    return Objects.equals(this.nextPageToken, restrictableObjectDescriptorResponse.nextPageToken) &&
        Objects.equals(this.subjects, restrictableObjectDescriptorResponse.subjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, subjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestrictableObjectDescriptorResponse {\n");
    
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    subjects: ").append(toIndentedString(subjects)).append("\n");
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

