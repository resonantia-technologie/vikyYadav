package arrayProgram;

import java.util.Arrays;

public class MoveAllZeroLast {
	public static void main(String[] args) {
		int a[] = { 0, 12, 32, 4, 0, 45, 0, 13 };
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int i = a.length - 1; i > 0; i--) {
			//System.out.println(a[i]);
		}
	}
}
