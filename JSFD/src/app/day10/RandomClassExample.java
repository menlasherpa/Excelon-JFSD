package app.day10;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RandomClassExample {
	public static void main(String[] args) {
		Stream<Integer> randomNumberStream = Stream.generate(() -> new Random().nextInt(10));
		
		// print the random 50 numbers generated
//		randomNumberStream.forEach(n -> System.out.print(n + " "));
		
		// prints the first 20 random numbers
//		randomNumberStream.limit(20).forEach(n -> System.out.print(n + " "));
//		System.err.println();
//		System.out.println("========================");
		
		// skips the first 5 elements and prints rest
		randomNumberStream.skip(5).forEach(n -> System.out.print(n + " "));
		System.out.println("========================");
		
		
		IntStream stream = "Lakpa".chars();
		
		// prints the ASCII value of character
//		stream.forEach(n -> System.out.print(n + " "));
//		System.out.println();
		
		// actually print the character
		stream.forEach(n -> System.out.print((char)n + " "));
		System.out.println();
		System.out.println("========================");
		
		
		// operates on the string and splits by the given delimeter
		Stream<String> stream1 = Stream.of("Lakpa, Doma Sherpa".split(","));
		stream1.forEach(n -> System.out.println(n));
		
	}
}