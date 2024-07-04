package stringProgram;

import java.util.Iterator;

public class CountNoOfWordsInString {
	public static void main(String[] args) {
		String str="no of words present in the word";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			count++;
		}
		System.out.println("The No of words present in the : "+count);
	}
}
