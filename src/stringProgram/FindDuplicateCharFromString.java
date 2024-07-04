package stringProgram;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateCharFromString {
	public static void main(String[] args) {
		String str = "abcd ad";
		char[] s = str.toCharArray();
		Set<Character> ch = new HashSet<>();
		for (Character c : s) {
			if (ch.add(c) == false) {
				System.out.println(c);
			}
		}

	}
}
