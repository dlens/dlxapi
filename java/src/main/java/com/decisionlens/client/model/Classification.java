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
 * Classification
 */

public class Classification {
  @SerializedName("phrase")
  private String phrase = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("targetType")
  private String targetType = null;

  @SerializedName("planFeature")
  private String planFeature = null;

  public Classification phrase(String phrase) {
    this.phrase = phrase;
    return this;
  }

   /**
   * Get phrase
   * @return phrase
  **/
  @ApiModelProperty(value = "")
  public String getPhrase() {
    return phrase;
  }

  public void setPhrase(String phrase) {
    this.phrase = phrase;
  }

  public Classification type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Classification targetType(String targetType) {
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  @ApiModelProperty(value = "")
  public String getTargetType() {
    return targetType;
  }

  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }

  public Classification planFeature(String planFeature) {
    this.planFeature = planFeature;
    return this;
  }

   /**
   * Get planFeature
   * @return planFeature
  **/
  @ApiModelProperty(value = "")
  public String getPlanFeature() {
    return planFeature;
  }

  public void setPlanFeature(String planFeature) {
    this.planFeature = planFeature;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Classification classification = (Classification) o;
    return Objects.equals(this.phrase, classification.phrase) &&
        Objects.equals(this.type, classification.type) &&
        Objects.equals(this.targetType, classification.targetType) &&
        Objects.equals(this.planFeature, classification.planFeature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phrase, type, targetType, planFeature);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Classification {\n");
    
    sb.append("    phrase: ").append(toIndentedString(phrase)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    planFeature: ").append(toIndentedString(planFeature)).append("\n");
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

