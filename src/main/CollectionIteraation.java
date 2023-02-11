package main;

import java.util.Arrays;
import java.util.List;

public class CollectionIteraation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people= Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 38)
				);
		people.forEach(p->System.out.println(p.getFirstName()));

		people.forEach(System.out::println);
	}
	

}
