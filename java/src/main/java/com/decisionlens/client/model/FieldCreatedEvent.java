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
import com.decisionlens.client.model.DataType;
import com.decisionlens.client.model.Field;
import com.decisionlens.client.model.FieldType;
import com.decisionlens.client.model.PortfolioPlan;
import com.decisionlens.client.model.TargetType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FieldCreatedEvent
 */

public class FieldCreatedEvent {
  @SerializedName("sourceId")
  private String sourceId = null;

  @SerializedName("parent")
  private Field parent = null;

  @SerializedName("isFieldTypeApproved")
  private Boolean isFieldTypeApproved = null;

  @SerializedName("isIdeaFieldRequired")
  private Boolean isIdeaFieldRequired = null;

  @SerializedName("typePosition")
  private Integer typePosition = null;

  @SerializedName("dataType")
  private DataType dataType = null;

  @SerializedName("targetType")
  private TargetType targetType = null;

  @SerializedName("isFromImport")
  private Boolean isFromImport = null;

  @SerializedName("originalName")
  private String originalName = null;

  @SerializedName("isIdeaField")
  private Boolean isIdeaField = null;

  @SerializedName("portfolioId")
  private String portfolioId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("ideaFieldPosition")
  private Integer ideaFieldPosition = null;

  @SerializedName("fieldType")
  private FieldType fieldType = null;

  @SerializedName("portfolioPlan")
  private PortfolioPlan portfolioPlan = null;

