package app.day3.example;

public class ArrayExample {
	public static void main(String[] args) {
		int[] arr = {3,4,3,2,5};
		String[] strArr = {"Lakpa", "Doma", "Menlaa"};
		
		System.out.print(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			System.out.print(", " + arr[i]);
		}
		
		System.out.println();
		System.out.print(strArr[0]);
		for (int i = 1; i < strArr.length; i++) {
			System.out.print(", " + strArr[i]);
		}
		
		System.out.println();
		arraySum();
		arrayEvenSum();
		arrayOddSum();
	}
	
	public static void arraySum() {
		int[] arr = {3,4,3,2,5};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum of each elements in array is " + sum);
	}
	
	public static void arrayEvenSum() {
		int[] arr = {3,4,3,2,5};
		int evenSum = 0;
		for (int i =0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) evenSum += arr[i];
		}
		System.out.println("Sum of even elements in array is " + evenSum);
	}
	
	public static void arrayOddSum() {
		int[] arr = {3,4,3,2,5};
		int oddSum = 0;
		for(int i =0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) oddSum += arr[i];
		}
		System.out.println("Sum of odd elements in arrays is " + oddSum);
	}

}
