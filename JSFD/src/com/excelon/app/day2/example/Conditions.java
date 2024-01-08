package com.excelon.app.day2.example;

import java.util.Scanner;

public class Conditions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter account balance: ");
		
		int accountBal = s.nextInt();
		
		System.out.println("Account balance is " + accountBal);
		
		if (accountBal > 0) {
			System.out.println("Valid account" + "\n");
		} else {
			System.out.println("Invalid account" + "\n");
		}
		
		
		
		System.out.println("Enter salary: ");
		int salary = s.nextInt();
		System.out.println("Salary is " + salary);
		if(salary > 100) {
			System.out.println("Eligible for travel" + "\n");
		} else {
			System.out.println("Not elgible for travel" + "\n");
		}
		
//		A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
//		Ask user for quantity
//		Suppose, one unit will cost 100.
//		Judge and print total cost for user.
		
		System.out.println("Enter quantity: ");
		int quantity = s.nextInt();
		System.out.println("Quantity is " + quantity);
		if (quantity * 100 > 1000) {
			int totalCost = quantity * 100;
			System.out.println("Total cost is " + totalCost);
			System.out.println("Eligble for 10% discount");
			float discount = (float) (totalCost * 0.1);
			System.out.println("After discount: " + (totalCost - discount) + "\n");
		} else {
			System.out.println("Not eligble for discount");
			int totalCost = quantity * 100;
			System.out.println("Total cost is " + totalCost + "\n");
		}
		
		
		
		
		
	}
}
