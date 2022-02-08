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
import com.decisionlens.client.model.PortfolioPlanUser;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PortfolioPlanUserDeletedMessagePayload
 */

public class PortfolioPlanUserDeletedMessagePayload {
  @SerializedName("portfolioPlanUser")
  private PortfolioPlanUser portfolioPlanUser = null;

  public PortfolioPlanUserDeletedMessagePayload portfolioPlanUser(PortfolioPlanUser portfolioPlanUser) {
    this.portfolioPlanUser = portfolioPlanUser;
    return this;
  }

   /**
   * Get portfolioPlanUser
   * @return portfolioPlanUser
  **/
  @ApiModelProperty(required = true, value = "")
  public PortfolioPlanUser getPortfolioPlanUser() {
    return portfolioPlanUser;
  }

  public void setPortfolioPlanUser(PortfolioPlanUser portfolioPlanUser) {
    this.portfolioPlanUser = portfolioPlanUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortfolioPlanUserDeletedMessagePayload portfolioPlanUserDeletedMessagePayload = (PortfolioPlanUserDeletedMessagePayload) o;
    return Objects.equals(this.portfolioPlanUser, portfolioPlanUserDeletedMessagePayload.portfolioPlanUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(portfolioPlanUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortfolioPlanUserDeletedMessagePayload {\n");
    
    sb.append("    portfolioPlanUser: ").append(toIndentedString(portfolioPlanUser)).append("\n");
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
