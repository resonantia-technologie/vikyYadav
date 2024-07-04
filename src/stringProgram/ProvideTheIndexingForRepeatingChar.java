package stringProgram;

public class ProvideTheIndexingForRepeatingChar {
	public static void main(String[] args) {
		System.out.println(isCharOfOccurance("testing test tested", 't'));
	}

	public static String isCharOfOccurance(String input, char c) {
		String s = "";
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == c) {
				count++;
				s = s + count;
			} else
				s = s + input.charAt(i);
		}
		return s;

	}

}
