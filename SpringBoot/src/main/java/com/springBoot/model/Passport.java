package com.springBoot.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Passport {
	
	@Id
	@Column(name = "passport_id")
	private int passportId;
	
	@Column(name = "passport_number")
	private long passportNumber;
	
	@Column(name = "country")
	private String country;
	
	@OneToOne(mappedBy = "passport")
	@JsonBackReference
    private Employee employee;

	public Passport() {
		
	}

	public Passport(int passportId, long passportNumber, String country, Employee employee) {
		super();
		this.passportId = passportId;
		this.passportNumber = passportNumber;
		this.country = country;
		this.employee = employee;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	
	
	
	
}
