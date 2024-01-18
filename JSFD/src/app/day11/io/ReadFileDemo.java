package app.day11.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFileDemo {
	
	public static void main(String[] args) {
		try {
			readData();
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException " + e.getMessage());
		}
	}
	
	public static void readData() throws FileNotFoundException {
		FileInputStream file = new FileInputStream("Text.txt");
		throw new FileNotFoundException();
	}
}
