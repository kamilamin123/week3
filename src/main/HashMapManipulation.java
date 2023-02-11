package main;
import java.util.HashMap;
import java.util.HashSet;
public class HashMapManipulation {

	public static void main(String[] args) {
		// Create a HashMap and populate it with initial key-value pairs
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		// Print the size of the map
		System.out.println("Map size: "+map.size());

		// Use a for loop to print the key-value pairs in the map
		map.forEach(((key, value) -> System.out.println("Key: "+key+", Value: "+value)));
		
		

		// Use get() method to get the value of key "A"
		System.out.println("Value of key \'A\': "+ map.get("A"));


        // use put() method to add a new key-value pair to the map
		map.put("D", 4);
		System.out.println("Map after adding a new key-value pair:");
		map.forEach(((key, value) -> System.out.println("Key: "+key+", Value: "+value)));

		// Use the containsKey() method to check if the key "C" exists in the map
		if (map.containsKey("C")) {
			System.out.println("Key \'C\' exists in the map");
		}
	// Create a HashSet and populate it with initial values
		HashSet<String> map1=new HashSet <String>();
		map1.add("A");
		map1.add("B");
		map1.add("C");

		// Print the size of the set
		System.out.println("Set size: "+map1.size());

		// Use for loop to print the values in the set
		map1.forEach((value -> System.out.println("Value: "+value)));

		// Use add() method to add a new value to the set
		map1.add("d");
		System.out.println("Set after using add():");
		map1.forEach((value -> System.out.println("Value: "+value)));

		// Use remove() method to remove a value from the set
		map1.remove("A");
		System.out.println("Set after using remove():");
		map1.forEach((value -> System.out.println("Value: "+value)));

		// Use contains() method to check if the value "C" exists in the set
		if (map1.contains("C")) {
			System.out.println("Value \'C\' exists in the set.");
		}

	}
}
