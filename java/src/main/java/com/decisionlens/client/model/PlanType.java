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
 * Gets or Sets PlanType
 */
@JsonAdapter(PlanType.Adapter.class)
public enum PlanType {
  
  OVERALL("OVERALL"),
  
  VALUE("VALUE"),
  
  COST("COST"),
  
  RISK("RISK"),
  
  BALANCE("BALANCE");

  private String value;

  PlanType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PlanType fromValue(String text) {
    for (PlanType b : PlanType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<PlanType> {
    @Override
    public void write(final JsonWriter jsonWriter, final PlanType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PlanType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PlanType.fromValue(String.valueOf(value));
    }
  }
}
