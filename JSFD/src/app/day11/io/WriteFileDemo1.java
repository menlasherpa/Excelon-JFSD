package app.day11.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo1 {
	public static void main(String[] args) {
		
		File file = new File("Text1.txt");
		
		String s = "Congratulations, you have a job offer!";
		byte b[] = s.getBytes();
		
		try (FileOutputStream fos = new FileOutputStream(file)) {
			fos.write(b);
			System.out.println("Data stored in file");
			fos.close();
		
		} catch (FileNotFoundException e) {
			System.out.println("File not found " + e.getMessage());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
