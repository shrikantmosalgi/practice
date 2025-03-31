package com.springBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.springBoot.model.Employee;



@RestController
public class MainController {


	@RequestMapping("/home")
	public String home() {
		System.out.println("in home page");
		return "home";
	}
	
	@GetMapping("/test")
	public String testApi() {
		
		return "this is test api";
		
	}
	
	@GetMapping("/empId/{id}")
	public Employee getEmployee(@PathVariable("id") int empId) {
		
		return null;		
		
	}
}
