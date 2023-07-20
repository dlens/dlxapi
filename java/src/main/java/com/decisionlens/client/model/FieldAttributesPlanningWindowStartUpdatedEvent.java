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
 * FieldAttributesPlanningWindowStartUpdatedEvent
 */

public class FieldAttributesPlanningWindowStartUpdatedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("start")
  private Integer start = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("previousStart")
  private Integer previousStart = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public FieldAttributesPlanningWindowStartUpdatedEvent portfolioId(String portfolioId) {
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

  public FieldAttributesPlanningWindowStartUpdatedEvent name(String name) {
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

  public FieldAttributesPlanningWindowStartUpdatedEvent start(Integer start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public Integer getStart() {
    return start;
  }

  public void setStart(Integer start) {
    this.start = start;
  }

  public FieldAttributesPlanningWindowStartUpdatedEvent id(String id) {
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

  public FieldAttributesPlanningWindowStartUpdatedEvent previousStart(Integer previousStart) {
    this.previousStart = previousStart;
    return this;
  }

   /**
   * Get previousStart
   * @return previousStart
  **/
  @ApiModelProperty(value = "")
  public Integer getPreviousStart() {
    return previousStart;
  }

  public void setPreviousStart(Integer previousStart) {
    this.previousStart = previousStart;
  }

  public FieldAttributesPlanningWindowStartUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    FieldAttributesPlanningWindowStartUpdatedEvent fieldAttributesPlanningWindowStartUpdatedEvent = (FieldAttributesPlanningWindowStartUpdatedEvent) o;
    return Objects.equals(this.portfolioId, fieldAttributesPlanningWindowStartUpdatedEvent.portfolioId) &&
        Objects.equals(this.name, fieldAttributesPlanningWindowStartUpdatedEvent.name) &&
        Objects.equals(this.start, fieldAttributesPlanningWindowStartUpdatedEvent.start) &&
        Objects.equals(this.id, fieldAttributesPlanningWindowStartUpdatedEvent.id) &&
        Objects.equals(this.previousStart, fieldAttributesPlanningWindowStartUpdatedEvent.previousStart) &&
        Objects.equals(this.portfolioPlan, fieldAttributesPlanningWindowStartUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, name, start, id, previousStart, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldAttributesPlanningWindowStartUpdatedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    previousStart: ").append(toIndentedString(previousStart)).append("\n");
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

