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
import com.decisionlens.client.model.Field;
import com.decisionlens.client.model.PortfolioPlan;
import com.decisionlens.client.model.ResourcePoolBudgetAmount;
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
 * ResourcePoolCreatedEvent
 */

public class ResourcePoolCreatedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("field")
  private Field field = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("budgetAmounts")
  private List<ResourcePoolBudgetAmount> budgetAmounts = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public ResourcePoolCreatedEvent portfolioId(String portfolioId) {
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

  public ResourcePoolCreatedEvent field(Field field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(value = "")
  public Field getField() {
    return field;
  }

  public void setField(Field field) {
    this.field = field;
  }

  public ResourcePoolCreatedEvent name(String name) {
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

  public ResourcePoolCreatedEvent id(String id) {
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

  public ResourcePoolCreatedEvent budgetAmounts(List<ResourcePoolBudgetAmount> budgetAmounts) {
    this.budgetAmounts = budgetAmounts;
    return this;
  }

  public ResourcePoolCreatedEvent addBudgetAmountsItem(ResourcePoolBudgetAmount budgetAmountsItem) {
    if (this.budgetAmounts == null) {
      this.budgetAmounts = new ArrayList<ResourcePoolBudgetAmount>();
    }
    this.budgetAmounts.add(budgetAmountsItem);
    return this;
  }

   /**
   * Get budgetAmounts
   * @return budgetAmounts
  **/
  @ApiModelProperty(value = "")
  public List<ResourcePoolBudgetAmount> getBudgetAmounts() {
    return budgetAmounts;
  }

  public void setBudgetAmounts(List<ResourcePoolBudgetAmount> budgetAmounts) {
    this.budgetAmounts = budgetAmounts;
  }

  public ResourcePoolCreatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    ResourcePoolCreatedEvent resourcePoolCreatedEvent = (ResourcePoolCreatedEvent) o;
    return Objects.equals(this.portfolioId, resourcePoolCreatedEvent.portfolioId) &&
        Objects.equals(this.field, resourcePoolCreatedEvent.field) &&
        Objects.equals(this.name, resourcePoolCreatedEvent.name) &&
        Objects.equals(this.id, resourcePoolCreatedEvent.id) &&
        Objects.equals(this.budgetAmounts, resourcePoolCreatedEvent.budgetAmounts) &&
        Objects.equals(this.portfolioPlan, resourcePoolCreatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, field, name, id, budgetAmounts, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcePoolCreatedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    budgetAmounts: ").append(toIndentedString(budgetAmounts)).append("\n");
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

