package com.spring.autowire.using.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	@Autowired  //we can also write this at setter method or at constructor also
	private Address address;
	
	
	

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(Address address) {
		this.address = address;
	}



	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	
	
}
