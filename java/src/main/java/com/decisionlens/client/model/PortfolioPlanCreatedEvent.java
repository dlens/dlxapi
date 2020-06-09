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

/**
 * PortfolioPlanCreatedEvent
 */

public class PortfolioPlanCreatedEvent {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("isBaseline")
  private Boolean isBaseline = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  @SerializedName("parentPortfolioPlan")
  private PortfolioPlan parentPortfolioPlan = null;

  @SerializedName("portfolioId")
  private String portfolioId = null;

  public PortfolioPlanCreatedEvent id(String id) {
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

  public PortfolioPlanCreatedEvent name(String name) {
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

  public PortfolioPlanCreatedEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PortfolioPlanCreatedEvent isBaseline(Boolean isBaseline) {
    this.isBaseline = isBaseline;
    return this;
  }

   /**
   * Get isBaseline
   * @return isBaseline
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsBaseline() {
    return isBaseline;
  }

  public void setIsBaseline(Boolean isBaseline) {
    this.isBaseline = isBaseline;
  }

  public PortfolioPlanCreatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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

  public PortfolioPlanCreatedEvent parentPortfolioPlan(PortfolioPlan parentPortfolioPlan) {
    this.parentPortfolioPlan = parentPortfolioPlan;
    return this;
  }

   /**
   * Get parentPortfolioPlan
   * @return parentPortfolioPlan
  **/
  @ApiModelProperty(value = "")
  public PortfolioPlan getParentPortfolioPlan() {
    return parentPortfolioPlan;
  }

  public void setParentPortfolioPlan(PortfolioPlan parentPortfolioPlan) {
    this.parentPortfolioPlan = parentPortfolioPlan;
  }

  public PortfolioPlanCreatedEvent portfolioId(String portfolioId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioPlanCreatedEvent portfolioPlanCreatedEvent = (PortfolioPlanCreatedEvent) o;
    return Objects.equals(this.id, portfolioPlanCreatedEvent.id) &&
        Objects.equals(this.name, portfolioPlanCreatedEvent.name) &&
        Objects.equals(this.description, portfolioPlanCreatedEvent.description) &&
        Objects.equals(this.isBaseline, portfolioPlanCreatedEvent.isBaseline) &&
        Objects.equals(this.portfolioPlan, portfolioPlanCreatedEvent.portfolioPlan) &&
        Objects.equals(this.parentPortfolioPlan, portfolioPlanCreatedEvent.parentPortfolioPlan) &&
        Objects.equals(this.portfolioId, portfolioPlanCreatedEvent.portfolioId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, isBaseline, portfolioPlan, parentPortfolioPlan, portfolioId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioPlanCreatedEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBaseline: ").append(toIndentedString(isBaseline)).append("\n");
    sb.append("    portfolioPlan: ").append(toIndentedString(portfolioPlan)).append("\n");
    sb.append("    parentPortfolioPlan: ").append(toIndentedString(parentPortfolioPlan)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
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

