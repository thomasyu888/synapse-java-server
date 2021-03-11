package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.VerificationStateEnum;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The state of a verification submission
 */
@ApiModel(description = "The state of a verification submission")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class VerificationState   {
  @JsonProperty("createdBy")
  private String createdBy;

  @JsonProperty("createdOn")
  private String createdOn;

  @JsonProperty("notes")
  private String notes;

  @JsonProperty("reason")
  private String reason;

  @JsonProperty("state")
  private VerificationStateEnum state;

  public VerificationState createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The principal ID of the user who created this object
   * @return createdBy
  */
  @ApiModelProperty(value = "The principal ID of the user who created this object")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public VerificationState createdOn(String createdOn) {
    this.createdOn = createdOn;
    return this;
  }

  /**
   * The date and time this object was created
   * @return createdOn
  */
  @ApiModelProperty(value = "The date and time this object was created")


  public String getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(String createdOn) {
    this.createdOn = createdOn;
  }

  public VerificationState notes(String notes) {
    this.notes = notes;
    return this;
  }

  /**
   * Additional notes that can be set by the ACT team and that is not exposed to the end user.
   * @return notes
  */
  @ApiModelProperty(value = "Additional notes that can be set by the ACT team and that is not exposed to the end user.")


  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public VerificationState reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * The reason for putting the verification submission in this state.
   * @return reason
  */
  @ApiModelProperty(value = "The reason for putting the verification submission in this state.")


  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public VerificationState state(VerificationStateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")

  @Valid

  public VerificationStateEnum getState() {
    return state;
  }

  public void setState(VerificationStateEnum state) {
    this.state = state;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationState verificationState = (VerificationState) o;
    return Objects.equals(this.createdBy, verificationState.createdBy) &&
        Objects.equals(this.createdOn, verificationState.createdOn) &&
        Objects.equals(this.notes, verificationState.notes) &&
        Objects.equals(this.reason, verificationState.reason) &&
        Objects.equals(this.state, verificationState.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdBy, createdOn, notes, reason, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationState {\n");
    
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

