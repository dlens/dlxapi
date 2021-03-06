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
import com.decisionlens.client.model.PortfolioPlanUserRole;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AddUsersRequest
 */

public class AddUsersRequest {
  @SerializedName("emailIds")
  private List<String> emailIds = null;

  @SerializedName("role")
  private PortfolioPlanUserRole role = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("doNotNotify")
  private Boolean doNotNotify = null;

  public AddUsersRequest emailIds(List<String> emailIds) {
    this.emailIds = emailIds;
    return this;
  }

  public AddUsersRequest addEmailIdsItem(String emailIdsItem) {
    if (this.emailIds == null) {
      this.emailIds = new ArrayList<String>();
    }
    this.emailIds.add(emailIdsItem);
    return this;
  }

   /**
   * Get emailIds
   * @return emailIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getEmailIds() {
    return emailIds;
  }

  public void setEmailIds(List<String> emailIds) {
    this.emailIds = emailIds;
  }

  public AddUsersRequest role(PortfolioPlanUserRole role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public PortfolioPlanUserRole getRole() {
    return role;
  }

  public void setRole(PortfolioPlanUserRole role) {
    this.role = role;
  }

  public AddUsersRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AddUsersRequest doNotNotify(Boolean doNotNotify) {
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
    AddUsersRequest addUsersRequest = (AddUsersRequest) o;
    return Objects.equals(this.emailIds, addUsersRequest.emailIds) &&
        Objects.equals(this.role, addUsersRequest.role) &&
        Objects.equals(this.message, addUsersRequest.message) &&
        Objects.equals(this.doNotNotify, addUsersRequest.doNotNotify);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailIds, role, message, doNotNotify);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddUsersRequest {\n");
    
    sb.append("    emailIds: ").append(toIndentedString(emailIds)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

