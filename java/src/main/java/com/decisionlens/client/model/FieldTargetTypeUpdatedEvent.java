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
import com.decisionlens.client.model.FieldType;
import com.decisionlens.client.model.PortfolioPlan;
import com.decisionlens.client.model.TargetType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FieldTargetTypeUpdatedEvent
 */

public class FieldTargetTypeUpdatedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("targetType")
  private TargetType targetType = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("previousTargetType")
  private TargetType previousTargetType = null;

  @SerializedName("fieldType")
  private FieldType fieldType = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public FieldTargetTypeUpdatedEvent portfolioId(String portfolioId) {
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

  public FieldTargetTypeUpdatedEvent name(String name) {
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

  public FieldTargetTypeUpdatedEvent targetType(TargetType targetType) {
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  @ApiModelProperty(value = "")
  public TargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(TargetType targetType) {
    this.targetType = targetType;
  }

  public FieldTargetTypeUpdatedEvent id(String id) {
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

  public FieldTargetTypeUpdatedEvent previousTargetType(TargetType previousTargetType) {
    this.previousTargetType = previousTargetType;
    return this;
  }

   /**
   * Get previousTargetType
   * @return previousTargetType
  **/
  @ApiModelProperty(value = "")
  public TargetType getPreviousTargetType() {
    return previousTargetType;
  }

  public void setPreviousTargetType(TargetType previousTargetType) {
    this.previousTargetType = previousTargetType;
  }

  public FieldTargetTypeUpdatedEvent fieldType(FieldType fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @ApiModelProperty(value = "")
  public FieldType getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldType fieldType) {
    this.fieldType = fieldType;
  }

  public FieldTargetTypeUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    FieldTargetTypeUpdatedEvent fieldTargetTypeUpdatedEvent = (FieldTargetTypeUpdatedEvent) o;
    return Objects.equals(this.portfolioId, fieldTargetTypeUpdatedEvent.portfolioId) &&
        Objects.equals(this.name, fieldTargetTypeUpdatedEvent.name) &&
        Objects.equals(this.targetType, fieldTargetTypeUpdatedEvent.targetType) &&
        Objects.equals(this.id, fieldTargetTypeUpdatedEvent.id) &&
        Objects.equals(this.previousTargetType, fieldTargetTypeUpdatedEvent.previousTargetType) &&
        Objects.equals(this.fieldType, fieldTargetTypeUpdatedEvent.fieldType) &&
        Objects.equals(this.portfolioPlan, fieldTargetTypeUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, name, targetType, id, previousTargetType, fieldType, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldTargetTypeUpdatedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    previousTargetType: ").append(toIndentedString(previousTargetType)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
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

