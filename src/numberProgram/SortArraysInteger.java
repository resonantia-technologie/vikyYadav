package numberProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortArraysInteger {
	public static void main(String[] args) {
		Integer a[] = { 4, 5, 6, 7, 4, 3, 6, 86, 65, 32, 65, 9, 65, 1, 2, 86, 86 };// 10 =9F
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> list = null;
		for (Integer c : a) {
			if (set.add(c) == false) {
			} else {
				list = Arrays.asList(c);
			}
		}
		System.out.println(list);

		// System.out.println(list);
		// System.out.println(list.get(list.size() - 2));

	}
}
