package com.as.Java8;

/*
interface Interf {
	public void sum(int a, int b);
}

class Demo implements Interf {

	@Override
	public void sum(int a, int b) {
		System.out.println("Sum is =" + (a + b));
	}

}

public class Example2 {
	
	public static void main(String ... s) {
		
		Interf i1=new Demo();
		i1.sum(90, 80);
		
	}

}
*/

@FunctionalInterface
interface Interf {
	public void sum(int a, int b);
}

public class Example2 {	
	public static void main(String... s) {
		
		Interf i1=(a,b)->System.out.println("Sum is ="+(a+b));
		i1.sum(90, 80);
		
	}
}


