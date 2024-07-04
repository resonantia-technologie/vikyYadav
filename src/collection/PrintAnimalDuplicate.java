package collection;

import java.util.*;

public class PrintAnimalDuplicate {
	public static void main(String[] args) {
		List<String> animal=new ArrayList<String>();
		animal.add("cat");
		animal.add("eat");
		animal.add("rat");
		animal.add("dog");
		animal.add("cat");
		Set<String> set=new HashSet<String>();
		for(String b: animal) {
			if(!set.add(b)) {
				System.out.println(b);

			}
				//System.out.println(b);

		}
		
	}
}
