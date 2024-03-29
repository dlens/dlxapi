/*
 * Decision Lens API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.decisionlens.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * RegisterUserRequest
 */

public class RegisterUserRequest {
  @SerializedName("userRegistrationToken")
  private String userRegistrationToken = null;

  @SerializedName("emailId")
  private String emailId = null;

  @SerializedName("landingPage")
  private String landingPage = null;

  @SerializedName("doNotNotify")
  private Boolean doNotNotify = false;

  public RegisterUserRequest userRegistrationToken(String userRegistrationToken) {
    this.userRegistrationToken = userRegistrationToken;
    return this;
  }

   /**
   * Get userRegistrationToken
   * @return userRegistrationToken
  **/
  @ApiModelProperty(required = true, value = "")
  public String getUserRegistrationToken() {
    return userRegistrationToken;
  }

  public void setUserRegistrationToken(String userRegistrationToken) {
    this.userRegistrationToken = userRegistrationToken;
  }

  public RegisterUserRequest emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

   /**
   * Get emailId
   * @return emailId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public RegisterUserRequest landingPage(String landingPage) {
    this.landingPage = landingPage;
    return this;
  }

   /**
   * Get landingPage
   * @return landingPage
  **/
  @ApiModelProperty(value = "")
  public String getLandingPage() {
    return landingPage;
  }

  public void setLandingPage(String landingPage) {
    this.landingPage = landingPage;
  }

  public RegisterUserRequest doNotNotify(Boolean doNotNotify) {
    this.doNotNotify = doNotNotify;
    return this;
  }

   /**
   * Get doNotNotify
   * @return doNotNotify
  **/
  @ApiModelProperty(value = "")
  public Boolean isDoNotNotify() {
    return doNotNotify;
  }

  public void setDoNotNotify(Boolean doNotNotify) {
    this.doNotNotify = doNotNotify;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegisterUserRequest registerUserRequest = (RegisterUserRequest) o;
    return Objects.equals(this.userRegistrationToken, registerUserRequest.userRegistrationToken) &&
        Objects.equals(this.emailId, registerUserRequest.emailId) &&
        Objects.equals(this.landingPage, registerUserRequest.landingPage) &&
        Objects.equals(this.doNotNotify, registerUserRequest.doNotNotify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userRegistrationToken, emailId, landingPage, doNotNotify);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegisterUserRequest {\n");
    
    sb.append("    userRegistrationToken: ").append(toIndentedString(userRegistrationToken)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    landingPage: ").append(toIndentedString(landingPage)).append("\n");
    sb.append("    doNotNotify: ").append(toIndentedString(doNotNotify)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

