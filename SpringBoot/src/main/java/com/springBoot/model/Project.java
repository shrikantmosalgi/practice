package com.springBoot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Project {

	@Id
	@Column(name = "project_id")
	private int projectId;
	
	@Column(name = "project_name")
	private String projectName;
	
	@Column(name = "project_language")
	private String projectLanguage;
	
	public Project() {
		
		// TODO Auto-generated constructor stub
	}
	
	public Project(int projectId, String projectName, String projectLanguage) {
		
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectLanguage = projectLanguage;
	}
	
	

	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectLanguage() {
		return projectLanguage;
	}
	public void setProjectLanguage(String projectLanguage) {
		this.projectLanguage = projectLanguage;
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectLanguage="
				+ projectLanguage + "]";
	}
	
	
	
	
	
}
