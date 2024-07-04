package numberProgram;

public class OccurenceOfCHar {
	public static void main(String args[]) {
		String str = "aa bb cc d  j zz ee";
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char c = str.charAt(i);
			for (int j = 0; j < ch.length; j++) {
				if (c == ch[j]) {

					count++;
					ch[j] = 0;
				}

			}
			if (count > 0)
				System.out.println(c + "= " + count);

		}

	}

}