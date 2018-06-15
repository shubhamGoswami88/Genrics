package com.as.Java8;

interface Utility{
	public static String getTitle(String s) {
		return s;
	}
}

public class TestStatic implements Utility {
	
	public static void main(String args[]) {
		
		TestStatic o1=new TestStatic();
		Utility.getTitle("Utility Provided by the Shubham,");	
		
	}

}
