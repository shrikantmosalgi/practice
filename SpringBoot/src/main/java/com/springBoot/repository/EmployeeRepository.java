package com.springBoot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.springBoot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	//derived query or custom finder methods
	public List<Employee> findByEmpName(String empName);
	public List<Employee> findByEmpNameAndEmpAddress(String empName,String empAddess);
	public List<Employee> findByEmpNameStartingWith(String empName);
	public List<Employee> findByEmpSalaryGreaterThanEqual(int empSalary);
	
	//JPQL
	@Query("select e from Employee e")
	public List<Employee> getAllEmployee();
	
	@Query("select e from Employee e where e.empSalary =:salary and e.empAddress =:address")
	public List<Employee> getEmployeeBySalaryAndAddress(@Param("salary") int empSalary,@Param("address") String empAddress);
	
}
