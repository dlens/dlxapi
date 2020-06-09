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
import com.decisionlens.client.model.PortfolioPlan;
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
 * ProjectContributingUserIdsUpdatedEvent
 */

public class ProjectContributingUserIdsUpdatedEvent {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("contributingUserIds")
  private List<String> contributingUserIds = null;

  @SerializedName("previousContributingUserIds")
  private List<String> previousContributingUserIds = null;

  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public ProjectContributingUserIdsUpdatedEvent id(String id) {
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

  public ProjectContributingUserIdsUpdatedEvent name(String name) {
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

  public ProjectContributingUserIdsUpdatedEvent contributingUserIds(List<String> contributingUserIds) {
    this.contributingUserIds = contributingUserIds;
    return this;
  }

  public ProjectContributingUserIdsUpdatedEvent addContributingUserIdsItem(String contributingUserIdsItem) {
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

  public ProjectContributingUserIdsUpdatedEvent previousContributingUserIds(List<String> previousContributingUserIds) {
    this.previousContributingUserIds = previousContributingUserIds;
    return this;
  }

  public ProjectContributingUserIdsUpdatedEvent addPreviousContributingUserIdsItem(String previousContributingUserIdsItem) {
    if (this.previousContributingUserIds == null) {
      this.previousContributingUserIds = new ArrayList<String>();
    }
    this.previousContributingUserIds.add(previousContributingUserIdsItem);
    return this;
  }

   /**
   * Get previousContributingUserIds
   * @return previousContributingUserIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getPreviousContributingUserIds() {
    return previousContributingUserIds;
  }

  public void setPreviousContributingUserIds(List<String> previousContributingUserIds) {
    this.previousContributingUserIds = previousContributingUserIds;
  }

  public ProjectContributingUserIdsUpdatedEvent portfolioId(String portfolioId) {
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

  public ProjectContributingUserIdsUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    ProjectContributingUserIdsUpdatedEvent projectContributingUserIdsUpdatedEvent = (ProjectContributingUserIdsUpdatedEvent) o;
    return Objects.equals(this.id, projectContributingUserIdsUpdatedEvent.id) &&
        Objects.equals(this.name, projectContributingUserIdsUpdatedEvent.name) &&
        Objects.equals(this.contributingUserIds, projectContributingUserIdsUpdatedEvent.contributingUserIds) &&
        Objects.equals(this.previousContributingUserIds, projectContributingUserIdsUpdatedEvent.previousContributingUserIds) &&
        Objects.equals(this.portfolioId, projectContributingUserIdsUpdatedEvent.portfolioId) &&
        Objects.equals(this.portfolioPlan, projectContributingUserIdsUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, contributingUserIds, previousContributingUserIds, portfolioId, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectContributingUserIdsUpdatedEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contributingUserIds: ").append(toIndentedString(contributingUserIds)).append("\n");
    sb.append("    previousContributingUserIds: ").append(toIndentedString(previousContributingUserIds)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
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

