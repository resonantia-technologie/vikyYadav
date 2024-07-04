package numberProgram;

public class FindOutDuplicateFromArray {
	public static void main(String[] args) {
		int a[] = { 2, 4, 56, 65, 7, 23, 2, 34, 32, 1, 2 ,65};
		for (int i = 0; i < a.length; i++) {
		
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[j]);
				}
			}
			
		}
	}
}
