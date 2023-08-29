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
import com.decisionlens.client.model.CategoryOption;
import com.decisionlens.client.model.Field;
import com.decisionlens.client.model.PortfolioPlan;
import com.decisionlens.client.model.Project;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * ScalePointAutoScaleValueUpdatedEvent
 */

public class ScalePointAutoScaleValueUpdatedEvent {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("field")
  private Field field = null;

  @SerializedName("autoScaleValue")
  private BigDecimal autoScaleValue = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("project")
  private Project project = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("previousAutoScaleValue")
  private BigDecimal previousAutoScaleValue = null;

  @SerializedName("category")
  private CategoryOption category = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public ScalePointAutoScaleValueUpdatedEvent portfolioId(String portfolioId) {
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

  public ScalePointAutoScaleValueUpdatedEvent field(Field field) {
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

  public ScalePointAutoScaleValueUpdatedEvent autoScaleValue(BigDecimal autoScaleValue) {
    this.autoScaleValue = autoScaleValue;
    return this;
  }

   /**
   * Get autoScaleValue
   * @return autoScaleValue
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAutoScaleValue() {
    return autoScaleValue;
  }

  public void setAutoScaleValue(BigDecimal autoScaleValue) {
    this.autoScaleValue = autoScaleValue;
  }

  public ScalePointAutoScaleValueUpdatedEvent name(String name) {
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

  public ScalePointAutoScaleValueUpdatedEvent project(Project project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  @ApiModelProperty(value = "")
  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public ScalePointAutoScaleValueUpdatedEvent id(String id) {
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

  public ScalePointAutoScaleValueUpdatedEvent previousAutoScaleValue(BigDecimal previousAutoScaleValue) {
    this.previousAutoScaleValue = previousAutoScaleValue;
    return this;
  }

   /**
   * Get previousAutoScaleValue
   * @return previousAutoScaleValue
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getPreviousAutoScaleValue() {
    return previousAutoScaleValue;
  }

  public void setPreviousAutoScaleValue(BigDecimal previousAutoScaleValue) {
    this.previousAutoScaleValue = previousAutoScaleValue;
  }

  public ScalePointAutoScaleValueUpdatedEvent category(CategoryOption category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(value = "")
  public CategoryOption getCategory() {
    return category;
  }

  public void setCategory(CategoryOption category) {
    this.category = category;
  }

  public ScalePointAutoScaleValueUpdatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    ScalePointAutoScaleValueUpdatedEvent scalePointAutoScaleValueUpdatedEvent = (ScalePointAutoScaleValueUpdatedEvent) o;
    return Objects.equals(this.portfolioId, scalePointAutoScaleValueUpdatedEvent.portfolioId) &&
        Objects.equals(this.field, scalePointAutoScaleValueUpdatedEvent.field) &&
        Objects.equals(this.autoScaleValue, scalePointAutoScaleValueUpdatedEvent.autoScaleValue) &&
        Objects.equals(this.name, scalePointAutoScaleValueUpdatedEvent.name) &&
        Objects.equals(this.project, scalePointAutoScaleValueUpdatedEvent.project) &&
        Objects.equals(this.id, scalePointAutoScaleValueUpdatedEvent.id) &&
        Objects.equals(this.previousAutoScaleValue, scalePointAutoScaleValueUpdatedEvent.previousAutoScaleValue) &&
        Objects.equals(this.category, scalePointAutoScaleValueUpdatedEvent.category) &&
        Objects.equals(this.portfolioPlan, scalePointAutoScaleValueUpdatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, field, autoScaleValue, name, project, id, previousAutoScaleValue, category, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScalePointAutoScaleValueUpdatedEvent {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    autoScaleValue: ").append(toIndentedString(autoScaleValue)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    previousAutoScaleValue: ").append(toIndentedString(previousAutoScaleValue)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
