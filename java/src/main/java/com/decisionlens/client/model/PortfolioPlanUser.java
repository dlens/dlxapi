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
import com.decisionlens.client.model.Permissions;
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
 * PortfolioPlanUser
 */

public class PortfolioPlanUser extends DlResource {
  @SerializedName("user")
  private User user = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  @SerializedName("roles")
  private List<PortfolioPlanUserRole> roles = null;

  @SerializedName("fieldPermissions")
  private Permissions fieldPermissions = null;

  @SerializedName("projectPermissions")
  private Permissions projectPermissions = null;

  public PortfolioPlanUser user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public PortfolioPlanUser portfolioPlan(PortfolioPlan portfolioPlan) {
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

  public PortfolioPlanUser roles(List<PortfolioPlanUserRole> roles) {
    this.roles = roles;
    return this;
  }

  public PortfolioPlanUser addRolesItem(PortfolioPlanUserRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<PortfolioPlanUserRole>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(value = "")
  public List<PortfolioPlanUserRole> getRoles() {
    return roles;
  }

  public void setRoles(List<PortfolioPlanUserRole> roles) {
    this.roles = roles;
  }

  public PortfolioPlanUser fieldPermissions(Permissions fieldPermissions) {
    this.fieldPermissions = fieldPermissions;
    return this;
  }

   /**
   * Get fieldPermissions
   * @return fieldPermissions
  **/
  @ApiModelProperty(value = "")
  public Permissions getFieldPermissions() {
    return fieldPermissions;
  }

  public void setFieldPermissions(Permissions fieldPermissions) {
    this.fieldPermissions = fieldPermissions;
  }

  public PortfolioPlanUser projectPermissions(Permissions projectPermissions) {
    this.projectPermissions = projectPermissions;
    return this;
  }

   /**
   * Get projectPermissions
   * @return projectPermissions
  **/
  @ApiModelProperty(value = "")
  public Permissions getProjectPermissions() {
    return projectPermissions;
  }

  public void setProjectPermissions(Permissions projectPermissions) {
    this.projectPermissions = projectPermissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioPlanUser portfolioPlanUser = (PortfolioPlanUser) o;
    return Objects.equals(this.user, portfolioPlanUser.user) &&
        Objects.equals(this.portfolioPlan, portfolioPlanUser.portfolioPlan) &&
        Objects.equals(this.roles, portfolioPlanUser.roles) &&
        Objects.equals(this.fieldPermissions, portfolioPlanUser.fieldPermissions) &&
        Objects.equals(this.projectPermissions, portfolioPlanUser.projectPermissions) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, portfolioPlan, roles, fieldPermissions, projectPermissions, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioPlanUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    portfolioPlan: ").append(toIndentedString(portfolioPlan)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    fieldPermissions: ").append(toIndentedString(fieldPermissions)).append("\n");
    sb.append("    projectPermissions: ").append(toIndentedString(projectPermissions)).append("\n");
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

