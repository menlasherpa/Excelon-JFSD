package com.excelon.app.day2.example;

public class IncrementOperators {
	public static void main(String[] args) {
		int num =100;
		// increment and decrement operators
		//a++;
		//--a;
		System.out.println(num);
		System.out.println(--num);
		System.out.println(num);
		
		
		
		// find greatest three numbers using ternary operator
		int a = 2;
		int b = 6;
		int c = 9;
		
		int greatest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("Greatest number is " + greatest);
		

	}

}
