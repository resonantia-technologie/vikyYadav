package numberProgram;

public class TestPrimeNumber {
	public static void main(String[] args) {
		int no = 7;
		int count = 0;
		for (int i = 1; i <= no; i++) {
			if (i % no == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("This is prime no");
		} else {
			System.out.println("Not Prime");
		}
	}
}
