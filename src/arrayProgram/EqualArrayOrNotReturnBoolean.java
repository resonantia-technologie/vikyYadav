package arrayProgram;

public class EqualArrayOrNotReturnBoolean {
	public static void main(String[] args) {
		int a[] = { 3, 5, 6, 3 };
		int b[] = { 3, 5, 6, 3 };
		System.out.println(isEqualArray(a, b));
	}

	public static boolean isEqualArray(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}
