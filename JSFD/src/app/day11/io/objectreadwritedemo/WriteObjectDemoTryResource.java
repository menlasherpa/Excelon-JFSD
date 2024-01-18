package app.day11.io.objectreadwritedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class WriteObjectDemoTryResource {
	public static void main(String[] args) {
		
		Employee emp = new Employee(102, "Menlaa", LocalDate.now(), "Emp description");
		
		File file = new File ("Employee1.txt");
		
		// try with resource statement
		// Java 7 feature
		try (FileOutputStream fos = new FileOutputStream(file)) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Object data stored in the file");
		} catch (FileNotFoundException e) {
			System.out.println("File not found --> " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
