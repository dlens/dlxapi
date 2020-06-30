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
 * FieldTagAddedEvent
 */

public class FieldTagAddedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("tagParentName")
  private String tagParentName = null;

  @SerializedName("tagId")
  private String tagId = null;

  @SerializedName("tagColor")
  private String tagColor = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("tagName")
  private String tagName = null;

  @SerializedName("tagParentId")
  private String tagParentId = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public FieldTagAddedEvent portfolioId(String portfolioId) {
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

  public FieldTagAddedEvent tagParentName(String tagParentName) {
    this.tagParentName = tagParentName;
    return this;
  }

   /**
   * Get tagParentName
   * @return tagParentName
  **/
  @ApiModelProperty(value = "")
  public String getTagParentName() {
    return tagParentName;
  }

  public void setTagParentName(String tagParentName) {
    this.tagParentName = tagParentName;
  }

  public FieldTagAddedEvent tagId(String tagId) {
    this.tagId = tagId;
    return this;
  }

   /**
   * Get tagId
   * @return tagId
  **/
  @ApiModelProperty(value = "")
  public String getTagId() {
    return tagId;
  }

  public void setTagId(String tagId) {
    this.tagId = tagId;
  }

  public FieldTagAddedEvent tagColor(String tagColor) {
    this.tagColor = tagColor;
    return this;
  }

   /**
   * Get tagColor
   * @return tagColor
  **/
  @ApiModelProperty(value = "")
  public String getTagColor() {
    return tagColor;
  }

  public void setTagColor(String tagColor) {
    this.tagColor = tagColor;
  }

  public FieldTagAddedEvent name(String name) {
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

  public FieldTagAddedEvent id(String id) {
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

  public FieldTagAddedEvent tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @ApiModelProperty(value = "")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public FieldTagAddedEvent tagParentId(String tagParentId) {
    this.tagParentId = tagParentId;
    return this;
  }

   /**
   * Get tagParentId
   * @return tagParentId
  **/
  @ApiModelProperty(value = "")
  public String getTagParentId() {
    return tagParentId;
  }

  public void setTagParentId(String tagParentId) {
    this.tagParentId = tagParentId;
  }

  public FieldTagAddedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    FieldTagAddedEvent fieldTagAddedEvent = (FieldTagAddedEvent) o;
    return Objects.equals(this.portfolioId, fieldTagAddedEvent.portfolioId) &&
        Objects.equals(this.tagParentName, fieldTagAddedEvent.tagParentName) &&
        Objects.equals(this.tagId, fieldTagAddedEvent.tagId) &&
        Objects.equals(this.tagColor, fieldTagAddedEvent.tagColor) &&
        Objects.equals(this.name, fieldTagAddedEvent.name) &&
        Objects.equals(this.id, fieldTagAddedEvent.id) &&
        Objects.equals(this.tagName, fieldTagAddedEvent.tagName) &&
        Objects.equals(this.tagParentId, fieldTagAddedEvent.tagParentId) &&
        Objects.equals(this.portfolioPlan, fieldTagAddedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, tagParentName, tagId, tagColor, name, id, tagName, tagParentId, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldTagAddedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    tagParentName: ").append(toIndentedString(tagParentName)).append("\n");
    sb.append("    tagId: ").append(toIndentedString(tagId)).append("\n");
    sb.append("    tagColor: ").append(toIndentedString(tagColor)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    tagParentId: ").append(toIndentedString(tagParentId)).append("\n");
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

