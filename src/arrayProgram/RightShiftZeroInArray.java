package arrayProgram;

public class RightShiftZeroInArray {
	public static void main(String[] args) {
		int count = 0;
		int a[] = new int[] { 1,0, 5,1, 6,1, 0, 0, 4, 9, 0, 78, 65, 0 };
		int temp[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			if (a[i]!= 0) {
				temp[count] = a[i];
				count++;
			}

			}
		for (int i = 0; i<temp.length; i++) {
			System.out.print(" " + temp[i]);
		}
	}
}
