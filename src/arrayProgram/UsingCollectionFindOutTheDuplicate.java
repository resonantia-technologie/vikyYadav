package arrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class UsingCollectionFindOutTheDuplicate {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>
		(Arrays.asList(1, 2, 3, 44, 44, 3));
		// Using LinkedHashset
		LinkedHashSet<Integer> linkedHs = new LinkedHashSet<Integer>(numbers);
		ArrayList<Integer> noDupNumbers = new ArrayList<Integer>(linkedHs);
		System.out.println(noDupNumbers);
	}
}
