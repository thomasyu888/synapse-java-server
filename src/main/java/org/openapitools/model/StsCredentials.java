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
 * Temporary AWS credentials vended by STS (Security Token Service).
 */
@ApiModel(description = "Temporary AWS credentials vended by STS (Security Token Service).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-03-11T20:51:24.548366+08:00[Asia/Taipei]")
public class StsCredentials   {
  @JsonProperty("accessKeyId")
  private String accessKeyId;

  @JsonProperty("baseKey")
  private String baseKey;

  @JsonProperty("bucket")
  private String bucket;

  @JsonProperty("expiration")
  private String expiration;

  @JsonProperty("secretAccessKey")
  private String secretAccessKey;

  @JsonProperty("sessionToken")
  private String sessionToken;

  public StsCredentials accessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
    return this;
  }

  /**
   * AWS access key ID.
   * @return accessKeyId
  */
  @ApiModelProperty(value = "AWS access key ID.")


  public String getAccessKeyId() {
    return accessKeyId;
  }

  public void setAccessKeyId(String accessKeyId) {
    this.accessKeyId = accessKeyId;
  }

  public StsCredentials baseKey(String baseKey) {
    this.baseKey = baseKey;
    return this;
  }

  /**
   * The S3 key prefix that these credentials have access to.
   * @return baseKey
  */
  @ApiModelProperty(value = "The S3 key prefix that these credentials have access to.")


  public String getBaseKey() {
    return baseKey;
  }

  public void setBaseKey(String baseKey) {
    this.baseKey = baseKey;
  }

  public StsCredentials bucket(String bucket) {
    this.bucket = bucket;
    return this;
  }

  /**
   * The bucket that these credentials have access to.
   * @return bucket
  */
  @ApiModelProperty(value = "The bucket that these credentials have access to.")


  public String getBucket() {
    return bucket;
  }

  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  public StsCredentials expiration(String expiration) {
    this.expiration = expiration;
    return this;
  }

  /**
   * The date-time that these credentials expire.
   * @return expiration
  */
  @ApiModelProperty(value = "The date-time that these credentials expire.")


  public String getExpiration() {
    return expiration;
  }

  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }

  public StsCredentials secretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
    return this;
  }

  /**
   * AWS secret access key.
   * @return secretAccessKey
  */
  @ApiModelProperty(value = "AWS secret access key.")


  public String getSecretAccessKey() {
    return secretAccessKey;
  }

  public void setSecretAccessKey(String secretAccessKey) {
    this.secretAccessKey = secretAccessKey;
  }

  public StsCredentials sessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
    return this;
  }

  /**
   * AWS temporary session token.
   * @return sessionToken
  */
  @ApiModelProperty(value = "AWS temporary session token.")


  public String getSessionToken() {
    return sessionToken;
  }

  public void setSessionToken(String sessionToken) {
    this.sessionToken = sessionToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StsCredentials stsCredentials = (StsCredentials) o;
    return Objects.equals(this.accessKeyId, stsCredentials.accessKeyId) &&
        Objects.equals(this.baseKey, stsCredentials.baseKey) &&
        Objects.equals(this.bucket, stsCredentials.bucket) &&
        Objects.equals(this.expiration, stsCredentials.expiration) &&
        Objects.equals(this.secretAccessKey, stsCredentials.secretAccessKey) &&
        Objects.equals(this.sessionToken, stsCredentials.sessionToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeyId, baseKey, bucket, expiration, secretAccessKey, sessionToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StsCredentials {\n");
    
    sb.append("    accessKeyId: ").append(toIndentedString(accessKeyId)).append("\n");
    sb.append("    baseKey: ").append(toIndentedString(baseKey)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    secretAccessKey: ").append(toIndentedString(secretAccessKey)).append("\n");
    sb.append("    sessionToken: ").append(toIndentedString(sessionToken)).append("\n");
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

