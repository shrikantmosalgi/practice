package com.java8.test;

public class Test {
	
	String name ;
	

	public Test(String name) {
		super();
		this.name = name;
	}


	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String toString() {
		return "Test [name=" + name + "]";
	}


	public static void main(String[] args) {
		
		Test test = new Test("shrikant");

		test.name="siddharth";
		System.out.println(test);
		
	}

}
