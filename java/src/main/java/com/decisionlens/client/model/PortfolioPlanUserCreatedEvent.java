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
import com.decisionlens.client.model.Permission;
import com.decisionlens.client.model.PortfolioPlan;
import com.decisionlens.client.model.PortfolioPlanUserRole;
import com.decisionlens.client.model.User;
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
 * PortfolioPlanUserCreatedEvent
 */

public class PortfolioPlanUserCreatedEvent {
  @SerializedName("portfolioPlanUserRoleList")
  private List<PortfolioPlanUserRole> portfolioPlanUserRoleList = null;

  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("permissions")
  private List<Permission> permissions = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("contributingProjectIds")
  private List<String> contributingProjectIds = null;

  @SerializedName("user")
  private User user = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public PortfolioPlanUserCreatedEvent portfolioPlanUserRoleList(List<PortfolioPlanUserRole> portfolioPlanUserRoleList) {
    this.portfolioPlanUserRoleList = portfolioPlanUserRoleList;
    return this;
  }

  public PortfolioPlanUserCreatedEvent addPortfolioPlanUserRoleListItem(PortfolioPlanUserRole portfolioPlanUserRoleListItem) {
    if (this.portfolioPlanUserRoleList == null) {
      this.portfolioPlanUserRoleList = new ArrayList<PortfolioPlanUserRole>();
    }
    this.portfolioPlanUserRoleList.add(portfolioPlanUserRoleListItem);
    return this;
  }

   /**
   * Get portfolioPlanUserRoleList
   * @return portfolioPlanUserRoleList
  **/
  @ApiModelProperty(value = "")
  public List<PortfolioPlanUserRole> getPortfolioPlanUserRoleList() {
    return portfolioPlanUserRoleList;
  }

  public void setPortfolioPlanUserRoleList(List<PortfolioPlanUserRole> portfolioPlanUserRoleList) {
    this.portfolioPlanUserRoleList = portfolioPlanUserRoleList;
  }

  public PortfolioPlanUserCreatedEvent portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(value = "")
  public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }

  public PortfolioPlanUserCreatedEvent permissions(List<Permission> permissions) {
    this.permissions = permissions;
    return this;
  }

  public PortfolioPlanUserCreatedEvent addPermissionsItem(Permission permissionsItem) {
    if (this.permissions == null) {
      this.permissions = new ArrayList<Permission>();
    }
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @ApiModelProperty(value = "")
  public List<Permission> getPermissions() {
    return permissions;
  }

  public void setPermissions(List<Permission> permissions) {
    this.permissions = permissions;
  }

  public PortfolioPlanUserCreatedEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PortfolioPlanUserCreatedEvent contributingProjectIds(List<String> contributingProjectIds) {
    this.contributingProjectIds = contributingProjectIds;
    return this;
  }

  public PortfolioPlanUserCreatedEvent addContributingProjectIdsItem(String contributingProjectIdsItem) {
    if (this.contributingProjectIds == null) {
      this.contributingProjectIds = new ArrayList<String>();
    }
    this.contributingProjectIds.add(contributingProjectIdsItem);
    return this;
  }

   /**
   * Get contributingProjectIds
   * @return contributingProjectIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getContributingProjectIds() {
    return contributingProjectIds;
  }

  public void setContributingProjectIds(List<String> contributingProjectIds) {
    this.contributingProjectIds = contributingProjectIds;
  }

  public PortfolioPlanUserCreatedEvent user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public PortfolioPlanUserCreatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
    this.portfolioPlan = portfolioPlan;
    return this;
  }

   /**
   * Get portfolioPlan
   * @return portfolioPlan
  **/
  @ApiModelProperty(value = "")
  public PortfolioPlan getPortfolioPlan() {
    return portfolioPlan;
  }

  public void setPortfolioPlan(PortfolioPlan portfolioPlan) {
    this.portfolioPlan = portfolioPlan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioPlanUserCreatedEvent portfolioPlanUserCreatedEvent = (PortfolioPlanUserCreatedEvent) o;
    return Objects.equals(this.portfolioPlanUserRoleList, portfolioPlanUserCreatedEvent.portfolioPlanUserRoleList) &&
        Objects.equals(this.portfolioId, portfolioPlanUserCreatedEvent.portfolioId) &&
        Objects.equals(this.permissions, portfolioPlanUserCreatedEvent.permissions) &&
        Objects.equals(this.id, portfolioPlanUserCreatedEvent.id) &&
        Objects.equals(this.contributingProjectIds, portfolioPlanUserCreatedEvent.contributingProjectIds) &&
        Objects.equals(this.user, portfolioPlanUserCreatedEvent.user) &&
        Objects.equals(this.portfolioPlan, portfolioPlanUserCreatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioPlanUserRoleList, portfolioId, permissions, id, contributingProjectIds, user, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioPlanUserCreatedEvent {\n");
    
    sb.append("    portfolioPlanUserRoleList: ").append(toIndentedString(portfolioPlanUserRoleList)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contributingProjectIds: ").append(toIndentedString(contributingProjectIds)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    portfolioPlan: ").append(toIndentedString(portfolioPlan)).append("\n");
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

