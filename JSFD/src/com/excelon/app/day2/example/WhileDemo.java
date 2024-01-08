package com.excelon.app.day2.example;

public class WhileDemo {
	public static void main(String[] args) {
		int i = 0;
//		while(i <= 10) {
//			if (i % 2 != 0) {
//				System.out.println("-----> " + i);
//			}
//			i++;
//		}
		
		int oddSum = 0;
		int evenSum =0;
		
		while(i <= 10) {
			if (i % 2 == 0) {
				evenSum += i;
			} else {
				oddSum += i;
			}
			i++;
			
		}
		System.out.println("Sum of even numbers " + evenSum);
		System.out.println("Sum of odd numbers " + oddSum);
		
	}

}
