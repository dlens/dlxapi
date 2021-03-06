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
 * BudgetAllocation
 */

public class BudgetAllocation {
  @SerializedName("resourcePoolName")
  private String resourcePoolName = null;

  @SerializedName("resourcePoolId")
  private String resourcePoolId = null;

  @SerializedName("yearlyBudgets")
  private List<Double> yearlyBudgets = null;

  @SerializedName("yearlyAllocations")
  private List<Double> yearlyAllocations = null;

  @SerializedName("yearlyTimePeriods")
  private List<Long> yearlyTimePeriods = null;

  @SerializedName("yearlyConstrainedAllocations")
  private List<Double> yearlyConstrainedAllocations = null;

  @SerializedName("monthlyAllocations")
  private List<Double> monthlyAllocations = null;

  @SerializedName("monthlyBudgets")
  private List<Double> monthlyBudgets = null;

  @SerializedName("monthlyTimePeriods")
  private List<Long> monthlyTimePeriods = null;

  @SerializedName("monthlyConstrainedAllocations")
  private List<Double> monthlyConstrainedAllocations = null;

  public BudgetAllocation resourcePoolName(String resourcePoolName) {
    this.resourcePoolName = resourcePoolName;
    return this;
  }

   /**
   * Get resourcePoolName
   * @return resourcePoolName
  **/
  @ApiModelProperty(value = "")
  public String getResourcePoolName() {
    return resourcePoolName;
  }

  public void setResourcePoolName(String resourcePoolName) {
    this.resourcePoolName = resourcePoolName;
  }

  public BudgetAllocation resourcePoolId(String resourcePoolId) {
    this.resourcePoolId = resourcePoolId;
    return this;
  }

   /**
   * Get resourcePoolId
   * @return resourcePoolId
  **/
  @ApiModelProperty(value = "")
  public String getResourcePoolId() {
    return resourcePoolId;
  }

  public void setResourcePoolId(String resourcePoolId) {
    this.resourcePoolId = resourcePoolId;
  }

  public BudgetAllocation yearlyBudgets(List<Double> yearlyBudgets) {
    this.yearlyBudgets = yearlyBudgets;
    return this;
  }

  public BudgetAllocation addYearlyBudgetsItem(Double yearlyBudgetsItem) {
    if (this.yearlyBudgets == null) {
      this.yearlyBudgets = new ArrayList<Double>();
    }
    this.yearlyBudgets.add(yearlyBudgetsItem);
    return this;
  }

   /**
   * Get yearlyBudgets
   * @return yearlyBudgets
  **/
  @ApiModelProperty(value = "")
  public List<Double> getYearlyBudgets() {
    return yearlyBudgets;
  }

  public void setYearlyBudgets(List<Double> yearlyBudgets) {
    this.yearlyBudgets = yearlyBudgets;
  }

  public BudgetAllocation yearlyAllocations(List<Double> yearlyAllocations) {
    this.yearlyAllocations = yearlyAllocations;
    return this;
  }

  public BudgetAllocation addYearlyAllocationsItem(Double yearlyAllocationsItem) {
    if (this.yearlyAllocations == null) {
      this.yearlyAllocations = new ArrayList<Double>();
    }
    this.yearlyAllocations.add(yearlyAllocationsItem);
    return this;
  }

   /**
   * Get yearlyAllocations
   * @return yearlyAllocations
  **/
  @ApiModelProperty(value = "")
  public List<Double> getYearlyAllocations() {
    return yearlyAllocations;
  }

  public void setYearlyAllocations(List<Double> yearlyAllocations) {
    this.yearlyAllocations = yearlyAllocations;
  }

  public BudgetAllocation yearlyTimePeriods(List<Long> yearlyTimePeriods) {
    this.yearlyTimePeriods = yearlyTimePeriods;
    return this;
  }

