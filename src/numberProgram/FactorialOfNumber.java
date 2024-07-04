package numberProgram;

public class FactorialOfNumber {
	public static void main(String[] args) {
		int no = 6; // 5*4*3*2*1=120
		int sum = 1;
		for (int i = 1; i <= no; i++) {
			sum = sum * i;
		}
		System.out.println(sum);
	}
}
