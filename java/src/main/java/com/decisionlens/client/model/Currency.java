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
 * Gets or Sets Currency
 */
@JsonAdapter(Currency.Adapter.class)
public enum Currency {
  
  DEFAULT("DEFAULT"),
  
  DOLLAR("DOLLAR");

  private String value;

  Currency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Currency fromValue(String text) {
    for (Currency b : Currency.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<Currency> {
    @Override
    public void write(final JsonWriter jsonWriter, final Currency enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Currency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Currency.fromValue(String.valueOf(value));
    }
  }
}
