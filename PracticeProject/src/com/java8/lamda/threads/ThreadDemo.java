package com.java8.lamda.threads;

public class ThreadDemo {

	public static void main(String[] args) {

		//first thread
		Runnable thread1 =() -> {
			for (int i=1;i<=10;i++) {
				System.out.println("*"+i);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		Thread t =new Thread(thread1);
		t.start();
		
		//--------------------------------------------
		Runnable t2 =() ->{
			try {
				for(int i=1;i<=10;i++) {
					System.out.println(i*2);
					Thread.sleep(500);
				}
			} catch (Exception e2) {

			e2.printStackTrace();
			}
		};
		
		Thread thread2= new Thread(t2);
		thread2.run();
	}

}
