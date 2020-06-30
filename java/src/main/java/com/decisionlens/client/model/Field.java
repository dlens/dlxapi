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
import com.decisionlens.client.model.DlResource;
import com.decisionlens.client.model.Field;
import com.decisionlens.client.model.FieldType;
import com.decisionlens.client.model.FieldValues;
import com.decisionlens.client.model.Portfolio;
import com.decisionlens.client.model.Source;
import com.decisionlens.client.model.TargetType;
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
 * Field
 */

public class Field extends DlResource {
  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("type")
  private FieldType type = null;

  @SerializedName("source")
  private Source source = null;

  @SerializedName("portfolio")
  private Portfolio portfolio = null;

  @SerializedName("parent")
  private Field parent = null;

  @SerializedName("position")
  private Integer position = null;

  @SerializedName("typePosition")
  private Integer typePosition = null;

  @SerializedName("fieldValues")
  private FieldValues fieldValues = null;

  @SerializedName("targetType")
  private TargetType targetType = null;

  @SerializedName("dataType")
  private DataType dataType = null;

  @SerializedName("isFieldTypeApproved")
  private Boolean isFieldTypeApproved = true;

  @SerializedName("tagIds")
  private List<String> tagIds = null;

  @SerializedName("isIdeaField")
  private Boolean isIdeaField = false;

  @SerializedName("ideaFieldPosition")
  private Integer ideaFieldPosition = null;

  @SerializedName("isIdeaFieldRequired")
  private Boolean isIdeaFieldRequired = false;

  public Field name(String name) {
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

  public Field description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Field type(FieldType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public FieldType getType() {
    return type;
  }

  public void setType(FieldType type) {
    this.type = type;
  }

  public Field source(Source source) {
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @ApiModelProperty(value = "")
  public Source getSource() {
    return source;
  }

  public void setSource(Source source) {
    this.source = source;
  }

  public Field portfolio(Portfolio portfolio) {
    this.portfolio = portfolio;
    return this;
  }

   /**
   * Get portfolio
   * @return portfolio
  **/
  @ApiModelProperty(value = "")
  public Portfolio getPortfolio() {
    return portfolio;
  }

  public void setPortfolio(Portfolio portfolio) {
    this.portfolio = portfolio;
  }

  public Field parent(Field parent) {
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

  public Field position(Integer position) {
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

  public Field typePosition(Integer typePosition) {
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

  public Field fieldValues(FieldValues fieldValues) {
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

  public Field targetType(TargetType targetType) {
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

  public Field dataType(DataType dataType) {
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

  public Field isFieldTypeApproved(Boolean isFieldTypeApproved) {
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

  public Field tagIds(List<String> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public Field addTagIdsItem(String tagIdsItem) {
    if (this.tagIds == null) {
      this.tagIds = new ArrayList<String>();
    }
    this.tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * Get tagIds
   * @return tagIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getTagIds() {
    return tagIds;
  }

  public void setTagIds(List<String> tagIds) {
    this.tagIds = tagIds;
  }

  public Field isIdeaField(Boolean isIdeaField) {
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

  public Field ideaFieldPosition(Integer ideaFieldPosition) {
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

  public Field isIdeaFieldRequired(Boolean isIdeaFieldRequired) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.name, field.name) &&
        Objects.equals(this.description, field.description) &&
        Objects.equals(this.type, field.type) &&
        Objects.equals(this.source, field.source) &&
        Objects.equals(this.portfolio, field.portfolio) &&
        Objects.equals(this.parent, field.parent) &&
        Objects.equals(this.position, field.position) &&
        Objects.equals(this.typePosition, field.typePosition) &&
        Objects.equals(this.fieldValues, field.fieldValues) &&
        Objects.equals(this.targetType, field.targetType) &&
        Objects.equals(this.dataType, field.dataType) &&
        Objects.equals(this.isFieldTypeApproved, field.isFieldTypeApproved) &&
        Objects.equals(this.tagIds, field.tagIds) &&
        Objects.equals(this.isIdeaField, field.isIdeaField) &&
        Objects.equals(this.ideaFieldPosition, field.ideaFieldPosition) &&
        Objects.equals(this.isIdeaFieldRequired, field.isIdeaFieldRequired) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, type, source, portfolio, parent, position, typePosition, fieldValues, targetType, dataType, isFieldTypeApproved, tagIds, isIdeaField, ideaFieldPosition, isIdeaFieldRequired, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    portfolio: ").append(toIndentedString(portfolio)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    typePosition: ").append(toIndentedString(typePosition)).append("\n");
    sb.append("    fieldValues: ").append(toIndentedString(fieldValues)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    isFieldTypeApproved: ").append(toIndentedString(isFieldTypeApproved)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
    sb.append("    isIdeaField: ").append(toIndentedString(isIdeaField)).append("\n");
    sb.append("    ideaFieldPosition: ").append(toIndentedString(ideaFieldPosition)).append("\n");
    sb.append("    isIdeaFieldRequired: ").append(toIndentedString(isIdeaFieldRequired)).append("\n");
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
