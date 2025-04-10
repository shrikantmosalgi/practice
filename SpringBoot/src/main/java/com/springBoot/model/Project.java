package com.springBoot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Project {

	@Id
	@Column(name = "project_id")
	private int projectId;

	@Column(name = "project_name")
	private String projectName;

	@Column(name = "project_language")
	private String projectLanguage;

	@ManyToMany(mappedBy = "projects") /*
										 * here if we one project can have multiple employee then we need to create
										 * project_employee table and join it as done in employee class
										 */
	@JsonBackReference     
	private List<Employee> employees;

	public Project() {
	}

	public Project(int projectId, String projectName, String projectLanguage, List<Employee> employees) {
		this.projectId = projectId;
		this.projectName = projectName;
		this.projectLanguage = projectLanguage;
		this.employees = employees;
	}

	// Getters and setters
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

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
