package numberProgram;

public class ArmStrongNumberTest {
	public static void main(String[] args) {
		System.out.println(isArmStrongNumber(153));

	}

	public static String isArmStrongNumber(int no) {
		int rem = 0;
		int total = 0;
		int value = no;
		while (value > 0) {
			rem = value % 10;
			total = total + (rem * rem * rem);
			value = value / 10;
		}
		if (no == total) {
			return "This is ArmStrong";
		} else
			return "This is not ArmStrong";
	}
}
