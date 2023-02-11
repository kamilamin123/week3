package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListexample {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> names =new LinkedList<>();
		names.add("Kamil");
		names.add("Omnia");
		names.add("Lillyan");
		names.add("Izzeldin");
		System.out.println(names.get(3));
		names.add(1,"Liena");
		
		ArrayList<String> names1 =new ArrayList<>();
		names1.add("Kamil");
		names1.add("Omnia");
		names1.add("Lillyan");
		names1.add("Izzeldin");
		System.out.println(names1.get(3));
		names1.add(1,"Liena");
		Iterator it =names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
