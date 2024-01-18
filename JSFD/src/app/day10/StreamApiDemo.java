package app.day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,4,5,3,2,1);

		// normal way
		for (Integer n : list) {
			System.out.println(n);
		}
		System.out.println("=======================");
		
		
		
		// print even numbers from list using streams with toList(0
		List<Integer> evenNumber = list.stream().filter(n -> n % 2 == 0).toList();
		System.out.println("Even numbers from the list are " + evenNumber);
		System.out.println("=========================");
		
		
		// print even numbers from list using streams with Collectors
		List<Integer> oddNumber = list.stream().filter(n -> n % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd numbers from the list are " + oddNumber);
		System.out.println("=========================");
		
		
		// Convert list into array
		Integer[] arr = list.stream().toArray(Integer[] :: new);
		for (Integer i : arr) {
			System.out.println(i);
		}
		System.out.println("=========================");
		
		
		// sort numbers using stream
		List<Integer> sortedNumber = list.stream().sorted().toList();
		System.out.println("Sorted numbers: " + sortedNumber);
		System.out.println("=========================");
		
		
		// sort numbers using stream and distinct
		List<Integer> sortedNumberUnique = list.stream().sorted().distinct().toList();
		System.out.println("Sorted numbers with no duplictes: " + sortedNumberUnique);
		System.out.println("=========================");
		
		                                                                 
		// another way to define stream containing integers
		Stream<Integer> intStream = Stream.of(new Integer[] {82, 89, 23, 22, 9,});
		intStream.forEach(n -> System.out.print(n + " "));
		System.out.println();
		System.out.println("=========================");
		
		
		// another way to define stream containing integers
		Stream<String> strStream = Stream.of("Lakpa", "Doma", "Menlaa");
		strStream.sorted().forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		
		// create a list and convert it to stream and display all elements
		List<Integer> newList = new ArrayList<Integer>();
		Stream<Integer> stream = list.stream();
		stream.forEach(n -> System.out.println(n));
		
		
		
		
		
	}
}
