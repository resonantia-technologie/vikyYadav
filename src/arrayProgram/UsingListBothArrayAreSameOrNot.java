package arrayProgram;

import java.util.Arrays;

public class UsingListBothArrayAreSameOrNot {

	public static void main(String[] args) {
		int a[] = { 3, 5, 6, 3 };
		int b[] = { 3, 7, 6, 3 };	
		System.out.println(Arrays.compare(a, b));
		
		//System.out.println(isEqualArrayList(a, b));
	}

	public static boolean isEqualArrayList(int a[], int b[]) {
		return Arrays.equals(a, b);
		
	}

}
