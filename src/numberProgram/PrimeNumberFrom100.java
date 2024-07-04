package numberProgram;

public class PrimeNumberFrom100 {
	public static void main(String[] args) {
		int count = 1;
		int no = 7;
		for (int i = 2; i <= no-1; i++) {
			if (no % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("This is not prime: " + no);
		} else
			System.out.println("This is prime " + no);

	}

}
