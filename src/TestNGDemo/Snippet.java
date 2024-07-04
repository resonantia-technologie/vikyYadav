package TestNGDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;

public class Snippet {
	@Test(enabled = true)
	public void m3() {
		System.out.println("true");

	}

	@Test(alwaysRun = false, enabled = true)
	public void m4() {
		System.out.println("true alwaysRun");
		List list = new ArrayList();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(7);
		List<Integer> synchList = Collections.synchronizedList(list);
		//List<Integer> synchList1 = Collections.sy


	}

}
