package FileOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTxtFile {
	public static void main(String[] args) throws IOException {
		try {
			String path = ".//read.txt";
			FileInputStream fis = new FileInputStream(path);
			int data;
			while ((data = fis.read()) != -1) {
				char fileData = ((char) data);
				System.out.print(fileData);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
}
