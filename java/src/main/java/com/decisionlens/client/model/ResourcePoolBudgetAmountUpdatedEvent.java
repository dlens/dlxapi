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
import com.decisionlens.client.model.TimePeriod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ResourcePoolBudgetAmountUpdatedEvent
 */

public class ResourcePoolBudgetAmountUpdatedEvent {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("budgetAmount")
  private Double budgetAmount = null;

  @SerializedName("previousBudgetAmount")
  private Double previousBudgetAmount = null;

  @SerializedName("timePeriod")
  private TimePeriod timePeriod = null;

  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public ResourcePoolBudgetAmountUpdatedEvent id(String id) {
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

  public ResourcePoolBudgetAmountUpdatedEvent name(String name) {
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

  public ResourcePoolBudgetAmountUpdatedEvent budgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
    return this;
  }

   /**
   * Get budgetAmount
   * @return budgetAmount
  **/
  @ApiModelProperty(value = "")
  public Double getBudgetAmount() {
    return budgetAmount;
  }

  public void setBudgetAmount(Double budgetAmount) {
    this.budgetAmount = budgetAmount;
  }

  public ResourcePoolBudgetAmountUpdatedEvent previousBudgetAmount(Double previousBudgetAmount) {
    this.previousBudgetAmount = previousBudgetAmount;
    return this;
  }

   /**
   * Get previousBudgetAmount
   * @return previousBudgetAmount
  **/
  @ApiModelProperty(value = "")
  public Double getPreviousBudgetAmount() {
    return previousBudgetAmount;
  }

  public void setPreviousBudgetAmount(Double previousBudgetAmount) {
    this.previousBudgetAmount = previousBudgetAmount;
  }

  public ResourcePoolBudgetAmountUpdatedEvent timePeriod(TimePeriod timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

   /**
   * Get timePeriod
   * @return timePeriod
  **/
  @ApiModelProperty(value = "")
  public TimePeriod getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(TimePeriod timePeriod) {
    this.timePeriod = timePeriod;
  }

  public ResourcePoolBudgetAmountUpdatedEvent portfolioId(String portfolioId) {
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

  public ResourcePoolBudgetAmountUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    ResourcePoolBudgetAmountUpdatedEvent resourcePoolBudgetAmountUpdatedEvent = (ResourcePoolBudgetAmountUpdatedEvent) o;
    return Objects.equals(this.id, resourcePoolBudgetAmountUpdatedEvent.id) &&
        Objects.equals(this.name, resourcePoolBudgetAmountUpdatedEvent.name) &&
        Objects.equals(this.budgetAmount, resourcePoolBudgetAmountUpdatedEvent.budgetAmount) &&
        Objects.equals(this.previousBudgetAmount, resourcePoolBudgetAmountUpdatedEvent.previousBudgetAmount) &&
        Objects.equals(this.timePeriod, resourcePoolBudgetAmountUpdatedEvent.timePeriod) &&
        Objects.equals(this.portfolioId, resourcePoolBudgetAmountUpdatedEvent.portfolioId) &&
        Objects.equals(this.portfolioPlan, resourcePoolBudgetAmountUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, budgetAmount, previousBudgetAmount, timePeriod, portfolioId, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcePoolBudgetAmountUpdatedEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    budgetAmount: ").append(toIndentedString(budgetAmount)).append("\n");
    sb.append("    previousBudgetAmount: ").append(toIndentedString(previousBudgetAmount)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
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

