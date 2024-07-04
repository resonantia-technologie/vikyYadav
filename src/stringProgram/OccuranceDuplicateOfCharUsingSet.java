package stringProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class OccuranceDuplicateOfCharUsingSet {
	private static int c;

	public static void main(String[] args) {
		String str = "223";
		char ch[] = str.toCharArray();
		Arrays.asList(ch);
		Set<Character> s = new HashSet<>();
		for (Character c : ch) {
			if (s.add(c) == false) {
				System.out.println( " " + c);
			}

		}
	}
}
