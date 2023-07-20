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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets ImportType
 */
@JsonAdapter(ImportType.Adapter.class)
public enum ImportType {
  
  PROJECT("PROJECT"),
  
  BUDGET("BUDGET"),
  
  BUDGET_AMOUNTS("BUDGET_AMOUNTS"),
  
  COST("COST"),
  
  COSTAGGREGATE("COSTAGGREGATE"),
  
  ALLOCATE("ALLOCATE"),
  
  SPEND_PLANNED("SPEND_PLANNED"),
  
  SPEND_ACTUAL("SPEND_ACTUAL");

  private String value;

  ImportType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ImportType fromValue(String text) {
    for (ImportType b : ImportType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ImportType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ImportType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ImportType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ImportType.fromValue(String.valueOf(value));
    }
  }
}

