package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DoubleAnnotation;
import org.openapitools.model.LongAnnotation;
import org.openapitools.model.StringAnnotation;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Primary container object for Annotations on a Synapse object
 */
@ApiModel(description = "Primary container object for Annotations on a Synapse object")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AnnotationsAnnotation   {
  @JsonProperty("doubleAnnos")
  @Valid
  private List<DoubleAnnotation> doubleAnnos = null;

  @JsonProperty("longAnnos")
  @Valid
  private List<LongAnnotation> longAnnos = null;

  @JsonProperty("objectId")
  private String objectId;

  @JsonProperty("scopeId")
  private String scopeId;

  @JsonProperty("stringAnnos")
  @Valid
  private List<StringAnnotation> stringAnnos = null;

  @JsonProperty("version")
  private Integer version;

  public AnnotationsAnnotation doubleAnnos(List<DoubleAnnotation> doubleAnnos) {
    this.doubleAnnos = doubleAnnos;
    return this;
  }

  public AnnotationsAnnotation addDoubleAnnosItem(DoubleAnnotation doubleAnnosItem) {
    if (this.doubleAnnos == null) {
      this.doubleAnnos = new ArrayList<>();
    }
    this.doubleAnnos.add(doubleAnnosItem);
    return this;
  }

  /**
   * A list of DoubleAnnnotations
   * @return doubleAnnos
  */
  @ApiModelProperty(value = "A list of DoubleAnnnotations")

  @Valid

  public List<DoubleAnnotation> getDoubleAnnos() {
    return doubleAnnos;
  }

  public void setDoubleAnnos(List<DoubleAnnotation> doubleAnnos) {
    this.doubleAnnos = doubleAnnos;
  }

  public AnnotationsAnnotation longAnnos(List<LongAnnotation> longAnnos) {
    this.longAnnos = longAnnos;
    return this;
  }

  public AnnotationsAnnotation addLongAnnosItem(LongAnnotation longAnnosItem) {
    if (this.longAnnos == null) {
      this.longAnnos = new ArrayList<>();
    }
    this.longAnnos.add(longAnnosItem);
    return this;
  }

  /**
   * A list of LongAnnnotations
   * @return longAnnos
  */
  @ApiModelProperty(value = "A list of LongAnnnotations")

  @Valid

  public List<LongAnnotation> getLongAnnos() {
    return longAnnos;
  }

  public void setLongAnnos(List<LongAnnotation> longAnnos) {
    this.longAnnos = longAnnos;
  }

  public AnnotationsAnnotation objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The Synapse ID of the object with which these Annotations are associated
   * @return objectId
  */
  @ApiModelProperty(value = "The Synapse ID of the object with which these Annotations are associated")


  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public AnnotationsAnnotation scopeId(String scopeId) {
    this.scopeId = scopeId;
    return this;
  }

  /**
   * The Synapse ID of the umbrella object above the object with which these Annotations are associated
   * @return scopeId
  */
  @ApiModelProperty(value = "The Synapse ID of the umbrella object above the object with which these Annotations are associated")


  public String getScopeId() {
    return scopeId;
  }

  public void setScopeId(String scopeId) {
    this.scopeId = scopeId;
  }

  public AnnotationsAnnotation stringAnnos(List<StringAnnotation> stringAnnos) {
    this.stringAnnos = stringAnnos;
    return this;
  }

  public AnnotationsAnnotation addStringAnnosItem(StringAnnotation stringAnnosItem) {
    if (this.stringAnnos == null) {
      this.stringAnnos = new ArrayList<>();
    }
    this.stringAnnos.add(stringAnnosItem);
    return this;
  }

  /**
   * A list of StringAnnnotations
   * @return stringAnnos
  */
  @ApiModelProperty(value = "A list of StringAnnnotations")

  @Valid

  public List<StringAnnotation> getStringAnnos() {
    return stringAnnos;
  }

  public void setStringAnnos(List<StringAnnotation> stringAnnos) {
    this.stringAnnos = stringAnnos;
  }

  public AnnotationsAnnotation version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The system controlled version of this collection of annotations
   * @return version
  */
  @ApiModelProperty(value = "The system controlled version of this collection of annotations")


  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationsAnnotation annotationsAnnotation = (AnnotationsAnnotation) o;
    return Objects.equals(this.doubleAnnos, annotationsAnnotation.doubleAnnos) &&
        Objects.equals(this.longAnnos, annotationsAnnotation.longAnnos) &&
        Objects.equals(this.objectId, annotationsAnnotation.objectId) &&
        Objects.equals(this.scopeId, annotationsAnnotation.scopeId) &&
        Objects.equals(this.stringAnnos, annotationsAnnotation.stringAnnos) &&
        Objects.equals(this.version, annotationsAnnotation.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doubleAnnos, longAnnos, objectId, scopeId, stringAnnos, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationsAnnotation {\n");
    
    sb.append("    doubleAnnos: ").append(toIndentedString(doubleAnnos)).append("\n");
    sb.append("    longAnnos: ").append(toIndentedString(longAnnos)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    scopeId: ").append(toIndentedString(scopeId)).append("\n");
    sb.append("    stringAnnos: ").append(toIndentedString(stringAnnos)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

