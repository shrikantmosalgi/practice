package com.springBoot.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Employee {

	@Id
	@Column(name = "emp_id")
	private int empId;

	@Column(name = "emp_name")
	private String empName;

	@Column(name = "emp_salary")
	private int empSalary;

	@Column(name = "emp_address")
	private String empAddress;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_project", joinColumns = @JoinColumn(name = "emp_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
	@JsonManagedReference
	private List<Project> projects;

	public Employee() {
	}

	public Employee(int empId, String empName, int empSalary, String empAddress, List<Project> projects) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.projects = projects;
	}

	// Getters and setters
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
}
