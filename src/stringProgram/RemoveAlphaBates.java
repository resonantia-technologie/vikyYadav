package stringProgram;

public class RemoveAlphaBates {
	public static void main(String[] args) {
		String str="A3l4p5ha7B8at6es";
		String s="";
		for (int i = 0; i < str.length(); i++) {
			if(Character.isAlphabetic(str.charAt(i))) {
				s=s+str.charAt(i);
			}
		}
		System.out.println(s);
		
	}
}
