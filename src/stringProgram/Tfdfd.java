package stringProgram;

public class Tfdfd {
	public static void main(String[] args) {
		String str = "a2b3c4";
		char[] ch = str.toCharArray();
		String st = "";
		int no = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(ch[i])) {
				no = Character.getNumericValue(ch[i]);
			} else if (Character.isAlphabetic(ch[i])) {
				for (int j = 0; j <= no; j++) { // Changed from j <= no to j < no
					st = st + ch[i];
				}
				no = 0; // Reset the number after using it
			}
		}
		System.out.println(st); // Should print "aabbbcccc"
	}

}
