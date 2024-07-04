package stringProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class GetMonthFromTheDate {
	public static void main(String[] args) {
		String[] a = { "1-jan-2001", "2-March-2014", "25-July-2013", 
				"1-jan-2005", "1-jan-2021" };
		Set<String> month = new HashSet<String>();
		for (int i = 0; i < a.length; i++) {
			String c = "";
			for (int j = 0; j < a[i].length(); j++) {
				if (Character.isAlphabetic(a[i].charAt(j))) {
					c += a[i].toLowerCase().charAt(j);
				}
			}
			month.add(c);
		}
		System.out.println(month);

	}

}
