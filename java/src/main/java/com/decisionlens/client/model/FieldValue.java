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
import com.decisionlens.client.model.Field;
import com.decisionlens.client.model.FieldValues;
import com.decisionlens.client.model.Project;
import com.decisionlens.client.model.TimePeriod;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FieldValue
 */

public class FieldValue {
  @SerializedName("field")
  private Field field = null;

  @SerializedName("project")
  private Project project = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("numericValue")
  private Double numericValue = null;

  @SerializedName("booleanValue")
  private Boolean booleanValue = null;

  @SerializedName("timePeriod")
  private TimePeriod timePeriod = null;

  @SerializedName("details")
  private FieldValues details = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("modifiedAt")
  private String modifiedAt = null;

  public FieldValue field(Field field) {
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

  public FieldValue project(Project project) {
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

  public FieldValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public FieldValue numericValue(Double numericValue) {
    this.numericValue = numericValue;
    return this;
  }

   /**
   * Get numericValue
   * @return numericValue
  **/
  @ApiModelProperty(value = "")
  public Double getNumericValue() {
    return numericValue;
  }

  public void setNumericValue(Double numericValue) {
    this.numericValue = numericValue;
  }

  public FieldValue booleanValue(Boolean booleanValue) {
    this.booleanValue = booleanValue;
    return this;
  }

   /**
   * Get booleanValue
   * @return booleanValue
  **/
  @ApiModelProperty(value = "")
  public Boolean isBooleanValue() {
    return booleanValue;
  }

  public void setBooleanValue(Boolean booleanValue) {
    this.booleanValue = booleanValue;
  }

  public FieldValue timePeriod(TimePeriod timePeriod) {
    this.timePeriod = timePeriod;
    return this;
  }

   /**
   * Get timePeriod
   * @return timePeriod
  **/
  @ApiModelProperty(value = "")
  public TimePeriod getTimePeriod() {
    return timePeriod;
  }

  public void setTimePeriod(TimePeriod timePeriod) {
    this.timePeriod = timePeriod;
  }

  public FieldValue details(FieldValues details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public FieldValues getDetails() {
    return details;
  }

  public void setDetails(FieldValues details) {
    this.details = details;
  }

  public FieldValue createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public FieldValue modifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

   /**
   * Get modifiedAt
   * @return modifiedAt
  **/
  @ApiModelProperty(value = "")
  public String getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(String modifiedAt) {
    this.modifiedAt = modifiedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldValue fieldValue = (FieldValue) o;
    return Objects.equals(this.field, fieldValue.field) &&
        Objects.equals(this.project, fieldValue.project) &&
        Objects.equals(this.value, fieldValue.value) &&
        Objects.equals(this.numericValue, fieldValue.numericValue) &&
        Objects.equals(this.booleanValue, fieldValue.booleanValue) &&
        Objects.equals(this.timePeriod, fieldValue.timePeriod) &&
        Objects.equals(this.details, fieldValue.details) &&
        Objects.equals(this.createdAt, fieldValue.createdAt) &&
        Objects.equals(this.modifiedAt, fieldValue.modifiedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, project, value, numericValue, booleanValue, timePeriod, details, createdAt, modifiedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldValue {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    numericValue: ").append(toIndentedString(numericValue)).append("\n");
    sb.append("    booleanValue: ").append(toIndentedString(booleanValue)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
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

