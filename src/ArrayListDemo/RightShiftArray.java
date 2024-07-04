package ArrayListDemo;

public class RightShiftArray {
	public static void main(String[] args) {
		int[] a = { 4, 54, 0, 5, 0, 4, 5, 0, 4, 5, 0, 4, 54, 0, 5, 4, 0 };
		int[] c = new int[a.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				c[count++] = a[i];
			}
		}
		for (int i = 0; i < c.length; i++) {
			System.out.print(" "+c[i]);
		}
	}
}
