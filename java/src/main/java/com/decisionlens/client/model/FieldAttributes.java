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
import com.decisionlens.client.model.CategoryDisplayOrder;
import com.decisionlens.client.model.DataFormats;
import com.decisionlens.client.model.PlanningWindow;
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
 * FieldAttributes
 */

public class FieldAttributes {
  @SerializedName("planningWindow")
  private PlanningWindow planningWindow = null;

  @SerializedName("timePeriod")
  private TimePeriod timePeriod = null;

  @SerializedName("categoryDisplayOrder")
  private CategoryDisplayOrder categoryDisplayOrder = null;

  @SerializedName("dataFormats")
  private DataFormats dataFormats = null;

  public FieldAttributes planningWindow(PlanningWindow planningWindow) {
    this.planningWindow = planningWindow;
    return this;
  }

   /**
   * Get planningWindow
   * @return planningWindow
  **/
  @ApiModelProperty(value = "")
  public PlanningWindow getPlanningWindow() {
    return planningWindow;
  }

  public void setPlanningWindow(PlanningWindow planningWindow) {
    this.planningWindow = planningWindow;
  }

  public FieldAttributes timePeriod(TimePeriod timePeriod) {
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

  public FieldAttributes categoryDisplayOrder(CategoryDisplayOrder categoryDisplayOrder) {
    this.categoryDisplayOrder = categoryDisplayOrder;
    return this;
  }

   /**
   * Get categoryDisplayOrder
   * @return categoryDisplayOrder
  **/
  @ApiModelProperty(value = "")
  public CategoryDisplayOrder getCategoryDisplayOrder() {
    return categoryDisplayOrder;
  }

  public void setCategoryDisplayOrder(CategoryDisplayOrder categoryDisplayOrder) {
    this.categoryDisplayOrder = categoryDisplayOrder;
  }

  public FieldAttributes dataFormats(DataFormats dataFormats) {
    this.dataFormats = dataFormats;
    return this;
  }

   /**
   * Get dataFormats
   * @return dataFormats
  **/
  @ApiModelProperty(value = "")
  public DataFormats getDataFormats() {
    return dataFormats;
  }

  public void setDataFormats(DataFormats dataFormats) {
    this.dataFormats = dataFormats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldAttributes fieldAttributes = (FieldAttributes) o;
    return Objects.equals(this.planningWindow, fieldAttributes.planningWindow) &&
        Objects.equals(this.timePeriod, fieldAttributes.timePeriod) &&
        Objects.equals(this.categoryDisplayOrder, fieldAttributes.categoryDisplayOrder) &&
        Objects.equals(this.dataFormats, fieldAttributes.dataFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planningWindow, timePeriod, categoryDisplayOrder, dataFormats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldAttributes {\n");
    
    sb.append("    planningWindow: ").append(toIndentedString(planningWindow)).append("\n");
    sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
    sb.append("    categoryDisplayOrder: ").append(toIndentedString(categoryDisplayOrder)).append("\n");
    sb.append("    dataFormats: ").append(toIndentedString(dataFormats)).append("\n");
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

