package stringProgram;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfCharUsingMap {
	public static void main(String[] args) {
		String str = "zKilaasannfffffffffffffffff";
		char ch[] = str.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}

}