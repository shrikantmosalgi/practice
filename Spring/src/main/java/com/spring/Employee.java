package com.spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	private int empId;
	private String empName;
	private int empSal;
	private List<String> empAddresses;
	private Set<String> phones;
  	private Map<String, String> courses;
	
	
	public Employee() {
				
	}

	public Employee(int empId, String empName, int empSal, List<String> empAddresses, Set<String> phones,
			Map<String, String> courses) {
		
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empAddresses = empAddresses;
		this.phones = phones;
		this.courses = courses;
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

	public List<String> getEmpAddresses() {
		return empAddresses;
	}

	public void setEmpAddresses(List<String> empAddresses) {
		this.empAddresses = empAddresses;
	}

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}

	public Map<String, String> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empAddresses="
				+ empAddresses + ", phones=" + phones + ", courses=" + courses + "]";
	}
	
	

}
