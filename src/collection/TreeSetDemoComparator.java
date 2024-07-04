package collection;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemoComparator  {
	public static void main(String[] args) {
		TreeSet t = new TreeSet<>(new MyComparator());
		t.add(10);
		t.add(5);
		t.add(15);
		t.add(20);
		t.add(25);
		t.add(20);
		System.out.println(t);
	}
}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer t1 = (Integer) o1;
		Integer t2 = (Integer) o2;
		if (t1 < t2) {
			return +1;

		} else if (t1 > t2) {
			return -1;

		} else
			return 0;
	}
}