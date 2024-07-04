package stringProgram;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CountNoOfWordsFromFile {
	public static void main(String[] args) throws IOException {
		String readfile = Files.readString(Paths.get(".\\read.txt"));
		
		String st[] = readfile.split(" ");
		int count = 0;
		for (int i = 0; i < st.length; i++) {
			if (st[i].equals("test")) {
				count++;
				System.out.println(" "+st[i]);
			}
		}
	}
}
