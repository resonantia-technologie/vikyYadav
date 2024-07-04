package stringProgram;

public class FirstNonRepeatingCharFromString {
	public static void main(String[] args) {
		String str = "AutomationAum";
		char c = 0;
		boolean found = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			found = true;
			for (int j = 0; j < str.length(); j++) {
				if (i != j && ch == str.charAt(j)) {
					found = false;
					break;
				}
			}

			if (found) {
				c = ch;
				break;
			}
		}

		if (found) {
			System.out.println("The first non-repeating character is: " + c);
		} else {
			System.out.println("No non-repeating character found.");
		}

	}
}