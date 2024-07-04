package stringProgram;

public class Vowels {
	public static void main(String[] args) {
		String str = "sbdksnkdsnaiueiue";
		String vowels = "aeiou";
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				if (str.charAt(i) == vowels.charAt(j)) {
					count++;
					System.out.println("vowel is : " + str.charAt(i) + " on index value : " + i);
				}
			}
		}
		System.out.println(count);
	}
}
