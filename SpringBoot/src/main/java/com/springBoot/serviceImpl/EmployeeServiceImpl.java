package com.springBoot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springBoot.repository.EmployeeRepository;
import com.springBoot.service.EmployeeService;

@Service
public class EmployeeServiceImpl {

	@Autowired
	public EmployeeRepository employeeRepository;
	
	
	
}
