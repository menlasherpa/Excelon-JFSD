package app.day10.dateandtimedemo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
	public static void main(String[] args) {
		
		String dateTime = "01-17-24 10:20";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy HH:mm");
		LocalDateTime parsedDateTime = LocalDateTime.parse(dateTime, formatter);
		System.out.println(parsedDateTime);
	}
}
