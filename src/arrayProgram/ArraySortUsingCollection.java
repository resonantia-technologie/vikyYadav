package arrayProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortUsingCollection {
	public static void main(String[] args) {
		Integer a[] = { 40, 3, 5, 3, 5, 6, 32, 64, 40, 42, 42, 42 ,78,63};
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		System.out.println(list.get(list.size() - 2));
		// for(Integer c: a) {

		// System.out.println(c);
		// }

	}
}
