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
 * Next page token for query
 */
@ApiModel(description = "Next page token for query")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class QueryNextPageToken   {
  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("entityId")
  private String entityId;

  @JsonProperty("token")
  private String token;

  public QueryNextPageToken concreteType(String concreteType) {
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

  public QueryNextPageToken entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * The ID of an Entity.
   * @return entityId
  */
  @ApiModelProperty(value = "The ID of an Entity.")


  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public QueryNextPageToken token(String token) {
    this.token = token;
    return this;
  }

  /**
   * The token for the next page.
   * @return token
  */
  @ApiModelProperty(value = "The token for the next page.")


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryNextPageToken queryNextPageToken = (QueryNextPageToken) o;
    return Objects.equals(this.concreteType, queryNextPageToken.concreteType) &&
        Objects.equals(this.entityId, queryNextPageToken.entityId) &&
        Objects.equals(this.token, queryNextPageToken.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concreteType, entityId, token);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryNextPageToken {\n");
    
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

