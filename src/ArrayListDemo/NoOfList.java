package ArrayListDemo;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

public class NoOfList {
	@Test
	public void testArrayList() {
		List<Integer> ls=new ArrayList<>();
		//ArrayList<Integer> ls = new ArrayList<Integer>();
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		ls.add(4);
		ls.add(3);
		ls.add(2);
		//System.out.println(ls.get(2));
		//System.out.println(ls.get(3));
		for (int i = 0; i < ls.size(); i++) {
			System.out.print(" "+ls.get(i));
		}

	}
}
