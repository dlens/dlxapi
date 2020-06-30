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
import com.decisionlens.client.model.FieldValue;
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
 * FieldValuesUpdatedMessagePayload
 */

public class FieldValuesUpdatedMessagePayload {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("portfolioPlanId")
  private String portfolioPlanId = null;

  @SerializedName("fieldValues")
  private List<FieldValue> fieldValues = new ArrayList<FieldValue>();

  public FieldValuesUpdatedMessagePayload portfolioId(String portfolioId) {
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

  public FieldValuesUpdatedMessagePayload portfolioPlanId(String portfolioPlanId) {
    this.portfolioPlanId = portfolioPlanId;
    return this;
  }

   /**
   * Get portfolioPlanId
   * @return portfolioPlanId
  **/
  @ApiModelProperty(value = "")
  public String getPortfolioPlanId() {
    return portfolioPlanId;
  }

  public void setPortfolioPlanId(String portfolioPlanId) {
    this.portfolioPlanId = portfolioPlanId;
  }

  public FieldValuesUpdatedMessagePayload fieldValues(List<FieldValue> fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

  public FieldValuesUpdatedMessagePayload addFieldValuesItem(FieldValue fieldValuesItem) {
    this.fieldValues.add(fieldValuesItem);
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @ApiModelProperty(required = true, value = "")
  public List<FieldValue> getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(List<FieldValue> fieldValues) {
    this.fieldValues = fieldValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldValuesUpdatedMessagePayload fieldValuesUpdatedMessagePayload = (FieldValuesUpdatedMessagePayload) o;
    return Objects.equals(this.portfolioId, fieldValuesUpdatedMessagePayload.portfolioId) &&
        Objects.equals(this.portfolioPlanId, fieldValuesUpdatedMessagePayload.portfolioPlanId) &&
        Objects.equals(this.fieldValues, fieldValuesUpdatedMessagePayload.fieldValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, portfolioPlanId, fieldValues);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldValuesUpdatedMessagePayload {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    portfolioPlanId: ").append(toIndentedString(portfolioPlanId)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
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
