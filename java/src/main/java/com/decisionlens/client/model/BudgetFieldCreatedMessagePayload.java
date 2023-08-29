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
 * BudgetFieldCreatedMessagePayload
 */

public class BudgetFieldCreatedMessagePayload {
  @SerializedName("budgetFields")
  private List<Field> budgetFields = new ArrayList<Field>();

  public BudgetFieldCreatedMessagePayload budgetFields(List<Field> budgetFields) {
    this.budgetFields = budgetFields;
    return this;
  }

  public BudgetFieldCreatedMessagePayload addBudgetFieldsItem(Field budgetFieldsItem) {
    this.budgetFields.add(budgetFieldsItem);
    return this;
  }

   /**
   * Get budgetFields
   * @return budgetFields
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Field> getBudgetFields() {
    return budgetFields;
  }

  public void setBudgetFields(List<Field> budgetFields) {
    this.budgetFields = budgetFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetFieldCreatedMessagePayload budgetFieldCreatedMessagePayload = (BudgetFieldCreatedMessagePayload) o;
    return Objects.equals(this.budgetFields, budgetFieldCreatedMessagePayload.budgetFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetFieldCreatedMessagePayload {\n");
    
    sb.append("    budgetFields: ").append(toIndentedString(budgetFields)).append("\n");
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
