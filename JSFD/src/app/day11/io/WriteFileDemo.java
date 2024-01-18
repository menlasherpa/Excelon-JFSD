package app.day11.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {
	public static void main(String[] args) {
		File file = new File("Text.txt");
		
		String s = "Excelon Solutions";
		byte b[] = s.getBytes();
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			fos.write(b);
			System.out.println("Data stored in file");
			fos.close();	
			
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException " + e.getMessage());
		
		} catch (IOException e) {
			e.printStackTrace();
		
		} finally {
			System.out.println("Always executed");
			
			try {
				fos.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