  public FieldCreatedEvent sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }

   /**
   * Get sourceId
   * @return sourceId
  **/
  @ApiModelProperty(value = "")
  public String getSourceId() {
    return sourceId;
  }

  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }

  public FieldCreatedEvent parent(Field parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public Field getParent() {
    return parent;
  }

  public void setParent(Field parent) {
    this.parent = parent;
  }

  public FieldCreatedEvent isFieldTypeApproved(Boolean isFieldTypeApproved) {
    this.isFieldTypeApproved = isFieldTypeApproved;
    return this;
  }

   /**
   * Get isFieldTypeApproved
   * @return isFieldTypeApproved
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFieldTypeApproved() {
    return isFieldTypeApproved;
  }

  public void setIsFieldTypeApproved(Boolean isFieldTypeApproved) {
    this.isFieldTypeApproved = isFieldTypeApproved;
  }

  public FieldCreatedEvent isIdeaFieldRequired(Boolean isIdeaFieldRequired) {
    this.isIdeaFieldRequired = isIdeaFieldRequired;
    return this;
  }

   /**
   * Get isIdeaFieldRequired
   * @return isIdeaFieldRequired
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsIdeaFieldRequired() {
    return isIdeaFieldRequired;
  }

  public void setIsIdeaFieldRequired(Boolean isIdeaFieldRequired) {
    this.isIdeaFieldRequired = isIdeaFieldRequired;
  }

  public FieldCreatedEvent typePosition(Integer typePosition) {
    this.typePosition = typePosition;
    return this;
  }

   /**
   * Get typePosition
   * @return typePosition
  **/
  @ApiModelProperty(value = "")
  public Integer getTypePosition() {
    return typePosition;
  }

  public void setTypePosition(Integer typePosition) {
    this.typePosition = typePosition;
  }

  public FieldCreatedEvent dataType(DataType dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @ApiModelProperty(value = "")
  public DataType getDataType() {
    return dataType;
  }

  public void setDataType(DataType dataType) {
    this.dataType = dataType;
  }

  public FieldCreatedEvent targetType(TargetType targetType) {
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  @ApiModelProperty(value = "")
  public TargetType getTargetType() {
    return targetType;
  }

  public void setTargetType(TargetType targetType) {
    this.targetType = targetType;
  }

  public FieldCreatedEvent isFromImport(Boolean isFromImport) {
    this.isFromImport = isFromImport;
    return this;
  }

   /**
   * Get isFromImport
   * @return isFromImport
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsFromImport() {
    return isFromImport;
  }

  public void setIsFromImport(Boolean isFromImport) {
    this.isFromImport = isFromImport;
  }

  public FieldCreatedEvent originalName(String originalName) {
    this.originalName = originalName;
    return this;
  }

   /**
   * Get originalName
   * @return originalName
  **/
  @ApiModelProperty(value = "")
  public String getOriginalName() {
    return originalName;
  }

  public void setOriginalName(String originalName) {
    this.originalName = originalName;
  }

  public FieldCreatedEvent isIdeaField(Boolean isIdeaField) {
    this.isIdeaField = isIdeaField;
    return this;
  }

   /**
   * Get isIdeaField
   * @return isIdeaField
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsIdeaField() {
    return isIdeaField;
  }

  public void setIsIdeaField(Boolean isIdeaField) {
    this.isIdeaField = isIdeaField;
  }

  public FieldCreatedEvent portfolioId(String portfolioId) {
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

  public FieldCreatedEvent name(String name) {
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

  public FieldCreatedEvent id(String id) {
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

  public FieldCreatedEvent position(Integer position) {
    this.position = position;
    return this;
  }

   /**
   * Get position
   * @return position
  **/
  @ApiModelProperty(value = "")
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public FieldCreatedEvent ideaFieldPosition(Integer ideaFieldPosition) {
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

  public FieldCreatedEvent fieldType(FieldType fieldType) {
    this.fieldType = fieldType;
    return this;
  }

   /**
   * Get fieldType
   * @return fieldType
  **/
  @ApiModelProperty(value = "")
  public FieldType getFieldType() {
    return fieldType;
  }

  public void setFieldType(FieldType fieldType) {
    this.fieldType = fieldType;
  }

  public FieldCreatedEvent portfolioPlan(PortfolioPlan portfolioPlan) {
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
    FieldCreatedEvent fieldCreatedEvent = (FieldCreatedEvent) o;
    return Objects.equals(this.sourceId, fieldCreatedEvent.sourceId) &&
        Objects.equals(this.parent, fieldCreatedEvent.parent) &&
        Objects.equals(this.isFieldTypeApproved, fieldCreatedEvent.isFieldTypeApproved) &&
        Objects.equals(this.isIdeaFieldRequired, fieldCreatedEvent.isIdeaFieldRequired) &&
        Objects.equals(this.typePosition, fieldCreatedEvent.typePosition) &&
        Objects.equals(this.dataType, fieldCreatedEvent.dataType) &&
        Objects.equals(this.targetType, fieldCreatedEvent.targetType) &&
        Objects.equals(this.isFromImport, fieldCreatedEvent.isFromImport) &&
        Objects.equals(this.originalName, fieldCreatedEvent.originalName) &&
        Objects.equals(this.isIdeaField, fieldCreatedEvent.isIdeaField) &&
        Objects.equals(this.portfolioId, fieldCreatedEvent.portfolioId) &&
        Objects.equals(this.name, fieldCreatedEvent.name) &&
        Objects.equals(this.id, fieldCreatedEvent.id) &&
        Objects.equals(this.position, fieldCreatedEvent.position) &&
        Objects.equals(this.ideaFieldPosition, fieldCreatedEvent.ideaFieldPosition) &&
        Objects.equals(this.fieldType, fieldCreatedEvent.fieldType) &&
        Objects.equals(this.portfolioPlan, fieldCreatedEvent.portfolioPlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, parent, isFieldTypeApproved, isIdeaFieldRequired, typePosition, dataType, targetType, isFromImport, originalName, isIdeaField, portfolioId, name, id, position, ideaFieldPosition, fieldType, portfolioPlan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldCreatedEvent {\n");
    
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    isFieldTypeApproved: ").append(toIndentedString(isFieldTypeApproved)).append("\n");
    sb.append("    isIdeaFieldRequired: ").append(toIndentedString(isIdeaFieldRequired)).append("\n");
    sb.append("    typePosition: ").append(toIndentedString(typePosition)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    isFromImport: ").append(toIndentedString(isFromImport)).append("\n");
    sb.append("    originalName: ").append(toIndentedString(originalName)).append("\n");
    sb.append("    isIdeaField: ").append(toIndentedString(isIdeaField)).append("\n");
    sb.append("    portfolioId: ").append(toIndentedString(portfolioId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    ideaFieldPosition: ").append(toIndentedString(ideaFieldPosition)).append("\n");
    sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
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

