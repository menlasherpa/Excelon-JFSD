package com.excelon.app.day1.example;

public class ArithmeticOperators {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 5;
		int num3 = 6;
		
		System.out.println("num1 + num2 " + num1 + num2);
		System.out.println("num1 - num2 " + (num1 - num2));
		System.out.println("num1 * num2 " + num1 * num2);
		System.out.println("num1 / num2 " + num1 / num2);
		System.out.println("num1 % num2 " + num1 * num2);
		
		System.out.println("Logical Operators && and ||");
		System.out.println("&& => " + (num1 > num2 && num1 > num3));
		System.out.println("|| => " + (num1 > num2 || num1 > num3));
		
	}

}
