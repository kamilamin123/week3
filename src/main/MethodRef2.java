package main;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class MethodRef2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people= Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 38)
				);
		
		System.out.println("print all");
		
		printConditionally(people,p-> true,System.out::println);
		
	}

	private static void printConditionally(List<Person> people, Predicate<Person> condition,Consumer<Person> consumer) {
		people.forEach((p)->{
			if (condition.test(p))	{consumer.accept(p);}
		});
	}
}


