package com.as.basics;

public class TypeEraser {
	
	   public static void main(String[] args) {
	      Box<Integer> integerBox = new Box<Integer>();
	      Box<String> stringBox = new Box<String>();

	      integerBox.add(new Integer(10));
	      stringBox.add(new String("Hello World"));
	      
	      printBox(integerBox);
	      printBox1(stringBox);
	   }
	   
	   private static <T extends Box> void printBox(T box) {
	      System.out.println("Integer Value :" + box.get());
	   }
	   
	   private static <T> void printBox1(T box) {
	      System.out.println("String Value :" + ((Box)box).get());
	   }
	}

	class Box<T> {
	   private T t;

	   public void add(T t) {
	      this.t = t;
	   }

	   public T get() {
	      return t;
	   }   
	}
	
	//====================================================================In this case, java compiler will replace T with Object class and after type erasure,compiler will generate bytecode for the following code. ====================================================================
	
	

/*
	public class TypeEraser {
	   public static void main(String[] args) {
	      Box integerBox = new Box();
	      Box stringBox = new Box();

	      integerBox.add(new Integer(10));
	      stringBox.add(new String("Hello World"));
	      
	      printBox(integerBox);
	      printBox1(stringBox);
	   }
		
	   //Bounded Types Erasure
	   private static void printBox(Box box) {
	      System.out.println("Integer Value :" + box.get());
	   }
		
	   //Unbounded Types Erasure
	   private static void printBox1(Object box) {
	      System.out.println("String Value :" + ((Box)box).get());
	   }
	}

	class Box {
	   private Object t;

	   public void add(Object t) {
	      this.t = t;
	   }

	   public Object get() {
	      return t;
	   }   
	}
	*/