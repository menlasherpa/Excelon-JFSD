package app.day06.arraydemo;

public class ArrayDemo {
	public static void main(String[] args) {
		
		// single dimensional array
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 3;
		}
		
		for (int element : arr) {
			System.out.print(element + " ");
		}
		
		System.out.println("========");
		
		
		// two dimensional array
		int[][] arr1 = new int [3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j =0; j < 3; j++) {
				arr1[i][j] = i * 3;
			}
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
