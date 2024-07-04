package numberProgram;

public class PrimeNumber {
	public static void main(String[] args) {
	isPrim(3);
	}

	public static boolean isPrim(int no) {
		int count = 1;
		for (int i = 2; i <= no-1; i++) {
			if (i % no == 0) {
				count++;
			}
		}
		if (count > 2) {
			return false;
		} else
			return true;

	}
}
