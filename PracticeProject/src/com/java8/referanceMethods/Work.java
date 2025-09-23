package com.java8.referanceMethods;

public class Work {
	
	public static void doWork() {
		System.out.println("i am doing work");
	}
	
	public static void table() {
		for(int i=1;i<=10;i++) {
			System.out.println(i*2);
			
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void printNumber() {
		for(int i=1;i<=10;i++) {
			System.out.println("*");			
		}
	}

}
