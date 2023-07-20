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
import com.decisionlens.client.model.DateFormat;
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
 * FieldAttributesDataFormatsDateFormatUpdatedEvent
 */

public class FieldAttributesDataFormatsDateFormatUpdatedEvent {
  @SerializedName("previousDateFormat")
  private DateFormat previousDateFormat = null;

  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("dateFormat")
  private DateFormat dateFormat = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public FieldAttributesDataFormatsDateFormatUpdatedEvent previousDateFormat(DateFormat previousDateFormat) {
    this.previousDateFormat = previousDateFormat;
    return this;
  }

   /**
   * Get previousDateFormat
   * @return previousDateFormat
  **/
  @ApiModelProperty(value = "")
  public DateFormat getPreviousDateFormat() {
    return previousDateFormat;
  }

  public void setPreviousDateFormat(DateFormat previousDateFormat) {
    this.previousDateFormat = previousDateFormat;
  }

  public FieldAttributesDataFormatsDateFormatUpdatedEvent portfolioId(String portfolioId) {
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

  public FieldAttributesDataFormatsDateFormatUpdatedEvent dateFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
    return this;
  }

   /**
   * Get dateFormat
   * @return dateFormat
  **/
  @ApiModelProperty(value = "")
  public DateFormat getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
  }

  public FieldAttributesDataFormatsDateFormatUpdatedEvent name(String name) {
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

  public FieldAttributesDataFormatsDateFormatUpdatedEvent id(String id) {
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

  public FieldAttributesDataFormatsDateFormatUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    FieldAttributesDataFormatsDateFormatUpdatedEvent fieldAttributesDataFormatsDateFormatUpdatedEvent = (FieldAttributesDataFormatsDateFormatUpdatedEvent) o;
    return Objects.equals(this.previousDateFormat, fieldAttributesDataFormatsDateFormatUpdatedEvent.previousDateFormat) &&
        Objects.equals(this.portfolioId, fieldAttributesDataFormatsDateFormatUpdatedEvent.portfolioId) &&
        Objects.equals(this.dateFormat, fieldAttributesDataFormatsDateFormatUpdatedEvent.dateFormat) &&
        Objects.equals(this.name, fieldAttributesDataFormatsDateFormatUpdatedEvent.name) &&
        Objects.equals(this.id, fieldAttributesDataFormatsDateFormatUpdatedEvent.id) &&
        Objects.equals(this.portfolioPlan, fieldAttributesDataFormatsDateFormatUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(previousDateFormat, portfolioId, dateFormat, name, id, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldAttributesDataFormatsDateFormatUpdatedEvent {\n");
    
    sb.append("    previousDateFormat: ").append(toIndentedString(previousDateFormat)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    dateFormat: ").append(toIndentedString(dateFormat)).append("\n");
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

