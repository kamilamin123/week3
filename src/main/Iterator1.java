package main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class Iterator1 {
	public static void main(String[] args) {


		LinkedList<String> names = new LinkedList<String>();
		names.push("Caleb");
		names.push("Sue");
		names.push("Sally");

		Iterator<String> it =names.listIterator();
		while(it.hasNext()) {
			String i= it.next();
			if(i.startsWith("C")) {
				it.remove();

			}
		}

		System.out.println(names);
		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(0);
		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(4);
		mySet.add(5);
		mySet.add(6);
		mySet.add(7);
		mySet.add(8);
		mySet.add(9);
		mySet.add(1);
		mySet.add(2);
		System.out.println(mySet);
		
		Iterator<Integer> it1=mySet.iterator();
		while (it1.hasNext()) {
			System.out.print(it1.next()+", ");
		}




	}
}