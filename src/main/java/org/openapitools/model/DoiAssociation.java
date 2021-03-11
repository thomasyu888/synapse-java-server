package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ObjectType;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * All fields that associate a Synapse object with a DOI. The objectId and objectType are required to create or mint a DOI in all circumstances. 
 */
@ApiModel(description = "All fields that associate a Synapse object with a DOI. The objectId and objectType are required to create or mint a DOI in all circumstances. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "objectId", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Doi.class, name = "Doi"),
})

public class DoiAssociation   {
  @JsonProperty("associatedBy")
  private String associatedBy;

  @JsonProperty("associatedOn")
  private String associatedOn;

  @JsonProperty("associationId")
  private String associationId;

  @JsonProperty("doiUri")
  private String doiUri;

  @JsonProperty("doiUrl")
  private String doiUrl;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("objectId")
  private String objectId;

  @JsonProperty("objectType")
  private ObjectType objectType;

  @JsonProperty("objectVersion")
  private Integer objectVersion;

  @JsonProperty("updatedBy")
  private String updatedBy;

  @JsonProperty("updatedOn")
  private String updatedOn;

  public DoiAssociation associatedBy(String associatedBy) {
    this.associatedBy = associatedBy;
    return this;
  }

  /**
   * The ID of the user that creates this DOI. Provided by Synapse.
   * @return associatedBy
  */
  @ApiModelProperty(value = "The ID of the user that creates this DOI. Provided by Synapse.")


  public String getAssociatedBy() {
    return associatedBy;
  }

  public void setAssociatedBy(String associatedBy) {
    this.associatedBy = associatedBy;
  }

  public DoiAssociation associatedOn(String associatedOn) {
    this.associatedOn = associatedOn;
    return this;
  }

  /**
   * The date time this DOI is first created. Provided by Synapse.
   * @return associatedOn
  */
  @ApiModelProperty(value = "The date time this DOI is first created. Provided by Synapse.")


  public String getAssociatedOn() {
    return associatedOn;
  }

  public void setAssociatedOn(String associatedOn) {
    this.associatedOn = associatedOn;
  }

  public DoiAssociation associationId(String associationId) {
    this.associationId = associationId;
    return this;
  }

  /**
   * The unique ID of this DOI stored in Synapse. Provided by Synapse.
   * @return associationId
  */
  @ApiModelProperty(value = "The unique ID of this DOI stored in Synapse. Provided by Synapse.")


  public String getAssociationId() {
    return associationId;
  }

  public void setAssociationId(String associationId) {
    this.associationId = associationId;
  }

  public DoiAssociation doiUri(String doiUri) {
    this.doiUri = doiUri;
    return this;
  }

  /**
   * The unique URI of this DOI to which the resource can be resolved. Provided by Synapse.
   * @return doiUri
  */
  @ApiModelProperty(value = "The unique URI of this DOI to which the resource can be resolved. Provided by Synapse.")


  public String getDoiUri() {
    return doiUri;
  }

  public void setDoiUri(String doiUri) {
    this.doiUri = doiUri;
  }

  public DoiAssociation doiUrl(String doiUrl) {
    this.doiUrl = doiUrl;
    return this;
  }

  /**
   * The DOI URL that will point to the Synapse object. Provided by Synapse.
   * @return doiUrl
  */
  @ApiModelProperty(value = "The DOI URL that will point to the Synapse object. Provided by Synapse.")


  public String getDoiUrl() {
    return doiUrl;
  }

  public void setDoiUrl(String doiUrl) {
    this.doiUrl = doiUrl;
  }

  public DoiAssociation etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * For Optimistic Concurrency Control (OCC). Required to successfully update a DOI.
   * @return etag
  */
  @ApiModelProperty(value = "For Optimistic Concurrency Control (OCC). Required to successfully update a DOI.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public DoiAssociation objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

  /**
   * The ID of the digital object in Synapse for which this DOI is created.
   * @return objectId
  */
  @ApiModelProperty(required = true, value = "The ID of the digital object in Synapse for which this DOI is created.")
  @NotNull


  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public DoiAssociation objectType(ObjectType objectType) {
    this.objectType = objectType;
    return this;
  }

  /**
   * Get objectType
   * @return objectType
  */
  @ApiModelProperty(value = "")

  @Valid

  public ObjectType getObjectType() {
    return objectType;
  }

  public void setObjectType(ObjectType objectType) {
    this.objectType = objectType;
  }

  public DoiAssociation objectVersion(Integer objectVersion) {
    this.objectVersion = objectVersion;
    return this;
  }

  /**
   * The version of the digital object. When null, the DOI is associated with the current version of the object.
   * @return objectVersion
  */
  @ApiModelProperty(value = "The version of the digital object. When null, the DOI is associated with the current version of the object.")


  public Integer getObjectVersion() {
    return objectVersion;
  }

  public void setObjectVersion(Integer objectVersion) {
    this.objectVersion = objectVersion;
  }

  public DoiAssociation updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * The ID of the user that last updated this DOI. Provided by Synapse.
   * @return updatedBy
  */
  @ApiModelProperty(value = "The ID of the user that last updated this DOI. Provided by Synapse.")


  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public DoiAssociation updatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
    return this;
  }

  /**
   * The date time this DOI is last updated. Provided by Synapse.
   * @return updatedOn
  */
  @ApiModelProperty(value = "The date time this DOI is last updated. Provided by Synapse.")


  public String getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(String updatedOn) {
    this.updatedOn = updatedOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DoiAssociation doiAssociation = (DoiAssociation) o;
    return Objects.equals(this.associatedBy, doiAssociation.associatedBy) &&
        Objects.equals(this.associatedOn, doiAssociation.associatedOn) &&
        Objects.equals(this.associationId, doiAssociation.associationId) &&
        Objects.equals(this.doiUri, doiAssociation.doiUri) &&
        Objects.equals(this.doiUrl, doiAssociation.doiUrl) &&
        Objects.equals(this.etag, doiAssociation.etag) &&
        Objects.equals(this.objectId, doiAssociation.objectId) &&
        Objects.equals(this.objectType, doiAssociation.objectType) &&
        Objects.equals(this.objectVersion, doiAssociation.objectVersion) &&
        Objects.equals(this.updatedBy, doiAssociation.updatedBy) &&
        Objects.equals(this.updatedOn, doiAssociation.updatedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedBy, associatedOn, associationId, doiUri, doiUrl, etag, objectId, objectType, objectVersion, updatedBy, updatedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DoiAssociation {\n");
    
    sb.append("    associatedBy: ").append(toIndentedString(associatedBy)).append("\n");
    sb.append("    associatedOn: ").append(toIndentedString(associatedOn)).append("\n");
    sb.append("    associationId: ").append(toIndentedString(associationId)).append("\n");
    sb.append("    doiUri: ").append(toIndentedString(doiUri)).append("\n");
    sb.append("    doiUrl: ").append(toIndentedString(doiUrl)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    objectVersion: ").append(toIndentedString(objectVersion)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedOn: ").append(toIndentedString(updatedOn)).append("\n");
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

