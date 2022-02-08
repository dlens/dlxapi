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
import com.decisionlens.client.model.LikertScaleType;
import com.decisionlens.client.model.RiskType;
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
 * CategorizationInsight
 */

public class CategorizationInsight {
  @SerializedName("name")
  private String name = null;

  @SerializedName("likertScaleType")
  private LikertScaleType likertScaleType = null;

  @SerializedName("riskType")
  private RiskType riskType = null;

  @SerializedName("allocation")
  private Double allocation = null;

  @SerializedName("expectedAllocation")
  private Double expectedAllocation = null;

  @SerializedName("projectCount")
  private Integer projectCount = null;

  @SerializedName("projectIds")
  private List<String> projectIds = null;

  public CategorizationInsight name(String name) {
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

  public CategorizationInsight likertScaleType(LikertScaleType likertScaleType) {
    this.likertScaleType = likertScaleType;
    return this;
  }

   /**
   * Get likertScaleType
   * @return likertScaleType
  **/
  @ApiModelProperty(value = "")
  public LikertScaleType getLikertScaleType() {
    return likertScaleType;
  }

  public void setLikertScaleType(LikertScaleType likertScaleType) {
    this.likertScaleType = likertScaleType;
  }

  public CategorizationInsight riskType(RiskType riskType) {
    this.riskType = riskType;
    return this;
  }

   /**
   * Get riskType
   * @return riskType
  **/
  @ApiModelProperty(value = "")
  public RiskType getRiskType() {
    return riskType;
  }

  public void setRiskType(RiskType riskType) {
    this.riskType = riskType;
  }

  public CategorizationInsight allocation(Double allocation) {
    this.allocation = allocation;
    return this;
  }

   /**
   * Get allocation
   * @return allocation
  **/
  @ApiModelProperty(value = "")
  public Double getAllocation() {
    return allocation;
  }

  public void setAllocation(Double allocation) {
    this.allocation = allocation;
  }

  public CategorizationInsight expectedAllocation(Double expectedAllocation) {
    this.expectedAllocation = expectedAllocation;
    return this;
  }

   /**
   * Get expectedAllocation
   * @return expectedAllocation
  **/
  @ApiModelProperty(value = "")
  public Double getExpectedAllocation() {
    return expectedAllocation;
  }

  public void setExpectedAllocation(Double expectedAllocation) {
    this.expectedAllocation = expectedAllocation;
  }

  public CategorizationInsight projectCount(Integer projectCount) {
    this.projectCount = projectCount;
    return this;
  }

   /**
   * Get projectCount
   * @return projectCount
  **/
  @ApiModelProperty(value = "")
  public Integer getProjectCount() {
    return projectCount;
  }

  public void setProjectCount(Integer projectCount) {
    this.projectCount = projectCount;
  }

  public CategorizationInsight projectIds(List<String> projectIds) {
    this.projectIds = projectIds;
    return this;
  }

  public CategorizationInsight addProjectIdsItem(String projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<String>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * Get projectIds
   * @return projectIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getProjectIds() {
    return projectIds;
  }

  public void setProjectIds(List<String> projectIds) {
    this.projectIds = projectIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategorizationInsight categorizationInsight = (CategorizationInsight) o;
    return Objects.equals(this.name, categorizationInsight.name) &&
        Objects.equals(this.likertScaleType, categorizationInsight.likertScaleType) &&
        Objects.equals(this.riskType, categorizationInsight.riskType) &&
        Objects.equals(this.allocation, categorizationInsight.allocation) &&
        Objects.equals(this.expectedAllocation, categorizationInsight.expectedAllocation) &&
        Objects.equals(this.projectCount, categorizationInsight.projectCount) &&
        Objects.equals(this.projectIds, categorizationInsight.projectIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, likertScaleType, riskType, allocation, expectedAllocation, projectCount, projectIds);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategorizationInsight {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    likertScaleType: ").append(toIndentedString(likertScaleType)).append("\n");
    sb.append("    riskType: ").append(toIndentedString(riskType)).append("\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
    sb.append("    expectedAllocation: ").append(toIndentedString(expectedAllocation)).append("\n");
    sb.append("    projectCount: ").append(toIndentedString(projectCount)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
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
