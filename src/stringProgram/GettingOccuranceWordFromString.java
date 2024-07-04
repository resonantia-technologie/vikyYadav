package stringProgram;

import java.util.HashMap;
import java.util.Map;

public class GettingOccuranceWordFromString {
	public static void main(String[] args) {
		String str = "Kailas Kiran Kailas vikas Kailas Tej Tej Tej";
		String st[] = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s : st) {
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else
				map.put(s, 1);
		}
		System.out.println(map);

	}

}
