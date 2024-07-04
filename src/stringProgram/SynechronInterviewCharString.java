package stringProgram;
import java.util.HashMap;
import java.util.Map;
public class SynechronInterviewCharString {
	public static void main(String[] args) {
		String str = "CharacteraaaCCCCCCCCC";
		char[] ch = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character c : ch) {
			if (Character.isLetter(c)) {
				char lowerCaseChar = Character.toLowerCase(c);
				if (map.containsKey(lowerCaseChar)) {
					map.put(c, map.get(lowerCaseChar) + 1);
				} else {
					map.put(lowerCaseChar, 1);
				}
			}
		}
		int max = 0;
		char maxChar = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			char currentChar = entry.getKey();
			int currentCount = entry.getValue();
			if (currentCount > max || (currentCount == max && currentChar < maxChar)) {
				max = currentCount;
				maxChar = currentChar;
			}
		}
		System.out.println("Most occurance of char is : " + max + ": " + maxChar);
	}
	
	public static char getMaxOccuranceCharFromTheString(String str) {
		char ch[] = str.toCharArray();
		char maxChar = 0;
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char c = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (i != j && c == ch[j]) {
					count++;
					ch[j] = 0;
				}
			}
			if (count > 0) {
				if (count > maxChar) {
					maxChar = c;
				}
			}
		}
		return maxChar;
	}
}
