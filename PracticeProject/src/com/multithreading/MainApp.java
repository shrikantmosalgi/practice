package com.multithreading;

public class MainApp {

	public static void main(String[] args) {
		//object of thread using Runnable interface
		UsingRunnable usingRunnable = new UsingRunnable();
		
		Thread tr= new Thread(usingRunnable);
		tr.start();
		
		//object of thread using Thread class
		ThreadClass t = new ThreadClass();
		t.start();
	}

}
