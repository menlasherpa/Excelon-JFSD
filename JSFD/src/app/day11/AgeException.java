package app.day11;

public class AgeException extends Exception {
	
	public AgeException() {
		System.out.println("This person Cannot vote");
	}
	
	public AgeException(String message) {
		System.out.println("This person Cannot vote " + message);
	}
	
	public AgeException(String message, int age) {
		System.out.println("This person Cannot vote " + message + " " + age);
	}
}
