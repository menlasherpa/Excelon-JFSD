package app.day10.dateandtimedemo;

import java.time.Duration;
import java.time.Instant;

public class InstantDemo {
	public static void main(String[] args) {
		long i = 0;
		
		// Instant is used for figuring out duration from start to end for a task
		Instant start = Instant.now();
		
		for (i = 0; i < 1000000; i++) {
			System.out.println(i);
		}
		
		System.out.println(i);
		
		Instant end = Instant.now();
		
		long duration = Duration.between(start, end).toSeconds();
		
		System.out.println(duration + " seconds");
	}
}
