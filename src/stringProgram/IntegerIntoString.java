package stringProgram;

public class IntegerIntoString {
	public static void main(String args[]) {
		String str = "84e834";
		//int b = Integer.parseInt(str);
		//System.out.println(b);
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int digit = 0;
			if (Character.isDigit(ch)) {
				digit = Character.getNumericValue(ch);
			}
			//System.out.print(digit);
		}
		
		int a=8753;
		String no=String.valueOf(a);
		System.out.println(no);

	}
}
