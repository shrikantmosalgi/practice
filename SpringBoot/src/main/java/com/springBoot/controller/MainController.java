package com.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.model.Employee;
import com.springBoot.repository.EmployeeRepository;



@RestController
public class MainController {

	@Autowired
	public EmployeeRepository employeeRepository;

	@RequestMapping("/home")
	public String home() {
		System.out.println("in home page");
		return "home";
	}
	
	@GetMapping("/test")
	public String testApi() {
		
		return "this is test api";
		
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getEmployees(){
		
		List<Employee> empList= employeeRepository.findAll();
		
		return empList;
		
	}
	
	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee employee) {
		
		employeeRepository.save(employee);
		
		
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable("id") int empid) {
		
	}
}
