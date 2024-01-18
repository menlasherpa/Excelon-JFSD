package app.day03.example;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" " + i);
			}
			System.out.println();
		}

	}

}
