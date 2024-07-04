package stringProgram;

public class MakeFirstCharCapital {
	public static void main(String args[]) {
		String str = "Dont loose your hipes";
		String st[] = str.split(" ");
		String s = "";

		for (int i = 0; i < st.length; i++) {
			for (int j = 0; j < st[i].length(); j++) {
				if (j == 1) {
					s = s + st[i].toUpperCase().charAt(j);
				} else {
					s = s + st[i].charAt(j);
				}
			}
			s = s + " ";
		}
		System.out.println(s);

	}
}