  public BudgetAllocation addYearlyTimePeriodsItem(Long yearlyTimePeriodsItem) {
    if (this.yearlyTimePeriods == null) {
      this.yearlyTimePeriods = new ArrayList<Long>();
    }
    this.yearlyTimePeriods.add(yearlyTimePeriodsItem);
    return this;
  }

   /**
   * Get yearlyTimePeriods
   * @return yearlyTimePeriods
  **/
  @ApiModelProperty(value = "")
  public List<Long> getYearlyTimePeriods() {
    return yearlyTimePeriods;
  }

  public void setYearlyTimePeriods(List<Long> yearlyTimePeriods) {
    this.yearlyTimePeriods = yearlyTimePeriods;
  }

  public BudgetAllocation yearlyConstrainedAllocations(List<Double> yearlyConstrainedAllocations) {
    this.yearlyConstrainedAllocations = yearlyConstrainedAllocations;
    return this;
  }

  public BudgetAllocation addYearlyConstrainedAllocationsItem(Double yearlyConstrainedAllocationsItem) {
    if (this.yearlyConstrainedAllocations == null) {
      this.yearlyConstrainedAllocations = new ArrayList<Double>();
    }
    this.yearlyConstrainedAllocations.add(yearlyConstrainedAllocationsItem);
    return this;
  }

   /**
   * Get yearlyConstrainedAllocations
   * @return yearlyConstrainedAllocations
  **/
  @ApiModelProperty(value = "")
  public List<Double> getYearlyConstrainedAllocations() {
    return yearlyConstrainedAllocations;
  }

  public void setYearlyConstrainedAllocations(List<Double> yearlyConstrainedAllocations) {
    this.yearlyConstrainedAllocations = yearlyConstrainedAllocations;
  }

  public BudgetAllocation monthlyAllocations(List<Double> monthlyAllocations) {
    this.monthlyAllocations = monthlyAllocations;
    return this;
  }

  public BudgetAllocation addMonthlyAllocationsItem(Double monthlyAllocationsItem) {
    if (this.monthlyAllocations == null) {
      this.monthlyAllocations = new ArrayList<Double>();
    }
    this.monthlyAllocations.add(monthlyAllocationsItem);
    return this;
  }

   /**
   * Get monthlyAllocations
   * @return monthlyAllocations
  **/
  @ApiModelProperty(value = "")
  public List<Double> getMonthlyAllocations() {
    return monthlyAllocations;
  }

  public void setMonthlyAllocations(List<Double> monthlyAllocations) {
    this.monthlyAllocations = monthlyAllocations;
  }

  public BudgetAllocation monthlyBudgets(List<Double> monthlyBudgets) {
    this.monthlyBudgets = monthlyBudgets;
    return this;
  }

  public BudgetAllocation addMonthlyBudgetsItem(Double monthlyBudgetsItem) {
    if (this.monthlyBudgets == null) {
      this.monthlyBudgets = new ArrayList<Double>();
    }
    this.monthlyBudgets.add(monthlyBudgetsItem);
    return this;
  }

   /**
   * Get monthlyBudgets
   * @return monthlyBudgets
  **/
  @ApiModelProperty(value = "")
  public List<Double> getMonthlyBudgets() {
    return monthlyBudgets;
  }

  public void setMonthlyBudgets(List<Double> monthlyBudgets) {
    this.monthlyBudgets = monthlyBudgets;
  }

  public BudgetAllocation monthlyTimePeriods(List<Long> monthlyTimePeriods) {
    this.monthlyTimePeriods = monthlyTimePeriods;
    return this;
  }

  public BudgetAllocation addMonthlyTimePeriodsItem(Long monthlyTimePeriodsItem) {
    if (this.monthlyTimePeriods == null) {
      this.monthlyTimePeriods = new ArrayList<Long>();
    }
    this.monthlyTimePeriods.add(monthlyTimePeriodsItem);
    return this;
  }

