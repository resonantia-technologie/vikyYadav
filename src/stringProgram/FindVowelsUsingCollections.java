package stringProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindVowelsUsingCollections {
	public static void main(String[] args) {
		String str = "Kailas ANdhalkar";
		String vowels = "aeiouAEIOU";

		// Convert the string to a character array
		char[] characters = str.toCharArray();

		// Create a set of vowels for quick lookup
		Set<Character> vowelSet = new HashSet<>();
		for (char vowel : vowels.toCharArray()) {
			vowelSet.add(vowel);
		}

		// Create a map to store the vowels found in the string and their counts
		Map<Character, Integer> vowelMap = new HashMap<>();

		// Iterate through the character array and check for vowels
		for (char c : characters) {
			if (vowelSet.contains(c)) {
				if (vowelMap.containsKey(c)) {
					// If the vowel is already in the map, increment its count
					int count = vowelMap.get(c);
					vowelMap.put(c, count + 1);
				} else {
					// If the vowel is not in the map, add it with a count of 1
					vowelMap.put(c, 1);
				}
			}
		}

		// Print the vowels found in the string and their counts
		for (Map.Entry<Character, Integer> entry : vowelMap.entrySet()) {
			System.out.println("Vowel: " + entry.getKey() + ", Count: " + entry.getValue());
		}
	}	
}
