package com.spring.autowire.usingXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context= new ClassPathXmlApplicationContext("com/spring/autowire/usingXml/AutoWireconfig.xml");
		
		Employee emp =(Employee) context.getBean("employee");
		System.out.println(emp);
	}

}
