package arrayProgram;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromArrya {
	public static void main(String[] args) {
		int a[] = { 4, 4, 54, 53, 32, 23, 32 };
		Set<Integer> set = new HashSet<Integer>();
		for (int c : a) {
			if (set.add(c) == false) {
				System.out.println(c);
			}
		}
	}
}
