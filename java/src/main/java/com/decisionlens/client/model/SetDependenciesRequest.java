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
import java.util.ArrayList;
import java.util.List;

/**
 * SetDependenciesRequest
 */

public class SetDependenciesRequest {
  @SerializedName("dependsOnProjectIds")
  private List<String> dependsOnProjectIds = null;

  @SerializedName("hasDependentProjectIds")
  private List<String> hasDependentProjectIds = null;

  public SetDependenciesRequest dependsOnProjectIds(List<String> dependsOnProjectIds) {
    this.dependsOnProjectIds = dependsOnProjectIds;
    return this;
  }

  public SetDependenciesRequest addDependsOnProjectIdsItem(String dependsOnProjectIdsItem) {
    if (this.dependsOnProjectIds == null) {
      this.dependsOnProjectIds = new ArrayList<String>();
    }
    this.dependsOnProjectIds.add(dependsOnProjectIdsItem);
    return this;
  }

   /**
   * Get dependsOnProjectIds
   * @return dependsOnProjectIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getDependsOnProjectIds() {
    return dependsOnProjectIds;
  }

  public void setDependsOnProjectIds(List<String> dependsOnProjectIds) {
    this.dependsOnProjectIds = dependsOnProjectIds;
  }

  public SetDependenciesRequest hasDependentProjectIds(List<String> hasDependentProjectIds) {
    this.hasDependentProjectIds = hasDependentProjectIds;
    return this;
  }

  public SetDependenciesRequest addHasDependentProjectIdsItem(String hasDependentProjectIdsItem) {
    if (this.hasDependentProjectIds == null) {
      this.hasDependentProjectIds = new ArrayList<String>();
    }
    this.hasDependentProjectIds.add(hasDependentProjectIdsItem);
    return this;
  }

   /**
   * Get hasDependentProjectIds
   * @return hasDependentProjectIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getHasDependentProjectIds() {
    return hasDependentProjectIds;
  }

  public void setHasDependentProjectIds(List<String> hasDependentProjectIds) {
    this.hasDependentProjectIds = hasDependentProjectIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetDependenciesRequest setDependenciesRequest = (SetDependenciesRequest) o;
    return Objects.equals(this.dependsOnProjectIds, setDependenciesRequest.dependsOnProjectIds) &&
        Objects.equals(this.hasDependentProjectIds, setDependenciesRequest.hasDependentProjectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dependsOnProjectIds, hasDependentProjectIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetDependenciesRequest {\n");
    
    sb.append("    dependsOnProjectIds: ").append(toIndentedString(dependsOnProjectIds)).append("\n");
    sb.append("    hasDependentProjectIds: ").append(toIndentedString(hasDependentProjectIds)).append("\n");
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
