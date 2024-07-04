package stringProgram;

import java.util.HashSet;
import java.util.Set;

public class DuplkcateWord {
	public static void main(String[] args) {
		String str = "vikas yadav vikas prakash yadav";
		String[] st = str.split(" ");
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < st.length; i++) {
			if (set.add(st[i]) == false) {
				System.out.println(st[i]);
			}
		}

	}
}
