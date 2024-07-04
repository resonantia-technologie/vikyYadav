package arrayProgram;

import java.util.HashSet;
import java.util.Set;

public class SumOfCommanElementFromArray {
	public static void main(String[] args) {
		int[] a = { 4, 6, 8, 3, 5, 9, 33 };
		int[] b = { 4, 0, 8, 3, 50, 9, 30 };

		Set<Integer> aSet = new HashSet<Integer>();
		for (int c : a) {
			aSet.add(c);
		}
		int sum = 0;
		HashSet<Integer> comman = new HashSet<Integer>();
		for (int num : b) {
			if (aSet.contains(num) && !aSet.contains(num)) {
				sum += num;
				comman.add(num);
			}
		}

		System.out.println(sum);
	}
}