   /**
   * Get monthlyTimePeriods
   * @return monthlyTimePeriods
  **/
  @ApiModelProperty(value = "")
  public List<Long> getMonthlyTimePeriods() {
    return monthlyTimePeriods;
  }

  public void setMonthlyTimePeriods(List<Long> monthlyTimePeriods) {
    this.monthlyTimePeriods = monthlyTimePeriods;
  }

  public BudgetAllocation monthlyConstrainedAllocations(List<Double> monthlyConstrainedAllocations) {
    this.monthlyConstrainedAllocations = monthlyConstrainedAllocations;
    return this;
  }

  public BudgetAllocation addMonthlyConstrainedAllocationsItem(Double monthlyConstrainedAllocationsItem) {
    if (this.monthlyConstrainedAllocations == null) {
      this.monthlyConstrainedAllocations = new ArrayList<Double>();
    }
    this.monthlyConstrainedAllocations.add(monthlyConstrainedAllocationsItem);
    return this;
  }

   /**
   * Get monthlyConstrainedAllocations
   * @return monthlyConstrainedAllocations
  **/
  @ApiModelProperty(value = "")
  public List<Double> getMonthlyConstrainedAllocations() {
    return monthlyConstrainedAllocations;
  }

  public void setMonthlyConstrainedAllocations(List<Double> monthlyConstrainedAllocations) {
    this.monthlyConstrainedAllocations = monthlyConstrainedAllocations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetAllocation budgetAllocation = (BudgetAllocation) o;
    return Objects.equals(this.resourcePoolName, budgetAllocation.resourcePoolName) &&
        Objects.equals(this.resourcePoolId, budgetAllocation.resourcePoolId) &&
        Objects.equals(this.yearlyBudgets, budgetAllocation.yearlyBudgets) &&
        Objects.equals(this.yearlyAllocations, budgetAllocation.yearlyAllocations) &&
        Objects.equals(this.yearlyTimePeriods, budgetAllocation.yearlyTimePeriods) &&
        Objects.equals(this.yearlyConstrainedAllocations, budgetAllocation.yearlyConstrainedAllocations) &&
        Objects.equals(this.monthlyAllocations, budgetAllocation.monthlyAllocations) &&
        Objects.equals(this.monthlyBudgets, budgetAllocation.monthlyBudgets) &&
        Objects.equals(this.monthlyTimePeriods, budgetAllocation.monthlyTimePeriods) &&
        Objects.equals(this.monthlyConstrainedAllocations, budgetAllocation.monthlyConstrainedAllocations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourcePoolName, resourcePoolId, yearlyBudgets, yearlyAllocations, yearlyTimePeriods, yearlyConstrainedAllocations, monthlyAllocations, monthlyBudgets, monthlyTimePeriods, monthlyConstrainedAllocations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetAllocation {\n");
    
    sb.append("    resourcePoolName: ").append(toIndentedString(resourcePoolName)).append("\n");
    sb.append("    resourcePoolId: ").append(toIndentedString(resourcePoolId)).append("\n");
    sb.append("    yearlyBudgets: ").append(toIndentedString(yearlyBudgets)).append("\n");
    sb.append("    yearlyAllocations: ").append(toIndentedString(yearlyAllocations)).append("\n");
    sb.append("    yearlyTimePeriods: ").append(toIndentedString(yearlyTimePeriods)).append("\n");
    sb.append("    yearlyConstrainedAllocations: ").append(toIndentedString(yearlyConstrainedAllocations)).append("\n");
    sb.append("    monthlyAllocations: ").append(toIndentedString(monthlyAllocations)).append("\n");
    sb.append("    monthlyBudgets: ").append(toIndentedString(monthlyBudgets)).append("\n");
    sb.append("    monthlyTimePeriods: ").append(toIndentedString(monthlyTimePeriods)).append("\n");
    sb.append("    monthlyConstrainedAllocations: ").append(toIndentedString(monthlyConstrainedAllocations)).append("\n");
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

