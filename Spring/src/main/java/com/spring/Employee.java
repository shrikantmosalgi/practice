package com.spring;

public class Employee {
	private int empId;
	private String empName;
	private int empSal;
	private String empAddress;
	
	
	
	public Employee() {
				
	}
	
	
	
	public Employee(int empId, String empName, int empSal, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
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
	public int getEmpSal() {
		return empSal;
	}
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAddress=" + empAddress
				+ "]";
	}
	
	

}
