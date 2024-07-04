package stringProgram;

public class FindVowelFromString {
public static boolean isVowel(char c) {
return c=='a'||c=='e'|| c=='i'||c=='o'|| c=='u';
}

public static void main(String[] args) {
	String str="kails as";
	String vowel="";
	for (int i = 0; i <str.length(); i++) {
		if(isVowel(str.charAt(i))) {
			vowel=vowel+str.charAt(i);
		}
		vowel=vowel+" ";
	}
	System.out.println(""+vowel);
}
}
