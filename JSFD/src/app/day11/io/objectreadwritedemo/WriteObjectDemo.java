package app.day11.io.objectreadwritedemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

public class WriteObjectDemo {
	public static void main(String[] args) {
		Employee emp = new Employee(1, "Lakpa", LocalDate.now(), "Emp details");
		
		File file = new File("Employee.txt");
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			System.out.println("Object data stored in the file");
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found --> " + e.getMessage());
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
