package stringProgram;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String str = "Lis ten";
		String str1 = "Silent";

		char st[] = str.replace(" ", "").toLowerCase().toCharArray();
		char st1[] = str1.replace(" ", "").toLowerCase().toCharArray();
		Arrays.sort(st);
		Arrays.sort(st1);
		System.out.println(st);
		System.out.println(st1);

		if (Arrays.equals(st, st1)) {
			System.out.println("This is anagram");
		} else
			System.out.println("This is not anagram");
	}
}
