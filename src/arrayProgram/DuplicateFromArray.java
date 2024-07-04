package arrayProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplicateFromArray {
	public static void main(String[] args) {
		Integer[] a = { 3, 42, 4, 3, 4 };
			Set<Integer> set = new HashSet<Integer>();
		for (Integer b : a) {
			if (set.add(b) == false) {
				System.out.println(b);
			}
		}

	}
}
