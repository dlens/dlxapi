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
import com.decisionlens.client.model.DlResource;
import com.decisionlens.client.model.FieldGrades;
import com.decisionlens.client.model.Grade;
import com.decisionlens.client.model.PlanType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PlanGrade
 */

public class PlanGrade extends DlResource {
  @SerializedName("type")
  private PlanType type = null;

  @SerializedName("grade")
  private Grade grade = null;

  @SerializedName("fieldGrades")
  private FieldGrades fieldGrades = null;

  public PlanGrade type(PlanType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public PlanType getType() {
    return type;
  }

  public void setType(PlanType type) {
    this.type = type;
  }

  public PlanGrade grade(Grade grade) {
    this.grade = grade;
    return this;
  }

   /**
   * Get grade
   * @return grade
  **/
  @ApiModelProperty(value = "")
  public Grade getGrade() {
    return grade;
  }

  public void setGrade(Grade grade) {
    this.grade = grade;
  }

  public PlanGrade fieldGrades(FieldGrades fieldGrades) {
    this.fieldGrades = fieldGrades;
    return this;
  }

   /**
   * Get fieldGrades
   * @return fieldGrades
  **/
  @ApiModelProperty(value = "")
  public FieldGrades getFieldGrades() {
    return fieldGrades;
  }

  public void setFieldGrades(FieldGrades fieldGrades) {
    this.fieldGrades = fieldGrades;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanGrade planGrade = (PlanGrade) o;
    return Objects.equals(this.type, planGrade.type) &&
        Objects.equals(this.grade, planGrade.grade) &&
        Objects.equals(this.fieldGrades, planGrade.fieldGrades) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, grade, fieldGrades, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanGrade {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    fieldGrades: ").append(toIndentedString(fieldGrades)).append("\n");
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

