package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ObjectType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Reference to a WikiPage
 */
@ApiModel(description = "Reference to a WikiPage")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class WikiPageKey   {
  @JsonProperty("ownerObjectId")
  private String ownerObjectId;

  @JsonProperty("ownerObjectType")
  private ObjectType ownerObjectType;

  @JsonProperty("wikiPageId")
  private String wikiPageId;

  public WikiPageKey ownerObjectId(String ownerObjectId) {
    this.ownerObjectId = ownerObjectId;
    return this;
  }

  /**
   * The owner of this page.
   * @return ownerObjectId
  */
  @ApiModelProperty(value = "The owner of this page.")


  public String getOwnerObjectId() {
    return ownerObjectId;
  }

  public void setOwnerObjectId(String ownerObjectId) {
    this.ownerObjectId = ownerObjectId;
  }

  public WikiPageKey ownerObjectType(ObjectType ownerObjectType) {
    this.ownerObjectType = ownerObjectType;
    return this;
  }

  /**
   * Get ownerObjectType
   * @return ownerObjectType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ObjectType getOwnerObjectType() {
    return ownerObjectType;
  }

  public void setOwnerObjectType(ObjectType ownerObjectType) {
    this.ownerObjectType = ownerObjectType;
  }

  public WikiPageKey wikiPageId(String wikiPageId) {
    this.wikiPageId = wikiPageId;
    return this;
  }

  /**
   * The ID of the wiki page.
   * @return wikiPageId
  */
  @ApiModelProperty(value = "The ID of the wiki page.")


  public String getWikiPageId() {
    return wikiPageId;
  }

  public void setWikiPageId(String wikiPageId) {
    this.wikiPageId = wikiPageId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WikiPageKey wikiPageKey = (WikiPageKey) o;
    return Objects.equals(this.ownerObjectId, wikiPageKey.ownerObjectId) &&
        Objects.equals(this.ownerObjectType, wikiPageKey.ownerObjectType) &&
        Objects.equals(this.wikiPageId, wikiPageKey.wikiPageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ownerObjectId, ownerObjectType, wikiPageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WikiPageKey {\n");
    
    sb.append("    ownerObjectId: ").append(toIndentedString(ownerObjectId)).append("\n");
    sb.append("    ownerObjectType: ").append(toIndentedString(ownerObjectType)).append("\n");
    sb.append("    wikiPageId: ").append(toIndentedString(wikiPageId)).append("\n");
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

