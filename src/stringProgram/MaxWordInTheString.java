package stringProgram;

public class MaxWordInTheString {
	public static void main(String args[]) {
		String str = "Generatesfdfdfdfdfdffd a stream of indices for the strirrr44444444444444rrrrrrrrrrrrng";
		String[] st = str.split(" ");
		String max = st[0];
		for (int i = 0; i < st.length; i++) {
			if (st[i].length() > max.length()) {
				max = st[i];

			}
		}
		System.out.println(max);

	}
}
