package com.as.Java8;
/*
interface Check{
	public void sum();
}

class Demo implements Check{
	private int a;
	private int b;

	public Demo(int a,int b) {
		this.a=a;
		this.b=b;
	}

	@Override
	public void sum() {
		int c=a+b;
		System.out.println("sum is = "+c);
	}
	
}
public class WithoutLamdaExpression {

	
	public static void main(String args[]) {
	
	Check o1=new Demo(4, 5);
	o1.sum();
	}

}*/

//============================================================================================================


@FunctionalInterface
interface Check{
	public void sum();
}


public class WithoutLamdaExpression{
	public static void main(String args[]) {
		Check o1=()->System.out.println("Sum is "+(4+5));
		o1.sum();
	}
	
}