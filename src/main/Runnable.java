package main;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phrase = "the quick brown fox jumps over the lazy dog";
		String[] phraseList = phrase.split(" ");
		
		TreeSet<String> words = new TreeSet<String>();
		words.addAll(Arrays.asList(phraseList));
		System.out.println(words);
		for(String w:words) {
			System.out.println(w);
		}
		NavigableSet<String> decending = words.descendingSet();
		System.out.println(decending);
		System.out.println(words.ceiling("fa"));
		
	}

}
