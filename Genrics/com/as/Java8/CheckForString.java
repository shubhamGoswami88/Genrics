package com.as.Java8;

import java.util.function.Predicate;

public class CheckForString {
	public static void main(String args[]) {		
		Predicate<String> s=l->(l.length()>9);
		System.out.println(s.test("shub"));
		System.out.println(s.test("shubham goswami"));		
	}

}
