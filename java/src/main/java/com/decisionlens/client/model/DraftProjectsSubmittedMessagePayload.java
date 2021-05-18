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
import com.decisionlens.client.model.Attachment;
import com.decisionlens.client.model.Project;
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
 * DraftProjectsSubmittedMessagePayload
 */

public class DraftProjectsSubmittedMessagePayload {
  @SerializedName("projects")
  private List<Project> projects = new ArrayList<Project>();

  @SerializedName("attachments")
  private List<Attachment> attachments = null;

  public DraftProjectsSubmittedMessagePayload projects(List<Project> projects) {
    this.projects = projects;
    return this;
  }

  public DraftProjectsSubmittedMessagePayload addProjectsItem(Project projectsItem) {
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * Get projects
   * @return projects
  **/
  @ApiModelProperty(required = true, value = "")
  public List<Project> getProjects() {
    return projects;
  }

  public void setProjects(List<Project> projects) {
    this.projects = projects;
  }

  public DraftProjectsSubmittedMessagePayload attachments(List<Attachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public DraftProjectsSubmittedMessagePayload addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<Attachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "")
  public List<Attachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DraftProjectsSubmittedMessagePayload draftProjectsSubmittedMessagePayload = (DraftProjectsSubmittedMessagePayload) o;
    return Objects.equals(this.projects, draftProjectsSubmittedMessagePayload.projects) &&
        Objects.equals(this.attachments, draftProjectsSubmittedMessagePayload.attachments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projects, attachments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DraftProjectsSubmittedMessagePayload {\n");
    
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
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

