package com.excelon.app.day2.example;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		long num = s.nextLong();
		long reverse = 0;
		
		while(num > 0) {
			long remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		
		System.out.println("Reverse is " + reverse);

	}

}
