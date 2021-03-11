package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.AccessorChange;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * This is the base interface that all Request implements.
 */
@ApiModel(description = "This is the base interface that all Request implements.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class RequestInterface   {
  @JsonProperty("accessRequirementId")
  private String accessRequirementId;

  @JsonProperty("accessorChanges")
  @Valid
  private List<AccessorChange> accessorChanges = null;

  @JsonProperty("attachments")
  @Valid
  private List<String> attachments = null;

  @JsonProperty("concreteType")
  private String concreteType;

  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private BigDecimal createdOn;

  @JsonProperty("ducFileHandleId")
  private String ducFileHandleId;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("id")
  private String id;

  @JsonProperty("irbFileHandleId")
  private String irbFileHandleId;

  @JsonProperty("modifiedBy")
  private String modifiedBy;

  @JsonProperty("modifiedOn")
  private BigDecimal modifiedOn;

  @JsonProperty("researchProjectId")
  private String researchProjectId;

  public RequestInterface accessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
    return this;
  }

  /**
   * The ID of the Access Requirement which requires a request to be submitted to gain access to a dataset. This request contains information that satisfies those requirements. 
   * @return accessRequirementId
  */
  @ApiModelProperty(value = "The ID of the Access Requirement which requires a request to be submitted to gain access to a dataset. This request contains information that satisfies those requirements. ")


  public String getAccessRequirementId() {
    return accessRequirementId;
  }

  public void setAccessRequirementId(String accessRequirementId) {
    this.accessRequirementId = accessRequirementId;
  }

  public RequestInterface accessorChanges(List<AccessorChange> accessorChanges) {
    this.accessorChanges = accessorChanges;
    return this;
  }

  public RequestInterface addAccessorChangesItem(AccessorChange accessorChangesItem) {
    if (this.accessorChanges == null) {
      this.accessorChanges = new ArrayList<>();
    }
    this.accessorChanges.add(accessorChangesItem);
    return this;
  }

  /**
   * List of user changes. A user can gain access, renew access or have access revoked.
   * @return accessorChanges
  */
  @ApiModelProperty(value = "List of user changes. A user can gain access, renew access or have access revoked.")

  @Valid

  public List<AccessorChange> getAccessorChanges() {
    return accessorChanges;
  }

  public void setAccessorChanges(List<AccessorChange> accessorChanges) {
    this.accessorChanges = accessorChanges;
  }

  public RequestInterface attachments(List<String> attachments) {
    this.attachments = attachments;
    return this;
  }

  public RequestInterface addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

  /**
   * The set of file handle ID of attached files to this request.
   * @return attachments
  */
  @ApiModelProperty(value = "The set of file handle ID of attached files to this request.")


  public List<String> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }

  public RequestInterface concreteType(String concreteType) {
    this.concreteType = concreteType;
    return this;
  }

  /**
   * Indicates which implementation of RequestInterface this object represents.
   * @return concreteType
  */
  @ApiModelProperty(value = "Indicates which implementation of RequestInterface this object represents.")


  public String getConcreteType() {
    return concreteType;
  }

  public void setConcreteType(String concreteType) {
    this.concreteType = concreteType;
  }

  public RequestInterface createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The ID of the user that created this request.
   * @return createdBy
  */
  @ApiModelProperty(value = "The ID of the user that created this request.")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public RequestInterface createdOn(BigDecimal createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date this request was created.
   * @return createdOn
  */
  @ApiModelProperty(value = "The date this request was created.")

  @Valid

  public BigDecimal getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(BigDecimal createdOn) {
    this.createdOn = createdOn;
  }

  public RequestInterface ducFileHandleId(String ducFileHandleId) {
    this.ducFileHandleId = ducFileHandleId;
    return this;
  }

  /**
   * The Data Use Certificate uploaded by user.
   * @return ducFileHandleId
  */
  @ApiModelProperty(value = "The Data Use Certificate uploaded by user.")


  public String getDucFileHandleId() {
    return ducFileHandleId;
  }

  public void setDucFileHandleId(String ducFileHandleId) {
    this.ducFileHandleId = ducFileHandleId;
  }

  public RequestInterface etag(String etag) {
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

  public RequestInterface id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique immutable ID for this request. A new ID will be generated for new Request. Once issued, this ID is guaranteed to never change or be re-issued. 
   * @return id
  */
  @ApiModelProperty(value = "The unique immutable ID for this request. A new ID will be generated for new Request. Once issued, this ID is guaranteed to never change or be re-issued. ")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RequestInterface irbFileHandleId(String irbFileHandleId) {
    this.irbFileHandleId = irbFileHandleId;
    return this;
  }

  /**
   * The Institutional Review Board Approval document uploaded by user.
   * @return irbFileHandleId
  */
  @ApiModelProperty(value = "The Institutional Review Board Approval document uploaded by user.")


  public String getIrbFileHandleId() {
    return irbFileHandleId;
  }

  public void setIrbFileHandleId(String irbFileHandleId) {
    this.irbFileHandleId = irbFileHandleId;
  }

  public RequestInterface modifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }

  /**
   * The ID of the user that last modified this request.
   * @return modifiedBy
  */
  @ApiModelProperty(value = "The ID of the user that last modified this request.")


  public String getModifiedBy() {
    return modifiedBy;
  }

  public void setModifiedBy(String modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  public RequestInterface modifiedOn(BigDecimal modifiedOn) {
    this.modifiedOn = modifiedOn;
    return this;
  }

  /**
   * The date this request was last modified.
   * @return modifiedOn
  */
  @ApiModelProperty(value = "The date this request was last modified.")

  @Valid

  public BigDecimal getModifiedOn() {
    return modifiedOn;
  }

  public void setModifiedOn(BigDecimal modifiedOn) {
    this.modifiedOn = modifiedOn;
  }

  public RequestInterface researchProjectId(String researchProjectId) {
    this.researchProjectId = researchProjectId;
    return this;
  }

  /**
   * The ID of the research project associated with this request.
   * @return researchProjectId
  */
  @ApiModelProperty(value = "The ID of the research project associated with this request.")


  public String getResearchProjectId() {
    return researchProjectId;
  }

  public void setResearchProjectId(String researchProjectId) {
    this.researchProjectId = researchProjectId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestInterface requestInterface = (RequestInterface) o;
    return Objects.equals(this.accessRequirementId, requestInterface.accessRequirementId) &&
        Objects.equals(this.accessorChanges, requestInterface.accessorChanges) &&
        Objects.equals(this.attachments, requestInterface.attachments) &&
        Objects.equals(this.concreteType, requestInterface.concreteType) &&
        Objects.equals(this.createdBy, requestInterface.createdBy) &&
        Objects.equals(this.createdOn, requestInterface.createdOn) &&
        Objects.equals(this.ducFileHandleId, requestInterface.ducFileHandleId) &&
        Objects.equals(this.etag, requestInterface.etag) &&
        Objects.equals(this.id, requestInterface.id) &&
        Objects.equals(this.irbFileHandleId, requestInterface.irbFileHandleId) &&
        Objects.equals(this.modifiedBy, requestInterface.modifiedBy) &&
        Objects.equals(this.modifiedOn, requestInterface.modifiedOn) &&
        Objects.equals(this.researchProjectId, requestInterface.researchProjectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessRequirementId, accessorChanges, attachments, concreteType, createdBy, createdOn, ducFileHandleId, etag, id, irbFileHandleId, modifiedBy, modifiedOn, researchProjectId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestInterface {\n");
    
    sb.append("    accessRequirementId: ").append(toIndentedString(accessRequirementId)).append("\n");
    sb.append("    accessorChanges: ").append(toIndentedString(accessorChanges)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    concreteType: ").append(toIndentedString(concreteType)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    ducFileHandleId: ").append(toIndentedString(ducFileHandleId)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    irbFileHandleId: ").append(toIndentedString(irbFileHandleId)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedOn: ").append(toIndentedString(modifiedOn)).append("\n");
    sb.append("    researchProjectId: ").append(toIndentedString(researchProjectId)).append("\n");
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

