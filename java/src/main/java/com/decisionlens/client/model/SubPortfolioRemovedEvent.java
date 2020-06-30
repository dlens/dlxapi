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
import com.decisionlens.client.model.Portfolio;
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
 * SubPortfolioRemovedEvent
 */

public class SubPortfolioRemovedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("subPortfolio")
  private Portfolio subPortfolio = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public SubPortfolioRemovedEvent portfolioId(String portfolioId) {
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

  public SubPortfolioRemovedEvent subPortfolio(Portfolio subPortfolio) {
    this.subPortfolio = subPortfolio;
    return this;
  }

   /**
   * Get subPortfolio
   * @return subPortfolio
  **/
  @ApiModelProperty(value = "")
  public Portfolio getSubPortfolio() {
    return subPortfolio;
  }

  public void setSubPortfolio(Portfolio subPortfolio) {
    this.subPortfolio = subPortfolio;
  }

  public SubPortfolioRemovedEvent name(String name) {
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

  public SubPortfolioRemovedEvent id(String id) {
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

  public SubPortfolioRemovedEvent position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public SubPortfolioRemovedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    SubPortfolioRemovedEvent subPortfolioRemovedEvent = (SubPortfolioRemovedEvent) o;
    return Objects.equals(this.portfolioId, subPortfolioRemovedEvent.portfolioId) &&
        Objects.equals(this.subPortfolio, subPortfolioRemovedEvent.subPortfolio) &&
        Objects.equals(this.name, subPortfolioRemovedEvent.name) &&
        Objects.equals(this.id, subPortfolioRemovedEvent.id) &&
        Objects.equals(this.position, subPortfolioRemovedEvent.position) &&
        Objects.equals(this.portfolioPlan, subPortfolioRemovedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, subPortfolio, name, id, position, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubPortfolioRemovedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    subPortfolio: ").append(toIndentedString(subPortfolio)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
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

