package stringProgram;

import java.util.Iterator;

public class AdditionOfDigitFromChar {
	public static void main(String[] args) {
		String str = "k3a5i6a6s6";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				sum = sum + Integer.parseInt(str.charAt(i) + "");
			}
		}
		System.out.println(sum);
	}
}
