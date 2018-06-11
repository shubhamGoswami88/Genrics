package com.as.basics;

import java.util.List;
import java.util.ArrayList;

public class GenericsTest {
	
	//Upper bound wildcard
	   //in category
	   public static void deleteCat(List<? extends Cat1> catList, Cat1 cat) {
	      catList.remove(cat);
	      System.out.println("Cat Removed");
	   }

	   //Lower bound wildcard
	   //out category
	   public static void addCat(List<? super RedCat1> catList) {
	      catList.add(new RedCat1("Red Cat"));
	      System.out.println("Cat Added");
	   }
	
	 //Unbounded wildcard
	   //Using Object method toString()
	   public static void printAll(List<?> list) {
	      for (Object item : list)
	         System.out.println(item + " ");
	   }
	
	

	public static void main(String args[]) {
		
		 List<Animal1> animalList= new ArrayList<Animal1>();
	      List<RedCat1> redCatList= new ArrayList<RedCat1>();

	      //add list of super class Animal of Cat class
	      addCat(animalList);
	      //add list of Cat class
	      addCat(redCatList);  
	      addCat(redCatList);  

	      //print all animals
	      printAll(animalList);
	      printAll(redCatList);

	      Cat1 cat = redCatList.get(0);
	      //delete cat
	      deleteCat(redCatList, cat);
	      printAll(redCatList); 
	    
		
		
	}

	
}

class Animal1{
	
	private String name;

	public Animal1(String name) {		
		this.name=name;		
	}
}

class Cat1 extends Animal1{
	
	public Cat1(String s) {
		super(s);
	}
}


class RedCat1 extends Cat1{
	
	public RedCat1(String s) {
		super(s);
	}
}

class Dog1 extends Animal1{
	
	public Dog1(String s) {
		super(s);
	}
}