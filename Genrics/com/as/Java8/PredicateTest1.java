package com.as.Java8;

import java.util.function.Predicate;

public class PredicateTest1 {
public static void main(String args[]) {
	
	int [] x= {0,5,10,15,20,25,30};
	
	Predicate<Integer> l=i->(i>10);
	Predicate<Integer> q=i->(i%2==0);	
	System.out.println("Number Greater then 10");
	m1(l, x);
	
	System.out.println("Even number");
	m1(q, x);
	
	System.out.println("Number less than 10");
	m1(l.negate(), x);
	
	System.out.println("Number Greater then 10 and not Even");
	m1(l.and(q.negate()), x);
	
	
	System.out.println("Number Greater then 10 and Even");
	m1(l.and(q), x);
	
}

public static void m1(Predicate<Integer> p,int x[]) {
	for( int y :x) {
		if(p.test(y)) {
			System.out.println(y);			
		}
	}
}
}
