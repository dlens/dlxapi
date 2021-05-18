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
import com.decisionlens.client.model.LikertScaleInsight;
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
 * LikertScaleFieldInsight
 */

public class LikertScaleFieldInsight {
  @SerializedName("fieldId")
  private String fieldId = null;

  @SerializedName("likertScaleInsights")
  private List<LikertScaleInsight> likertScaleInsights = null;

  public LikertScaleFieldInsight fieldId(String fieldId) {
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

  public LikertScaleFieldInsight likertScaleInsights(List<LikertScaleInsight> likertScaleInsights) {
    this.likertScaleInsights = likertScaleInsights;
    return this;
  }

  public LikertScaleFieldInsight addLikertScaleInsightsItem(LikertScaleInsight likertScaleInsightsItem) {
    if (this.likertScaleInsights == null) {
      this.likertScaleInsights = new ArrayList<LikertScaleInsight>();
    }
    this.likertScaleInsights.add(likertScaleInsightsItem);
    return this;
  }

   /**
   * Get likertScaleInsights
   * @return likertScaleInsights
  **/
  @ApiModelProperty(value = "")
  public List<LikertScaleInsight> getLikertScaleInsights() {
    return likertScaleInsights;
  }

  public void setLikertScaleInsights(List<LikertScaleInsight> likertScaleInsights) {
    this.likertScaleInsights = likertScaleInsights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LikertScaleFieldInsight likertScaleFieldInsight = (LikertScaleFieldInsight) o;
    return Objects.equals(this.fieldId, likertScaleFieldInsight.fieldId) &&
        Objects.equals(this.likertScaleInsights, likertScaleFieldInsight.likertScaleInsights);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, likertScaleInsights);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LikertScaleFieldInsight {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    likertScaleInsights: ").append(toIndentedString(likertScaleInsights)).append("\n");
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

