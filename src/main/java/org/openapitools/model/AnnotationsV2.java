package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.AnnotationsValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Annotations are additional key-value pair metadata that are associated with an object.
 */
@ApiModel(description = "Annotations are additional key-value pair metadata that are associated with an object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AnnotationsV2   {
  @JsonProperty("annotations")
  @Valid
  private Map<String, AnnotationsValue> annotations = null;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  public AnnotationsV2 annotations(Map<String, AnnotationsValue> annotations) {
    this.annotations = annotations;
    return this;
  }

  public AnnotationsV2 putAnnotationsItem(String key, AnnotationsValue annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

  /**
   * Additional metadata associated with the object. The key is the name of your desired annotations. The value is an object containing a list of string values (use empty list to represent no values for key) and the value type associated with all values in the list
   * @return annotations
  */
  @ApiModelProperty(value = "Additional metadata associated with the object. The key is the name of your desired annotations. The value is an object containing a list of string values (use empty list to represent no values for key) and the value type associated with all values in the list")

  @Valid

  public Map<String, AnnotationsValue> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, AnnotationsValue> annotations) {
    this.annotations = annotations;
  }

  public AnnotationsV2 etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Etag of the object to which this annotation belongs. To update an AnnotationV2, this field must match the current etag on the object.
   * @return etag
  */
  @ApiModelProperty(value = "Etag of the object to which this annotation belongs. To update an AnnotationV2, this field must match the current etag on the object.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public AnnotationsV2 id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the object to which this annotation belongs
   * @return id
  */
  @ApiModelProperty(value = "ID of the object to which this annotation belongs")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnnotationsV2 annotationsV2 = (AnnotationsV2) o;
    return Objects.equals(this.annotations, annotationsV2.annotations) &&
        Objects.equals(this.etag, annotationsV2.etag) &&
        Objects.equals(this.id, annotationsV2.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, etag, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnnotationsV2 {\n");
    
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

