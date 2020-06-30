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
import com.decisionlens.client.model.FieldValues;
import com.decisionlens.client.model.PortfolioPlanGrades;
import com.decisionlens.client.model.Project;
import com.decisionlens.client.model.RecommendationType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Recommendation
 */

public class Recommendation {
  @SerializedName("type")
  private RecommendationType type = null;

  @SerializedName("fieldValues")
  private FieldValues fieldValues = null;

  @SerializedName("portfolioPlanGrades")
  private PortfolioPlanGrades portfolioPlanGrades = null;

  @SerializedName("project")
  private Project project = null;

  public Recommendation type(RecommendationType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public RecommendationType getType() {
    return type;
  }

  public void setType(RecommendationType type) {
    this.type = type;
  }

  public Recommendation fieldValues(FieldValues fieldValues) {
    this.fieldValues = fieldValues;
    return this;
  }

   /**
   * Get fieldValues
   * @return fieldValues
  **/
  @ApiModelProperty(value = "")
  public FieldValues getFieldValues() {
    return fieldValues;
  }

  public void setFieldValues(FieldValues fieldValues) {
    this.fieldValues = fieldValues;
  }

  public Recommendation portfolioPlanGrades(PortfolioPlanGrades portfolioPlanGrades) {
    this.portfolioPlanGrades = portfolioPlanGrades;
    return this;
  }

   /**
   * Get portfolioPlanGrades
   * @return portfolioPlanGrades
  **/
  @ApiModelProperty(value = "")
  public PortfolioPlanGrades getPortfolioPlanGrades() {
    return portfolioPlanGrades;
  }

  public void setPortfolioPlanGrades(PortfolioPlanGrades portfolioPlanGrades) {
    this.portfolioPlanGrades = portfolioPlanGrades;
  }

  public Recommendation project(Project project) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Recommendation recommendation = (Recommendation) o;
    return Objects.equals(this.type, recommendation.type) &&
        Objects.equals(this.fieldValues, recommendation.fieldValues) &&
        Objects.equals(this.portfolioPlanGrades, recommendation.portfolioPlanGrades) &&
        Objects.equals(this.project, recommendation.project);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fieldValues, portfolioPlanGrades, project);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Recommendation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    portfolioPlanGrades: ").append(toIndentedString(portfolioPlanGrades)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
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
