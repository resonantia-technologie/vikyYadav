package stringProgram;

public class ReplaceSpecialCharByX {
	public static void main(String[] args) {
		String str = "Te$!ng $h@str@";
		String input=str.replaceAll("[^a-zA-Z]", "X");
		System.out.println(input);
	}
}
