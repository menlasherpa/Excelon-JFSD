package app.day11.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemoWIthThrows  {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// create new file
		File file = new File("Text1.txt");
		
		String s = "Lakpa Doma Sherpa";
		byte b[] = s.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(b);
		System.out.println("Data written in file");
	}
}
