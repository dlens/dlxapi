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
import com.decisionlens.client.model.FieldWeight;
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
 * ScoreWeight
 */

public class ScoreWeight extends DlResource {
  @SerializedName("name")
  private String name = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("fieldWeights")
  private List<FieldWeight> fieldWeights = null;

  public ScoreWeight name(String name) {
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

  public ScoreWeight isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public ScoreWeight fieldWeights(List<FieldWeight> fieldWeights) {
    this.fieldWeights = fieldWeights;
    return this;
  }

  public ScoreWeight addFieldWeightsItem(FieldWeight fieldWeightsItem) {
    if (this.fieldWeights == null) {
      this.fieldWeights = new ArrayList<FieldWeight>();
    }
    this.fieldWeights.add(fieldWeightsItem);
    return this;
  }

   /**
   * Get fieldWeights
   * @return fieldWeights
  **/
  @ApiModelProperty(value = "")
  public List<FieldWeight> getFieldWeights() {
    return fieldWeights;
  }

  public void setFieldWeights(List<FieldWeight> fieldWeights) {
    this.fieldWeights = fieldWeights;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScoreWeight scoreWeight = (ScoreWeight) o;
    return Objects.equals(this.name, scoreWeight.name) &&
        Objects.equals(this.isDefault, scoreWeight.isDefault) &&
        Objects.equals(this.fieldWeights, scoreWeight.fieldWeights) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isDefault, fieldWeights, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScoreWeight {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    fieldWeights: ").append(toIndentedString(fieldWeights)).append("\n");
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

