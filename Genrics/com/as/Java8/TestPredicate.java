package com.as.Java8;

import java.util.function.Predicate;

public class TestPredicate {
	
	public static void main(String args[]) {
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(100));
		System.out.println(p.test(8));
		System.out.println(p.test(200));
	}

}
