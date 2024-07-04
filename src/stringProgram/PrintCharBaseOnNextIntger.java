package stringProgram;

public class PrintCharBaseOnNextIntger {
	public static void ff(String[] args) {
		String str = "a2b3c4u5T8";
		char ch[] = str.toCharArray();
		String st = "";
		int no = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(ch[i])) {
				no = Character.getNumericValue(ch[i]);
			} else if (Character.isAlphabetic(ch[i])) {
				for (int j = 0; j <= no; j++) {
					st = st + ch[i];
				}
				  no = 0;
			}
		}
		System.out.println(st);

	}

}


