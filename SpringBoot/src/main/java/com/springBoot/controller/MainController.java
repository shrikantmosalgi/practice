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

import com.springBoot.dto.EmployeeDto;
import com.springBoot.model.Employee;
import com.springBoot.model.Passport;
import com.springBoot.model.Project;
import com.springBoot.repository.EmployeeRepository;
import com.springBoot.repository.ProjectRepository;



@RestController
public class MainController {

	@Autowired
	public EmployeeRepository employeeRepository;
	
	@Autowired
	public ProjectRepository projectRepository;

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
		System.out.println("in getAllEmployees");

		List<Employee> empList= employeeRepository.findAll();
		
		return empList;
		
	}
	@GetMapping("/getAllProjects")
	public List<Project> getAllProjects(){
		System.out.println("in getAllProjects");

		List<Project> projectList= projectRepository.findAll();
		
		return projectList;
		
	}
	
	@PostMapping("/addEmployee")
	public void addEmployee(@RequestBody EmployeeDto employeeDto) {
		System.out.println("in addEmployee");
		Employee employee = new Employee();
		Passport passport =new Passport();
		
		passport.setPassportId(employeeDto.getPassportId());
		passport.setPassportNumber(employeeDto.getPassportNumber());
		passport.setCountry(employeeDto.getCountry());
		
		employee.setEmpId(employeeDto.getEmpId());
		employee.setEmpName(employeeDto.getEmpName());
		employee.setEmpAddress(employeeDto.getEmpAddress());
		employee.setEmpSalary(employeeDto.getEmpSalary());
		
		List<Project> projects = projectRepository.getProjectsById(employeeDto.getProjectIds());
		employee.setProjects(projects);
		
		//passport.setEmployee(employee);
		
		employee.setPassport(passport);
		
		employeeRepository.save(employee);
		
		
		
	}
	
	@DeleteMapping("/deleteEmployee/{id}")
	public void deleteEmployee(@PathVariable("id") int empid) {
		
	}
}
