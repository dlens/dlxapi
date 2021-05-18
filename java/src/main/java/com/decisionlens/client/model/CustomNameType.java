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
 * Gets or Sets CustomNameType
 */
@JsonAdapter(CustomNameType.Adapter.class)
public enum CustomNameType {
  
  PROJECT("PROJECT"),
  
  BUDGET("BUDGET"),
  
  REQUEST("REQUEST"),
  
  ALLOCATED("ALLOCATED"),
  
  DRAFT("DRAFT"),
  
  IDEA("IDEA"),
  
  BACKLOG("BACKLOG"),
  
  SCHEDULED("SCHEDULED"),
  
  IN_PROGRESS("IN_PROGRESS"),
  
  COMPLETED("COMPLETED"),
  
  ON_HOLD("ON_HOLD"),
  
  ARCHIVED("ARCHIVED"),
  
  PLANNED("PLANNED"),
  
  OBLIGATED("OBLIGATED");

  private String value;

  CustomNameType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static CustomNameType fromValue(String text) {
    for (CustomNameType b : CustomNameType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<CustomNameType> {
    @Override
    public void write(final JsonWriter jsonWriter, final CustomNameType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public CustomNameType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return CustomNameType.fromValue(String.valueOf(value));
    }
  }
}

