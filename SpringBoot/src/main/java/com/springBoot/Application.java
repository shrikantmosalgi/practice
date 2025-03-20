package com.springBoot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springBoot.model.Employee;
import com.springBoot.repository.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Application.class, args);
		EmployeeRepository employeeRepository=context.getBean(EmployeeRepository.class);
		Employee employee=new Employee();
		employee.setEmpId(2);
		employee.setEmpName("chiku");
		employee.setEmpSalary(45000);
		employee.setEmpAddress("mangalwedha");
		
		employeeRepository.save(employee);
		
		
		
	}

}
