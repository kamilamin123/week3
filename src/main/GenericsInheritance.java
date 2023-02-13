package main;

import java.util.ArrayList;
import java.util.List;

public class GenericsInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> names = new ArrayList<>();
//		names.add("Name 1");
//		names.add("Name 2");
//		printList(names);
		
		List<Integer> integers =new ArrayList<>();
		integers.add(1);
		integers.add(2);
		printList(integers);
		List<Double> doubles =new ArrayList<>();
		doubles.add(1.2);
		doubles.add(1.5);
		printList(doubles);
//		addToList(integers,10);
//		addToList(doubles,10.5);
		printList(integers);
		printList(doubles);
		List<Number> numbers =new ArrayList<>();
		numbers.add(1.2);
		numbers.add(1.5);
		numbers.add(10);
		addToList(numbers,10);
		addToList(numbers,10.5);
		printList(numbers);

	}

	private static  void addToList(List<? super Number> integers, Number i) {
		integers.add(i);
		// TODO Auto-generated method stub
		
	}

	private static  void printList(List<? extends Number> list) {
		// TODO Auto-generated method stub
		list.forEach(System.out::println);		
	}

}
