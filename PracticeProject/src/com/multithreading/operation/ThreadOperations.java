package com.multithreading.operation;

public class ThreadOperations {

	public static void main(String[] args) {

		System.out.println("started");
		
		Thread t =Thread.currentThread();
		
		String currentThreadName =t.getName();
		System.out.println(currentThreadName);
		System.out.println("id is "+t.getId());
		
		
		
		
		
		
		System.out.println("ended");
		
	}

}
