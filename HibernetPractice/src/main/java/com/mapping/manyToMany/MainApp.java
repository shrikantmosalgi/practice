package com.mapping.manyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {

	       //session
	       
	       
	      
	       Employee emp1= new Employee();
	       Employee emp2= new Employee();
	       
	       emp1.setEmpName("shrikant");
	       
	       
	       emp2.setEmpName("siddharth");
	       emp1.setProjects(null);
	       
	       Project project1 = new Project();
	       Project project2 = new Project();
	       
	       project1.setProjectName("library management system");
	       
	       project2.setProjectName("chatbot");
	       
	       
	       List<Employee> employeeList = new ArrayList<Employee>();
	       employeeList.add(emp1);
	       employeeList.add(emp2);
	       List<Project> projectList = new ArrayList<Project>();
	       projectList.add(project1);
	       projectList.add(project2);
	       
	       emp1.setProjects(projectList);
	       project1.setEmployees(employeeList);
	       
	       emp2.setProjects(projectList);
	       project2.setEmployees(employeeList);
	       
	       SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	        
	       Session session= sessionFactory.openSession();
	       org.hibernate.Transaction transaction= session.beginTransaction();
	       
	       
	       session.persist(emp1);
	       session.persist(emp2);
	       
	       session.persist(project1);
	       session.persist(project2);
	       
	       transaction.commit();
	       session.close();
	       
	}

}
