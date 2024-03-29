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
 * Gets or Sets MessageDestinationType
 */
@JsonAdapter(MessageDestinationType.Adapter.class)
public enum MessageDestinationType {
  
  USER("USER"),
  
  GROUP_USER("GROUP_USER"),
  
  GROUP("GROUP"),
  
  PORTFOLIO("PORTFOLIO"),
  
  PORTFOLIO_USER("PORTFOLIO_USER"),
  
  PORTFOLIOPLAN("PORTFOLIOPLAN");

  private String value;

  MessageDestinationType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MessageDestinationType fromValue(String text) {
    for (MessageDestinationType b : MessageDestinationType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MessageDestinationType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MessageDestinationType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MessageDestinationType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MessageDestinationType.fromValue(String.valueOf(value));
    }
  }
}

