package main;

import java.util.ArrayList;
import java.util.List;

public class ThingClassExample {
	public static <T> void main(String args[]) throws InterruptedException {
	ThingClass<Integer,Integer> myInt = new ThingClass<>(1,9);
	ThingClass<Double,Double> myDouble = new ThingClass<>(3.14,1.01);   
	ThingClass<Character,Character> myChar = new ThingClass<>('@','$');
	ThingClass<String,Character> myString = new ThingClass<>("Hello",'c');
	  
	ArrayList<Object> people=new ArrayList<Object>();
	people.add( myInt);
	people.add( myDouble );
	people.add( myChar);
	people.add( myString);
	
	
	
	
	
	
	Thread t1 =new Thread(()->print(people));
	t1.start();
	t1.join();
  
	   System.out.println(myInt);
	   System.out.println(myDouble);
	   System.out.println(myChar);
	   System.out.println(myString);
	   
	   
	   
	
	}
	public static <T> void print(ArrayList<Object> t) {
		t.forEach(p->System.out.println(p+" T2"));
		
	}
}
