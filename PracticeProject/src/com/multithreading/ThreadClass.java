package com.multithreading;

public class ThreadClass extends Thread{
	
	@Override
	public void run() {
		
		try {
			
			for(int i=1;i<=10;i++) {
				System.out.println(i*10);
				Thread.sleep(400);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
