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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ScoreWeightFieldWeightLockUpdatedEvent
 */

public class ScoreWeightFieldWeightLockUpdatedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("field")
  private Field field = null;

  @SerializedName("previousIsLocked")
  private Boolean previousIsLocked = null;

  @SerializedName("isLocked")
  private Boolean isLocked = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public ScoreWeightFieldWeightLockUpdatedEvent portfolioId(String portfolioId) {
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

  public ScoreWeightFieldWeightLockUpdatedEvent field(Field field) {
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

  public ScoreWeightFieldWeightLockUpdatedEvent previousIsLocked(Boolean previousIsLocked) {
    this.previousIsLocked = previousIsLocked;
    return this;
  }

   /**
   * Get previousIsLocked
   * @return previousIsLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean isPreviousIsLocked() {
    return previousIsLocked;
  }

  public void setPreviousIsLocked(Boolean previousIsLocked) {
    this.previousIsLocked = previousIsLocked;
  }

  public ScoreWeightFieldWeightLockUpdatedEvent isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Get isLocked
   * @return isLocked
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  public ScoreWeightFieldWeightLockUpdatedEvent name(String name) {
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

  public ScoreWeightFieldWeightLockUpdatedEvent id(String id) {
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

  public ScoreWeightFieldWeightLockUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    ScoreWeightFieldWeightLockUpdatedEvent scoreWeightFieldWeightLockUpdatedEvent = (ScoreWeightFieldWeightLockUpdatedEvent) o;
    return Objects.equals(this.portfolioId, scoreWeightFieldWeightLockUpdatedEvent.portfolioId) &&
        Objects.equals(this.field, scoreWeightFieldWeightLockUpdatedEvent.field) &&
        Objects.equals(this.previousIsLocked, scoreWeightFieldWeightLockUpdatedEvent.previousIsLocked) &&
        Objects.equals(this.isLocked, scoreWeightFieldWeightLockUpdatedEvent.isLocked) &&
        Objects.equals(this.name, scoreWeightFieldWeightLockUpdatedEvent.name) &&
        Objects.equals(this.id, scoreWeightFieldWeightLockUpdatedEvent.id) &&
        Objects.equals(this.portfolioPlan, scoreWeightFieldWeightLockUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, field, previousIsLocked, isLocked, name, id, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreWeightFieldWeightLockUpdatedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    previousIsLocked: ").append(toIndentedString(previousIsLocked)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

