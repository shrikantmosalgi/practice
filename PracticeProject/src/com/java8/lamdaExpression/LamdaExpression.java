package com.java8.lamdaExpression;

public class LamdaExpression {

	public static void main(String[] args) {
		// anonymous class example
		MYInterface myInter =new MYInterface() {
			
			@Override
			public void sayHello() {
				// TODO Auto-generated method stub
				System.out.println("this is anonymous class");
			}

			
		};
		// calling anonymous class method
		myInter.sayHello();
		
		
		// lamda expression example
		MYInterface myInterface =()->{
			System.out.println("this is lamda expression");
		};
		// calling method
		myInterface.sayHello();
		//-------------------------------------------------------
		//anpnymous class
		SumInterface sumInterface = new SumInterface() {
			
			@Override
			public int sum(int d, int e) {
			
				int f =d + e;
				System.out.println(f);
				return f;
			}
		};
		
		sumInterface.sum(20, 40);
		
		// lamda expression
		SumInterface sumLamda =(int a, int b) ->{
			int c =0;
			c=a+b;
			System.out.println(c);
			return c;
					
		};
		
		sumLamda.sum(10,20);
		
	}
}
