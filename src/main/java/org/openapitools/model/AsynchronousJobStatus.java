package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.AsynchJobState;
import org.openapitools.model.AsynchronousRequestBody;
import org.openapitools.model.AsynchronousResponseBody;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Object used to track the status of an Asynchronous Job.
 */
@ApiModel(description = "Object used to track the status of an Asynchronous Job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class AsynchronousJobStatus   {
  @JsonProperty("changedOn")
  private String changedOn;

  @JsonProperty("errorDetails")
  private String errorDetails;

  @JsonProperty("errorMessage")
  private String errorMessage;

  @JsonProperty("etag")
  private String etag;

  @JsonProperty("exception")
  private String exception;

  @JsonProperty("jobCanceling")
  private Boolean jobCanceling;

  @JsonProperty("jobId")
  private String jobId;

  @JsonProperty("jobState")
  private AsynchJobState jobState;

  @JsonProperty("progressCurrent")
  private Integer progressCurrent;

  @JsonProperty("progressMessage")
  private String progressMessage;

  @JsonProperty("progressTotal")
  private Integer progressTotal;

  @JsonProperty("requestBody")
  private AsynchronousRequestBody requestBody;

  @JsonProperty("responseBody")
  private AsynchronousResponseBody responseBody;

  @JsonProperty("runtimeMS")
  private BigDecimal runtimeMS;

  @JsonProperty("startedByUserId")
  private Integer startedByUserId;

  @JsonProperty("startedOn")
  private String startedOn;

  public AsynchronousJobStatus changedOn(String changedOn) {
    this.changedOn = changedOn;
    return this;
  }

  /**
   * The date-time when the status of this table last changed.
   * @return changedOn
  */
  @ApiModelProperty(value = "The date-time when the status of this table last changed.")


  public String getChangedOn() {
    return changedOn;
  }

  public void setChangedOn(String changedOn) {
    this.changedOn = changedOn;
  }

  public AsynchronousJobStatus errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * When processing fails, this is the full stack trace of the error.
   * @return errorDetails
  */
  @ApiModelProperty(value = "When processing fails, this is the full stack trace of the error.")


  public String getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }

  public AsynchronousJobStatus errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * When processing fails, this is a one line error message.
   * @return errorMessage
  */
  @ApiModelProperty(value = "When processing fails, this is a one line error message.")


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public AsynchronousJobStatus etag(String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The etag of the status will change whenever the status changes.
   * @return etag
  */
  @ApiModelProperty(value = "The etag of the status will change whenever the status changes.")


  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public AsynchronousJobStatus exception(String exception) {
    this.exception = exception;
    return this;
  }

  /**
   * The exception that needs to be thrown
   * @return exception
  */
  @ApiModelProperty(value = "The exception that needs to be thrown")


  public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }

  public AsynchronousJobStatus jobCanceling(Boolean jobCanceling) {
    this.jobCanceling = jobCanceling;
    return this;
  }

  /**
   * Was the job being asked to cancel.
   * @return jobCanceling
  */
  @ApiModelProperty(value = "Was the job being asked to cancel.")


  public Boolean getJobCanceling() {
    return jobCanceling;
  }

  public void setJobCanceling(Boolean jobCanceling) {
    this.jobCanceling = jobCanceling;
  }

  public AsynchronousJobStatus jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * The ID if the job issued when this job request was issued.
   * @return jobId
  */
  @ApiModelProperty(value = "The ID if the job issued when this job request was issued.")


  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public AsynchronousJobStatus jobState(AsynchJobState jobState) {
    this.jobState = jobState;
    return this;
  }

  /**
   * Get jobState
   * @return jobState
  */
  @ApiModelProperty(value = "")

  @Valid

  public AsynchJobState getJobState() {
    return jobState;
  }

  public void setJobState(AsynchJobState jobState) {
    this.jobState = jobState;
  }

  public AsynchronousJobStatus progressCurrent(Integer progressCurrent) {
    this.progressCurrent = progressCurrent;
    return this;
  }

  /**
   * The progress current value indicates how much progress has been made. For example: If progressTotal = 100; and progressCurrent = 50; then the work is 50% complete. 
   * @return progressCurrent
  */
  @ApiModelProperty(value = "The progress current value indicates how much progress has been made. For example: If progressTotal = 100; and progressCurrent = 50; then the work is 50% complete. ")


  public Integer getProgressCurrent() {
    return progressCurrent;
  }

  public void setProgressCurrent(Integer progressCurrent) {
    this.progressCurrent = progressCurrent;
  }

  public AsynchronousJobStatus progressMessage(String progressMessage) {
    this.progressMessage = progressMessage;
    return this;
  }

  /**
   * The current message of the progress tracker.
   * @return progressMessage
  */
  @ApiModelProperty(value = "The current message of the progress tracker.")


  public String getProgressMessage() {
    return progressMessage;
  }

  public void setProgressMessage(String progressMessage) {
    this.progressMessage = progressMessage;
  }

  public AsynchronousJobStatus progressTotal(Integer progressTotal) {
    this.progressTotal = progressTotal;
    return this;
  }

  /**
   * The progress total indicates the total amount of work to complete. For example: If progressTotal = 100; and progressCurrent = 50; then the work is 50% complete. 
   * @return progressTotal
  */
  @ApiModelProperty(value = "The progress total indicates the total amount of work to complete. For example: If progressTotal = 100; and progressCurrent = 50; then the work is 50% complete. ")


  public Integer getProgressTotal() {
    return progressTotal;
  }

  public void setProgressTotal(Integer progressTotal) {
    this.progressTotal = progressTotal;
  }

  public AsynchronousJobStatus requestBody(AsynchronousRequestBody requestBody) {
    this.requestBody = requestBody;
    return this;
  }

  /**
   * Get requestBody
   * @return requestBody
  */
  @ApiModelProperty(value = "")

  @Valid

  public AsynchronousRequestBody getRequestBody() {
    return requestBody;
  }

  public void setRequestBody(AsynchronousRequestBody requestBody) {
    this.requestBody = requestBody;
  }

  public AsynchronousJobStatus responseBody(AsynchronousResponseBody responseBody) {
    this.responseBody = responseBody;
    return this;
  }

  /**
   * Get responseBody
   * @return responseBody
  */
  @ApiModelProperty(value = "")

  @Valid

  public AsynchronousResponseBody getResponseBody() {
    return responseBody;
  }

  public void setResponseBody(AsynchronousResponseBody responseBody) {
    this.responseBody = responseBody;
  }

  public AsynchronousJobStatus runtimeMS(BigDecimal runtimeMS) {
    this.runtimeMS = runtimeMS;
    return this;
  }

  /**
   * The number of milliseconds from the start to completion of this job.
   * @return runtimeMS
  */
  @ApiModelProperty(value = "The number of milliseconds from the start to completion of this job.")

  @Valid

  public BigDecimal getRuntimeMS() {
    return runtimeMS;
  }

  public void setRuntimeMS(BigDecimal runtimeMS) {
    this.runtimeMS = runtimeMS;
  }

  public AsynchronousJobStatus startedByUserId(Integer startedByUserId) {
    this.startedByUserId = startedByUserId;
    return this;
  }

  /**
   * The ID of the user that started the job
   * @return startedByUserId
  */
  @ApiModelProperty(value = "The ID of the user that started the job")


  public Integer getStartedByUserId() {
    return startedByUserId;
  }

  public void setStartedByUserId(Integer startedByUserId) {
    this.startedByUserId = startedByUserId;
  }

  public AsynchronousJobStatus startedOn(String startedOn) {
    this.startedOn = startedOn;
    return this;
  }

  /**
   * The date-time when the status of this table last changed to PROCESSING.
   * @return startedOn
  */
  @ApiModelProperty(value = "The date-time when the status of this table last changed to PROCESSING.")


  public String getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(String startedOn) {
    this.startedOn = startedOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsynchronousJobStatus asynchronousJobStatus = (AsynchronousJobStatus) o;
    return Objects.equals(this.changedOn, asynchronousJobStatus.changedOn) &&
        Objects.equals(this.errorDetails, asynchronousJobStatus.errorDetails) &&
        Objects.equals(this.errorMessage, asynchronousJobStatus.errorMessage) &&
        Objects.equals(this.etag, asynchronousJobStatus.etag) &&
        Objects.equals(this.exception, asynchronousJobStatus.exception) &&
        Objects.equals(this.jobCanceling, asynchronousJobStatus.jobCanceling) &&
        Objects.equals(this.jobId, asynchronousJobStatus.jobId) &&
        Objects.equals(this.jobState, asynchronousJobStatus.jobState) &&
        Objects.equals(this.progressCurrent, asynchronousJobStatus.progressCurrent) &&
        Objects.equals(this.progressMessage, asynchronousJobStatus.progressMessage) &&
        Objects.equals(this.progressTotal, asynchronousJobStatus.progressTotal) &&
        Objects.equals(this.requestBody, asynchronousJobStatus.requestBody) &&
        Objects.equals(this.responseBody, asynchronousJobStatus.responseBody) &&
        Objects.equals(this.runtimeMS, asynchronousJobStatus.runtimeMS) &&
        Objects.equals(this.startedByUserId, asynchronousJobStatus.startedByUserId) &&
        Objects.equals(this.startedOn, asynchronousJobStatus.startedOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changedOn, errorDetails, errorMessage, etag, exception, jobCanceling, jobId, jobState, progressCurrent, progressMessage, progressTotal, requestBody, responseBody, runtimeMS, startedByUserId, startedOn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsynchronousJobStatus {\n");
    
    sb.append("    changedOn: ").append(toIndentedString(changedOn)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    jobCanceling: ").append(toIndentedString(jobCanceling)).append("\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    jobState: ").append(toIndentedString(jobState)).append("\n");
    sb.append("    progressCurrent: ").append(toIndentedString(progressCurrent)).append("\n");
    sb.append("    progressMessage: ").append(toIndentedString(progressMessage)).append("\n");
    sb.append("    progressTotal: ").append(toIndentedString(progressTotal)).append("\n");
    sb.append("    requestBody: ").append(toIndentedString(requestBody)).append("\n");
    sb.append("    responseBody: ").append(toIndentedString(responseBody)).append("\n");
    sb.append("    runtimeMS: ").append(toIndentedString(runtimeMS)).append("\n");
    sb.append("    startedByUserId: ").append(toIndentedString(startedByUserId)).append("\n");
    sb.append("    startedOn: ").append(toIndentedString(startedOn)).append("\n");
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

