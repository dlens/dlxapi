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
 * AttachmentNameUpdatedEvent
 */

public class AttachmentNameUpdatedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("previousName")
  private String previousName = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public AttachmentNameUpdatedEvent portfolioId(String portfolioId) {
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

  public AttachmentNameUpdatedEvent size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public AttachmentNameUpdatedEvent previousName(String previousName) {
    this.previousName = previousName;
    return this;
  }

   /**
   * Get previousName
   * @return previousName
  **/
  @ApiModelProperty(value = "")
  public String getPreviousName() {
    return previousName;
  }

  public void setPreviousName(String previousName) {
    this.previousName = previousName;
  }

  public AttachmentNameUpdatedEvent name(String name) {
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

  public AttachmentNameUpdatedEvent id(String id) {
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

  public AttachmentNameUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    AttachmentNameUpdatedEvent attachmentNameUpdatedEvent = (AttachmentNameUpdatedEvent) o;
    return Objects.equals(this.portfolioId, attachmentNameUpdatedEvent.portfolioId) &&
        Objects.equals(this.size, attachmentNameUpdatedEvent.size) &&
        Objects.equals(this.previousName, attachmentNameUpdatedEvent.previousName) &&
        Objects.equals(this.name, attachmentNameUpdatedEvent.name) &&
        Objects.equals(this.id, attachmentNameUpdatedEvent.id) &&
        Objects.equals(this.portfolioPlan, attachmentNameUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, size, previousName, name, id, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentNameUpdatedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    previousName: ").append(toIndentedString(previousName)).append("\n");
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

