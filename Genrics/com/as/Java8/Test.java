package com.as.Java8;
interface Lam{
	public void m1();	
}
public class Test  {
	public static void main(String args[]) {
		Test o1=new Test();
		o1.m2();		
	}
int x=10;
public void m2() {
	int y=90;
	Lam m1=()->{		
		System.err.println(x);
		System.err.println(y);		
		x=999;
//		y=99;	CE //Local variable y defined in an enclosing scope must be final or effectively final	
	};
	m1.m1();
}

}
