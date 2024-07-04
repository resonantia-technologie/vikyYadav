package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(4);
		alist.add(5);
		alist.add(6);
		alist.add(5);
		alist.add(7);
		alist.add(8);
		alist.add(2);
		alist.add(9);
		alist.add(90);
		alist.add(6);	
		Set<Integer> set = new HashSet<Integer>();
		for (Integer list : alist) {
			if (set.add(list) == false) {
				System.out.println(list + " :is duplicated");

			}
		}

	}
}
