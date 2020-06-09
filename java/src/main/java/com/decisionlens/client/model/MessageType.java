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
 * Gets or Sets MessageType
 */
@JsonAdapter(MessageType.Adapter.class)
public enum MessageType {
  
  FIELDCREATEDMESSAGE("FieldCreatedMessage"),
  
  FIELDSUPDATEDMESSAGE("FieldsUpdatedMessage"),
  
  FIELDSDELETEDMESSAGE("FieldsDeletedMessage"),
  
  PROJECTSCREATEDMESSAGE("ProjectsCreatedMessage"),
  
  PROJECTSDELETEDMESSAGE("ProjectsDeletedMessage"),
  
  ADDEDTOPORTFOLIOPLANMESSAGE("AddedToPortfolioPlanMessage"),
  
  REMOVEDFROMPORTFOLIOPLANMESSAGE("RemovedFromPortfolioPlanMessage"),
  
  PORTFOLIOPLANSUPDATEDMESSAGE("PortfolioPlansUpdatedMessage"),
  
  PORTFOLIOUPDATEDMESSAGE("PortfolioUpdatedMessage"),
  
  PORTFOLIOARCHIVEDMESSAGE("PortfolioArchivedMessage"),
  
  ADDEDTOPORTFOLIOMESSAGE("AddedToPortfolioMessage"),
  
  REMOVEDFROMPORTFOLIOMESSAGE("RemovedFromPortfolioMessage"),
  
  FIELDVALUESUPDATEDMESSAGE("FieldValuesUpdatedMessage"),
  
  RESOURCEPOOLSUPDATEDMESSAGE("ResourcePoolsUpdatedMessage"),
  
  DATAUPDATEDMESSAGE("DataUpdatedMessage"),
  
  RESOURCEPOOLSCREATEDMESSAGE("ResourcePoolsCreatedMessage"),
  
  RESOURCEPOOLSDELETEDMESSAGE("ResourcePoolsDeletedMessage"),
  
  SPREADSHEETREPORTPROGRESSMESSAGE("SpreadsheetReportProgressMessage"),
  
  COMMENTADDEDMESSAGE("CommentAddedMessage"),
  
  COMMENTEDITEDMESSAGE("CommentEditedMessage"),
  
  COMMENTDELETEDMESSAGE("CommentDeletedMessage"),
  
  NOTIFICATIONSMESSAGE("NotificationsMessage");

  private String value;

  MessageType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static MessageType fromValue(String text) {
    for (MessageType b : MessageType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<MessageType> {
    @Override
    public void write(final JsonWriter jsonWriter, final MessageType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public MessageType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return MessageType.fromValue(String.valueOf(value));
    }
  }
}

