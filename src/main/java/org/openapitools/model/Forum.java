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
 * A Forum schema
 */
@ApiModel(description = "A Forum schema")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Forum   {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("projectId")
  private String projectId;

  public Forum etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time an entity is updated it is used to detect when a client's current representation of an entity is out-of-date. 
   * @return etag
  */
  @ApiModelProperty(value = "Synapse employs an Optimistic Concurrency Control (OCC) scheme to handle concurrent updates. Since the E-Tag changes every time an entity is updated it is used to detect when a client's current representation of an entity is out-of-date. ")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public Forum id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of this object
   * @return id
  */
  @ApiModelProperty(value = "The ID of this object")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Forum projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The ID of the project to which this forum belongs. This ID may or may not start with prefix 'syn'. 
   * @return projectId
  */
  @ApiModelProperty(value = "The ID of the project to which this forum belongs. This ID may or may not start with prefix 'syn'. ")


  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Forum forum = (Forum) o;
    return Objects.equals(this.etag, forum.etag) &&
        Objects.equals(this.id, forum.id) &&
        Objects.equals(this.projectId, forum.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, id, projectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Forum {\n");
    
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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

