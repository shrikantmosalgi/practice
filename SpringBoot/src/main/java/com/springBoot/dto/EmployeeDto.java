package com.springBoot.dto;

import java.util.List;

public class EmployeeDto {

	private int empId;
	private String empName;
	private int empSalary;
	private String empAddress;
	private List<Integer> projectIds;
	private int passportId;
	private long passportNumber;
	private String country;


	
	public EmployeeDto() {
		
	}

	

	public EmployeeDto(int empId, String empName, int empSalary, String empAddress, List<Integer> projectIds,
			int passportId, long passportNumber, String country) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
		this.projectIds = projectIds;
		this.passportId = passportId;
		this.passportNumber = passportNumber;
		this.country = country;
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

	public List<Integer> getProjectIds() {
		return projectIds;
	}

	public void setProjectIds(List<Integer> projectIds) {
		this.projectIds = projectIds;
	}



	public int getPassportId() {
		return passportId;
	}



	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}



	public long getPassportNumber() {
		return passportNumber;
	}



	public void setPassportNumber(long passportNumber) {
		this.passportNumber = passportNumber;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
