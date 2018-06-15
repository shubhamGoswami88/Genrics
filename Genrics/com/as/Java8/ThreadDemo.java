package com.as.Java8;

/*
class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {			
			System.out.println("child Thtred");			
		}	
	}	
}

public class ThreadDemo {
	public static void main(String args[]) {
		Thread o1=new Thread(new MyRunnable());
		o1.start();	
		for (int i = 0; i < 10; i++) {			
			System.out.println("Main Thtred");			
		}	
	}

}*/


public class ThreadDemo {
	public static void main(String args[]) {
		Runnable r=()->{
			
			for (int i = 0; i < 10; i++) {			
				System.out.println("child Thtred");			
			}	
		};
		Thread o1=new Thread(r);
		o1.start();
		
		for (int i = 0; i < 10; i++) {			
			System.out.println("Main Thtred");			
		}
}

}


