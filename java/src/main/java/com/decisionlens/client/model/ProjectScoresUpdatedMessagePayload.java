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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ProjectScoresUpdatedMessagePayload
 */

public class ProjectScoresUpdatedMessagePayload {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("dataId")
  private String dataId = null;

  public ProjectScoresUpdatedMessagePayload portfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
    return this;
  }

   /**
   * Get portfolioId
   * @return portfolioId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPortfolioId() {
    return portfolioId;
  }

  public void setPortfolioId(String portfolioId) {
    this.portfolioId = portfolioId;
  }

  public ProjectScoresUpdatedMessagePayload dataId(String dataId) {
    this.dataId = dataId;
    return this;
  }

   /**
   * Get dataId
   * @return dataId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDataId() {
    return dataId;
  }

  public void setDataId(String dataId) {
    this.dataId = dataId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectScoresUpdatedMessagePayload projectScoresUpdatedMessagePayload = (ProjectScoresUpdatedMessagePayload) o;
    return Objects.equals(this.portfolioId, projectScoresUpdatedMessagePayload.portfolioId) &&
        Objects.equals(this.dataId, projectScoresUpdatedMessagePayload.dataId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, dataId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectScoresUpdatedMessagePayload {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    dataId: ").append(toIndentedString(dataId)).append("\n");
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
