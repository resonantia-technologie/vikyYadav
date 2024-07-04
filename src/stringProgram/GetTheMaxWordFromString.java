package stringProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetTheMaxWordFromString {
	public static void main(String args[]) {
		String str = "Relationsghdddddddddddddddddddjkfkffkhip manager is not applicablehfhfhfhgtgtg for monthly plans.";
		String[] s = str.split(" ");
		String b = "";
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() > b.length()) {
				b = s[i];
			}
		}
		System.out.println(b);
	}

}