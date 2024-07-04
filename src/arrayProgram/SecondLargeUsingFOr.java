package arrayProgram;

public class SecondLargeUsingFOr {
	public static void main(String[] args) {
		int a[] = { 10, 6, 8, 6, 2, 3, 8, 8, 10, 12, 12 ,13,13};
		int temp = 0;
		for (int j = 0; j < a.length; j++) {
			for (int i = j + 1; i < a.length; i++) {
				if (a[j] > a[i]) {
					temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}
		}
		int highest = a[a.length - 1];
		int secondHighest = 0;

		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] != highest) {
				secondHighest = a[i];
				break;
			}
		}

		if (secondHighest != 0) {
			System.out.println("The second highest value is: " + secondHighest);
		} else {
			System.out.println("There is no second highest value.");
		}
	}
}
