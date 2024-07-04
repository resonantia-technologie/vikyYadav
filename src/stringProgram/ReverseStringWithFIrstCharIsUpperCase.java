package stringProgram;

public class ReverseStringWithFIrstCharIsUpperCase {
	public static void main(String[] args) {
		String str = " kailsh vaijanath andhalkar";
		// Andhalkar Vaijanth Kailash
		String rev = "";
		String st[] = str.split(" ");
		for (int i = st.length - 1; i >= 0; i--) {
			for (int j = 0; j < st[i].length(); j++) {
				if (j == 0) {
					rev = rev + st[i].toUpperCase().charAt(j);
				} else
					rev = rev + st[i].charAt(j);
			}
			rev+=" ";
		}
		System.out.println(rev);

	}
}
