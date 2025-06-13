package com.java8.referanceMethods;

public class MethodRefrenceDemo {

	public static void main(String[] args) {

		//implementation of TestInterface
		
		TestInterface testInterface =Work::doWork; //here it uses method from work class for implementation of method in TestInterface
		
		testInterface.testInterfaceMethod();
		
		Runnable runnable =Work::table;  //:: refer the existing method it dose not call the method
									     // method should be static
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		Work work = new Work();
		
		Runnable runnable1 = work::printNumber;  //for referring not static method use object 
		Thread thread1 =new Thread(runnable1);
		thread1.start();
	}

}
