package com.springBoot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
	
	@OneToOne(cascade =CascadeType.ALL)
	@JsonManagedReference
	@JoinColumn(name = "passport_id", referencedColumnName = "passport_id")
	private Passport passport;

	@JsonManagedReference
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_project", joinColumns = @JoinColumn(name = "emp_id"), inverseJoinColumns = @JoinColumn(name = "project_id"))
	private List<Project> projects;/*
									* no need to create column in employee, it is managed by mapping relation is
									* present in employee_project table, here no need to create employee_project
									* also because it is just join column
									*/

	public Employee() {
	}

	

	public Employee(int empId, String empName, int empSalary, String empAddress, Passport passport,
			List<Project> projects) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.passport = passport;
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



	public Passport getPassport() {
		return passport;
	}



	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
}
