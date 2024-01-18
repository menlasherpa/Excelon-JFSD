package app.day10.dateandtimedemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAndTimeDemo {
	public static void main(String[] args) {
		
		// LocalDate and its operations
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate);
		
		System.out.println(localDate.now());
		
		System.out.println(localDate.getYear());
		
		System.out.println(localDate.getDayOfMonth());
		
		System.out.println(localDate.getDayOfYear());
		
		System.out.println(localDate.getMonthValue());
		
		System.out.println(localDate.plusDays(15));
		
		System.out.println(localDate.minusDays(15));
		
		System.out.println(" ================================");
		
		
		// LocalTime and its operations
		LocalTime localTime = LocalTime.now();
		
		System.out.println(localTime);
		
		System.out.println(localTime.getHour());
		
		System.out.println(localTime.getMinute());
		
		System.out.println(localTime.getSecond());
		
		System.out.println(localTime.plusHours(5));
		
		System.out.println(localTime.minusHours(3));
		
		System.out.println(" ================================");
		
		
		// LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
	}
}
