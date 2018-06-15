package com.as.Java8;

class Sample {
	private String s;

	public Sample(String s) {
		this.s = s;
		System.out.println("Construtor Executed :" + s);
	}
}


interface Cons{
	public Sample get(String s);
}

public class ConstrutorReference {

	public static void main(String args[]) {
		Cons f= s->new Sample(s);
		f.get("First Laymda Sample");
		Cons f1=Sample::new;
		f1.get("Construtor Reference");

	}

}
