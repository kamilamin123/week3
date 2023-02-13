package main;

import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayListBasics {
    
    // Complete the functionality of the function below
  
 
   
    // Do not modify the code below
    public static void main(String[] args) {
    	ArrayList<String> names = new ArrayList<>();
    	for (int i=1; i<=10; i++) {
    		names.add("name "+i);
    	}
    	
    	System.out.println(names.indexOf("name 10"));
    	Iterator<String> it =  names.iterator();
    	while(it.hasNext()) {
    		System.out.println(it.next());
    		it.remove();
    		
    	}
    	for (int i=0; i<names.size();i++) {
    		System.out.println(names.get(i));
    	}
    	ArrayList<String> names1 = new ArrayList<>();
    	System.out.println(names.equals(names1)); 
    
    }
}


