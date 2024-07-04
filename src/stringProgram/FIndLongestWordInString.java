package stringProgram;

public class FIndLongestWordInString {

	public static void main(String[] args) {
		String str = "hkgjjhggjgjkgjjkfjfkj name is Shrikant";
		// my=0 name=1, is=2, kailas=3
		String temp = "";
		String st[] = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			for (int j = 0; j < st.length; j++) {
				if (st[i].length() > st[j].length()) {
					temp = st[i];
				}
			}
		}
		System.out.println(temp);

	}
}
