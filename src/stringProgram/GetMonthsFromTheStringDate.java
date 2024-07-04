package stringProgram;

import java.util.HashSet;
import java.util.Set;

public class GetMonthsFromTheStringDate {
	public static void main(String[] args) {
		String[] a = { "1-jan-2001", "2-March-2014", "25-July-2013", "1-jan-2005", "1-jan-2021" };
		Set<String> months = new HashSet<String>();
		for (String date : a) {
			String month = "";
			for (int j = 0; j < date.length(); j++) {
				if (Character.isAlphabetic(date.charAt(j))) {
					month += date.charAt(j);
				}
			}
			months.add(month);
		}

		System.out.println(months);
	}
}
