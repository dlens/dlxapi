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
import com.decisionlens.client.model.BudgetAllocation;
import com.decisionlens.client.model.DlCollection;
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
import java.util.ArrayList;
import java.util.List;

/**
 * BudgetAllocations
 */

public class BudgetAllocations extends DlCollection {
  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  @SerializedName("timePeriodType")
  private TimePeriodType timePeriodType = null;

  @SerializedName("yearlyStartTime")
  private Long yearlyStartTime = null;

  @SerializedName("monthlyStartTime")
  private Long monthlyStartTime = null;

  @SerializedName("items")
  private List<BudgetAllocation> items = null;

  public BudgetAllocations portfolioPlan(PortfolioPlan portfolioPlan) {
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

  public BudgetAllocations timePeriodType(TimePeriodType timePeriodType) {
    this.timePeriodType = timePeriodType;
    return this;
  }

   /**
   * Get timePeriodType
   * @return timePeriodType
  **/
  @ApiModelProperty(value = "")
  public TimePeriodType getTimePeriodType() {
    return timePeriodType;
  }

  public void setTimePeriodType(TimePeriodType timePeriodType) {
    this.timePeriodType = timePeriodType;
  }

  public BudgetAllocations yearlyStartTime(Long yearlyStartTime) {
    this.yearlyStartTime = yearlyStartTime;
    return this;
  }

   /**
   * Get yearlyStartTime
   * @return yearlyStartTime
  **/
  @ApiModelProperty(value = "")
  public Long getYearlyStartTime() {
    return yearlyStartTime;
  }

  public void setYearlyStartTime(Long yearlyStartTime) {
    this.yearlyStartTime = yearlyStartTime;
  }

  public BudgetAllocations monthlyStartTime(Long monthlyStartTime) {
    this.monthlyStartTime = monthlyStartTime;
    return this;
  }

   /**
   * Get monthlyStartTime
   * @return monthlyStartTime
  **/
  @ApiModelProperty(value = "")
  public Long getMonthlyStartTime() {
    return monthlyStartTime;
  }

  public void setMonthlyStartTime(Long monthlyStartTime) {
    this.monthlyStartTime = monthlyStartTime;
  }

  public BudgetAllocations items(List<BudgetAllocation> items) {
    this.items = items;
    return this;
  }

  public BudgetAllocations addItemsItem(BudgetAllocation itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<BudgetAllocation>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @ApiModelProperty(value = "")
  public List<BudgetAllocation> getItems() {
    return items;
  }

  public void setItems(List<BudgetAllocation> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetAllocations budgetAllocations = (BudgetAllocations) o;
    return Objects.equals(this.portfolioPlan, budgetAllocations.portfolioPlan) &&
        Objects.equals(this.timePeriodType, budgetAllocations.timePeriodType) &&
        Objects.equals(this.yearlyStartTime, budgetAllocations.yearlyStartTime) &&
        Objects.equals(this.monthlyStartTime, budgetAllocations.monthlyStartTime) &&
        Objects.equals(this.items, budgetAllocations.items) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioPlan, timePeriodType, yearlyStartTime, monthlyStartTime, items, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetAllocations {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    portfolioPlan: ").append(toIndentedString(portfolioPlan)).append("\n");
    sb.append("    timePeriodType: ").append(toIndentedString(timePeriodType)).append("\n");
    sb.append("    yearlyStartTime: ").append(toIndentedString(yearlyStartTime)).append("\n");
    sb.append("    monthlyStartTime: ").append(toIndentedString(monthlyStartTime)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
