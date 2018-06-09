package com.as.basics;

public class Demo1<T> {
	T obj;

	public Demo1(T obj) {
		this.obj = obj;
	}

	T getOb() {
		return obj;
	}

	public void showType() {
		System.out.println("Type of T is " + obj.getClass().getName());
	}

	public static void main(String[] args) {
		Demo1<Integer> ob1 = new Demo1<Integer>(90);
		ob1.showType();
		int t = ob1.getOb();
		System.out.println("Val =" + t);
		Demo1<String> ob2 = new Demo1<String>("Shubham Goswami");
		ob2.showType();
		String s = ob2.getOb();
		System.out.println("Val =" + s);

	}

}
