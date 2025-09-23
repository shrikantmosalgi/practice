package com.java8.referanceMethods.usingConstructor;

public class MainApp {

	public static void main(String[] args) {
		//using lamda
		System.out.println("learning constructor refrence");
		Provider provider = ()->{
			
			return new Student();
			
		};
		
		Student stud =provider.getStudent();
		stud.display();
		
		//using reference
		
		Provider pro = Student::new;
		Student stude=pro.getStudent();
		stude.display();
	}
	
	

}
