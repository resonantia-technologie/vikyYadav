package stringProgram;

import java.util.Iterator;

public class ReverseWord {
	public static void main(String[] args) {
		String str = "Opportunity for Senior Java Developer";
		String st[] = str.split(" ");
		String rev = "";
		for (int i = 0; i < st.length; i++) {
			for (int j = st[i].length() - 1; j >= 0; j--) {
				char ch = st[i].charAt(j);
				rev = rev + ch;
			}
			rev = rev + " ";
		}
		System.out.println(rev);

	}
}
