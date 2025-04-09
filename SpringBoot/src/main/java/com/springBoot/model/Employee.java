package com.springBoot.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "project_id")
	public Project project;

	public Employee() {

		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, int empSalary, String empAddress, Project project) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.project = project;
	}

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

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	
	
	

}
