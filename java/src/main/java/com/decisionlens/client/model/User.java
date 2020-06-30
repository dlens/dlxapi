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
import com.decisionlens.client.model.DlResource;
import com.decisionlens.client.model.RoleType;
import com.decisionlens.client.model.UserStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * User
 */

public class User extends DlResource {
  @SerializedName("username")
  private String username = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("status")
  private UserStatus status = null;

  @SerializedName("isLocked")
  private Boolean isLocked = null;

  @SerializedName("invitationUrl")
  private String invitationUrl = null;

  @SerializedName("invitationUrlExpiration")
  private Integer invitationUrlExpiration = null;

  @SerializedName("role")
  private RoleType role = null;

  public User username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Get username
   * @return username
  **/
  @ApiModelProperty(value = "")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User status(UserStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public UserStatus getStatus() {
    return status;
  }

  public void setStatus(UserStatus status) {
    this.status = status;
  }

  public User isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public User invitationUrl(String invitationUrl) {
    this.invitationUrl = invitationUrl;
    return this;
  }

   /**
   * Get invitationUrl
   * @return invitationUrl
  **/
  @ApiModelProperty(value = "")
  public String getInvitationUrl() {
    return invitationUrl;
  }

  public void setInvitationUrl(String invitationUrl) {
    this.invitationUrl = invitationUrl;
  }

  public User invitationUrlExpiration(Integer invitationUrlExpiration) {
    this.invitationUrlExpiration = invitationUrlExpiration;
    return this;
  }

   /**
   * Get invitationUrlExpiration
   * @return invitationUrlExpiration
  **/
  @ApiModelProperty(value = "")
  public Integer getInvitationUrlExpiration() {
    return invitationUrlExpiration;
  }

  public void setInvitationUrlExpiration(Integer invitationUrlExpiration) {
    this.invitationUrlExpiration = invitationUrlExpiration;
  }

  public User role(RoleType role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @ApiModelProperty(value = "")
  public RoleType getRole() {
    return role;
  }

  public void setRole(RoleType role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.username, user.username) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.isLocked, user.isLocked) &&
        Objects.equals(this.invitationUrl, user.invitationUrl) &&
        Objects.equals(this.invitationUrlExpiration, user.invitationUrlExpiration) &&
        Objects.equals(this.role, user.role) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, firstName, lastName, status, isLocked, invitationUrl, invitationUrlExpiration, role, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    invitationUrl: ").append(toIndentedString(invitationUrl)).append("\n");
    sb.append("    invitationUrlExpiration: ").append(toIndentedString(invitationUrlExpiration)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
