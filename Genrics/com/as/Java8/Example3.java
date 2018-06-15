package com.as.Java8;

interface Squ{	
	public int square(int x);	
}

public class Example3 {	
	public static void main(String args[]) {		
		Squ o1=(x)->x*x;
		System.out.println("Square "+o1.square(4));
	}

}
