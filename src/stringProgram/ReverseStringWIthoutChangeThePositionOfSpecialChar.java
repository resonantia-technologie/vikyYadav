package stringProgram;

public class ReverseStringWIthoutChangeThePositionOfSpecialChar {
	public static void main(String[] args) {
		String str = "@Vik$as Yada#v^";
		char[] a = str.toCharArray();
		char[] ch = new char[str.length()];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == '@' || a[i] == '$' || str.charAt(i) == '#' || a[i] == '^') {
				ch[count++] = str.charAt(i);
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(" " + ch[i]);
		}
	}
}
