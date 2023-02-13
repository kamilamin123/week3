package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Genericsexample {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names =new ArrayList<>();
		addToNames(names,"Name 1");
		addToNames(names,"Name 2");
		System.out.println(names);
		incorrectAddToNames(names,10);
//		String name3=names.get(2);
		System.out.println(names);
//		String[] namesArray =new String[5];
//		addToArray(namesArray,10);
		//incorrectAddToArray(namesArray,10);
		System.out.println(names.get(2)); 
		
	}	
	private static void addToNames(List<String> names, String s) {
		names.add(s);
	}
	private static void incorrectAddToNames(List list,Integer i) {
		list.add(i);
	}

}
