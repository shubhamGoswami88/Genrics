package com.as.Java8;

import java.util.function.Function;

public class FunctionsTest {
	public static void main(String args[]) {
		Function<String, Integer> l=s->s.length();
		
		System.out.println(l.apply("Shubham Goswami"));
		System.out.println(l.apply("Shubham"));
		
	}

}
