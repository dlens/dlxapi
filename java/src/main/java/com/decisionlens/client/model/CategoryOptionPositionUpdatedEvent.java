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
 * CategoryOptionPositionUpdatedEvent
 */

public class CategoryOptionPositionUpdatedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("previousPosition")
  private Integer previousPosition = null;

  @SerializedName("fieldId")
  private String fieldId = null;

  public CategoryOptionPositionUpdatedEvent portfolioId(String portfolioId) {
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

  public CategoryOptionPositionUpdatedEvent id(String id) {
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

  public CategoryOptionPositionUpdatedEvent position(Integer position) {
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

  public CategoryOptionPositionUpdatedEvent previousPosition(Integer previousPosition) {
    this.previousPosition = previousPosition;
    return this;
  }

   /**
   * Get previousPosition
   * @return previousPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getPreviousPosition() {
    return previousPosition;
  }

  public void setPreviousPosition(Integer previousPosition) {
    this.previousPosition = previousPosition;
  }

  public CategoryOptionPositionUpdatedEvent fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * Get fieldId
   * @return fieldId
  **/
  @ApiModelProperty(value = "")
  public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CategoryOptionPositionUpdatedEvent categoryOptionPositionUpdatedEvent = (CategoryOptionPositionUpdatedEvent) o;
    return Objects.equals(this.portfolioId, categoryOptionPositionUpdatedEvent.portfolioId) &&
        Objects.equals(this.id, categoryOptionPositionUpdatedEvent.id) &&
        Objects.equals(this.position, categoryOptionPositionUpdatedEvent.position) &&
        Objects.equals(this.previousPosition, categoryOptionPositionUpdatedEvent.previousPosition) &&
        Objects.equals(this.fieldId, categoryOptionPositionUpdatedEvent.fieldId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, id, position, previousPosition, fieldId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CategoryOptionPositionUpdatedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    previousPosition: ").append(toIndentedString(previousPosition)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
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

