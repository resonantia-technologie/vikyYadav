package stringProgram;

public class ReverseEachWordFromString {
	public static void main(String[] args) {
		String str = "India is my country";
		String rev = "";
		String st[] = str.split(" ");
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
