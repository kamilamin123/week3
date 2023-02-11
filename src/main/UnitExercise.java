package main;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class UnitExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people= Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 38)
				);
		Collections.sort(people,(p1,p2)->p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("print all");
		people.forEach((p)->System.out.println(p));
		printConditionally(people,p-> p.getLastName().startsWith("C"),p-> System.out.println(p));
		people.forEach((p)->{
			if(p.getFirstName().startsWith("C")) {
		System.out.println(p);}});
		printConditionally(people,p-> true,p-> System.out.println(p));
	    printConditionally(people, p-> p.getFirstName().startsWith("C"),p-> System.out.println(p.getFirstName()));}


private static void printConditionally(List<Person> people, Predicate<Person> condition,Consumer<Person> consumer) {
	people.forEach((p)->{
	if (condition.test(p))	{consumer.accept(p);}
	});
}
}



