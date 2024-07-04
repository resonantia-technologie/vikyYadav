package stringProgram;

public class ReverseString {
	public static void main(String[] args) {
		String str = "TestingCanBeDone";
		StringBuffer btr = new StringBuffer(str);
		//System.out.println(btr.reverse());
		
		for (int i = str.length(); i >= 1; i--) {
			char a = str.charAt(i);
			System.out.println(a);
		}
	}
}
