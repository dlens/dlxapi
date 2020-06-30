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
 * FieldIdeaFieldPositionUpdatedEvent
 */

public class FieldIdeaFieldPositionUpdatedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("previousIdeaFieldPosition")
  private Integer previousIdeaFieldPosition = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("ideaFieldPosition")
  private Integer ideaFieldPosition = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public FieldIdeaFieldPositionUpdatedEvent portfolioId(String portfolioId) {
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

  public FieldIdeaFieldPositionUpdatedEvent name(String name) {
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

  public FieldIdeaFieldPositionUpdatedEvent previousIdeaFieldPosition(Integer previousIdeaFieldPosition) {
    this.previousIdeaFieldPosition = previousIdeaFieldPosition;
    return this;
  }

   /**
   * Get previousIdeaFieldPosition
   * @return previousIdeaFieldPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getPreviousIdeaFieldPosition() {
    return previousIdeaFieldPosition;
  }

  public void setPreviousIdeaFieldPosition(Integer previousIdeaFieldPosition) {
    this.previousIdeaFieldPosition = previousIdeaFieldPosition;
  }

  public FieldIdeaFieldPositionUpdatedEvent id(String id) {
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

  public FieldIdeaFieldPositionUpdatedEvent ideaFieldPosition(Integer ideaFieldPosition) {
    this.ideaFieldPosition = ideaFieldPosition;
    return this;
  }

   /**
   * Get ideaFieldPosition
   * @return ideaFieldPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getIdeaFieldPosition() {
    return ideaFieldPosition;
  }

  public void setIdeaFieldPosition(Integer ideaFieldPosition) {
    this.ideaFieldPosition = ideaFieldPosition;
  }

  public FieldIdeaFieldPositionUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    FieldIdeaFieldPositionUpdatedEvent fieldIdeaFieldPositionUpdatedEvent = (FieldIdeaFieldPositionUpdatedEvent) o;
    return Objects.equals(this.portfolioId, fieldIdeaFieldPositionUpdatedEvent.portfolioId) &&
        Objects.equals(this.name, fieldIdeaFieldPositionUpdatedEvent.name) &&
        Objects.equals(this.previousIdeaFieldPosition, fieldIdeaFieldPositionUpdatedEvent.previousIdeaFieldPosition) &&
        Objects.equals(this.id, fieldIdeaFieldPositionUpdatedEvent.id) &&
        Objects.equals(this.ideaFieldPosition, fieldIdeaFieldPositionUpdatedEvent.ideaFieldPosition) &&
        Objects.equals(this.portfolioPlan, fieldIdeaFieldPositionUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, name, previousIdeaFieldPosition, id, ideaFieldPosition, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldIdeaFieldPositionUpdatedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousIdeaFieldPosition: ").append(toIndentedString(previousIdeaFieldPosition)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ideaFieldPosition: ").append(toIndentedString(ideaFieldPosition)).append("\n");
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
