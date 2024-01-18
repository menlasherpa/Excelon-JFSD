package app.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
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
		
		
//		memberNames.stream().limit(5).sorted().forEach(n -> System.out.print(n + " "));
		
//		memberNames.stream().filter(n -> n.startsWith("A")).limit(5).sorted().forEach(n -> System.out.print(n + " "));
		
		// map will modify the elements
		// filter will give you subset of elements which satisfies the condition
		// directly print the stream operated values
		// use of method reference ::
		memberNames.stream().map(String::toUpperCase).sorted().forEach(n -> System.out.print(n + " "));
		
		
		// or you can store the operated values into a list and then print that
		// tried method reference here but didn't work, so my guess method reference only works when stream operated values are stored in a separate list
		List<String> names = memberNames.stream().map(n -> n.toLowerCase()).sorted().collect(Collectors.toList());
		System.out.println(names);
		
		
		List<List<Integer>> listOfLists = Arrays.asList(
				Arrays.asList(1,2,3),
				Arrays.asList(4,2,5),
				Arrays.asList(5,2,4)
				);
		List<Integer> finalList = listOfLists.stream().flatMap(n -> n.stream()).toList();
		System.out.println(finalList);
		
		
	}
}
