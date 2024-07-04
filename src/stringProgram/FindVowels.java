package stringProgram;

public class FindVowels {
	public static void main(String[] args) {
		String str = "vikas Yadaberiou";
		String vowels = "aeiouAEIOU";
		String v = "";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (vowels.indexOf(str.charAt(i))!= -1) {
				v += str.charAt(i);
				count++;
				
			}
			
		}
		System.out.println(v+": "+count);
		

	}
}
