package stringProgram;

public class RemoveCharFromString {
	public static void main(String[] args) {
		String m = "Communication";
		String n = m.replace("m", "");
		System.out.println(n);
		String k = "";
		for (int i = 0; i < m.length(); i++) {

			if (m.charAt(i) == 'm') {

			} else
				k = k + m.charAt(i);

		}
		System.out.println(k);

	}
}
