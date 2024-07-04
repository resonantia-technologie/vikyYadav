package ArrayListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListInterfaceMethod {
	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("a");
		a.add("b");
		a.add("e");
		a.add("c");
		a.add(2);
		Arrays.asList(a);
		Collections.sort(a);
		System.out.println(a);
		//System.out.println("Removed: "+a.remove(2));//to remove objects using index
		//System.out.println("Replace: "+a.set(2, 14));//to replace objects using index
		//System.out.println("last index from object: "+a.lastIndexOf(0));
		
		

	

	}
}
