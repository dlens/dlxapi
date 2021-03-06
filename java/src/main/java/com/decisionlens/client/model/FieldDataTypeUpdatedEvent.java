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
import com.decisionlens.client.model.DataType;
import com.decisionlens.client.model.FieldType;
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
 * FieldDataTypeUpdatedEvent
 */

public class FieldDataTypeUpdatedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("previousDataType")
  private DataType previousDataType = null;

  @SerializedName("dataType")
  private DataType dataType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("fieldType")
  private FieldType fieldType = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public FieldDataTypeUpdatedEvent portfolioId(String portfolioId) {
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

  public FieldDataTypeUpdatedEvent previousDataType(DataType previousDataType) {
    this.previousDataType = previousDataType;
    return this;
  }

   /**
   * Get previousDataType
   * @return previousDataType
  **/
  @ApiModelProperty(value = "")
  public DataType getPreviousDataType() {
    return previousDataType;
  }

  public void setPreviousDataType(DataType previousDataType) {
    this.previousDataType = previousDataType;
  }

  public FieldDataTypeUpdatedEvent dataType(DataType dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @ApiModelProperty(value = "")
  public DataType getDataType() {
    return dataType;
  }

  public void setDataType(DataType dataType) {
    this.dataType = dataType;
  }

  public FieldDataTypeUpdatedEvent name(String name) {
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

  public FieldDataTypeUpdatedEvent id(String id) {
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

  public FieldDataTypeUpdatedEvent fieldType(FieldType fieldType) {
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

  public FieldDataTypeUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    FieldDataTypeUpdatedEvent fieldDataTypeUpdatedEvent = (FieldDataTypeUpdatedEvent) o;
    return Objects.equals(this.portfolioId, fieldDataTypeUpdatedEvent.portfolioId) &&
        Objects.equals(this.previousDataType, fieldDataTypeUpdatedEvent.previousDataType) &&
        Objects.equals(this.dataType, fieldDataTypeUpdatedEvent.dataType) &&
        Objects.equals(this.name, fieldDataTypeUpdatedEvent.name) &&
        Objects.equals(this.id, fieldDataTypeUpdatedEvent.id) &&
        Objects.equals(this.fieldType, fieldDataTypeUpdatedEvent.fieldType) &&
        Objects.equals(this.portfolioPlan, fieldDataTypeUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, previousDataType, dataType, name, id, fieldType, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldDataTypeUpdatedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    previousDataType: ").append(toIndentedString(previousDataType)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

