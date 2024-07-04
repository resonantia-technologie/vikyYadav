package stringProgram;

public class OccuranceOfCharUisnf {
	public static void main(String[] args) {
		String str = "OccuranceOfChar";
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (c == ch[j]) {
					count++;
					ch[j] = 0;
				}
			}
			if (count > 0) {
				System.out.println(c + "=  " + count);
			}
		}

	}
}
