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
import com.decisionlens.client.model.TimePeriod;
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
 * AddAndDeleteFieldValuesForFieldsRequest
 */

public class AddAndDeleteFieldValuesForFieldsRequest {
  @SerializedName("fieldIdsToAdd")
  private List<String> fieldIdsToAdd = null;

  @SerializedName("fieldIdsToRemove")
  private List<String> fieldIdsToRemove = null;

  @SerializedName("timePeriods")
  private List<TimePeriod> timePeriods = null;

  @SerializedName("fieldValue")
  private FieldValue fieldValue = null;

  public AddAndDeleteFieldValuesForFieldsRequest fieldIdsToAdd(List<String> fieldIdsToAdd) {
    this.fieldIdsToAdd = fieldIdsToAdd;
    return this;
  }

  public AddAndDeleteFieldValuesForFieldsRequest addFieldIdsToAddItem(String fieldIdsToAddItem) {
    if (this.fieldIdsToAdd == null) {
      this.fieldIdsToAdd = new ArrayList<String>();
    }
    this.fieldIdsToAdd.add(fieldIdsToAddItem);
    return this;
  }

   /**
   * Get fieldIdsToAdd
   * @return fieldIdsToAdd
  **/
  @ApiModelProperty(value = "")
  public List<String> getFieldIdsToAdd() {
    return fieldIdsToAdd;
  }

  public void setFieldIdsToAdd(List<String> fieldIdsToAdd) {
    this.fieldIdsToAdd = fieldIdsToAdd;
  }

  public AddAndDeleteFieldValuesForFieldsRequest fieldIdsToRemove(List<String> fieldIdsToRemove) {
    this.fieldIdsToRemove = fieldIdsToRemove;
    return this;
  }

  public AddAndDeleteFieldValuesForFieldsRequest addFieldIdsToRemoveItem(String fieldIdsToRemoveItem) {
    if (this.fieldIdsToRemove == null) {
      this.fieldIdsToRemove = new ArrayList<String>();
    }
    this.fieldIdsToRemove.add(fieldIdsToRemoveItem);
    return this;
  }

   /**
   * Get fieldIdsToRemove
   * @return fieldIdsToRemove
  **/
  @ApiModelProperty(value = "")
  public List<String> getFieldIdsToRemove() {
    return fieldIdsToRemove;
  }

  public void setFieldIdsToRemove(List<String> fieldIdsToRemove) {
    this.fieldIdsToRemove = fieldIdsToRemove;
  }

  public AddAndDeleteFieldValuesForFieldsRequest timePeriods(List<TimePeriod> timePeriods) {
    this.timePeriods = timePeriods;
    return this;
  }

  public AddAndDeleteFieldValuesForFieldsRequest addTimePeriodsItem(TimePeriod timePeriodsItem) {
    if (this.timePeriods == null) {
      this.timePeriods = new ArrayList<TimePeriod>();
    }
    this.timePeriods.add(timePeriodsItem);
    return this;
  }

   /**
   * Get timePeriods
   * @return timePeriods
  **/
  @ApiModelProperty(value = "")
  public List<TimePeriod> getTimePeriods() {
    return timePeriods;
  }

  public void setTimePeriods(List<TimePeriod> timePeriods) {
    this.timePeriods = timePeriods;
  }

  public AddAndDeleteFieldValuesForFieldsRequest fieldValue(FieldValue fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * Get fieldValue
   * @return fieldValue
  **/
  @ApiModelProperty(value = "")
  public FieldValue getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(FieldValue fieldValue) {
    this.fieldValue = fieldValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAndDeleteFieldValuesForFieldsRequest addAndDeleteFieldValuesForFieldsRequest = (AddAndDeleteFieldValuesForFieldsRequest) o;
    return Objects.equals(this.fieldIdsToAdd, addAndDeleteFieldValuesForFieldsRequest.fieldIdsToAdd) &&
        Objects.equals(this.fieldIdsToRemove, addAndDeleteFieldValuesForFieldsRequest.fieldIdsToRemove) &&
        Objects.equals(this.timePeriods, addAndDeleteFieldValuesForFieldsRequest.timePeriods) &&
        Objects.equals(this.fieldValue, addAndDeleteFieldValuesForFieldsRequest.fieldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldIdsToAdd, fieldIdsToRemove, timePeriods, fieldValue);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAndDeleteFieldValuesForFieldsRequest {\n");
    
    sb.append("    fieldIdsToAdd: ").append(toIndentedString(fieldIdsToAdd)).append("\n");
    sb.append("    fieldIdsToRemove: ").append(toIndentedString(fieldIdsToRemove)).append("\n");
    sb.append("    timePeriods: ").append(toIndentedString(timePeriods)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
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
