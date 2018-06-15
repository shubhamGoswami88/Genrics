package com.as.Java8;

/*public class AnonymousInnerClass {
	public static void main(String args[]) {
		Thread o1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println("Child Method");
				}
			}
		});
		o1.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Child Method");
		}
		
	}

}
*/

public class AnonymousInnerClass {
	public static void main(String args[]) {
		Thread o1=new Thread(()-> {
			
				for(int i=0;i<10;i++) {
					System.out.println("Child Method");
				}
			});
		o1.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("Child Method");
		}
		
	}

}

