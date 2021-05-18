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
import com.decisionlens.client.model.FieldValues;
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
 * Project
 */

public class Project extends DlResource {
  @SerializedName("name")
  private String name = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("fieldValues")
  private FieldValues fieldValues = null;

  @SerializedName("dependsOnProjectIds")
  private List<String> dependsOnProjectIds = null;

  @SerializedName("hasDependentProjectIds")
  private List<String> hasDependentProjectIds = null;

  @SerializedName("contributingUserIds")
  private List<String> contributingUserIds = null;

  @SerializedName("isDraft")
  private Boolean isDraft = null;

  public Project name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Project position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Project fieldValues(FieldValues fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @ApiModelProperty(value = "")
  public FieldValues getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(FieldValues fieldValues) {
    this.fieldValues = fieldValues;
  }

  public Project dependsOnProjectIds(List<String> dependsOnProjectIds) {
    this.dependsOnProjectIds = dependsOnProjectIds;
    return this;
  }

  public Project addDependsOnProjectIdsItem(String dependsOnProjectIdsItem) {
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

  public Project hasDependentProjectIds(List<String> hasDependentProjectIds) {
    this.hasDependentProjectIds = hasDependentProjectIds;
    return this;
  }

  public Project addHasDependentProjectIdsItem(String hasDependentProjectIdsItem) {
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

  public Project contributingUserIds(List<String> contributingUserIds) {
    this.contributingUserIds = contributingUserIds;
    return this;
  }

  public Project addContributingUserIdsItem(String contributingUserIdsItem) {
    if (this.contributingUserIds == null) {
      this.contributingUserIds = new ArrayList<String>();
    }
    this.contributingUserIds.add(contributingUserIdsItem);
    return this;
  }

   /**
   * Get contributingUserIds
   * @return contributingUserIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getContributingUserIds() {
    return contributingUserIds;
  }

  public void setContributingUserIds(List<String> contributingUserIds) {
    this.contributingUserIds = contributingUserIds;
  }

  public Project isDraft(Boolean isDraft) {
    this.isDraft = isDraft;
    return this;
  }

   /**
   * Get isDraft
   * @return isDraft
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDraft() {
    return isDraft;
  }

  public void setIsDraft(Boolean isDraft) {
    this.isDraft = isDraft;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Project project = (Project) o;
    return Objects.equals(this.name, project.name) &&
        Objects.equals(this.position, project.position) &&
        Objects.equals(this.fieldValues, project.fieldValues) &&
        Objects.equals(this.dependsOnProjectIds, project.dependsOnProjectIds) &&
        Objects.equals(this.hasDependentProjectIds, project.hasDependentProjectIds) &&
        Objects.equals(this.contributingUserIds, project.contributingUserIds) &&
        Objects.equals(this.isDraft, project.isDraft) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, position, fieldValues, dependsOnProjectIds, hasDependentProjectIds, contributingUserIds, isDraft, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    dependsOnProjectIds: ").append(toIndentedString(dependsOnProjectIds)).append("\n");
    sb.append("    hasDependentProjectIds: ").append(toIndentedString(hasDependentProjectIds)).append("\n");
    sb.append("    contributingUserIds: ").append(toIndentedString(contributingUserIds)).append("\n");
    sb.append("    isDraft: ").append(toIndentedString(isDraft)).append("\n");
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

