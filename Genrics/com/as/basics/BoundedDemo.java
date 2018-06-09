package com.as.basics;

class Demo2<T extends Number> {

	T[] obj;

	public Demo2(T[] obj) {
		this.obj = obj;
	}

	double average() {
		double sum = 0.0;
		for (int i = 0; i < obj.length; i++) {
			sum = sum + obj[i].doubleValue();

		}
		return sum / obj.length;
	}

}

public class BoundedDemo {

	public static void main(String args[]) {

		Integer nums[] = { 1, 2, 3, 4, 5 };
		Demo2<Integer> d1 = new Demo2<Integer>(nums);
		Double d = d1.average();
		System.out.println(d);

	}

}
