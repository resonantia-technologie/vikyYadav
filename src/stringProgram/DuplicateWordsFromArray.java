package stringProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateWordsFromArray {
	public static void main(String[] args) {
		String st[] = { "Kailas", "kiran", "Kailas", "bikas", "tikas" };
		Set<String> set = new HashSet<String>();
		int count=0;
		for (String s : st) {
			count++;
			if (set.add(s) == false) {
				System.out.println(s+" = "+count);
			}

		}
	}
}
