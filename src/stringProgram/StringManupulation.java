package stringProgram;

public class StringManupulation {
	public static void main(String[] args) {
		String NewString = "Hello";
		NewString.concat("World");
		System.out.println(NewString);

		String NewString1 = "Hello";
		NewString1 = NewString1.concat(" World");
		System.out.println(NewString1);
	}
}
