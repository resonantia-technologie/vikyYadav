package stringProgram;

import java.util.Random;

public class RandomNameFromString {
	public static void main(String[] args) {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		Random ran = new Random();
		int length = 13;
		for (int i = 0; i < 10; i++) {
			ran.ints(length);
			int index = ran.nextInt(26);
		}
		
	}
}
