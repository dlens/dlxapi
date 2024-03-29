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
import java.util.ArrayList;
import java.util.List;

/**
 * Row
 */

public class Row {
  @SerializedName("size")
  private Integer size = null;

  @SerializedName("columns")
  private List<String> columns = null;

  @SerializedName("dataFormats")
  private List<String> dataFormats = null;

  public Row size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public Row columns(List<String> columns) {
    this.columns = columns;
    return this;
  }

  public Row addColumnsItem(String columnsItem) {
    if (this.columns == null) {
      this.columns = new ArrayList<String>();
    }
    this.columns.add(columnsItem);
    return this;
  }

   /**
   * Get columns
   * @return columns
  **/
  @ApiModelProperty(value = "")
  public List<String> getColumns() {
    return columns;
  }

  public void setColumns(List<String> columns) {
    this.columns = columns;
  }

  public Row dataFormats(List<String> dataFormats) {
    this.dataFormats = dataFormats;
    return this;
  }

  public Row addDataFormatsItem(String dataFormatsItem) {
    if (this.dataFormats == null) {
      this.dataFormats = new ArrayList<String>();
    }
    this.dataFormats.add(dataFormatsItem);
    return this;
  }

   /**
   * Get dataFormats
   * @return dataFormats
  **/
  @ApiModelProperty(value = "")
  public List<String> getDataFormats() {
    return dataFormats;
  }

  public void setDataFormats(List<String> dataFormats) {
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
    Row row = (Row) o;
    return Objects.equals(this.size, row.size) &&
        Objects.equals(this.columns, row.columns) &&
        Objects.equals(this.dataFormats, row.dataFormats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, columns, dataFormats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Row {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
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

