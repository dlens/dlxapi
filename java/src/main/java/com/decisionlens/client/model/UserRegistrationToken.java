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
import com.decisionlens.client.model.Group;
import com.decisionlens.client.model.PortfolioPlanUserRole;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UserRegistrationToken
 */

public class UserRegistrationToken {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("group")
  private Group group = null;

  @SerializedName("role")
  private PortfolioPlanUserRole role = null;

  @SerializedName("expiresAt")
  private Long expiresAt = null;

  public UserRegistrationToken portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * portfolio id
   * @return portfolioId
  **/
  @ApiModelProperty(value = "portfolio id")
  public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }

  public UserRegistrationToken group(Group group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @ApiModelProperty(value = "")
  public Group getGroup() {
    return group;
  }

  public void setGroup(Group group) {
    this.group = group;
  }

  public UserRegistrationToken role(PortfolioPlanUserRole role) {
    this.role = role;
    return this;
  }

   /**
   * portfolio plan user role
   * @return role
  **/
  @ApiModelProperty(value = "portfolio plan user role")
  public PortfolioPlanUserRole getRole() {
    return role;
  }

  public void setRole(PortfolioPlanUserRole role) {
    this.role = role;
  }

  public UserRegistrationToken expiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

   /**
   * Get expiresAt
   * @return expiresAt
  **/
  @ApiModelProperty(value = "")
  public Long getExpiresAt() {
    return expiresAt;
  }

  public void setExpiresAt(Long expiresAt) {
    this.expiresAt = expiresAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRegistrationToken userRegistrationToken = (UserRegistrationToken) o;
    return Objects.equals(this.portfolioId, userRegistrationToken.portfolioId) &&
        Objects.equals(this.group, userRegistrationToken.group) &&
        Objects.equals(this.role, userRegistrationToken.role) &&
        Objects.equals(this.expiresAt, userRegistrationToken.expiresAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, group, role, expiresAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRegistrationToken {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    expiresAt: ").append(toIndentedString(expiresAt)).append("\n");
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
