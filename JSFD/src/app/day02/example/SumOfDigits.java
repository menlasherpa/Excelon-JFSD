package app.day02.example;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any digit number");
		long num = s.nextLong();
		long n = num;
		long sum = 0;
		
		while(num > 0) {
			long remainder = num % 10; 
			sum += remainder;
			num = num / 10;
		}
		
		System.out.println("Sum of all digits in " + n + " is " + sum);

	}

}
