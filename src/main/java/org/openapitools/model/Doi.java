package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DoiAllOf;
import org.openapitools.model.DoiAssociation;
import org.openapitools.model.DoiCreator;
import org.openapitools.model.DoiResourceType;
import org.openapitools.model.DoiTitle;
import org.openapitools.model.ObjectType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JSON schema for fields associated with a DOI and its metadata.
 */
@ApiModel(description = "JSON schema for fields associated with a DOI and its metadata.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class Doi extends DoiAssociation  {
  @JsonProperty("creators")
  @Valid
  private List<DoiCreator> creators = new ArrayList<>();

  @JsonProperty("publicationYear")
  private Integer publicationYear;

  @JsonProperty("resourceType")
  private DoiResourceType resourceType;

  @JsonProperty("titles")
  @Valid
  private List<DoiTitle> titles = new ArrayList<>();

  public Doi creators(List<DoiCreator> creators) {
    this.creators = creators;
    return this;
  }

  public Doi addCreatorsItem(DoiCreator creatorsItem) {
    this.creators.add(creatorsItem);
    return this;
  }

  /**
   * The main researchers involved in producing the data, or the authors of the publication, in priority order. 
   * @return creators
  */
  @ApiModelProperty(required = true, value = "The main researchers involved in producing the data, or the authors of the publication, in priority order. ")
  @NotNull

  @Valid

  public List<DoiCreator> getCreators() {
    return creators;
  }

  public void setCreators(List<DoiCreator> creators) {
    this.creators = creators;
  }

  public Doi publicationYear(Integer publicationYear) {
    this.publicationYear = publicationYear;
    return this;
  }

  /**
   * The year that this resource became publicly accessible. Must be in YYYY format.
   * @return publicationYear
  */
  @ApiModelProperty(required = true, value = "The year that this resource became publicly accessible. Must be in YYYY format.")
  @NotNull


  public Integer getPublicationYear() {
    return publicationYear;
  }

  public void setPublicationYear(Integer publicationYear) {
    this.publicationYear = publicationYear;
  }

  public Doi resourceType(DoiResourceType resourceType) {
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

  public Doi titles(List<DoiTitle> titles) {
    this.titles = titles;
    return this;
  }

  public Doi addTitlesItem(DoiTitle titlesItem) {
    this.titles.add(titlesItem);
    return this;
  }

  /**
   * A name or title by which a resource is known.
   * @return titles
  */
  @ApiModelProperty(required = true, value = "A name or title by which a resource is known.")
  @NotNull

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
    Doi doi = (Doi) o;
    return Objects.equals(this.creators, doi.creators) &&
        Objects.equals(this.publicationYear, doi.publicationYear) &&
        Objects.equals(this.resourceType, doi.resourceType) &&
        Objects.equals(this.titles, doi.titles) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creators, publicationYear, resourceType, titles, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Doi {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

