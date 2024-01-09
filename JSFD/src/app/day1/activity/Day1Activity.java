package app.day1.activity;

public class Day1Activity {
	public static void main(String[] args) {
		/*
		 * Accept three digit number find sum of digits
		 * accept five digit number find sum of first and last digit
		 * Accept three digit number find reverse number
		 */
		sumOfThreeDigitNum(135);
		firstAndLastSumOfFiveDigitNum(24567);
		reverseNum(345);
		
		
	}
	
	// Accept three digit number find sum of digits
	public static void sumOfThreeDigitNum(int num) {
		int sum = 0;
		
		int lastDigit = num % 10;
		sum += lastDigit;
		
		num = num / 10;
		int secondDigit = num % 10;
		sum += secondDigit;
		
		num = num / 10;
		int firstDigit = num % 10;
		sum += firstDigit;
		
		System.out.println("Sum of each digits in three digit number is " + sum);
	}
	
	
	// Accept five digit number find sum of first and last digit
	public static void firstAndLastSumOfFiveDigitNum(int num) {
		int sum = 0;
		
		int lastDigit = num % 10;
		sum += lastDigit;
		
		num = num / 10000;
		int firstDigit = num % 10;
		sum += firstDigit;
		
		System.out.println("Sum of first and last digit in five digit number: " + sum);
		
		
	}
	
	// Accept three digit number find reverse number
	public static void reverseNum(int num) {
		int reverse = 0;
		
		int lastDigit = num % 10;
		reverse = reverse * 10 + lastDigit;
		
		num = num / 10;
		int secondDigit = num % 10;
		reverse = reverse * 10 + secondDigit;
		
		int firstDigit = num / 10;
		reverse = reverse * 10 + firstDigit;
		
		System.out.println("Reverse of the number is " + reverse);
	}
	
	

}
