package app.day3.activity;


public class Day3Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {23,5,3,2,5,6,3,2,1};
		findMaxAndMin(arr);
		multiplicationTable(5);

		sortArr(arr);
	}
	
	//1. Find max and min no in an array
	public static void findMaxAndMin(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) max = arr[i];
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) min = arr[i];
		}
		
		System.out.println("Max element in the array is " + max);
		System.out.println("Min element in the array is " + min);
		
	}
	
	//2. Multplication table
	public static void multiplicationTable(int num) {
		for (int i =1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
	
	//3. Arrange element in sorted order
	public static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
