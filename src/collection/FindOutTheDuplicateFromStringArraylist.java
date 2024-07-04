package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindOutTheDuplicateFromStringArraylist {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		String a[] = { "Kiran", "Kailas", "Tanuja", "vikas", "kiran", "Kailas", "kiran" };
		alist.addAll(Arrays.asList(a));	
		Set<String> set = new HashSet<String>();
		for (String st : alist) {
			if (set.add(st) == false) {
				System.out.println(st);
			}
		}

	}
}
