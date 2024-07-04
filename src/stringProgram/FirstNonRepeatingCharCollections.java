package stringProgram;

import java.util.HashMap;

public class FirstNonRepeatingCharCollections {
	public static void main(String[] args) {
		String str = "Kailas";
		char c[] = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();
		for (Character a : c) {
			if (map.containsKey(a)) {
				map.put(a, map.get(a) + 1);
			} else {
				map.put(a, 1);
			}
		}

		for (Character a : c) {
			if (map.get(a) == 1) {
				System.out.println(a);
				break;
			}
		}

	}
}
