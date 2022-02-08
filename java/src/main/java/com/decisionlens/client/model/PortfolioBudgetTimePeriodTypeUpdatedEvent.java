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
import com.decisionlens.client.model.TimePeriodType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PortfolioBudgetTimePeriodTypeUpdatedEvent
 */

public class PortfolioBudgetTimePeriodTypeUpdatedEvent {
  @SerializedName("budgetTimePeriodType")
  private TimePeriodType budgetTimePeriodType = null;

  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("previousTimePeriodType")
  private TimePeriodType previousTimePeriodType = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public PortfolioBudgetTimePeriodTypeUpdatedEvent budgetTimePeriodType(TimePeriodType budgetTimePeriodType) {
    this.budgetTimePeriodType = budgetTimePeriodType;
    return this;
  }

   /**
   * Get budgetTimePeriodType
   * @return budgetTimePeriodType
  **/
  @ApiModelProperty(value = "")
  public TimePeriodType getBudgetTimePeriodType() {
    return budgetTimePeriodType;
  }

  public void setBudgetTimePeriodType(TimePeriodType budgetTimePeriodType) {
    this.budgetTimePeriodType = budgetTimePeriodType;
  }

  public PortfolioBudgetTimePeriodTypeUpdatedEvent portfolioId(String portfolioId) {
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

  public PortfolioBudgetTimePeriodTypeUpdatedEvent name(String name) {
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

  public PortfolioBudgetTimePeriodTypeUpdatedEvent previousTimePeriodType(TimePeriodType previousTimePeriodType) {
    this.previousTimePeriodType = previousTimePeriodType;
    return this;
  }

   /**
   * Get previousTimePeriodType
   * @return previousTimePeriodType
  **/
  @ApiModelProperty(value = "")
  public TimePeriodType getPreviousTimePeriodType() {
    return previousTimePeriodType;
  }

  public void setPreviousTimePeriodType(TimePeriodType previousTimePeriodType) {
    this.previousTimePeriodType = previousTimePeriodType;
  }

  public PortfolioBudgetTimePeriodTypeUpdatedEvent id(String id) {
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

  public PortfolioBudgetTimePeriodTypeUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    PortfolioBudgetTimePeriodTypeUpdatedEvent portfolioBudgetTimePeriodTypeUpdatedEvent = (PortfolioBudgetTimePeriodTypeUpdatedEvent) o;
    return Objects.equals(this.budgetTimePeriodType, portfolioBudgetTimePeriodTypeUpdatedEvent.budgetTimePeriodType) &&
        Objects.equals(this.portfolioId, portfolioBudgetTimePeriodTypeUpdatedEvent.portfolioId) &&
        Objects.equals(this.name, portfolioBudgetTimePeriodTypeUpdatedEvent.name) &&
        Objects.equals(this.previousTimePeriodType, portfolioBudgetTimePeriodTypeUpdatedEvent.previousTimePeriodType) &&
        Objects.equals(this.id, portfolioBudgetTimePeriodTypeUpdatedEvent.id) &&
        Objects.equals(this.portfolioPlan, portfolioBudgetTimePeriodTypeUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetTimePeriodType, portfolioId, name, previousTimePeriodType, id, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioBudgetTimePeriodTypeUpdatedEvent {\n");
    
    sb.append("    budgetTimePeriodType: ").append(toIndentedString(budgetTimePeriodType)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousTimePeriodType: ").append(toIndentedString(previousTimePeriodType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
