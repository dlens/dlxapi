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
import com.decisionlens.client.model.FieldType;
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
 * IdeaFormFieldRequest
 */

public class IdeaFormFieldRequest {
  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("fieldIds")
  private List<String> fieldIds = null;

  @SerializedName("fieldTypes")
  private List<FieldType> fieldTypes = null;

  @SerializedName("isIncluded")
  private Boolean isIncluded = null;

  @SerializedName("isRequired")
  private Boolean isRequired = null;

  @SerializedName("ideaFieldPosition")
  private Integer ideaFieldPosition = null;

  public IdeaFormFieldRequest portfolioId(String portfolioId) {
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

  public IdeaFormFieldRequest fieldIds(List<String> fieldIds) {
    this.fieldIds = fieldIds;
    return this;
  }

  public IdeaFormFieldRequest addFieldIdsItem(String fieldIdsItem) {
    if (this.fieldIds == null) {
      this.fieldIds = new ArrayList<String>();
    }
    this.fieldIds.add(fieldIdsItem);
    return this;
  }

   /**
   * Get fieldIds
   * @return fieldIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getFieldIds() {
    return fieldIds;
  }

  public void setFieldIds(List<String> fieldIds) {
    this.fieldIds = fieldIds;
  }

  public IdeaFormFieldRequest fieldTypes(List<FieldType> fieldTypes) {
    this.fieldTypes = fieldTypes;
    return this;
  }

  public IdeaFormFieldRequest addFieldTypesItem(FieldType fieldTypesItem) {
    if (this.fieldTypes == null) {
      this.fieldTypes = new ArrayList<FieldType>();
    }
    this.fieldTypes.add(fieldTypesItem);
    return this;
  }

   /**
   * Get fieldTypes
   * @return fieldTypes
  **/
  @ApiModelProperty(value = "")
  public List<FieldType> getFieldTypes() {
    return fieldTypes;
  }

  public void setFieldTypes(List<FieldType> fieldTypes) {
    this.fieldTypes = fieldTypes;
  }

  public IdeaFormFieldRequest isIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
    return this;
  }

   /**
   * Get isIncluded
   * @return isIncluded
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsIncluded() {
    return isIncluded;
  }

  public void setIsIncluded(Boolean isIncluded) {
    this.isIncluded = isIncluded;
  }

  public IdeaFormFieldRequest isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }

   /**
   * Get isRequired
   * @return isRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsRequired() {
    return isRequired;
  }

  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }

  public IdeaFormFieldRequest ideaFieldPosition(Integer ideaFieldPosition) {
    this.ideaFieldPosition = ideaFieldPosition;
    return this;
  }

   /**
   * Get ideaFieldPosition
   * @return ideaFieldPosition
  **/
  @ApiModelProperty(value = "")
  public Integer getIdeaFieldPosition() {
    return ideaFieldPosition;
  }

  public void setIdeaFieldPosition(Integer ideaFieldPosition) {
    this.ideaFieldPosition = ideaFieldPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdeaFormFieldRequest ideaFormFieldRequest = (IdeaFormFieldRequest) o;
    return Objects.equals(this.portfolioId, ideaFormFieldRequest.portfolioId) &&
        Objects.equals(this.fieldIds, ideaFormFieldRequest.fieldIds) &&
        Objects.equals(this.fieldTypes, ideaFormFieldRequest.fieldTypes) &&
        Objects.equals(this.isIncluded, ideaFormFieldRequest.isIncluded) &&
        Objects.equals(this.isRequired, ideaFormFieldRequest.isRequired) &&
        Objects.equals(this.ideaFieldPosition, ideaFormFieldRequest.ideaFieldPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioId, fieldIds, fieldTypes, isIncluded, isRequired, ideaFieldPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdeaFormFieldRequest {\n");
    
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    fieldIds: ").append(toIndentedString(fieldIds)).append("\n");
    sb.append("    fieldTypes: ").append(toIndentedString(fieldTypes)).append("\n");
    sb.append("    isIncluded: ").append(toIndentedString(isIncluded)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
    sb.append("    ideaFieldPosition: ").append(toIndentedString(ideaFieldPosition)).append("\n");
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
