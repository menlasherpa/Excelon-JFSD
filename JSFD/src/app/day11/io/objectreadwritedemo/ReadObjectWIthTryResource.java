package app.day11.io.objectreadwritedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectWIthTryResource {
	public static void main(String[] args) {
		File file = new File("Employee1.txt");
		
		// try with resource statement
		// no need to close connections when using this
		// used for data connections or properties setting
		// Java 7 feature
		try (FileInputStream fis = new FileInputStream(file)){
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee emp = (Employee) ois.readObject();
			System.out.println(emp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
