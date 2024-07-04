package stringProgram;

public class FirstNon {
public static void main(String[] args) {
		String str = "Kailas";
		boolean found = false;
		char[] ch = str.toCharArray();
		char f = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			found = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && c == ch[j]) {
					found = false;
					break;
				}
			}
			if (found) {
				f = c;
				break;
			}

		}
		if (found) {
			System.out.println("First non repeating char is: " + f);
		} else {
			System.out.println("There is non repeating char");

		}
	}
}
