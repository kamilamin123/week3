package main;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	public static void main(String[] args) {
		String sentence = "This is a test sentence with no repeating words";

		// Split the sentence into words using split() method
		String [] words = sentence.split(" ");

		// Create a Map to store the frequency of each word
		Map<String, Integer> wordFrequency = new HashMap<>();

		//
		//        // Iterate through each word in the sentence
		for (String word:words) {
			if(wordFrequency.containsKey(word)) {
				wordFrequency.compute(word,(a,b)-> b+1);
			}else {
				wordFrequency.put(word, 1) ;
			}
		}

		System.out.println("Word frequency: " + wordFrequency);
	}
}
