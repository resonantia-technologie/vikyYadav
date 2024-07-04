package stringProgram;

public class RemoveSpecialCharFromString {
	public static void main(String[] args) {
		String a = "india@123";
		String b[] = a.split("@");
		System.out.println("First part: " + b[0]); // Output: india
		System.out.println("Second part: " + b[1]); // Output: 123
	}
}
