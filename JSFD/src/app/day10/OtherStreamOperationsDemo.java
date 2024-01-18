package app.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OtherStreamOperationsDemo {
	public static void main(String[] args) {
		List<String> memberNames = new ArrayList<String>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
		
		// check if if all elements matches the condition
		boolean allMatch = memberNames.stream().allMatch(n -> n.startsWith("A"));
		System.out.println("All match? " + allMatch);
		
		// check if there is a match in the element
		boolean anyMatch = memberNames.stream().anyMatch(n -> n.startsWith("A"));
		System.out.println("Any match? " + anyMatch);
		
		// checks if no element matches
		boolean noneMatch = memberNames.stream().noneMatch(n -> n.startsWith("A"));
		System.out.println("No match? " + noneMatch);
		
		// counts the number of elements
		long count = memberNames.stream().count();
		System.out.println("Total names " + count);
		
		// get the first element
		String firstName = memberNames.stream().findFirst().get();
		System.out.println("First Name: " + firstName);
		
		// reduces to a single value
		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "@" + s2);
		System.out.println(reduced);
	}
}
