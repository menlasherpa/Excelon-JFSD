package app.day02.activity;

public class Day2Activity {
	public static void main(String[] args) {
		
		System.out.println("Program 1" + '\n');
		weekday(1);
		
		System.out.println("Program 2"+ '\n');
		gender('F');
		
		System.out.println("Program 3"+ '\n');
		isVowel('c');
		
		System.out.println("Program 4"+ '\n');
		checkOddOrEven(5);
		
		System.out.println("Program 5"+ '\n');
		findNumberOfDays("July");
		
		System.out.println("Program 6"+ '\n');
		calculator('*');
		
		System.out.println("Program 7"+ '\n');
		remark('A');
		
		System.out.println("Program 9"+ '\n');
		eligibleToVote(26);
		
		System.out.println('\n');
		checkPalindrome(1217);
		
		System.out.println('\n');
		checkArmstrong(1634);
		
		System.out.println('\n');
		isPrime(5);
		
		System.out.println('\n');
		fibonacci(13);
		
	}
	
	public static void checkPalindrome(int num) {
		int originalNum = num;
		int reverse = 0;
		while(num > 0) {
			int remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num /= 10;
		}
		
		if(originalNum == reverse) System.out.println(originalNum + " is palindrome" + "\n");
		else System.out.println(originalNum + " is not palindrome");
		
	}
	
	public static void checkArmstrong(int num) {
		int originalNum = num;
		int digitCount = 0;
		int powerSum = 0;
		
		int n = num;
		while(n > 0) {
			n /= 10;
			digitCount++;
		}
		System.out.println(originalNum + " is a " + digitCount + " digit number");
		
		while(num > 0) {
			int remainder = num % 10;
			powerSum = (int) (powerSum + Math.pow(remainder, digitCount));
			num /= 10;
		}
		System.out.println("Sum of the power of " + digitCount + " of each digit in the number is " + powerSum);
		
		if(originalNum == powerSum) System.out.println(originalNum + " is an armstrong number");
		else System.out.println(originalNum + " is not an armstrong number");
		
		
	}
	
	public static void isPrime(int num) {
		int originalNum = num;
		boolean isPrime = true;
		if (num == 2 || num == 3) System.out.println(originalNum + " is prime");
		else {
			int i = 2;
			while (i <= num / 2) {
				if (num % i == 0) {
					isPrime = false;
					break;
				}
				i++;
			}
		}
		if (isPrime == true) System.out.println(originalNum + " is prime");
		else System.out.println(originalNum + " is not prime");
	}
	
	public static void fibonacci(int limit) {
		int a = 0, b = 1, i = 3;
		System.out.print(a + " " + b);
		while (i < limit) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
			i++;
		}
		
	}
	
	//1. Write a program to read a weekday number and print weekday name using switch statement
	public static void weekday(int num) {
		switch(num) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Invalid number. Please enter number between 1-7");
		}
	}
	
	//2. Write a program to read gender(M/F) and print the corresponding gender using a switch statement
	public static void gender(char c) {
		switch(c) {
		case 'M':
			System.out.println("Male");
			break;
		case 'F':
			System.out.println("Femaile");
			break;
		default:
			System.out.println("Invalid character. Please type M or F to know the gender");
		}
	}
	
	//3. Write a program to Check whether a character is a vowel or consonant using switch statement
	public static void isVowel(char c) {
		switch(c) {
		case 'a', 'e', 'i', 'o', 'u':
			System.out.println(c + " is a vowel");
			break;
		default:
			System.out.println(c + " is a consonant");
		}
	}
	
	//4. Write a program to Check whether the number is even or odd using switch statement
	public static void checkOddOrEven(int num) {
		int isEven = 0;
		if (num % 2 != 0) isEven = 1;
		
		switch(isEven) {
		case 0:
			System.out.println("Even");
			break;
		
		case 1:
			System.out.println("Odd");
			break;
			
		default:
				System.out.println("Not a valid number");
		}
	}
	
	//5. Write a program to Find the number of days in a month using a switch statement
	public static void findNumberOfDays(String month) {
		
		switch(month) {
			case "Jan", "Mar", "May", "July", "Aug", "Oct", "Dec" :
				System.out.println("Number of days in " + month + " are " + 31);
				break;
			case "Feb":
				System.out.println("Number of days in " + month + " are " + 28);
			case "April", "June", "Sept", "Nov":
				System.out.println("Number of days in " + month + " are " + 30);
				break;
			default:
				System.out.println("Invalid month");
		}
	}
	
	//6. Write a program to create simple calculator using switch Statement
	public static void calculator(char c) {
		int a = 5, b = 6;
		switch(c) {
		case '+':
			System.out.println("Sum between " + a + "and " + b + " is " + a + b);
			break;
		case '-':
			System.out.println("Difference between " + a + "and " + b + " is " + (a - b));
			break;
		case '*':
			System.out.println("Multiplication between " + a + " and " + b + " is " + a * b);
			break;
		case '/':
			System.out.println("Divison is " + a / b);
			break;
		case '%':
			System.out.println("Remainder is " + a % b);
			break;
		}
	}
	
	//7. Write a program to print remark according to the grade obtained using switch statement
	public static void remark(char grade) {
		switch(grade) {
		case 'A':
			System.out.println("You did great!");
			break;
		case 'B':
			System.out.println("Your grade is B");
			break;
		case 'C':
			System.out.println("Your grade is C");
			break;
		case 'D':
			System.out.println("Fail");
			break;
		default:
			System.out.println("Please enter correct grade from A-D");
		}
	}
	
	// 8. Write a program to Menu driven program using switch statement ( Find addition, subtraction, multiplication and division of to integer numbers )
	
	
	
	//9. Write a program to check whether a person is eligible to vote or Not using switch statement
	public static void eligibleToVote(int age) {
		int eligibleToVote = 0;
		if (age > 18) eligibleToVote = 1;
		switch(eligibleToVote) {
		case 0:
			System.out.println("Sorry you cannot vote");
			break;
		case 1:
			System.out.println("You are allowed to vote");
			break;
		default:
			System.out.println("Please enter correct age");
		}
	}

}
