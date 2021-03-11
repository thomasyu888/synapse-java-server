package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DoiCreator;
import org.openapitools.model.DoiResourceType;
import org.openapitools.model.DoiTitle;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DoiAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class DoiAllOf   {
  @JsonProperty("creators")
  @Valid
  private List<DoiCreator> creators = null;

  @JsonProperty("publicationYear")
  private Integer publicationYear;

  @JsonProperty("resourceType")
  private DoiResourceType resourceType;

  @JsonProperty("titles")
  @Valid
  private List<DoiTitle> titles = null;

  public DoiAllOf creators(List<DoiCreator> creators) {
    this.creators = creators;
    return this;
  }

  public DoiAllOf addCreatorsItem(DoiCreator creatorsItem) {
    if (this.creators == null) {
      this.creators = new ArrayList<>();
    }
    this.creators.add(creatorsItem);
    return this;
  }

  /**
   * The main researchers involved in producing the data, or the authors of the publication, in priority order. 
   * @return creators
  */
  @ApiModelProperty(value = "The main researchers involved in producing the data, or the authors of the publication, in priority order. ")

  @Valid

  public List<DoiCreator> getCreators() {
    return creators;
  }

  public void setCreators(List<DoiCreator> creators) {
    this.creators = creators;
  }

  public DoiAllOf publicationYear(Integer publicationYear) {
    this.publicationYear = publicationYear;
    return this;
  }

  /**
   * The year that this resource became publicly accessible. Must be in YYYY format.
   * @return publicationYear
  */
  @ApiModelProperty(value = "The year that this resource became publicly accessible. Must be in YYYY format.")


  public Integer getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(Integer publicationYear) {
    this.publicationYear = publicationYear;
  }

  public DoiAllOf resourceType(DoiResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   * @return resourceType
  */
  @ApiModelProperty(value = "")

  @Valid

  public DoiResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(DoiResourceType resourceType) {
    this.resourceType = resourceType;
  }

  public DoiAllOf titles(List<DoiTitle> titles) {
    this.titles = titles;
    return this;
  }

  public DoiAllOf addTitlesItem(DoiTitle titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

  /**
   * A name or title by which a resource is known.
   * @return titles
  */
  @ApiModelProperty(value = "A name or title by which a resource is known.")

  @Valid

  public List<DoiTitle> getTitles() {
    return titles;
  }

  public void setTitles(List<DoiTitle> titles) {
    this.titles = titles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoiAllOf doiAllOf = (DoiAllOf) o;
    return Objects.equals(this.creators, doiAllOf.creators) &&
        Objects.equals(this.publicationYear, doiAllOf.publicationYear) &&
        Objects.equals(this.resourceType, doiAllOf.resourceType) &&
        Objects.equals(this.titles, doiAllOf.titles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creators, publicationYear, resourceType, titles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoiAllOf {\n");
    
    sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
    sb.append("    publicationYear: ").append(toIndentedString(publicationYear)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
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

