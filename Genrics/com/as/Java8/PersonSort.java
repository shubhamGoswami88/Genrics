package com.as.Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonSort {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
       
        p1.setAge(20);
        p1.setName("abc");
       
        p2.setAge(25);
        p2.setName("xyz");
       
        p3.setAge(15);
        p3.setName("def");
       
        List<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        System.out.println("before sorting "+people);
        
        
        Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
		});
        
        System.out.println("after sorting with java 7 "+people);
//        ====================================================================
       
        Collections.sort(people,(Person per1,Person per2) -> {
            return per1.getAge() - per2.getAge();
                    }
        );
        System.out.println("after sorting "+people);
        
        PersonSortByAge sortByAge = new PersonSortByAge();
        
        Collections.sort(people,(Person per1,Person per2) -> sortByAge.compare(per1, per2));
       
       
        System.out.println("after sorting "+people);
        
        
        PersonSortByAge sortByAge1 = new PersonSortByAge();
        
        Collections.sort(people,sortByAge1::compare);
       
       
        System.out.println("after sorting "+people);
    }
    
    
    
    
    
}

class PersonSortByAge {
	 
    public int compare(Person p1,Person p2) {
        return p1.getAge() - p2.getAge();
    }
 
}