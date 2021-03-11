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
 * JSON schema for UserGroup POJO
 */
@ApiModel(description = "JSON schema for UserGroup POJO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class UserGroup   {
  @JsonProperty("creationDate")
  private String creationDate;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("isIndividual")
  private Boolean isIndividual;

  @JsonProperty("uri")
  private String uri;

  public UserGroup creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * The date this user or group was created.
   * @return creationDate
  */
  @ApiModelProperty(value = "The date this user or group was created.")


  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public UserGroup etag(String etag) {
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

  public UserGroup id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of either the user or group.
   * @return id
  */
  @ApiModelProperty(value = "The id of either the user or group.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UserGroup isIndividual(Boolean isIndividual) {
    this.isIndividual = isIndividual;
    return this;
  }

  /**
   * True if this is a user, false if it is a group
   * @return isIndividual
  */
  @ApiModelProperty(value = "True if this is a user, false if it is a group")


  public Boolean getIsIndividual() {
    return isIndividual;
  }

  public void setIsIndividual(Boolean isIndividual) {
    this.isIndividual = isIndividual;
  }

  public UserGroup uri(String uri) {
    this.uri = uri;
    return this;
  }

  /**
   * Uri
   * @return uri
  */
  @ApiModelProperty(value = "Uri")


  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserGroup userGroup = (UserGroup) o;
    return Objects.equals(this.creationDate, userGroup.creationDate) &&
        Objects.equals(this.etag, userGroup.etag) &&
        Objects.equals(this.id, userGroup.id) &&
        Objects.equals(this.isIndividual, userGroup.isIndividual) &&
        Objects.equals(this.uri, userGroup.uri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationDate, etag, id, isIndividual, uri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserGroup {\n");
    
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isIndividual: ").append(toIndentedString(isIndividual)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
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

