package app.day11;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		int arr[] = {10, 10};
		int a = 10;
		int b = 10;
		
		// try catch block is the standard way to handle exceptions
		try {
			System.out.println("Value of a/b is " + (a/b));
			System.out.println("arr[10] is " + arr[10]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception " + e.getMessage());
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException " + e.getMessage());
			
		} finally {
			System.out.println("Always executed unless we specifiy system.exit(0) in previous blocks else the entire application crashes");
		}
		
		// exception handling using throw keyword
		throwDemo();
	}
	
	public static void throwDemo() {
		int a = 100;
		int b = 0;
		if (b > 0) System.out.println("Value of a/b is " + (a/b));
		else throw new ArithmeticException("Trying to divide by 0");
	}
}
