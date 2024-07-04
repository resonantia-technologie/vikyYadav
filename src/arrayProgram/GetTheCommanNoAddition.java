package arrayProgram;

import java.util.HashSet;

public class GetTheCommanNoAddition {
	public static void main(String[] args) {
		int[] a = { 4, 5, 7, 8, 1, 2 };
		int[] b = { 9, 5, 7, 3, 1, 2 };
		//5+7+1+2+7=
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i]==b[j]) {
					sum+=a[i];
				}
			}
		}
		//System.out.println(sum);
		System.out.println(sumOfCommonElements(a, b));

	}
	
	 public static int sumOfCommonElements(int[] a, int[] b) {
	        // Using a HashSet to store unique elements from array a
	        HashSet<Integer> setA = new HashSet<>();
	        for (int num : a) {
	            setA.add(num);
	        }

	        // Sum of common elements
	        int sum = 0;

	        // Iterate over array b and add to the sum if the element is also in setA
	        HashSet<Integer> commonElements = new HashSet<>();
	        for (int num : b) {
	            if (setA.contains(num) && !commonElements.contains(num)) {
	                sum += num;
	                commonElements.add(num);
	            }
	        }

	        return sum;
	    }	
	
	
}
