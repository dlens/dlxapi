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
 * PortfolioPlanDataImportedEvent
 */

public class PortfolioPlanDataImportedEvent {
  @SerializedName("fileName")
  private String fileName = null;

  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("sheetName")
  private String sheetName = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public PortfolioPlanDataImportedEvent fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

   /**
   * Get fileName
   * @return fileName
  **/
  @ApiModelProperty(value = "")
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public PortfolioPlanDataImportedEvent portfolioId(String portfolioId) {
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

  public PortfolioPlanDataImportedEvent sheetName(String sheetName) {
    this.sheetName = sheetName;
    return this;
  }

   /**
   * Get sheetName
   * @return sheetName
  **/
  @ApiModelProperty(value = "")
  public String getSheetName() {
    return sheetName;
  }

  public void setSheetName(String sheetName) {
    this.sheetName = sheetName;
  }

  public PortfolioPlanDataImportedEvent id(String id) {
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

  public PortfolioPlanDataImportedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    PortfolioPlanDataImportedEvent portfolioPlanDataImportedEvent = (PortfolioPlanDataImportedEvent) o;
    return Objects.equals(this.fileName, portfolioPlanDataImportedEvent.fileName) &&
        Objects.equals(this.portfolioId, portfolioPlanDataImportedEvent.portfolioId) &&
        Objects.equals(this.sheetName, portfolioPlanDataImportedEvent.sheetName) &&
        Objects.equals(this.id, portfolioPlanDataImportedEvent.id) &&
        Objects.equals(this.portfolioPlan, portfolioPlanDataImportedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileName, portfolioId, sheetName, id, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioPlanDataImportedEvent {\n");
    
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    sheetName: ").append(toIndentedString(sheetName)).append("\n");
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

