package com.as.Java8;


interface Right{
	default void show() {
		System.out.println("In Right interfce");
	}
}

interface Left{
	default void show() {
		System.out.println("In Left interfce");
	}
}

public class TestDefault implements Right,Left {
	public static void main(String args[]) {
		TestDefault o1=new TestDefault();
		o1.show();
	}

	@Override
	public void show() {
//		System.err.println("override the default method");
		Right.super.show();
		
	}

}
