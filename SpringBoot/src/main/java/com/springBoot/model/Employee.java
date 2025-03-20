package com.springBoot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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

	public Employee() {

		// TODO Auto-generated constructor stub
	}

	
	public Employee(int empId, String empName, int empSalary, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
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

	public void setEmpSalary(int empSalry) {
		this.empSalary = empSalry;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + "]";
	}

}
