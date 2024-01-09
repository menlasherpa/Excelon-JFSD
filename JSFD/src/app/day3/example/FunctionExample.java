package app.day3.example;

import java.util.Scanner;

public class FunctionExample {
	 public static void main(String[] args) {
		 
		System.out.println("Type1");
		sumOfTwoValues();
		
		System.out.println("Type2");
		sumOfThreeValues(1,2,5);
		
		System.out.println("Type3");
		int result = type3(1,3);
		System.out.println("Sum of two numbers with return and arguments type is " + result+ "\n");
		 
		System.out.println("Type4");
		int type4Result = type4();
		System.out.println("Sum of two numbers are using type 4 are " + type4Result+ "\n");
	}
	 
	// Type 1: No return, no argument
	public static void sumOfTwoValues() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a = s.nextInt();
		
		System.out.println("Enter another number");
		int b = s.nextInt();
		
		int c = a + b;
		System.out.println("Sum of two values is " + c+ "\n");
		
	}
	
	// Type 2: No return but argument
	public static void sumOfThreeValues(int a, int b, int c) {
		System.out.println("Sum of three numbers are " + (a + b + c)+ "\n");
		
	}
	
	// Type 3: Return and Argument
	public static int type3(int a, int b) {
		return (a + b);
	}
	
	// Type 4: No return but argument
	public static int type4() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = s.nextInt();
		System.out.println("Enter next number");
		int b = s.nextInt();
		return (a + b);
	}

}
