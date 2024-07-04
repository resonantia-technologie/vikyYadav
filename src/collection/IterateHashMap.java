package collection;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class IterateHashMap {

	@Test
	public void getValue() {
		System.out.println(testHashMap());
		usingKeySet();

	}

	public static String testHashMap() {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "pune");
		map.put(1, "Mumbai");
		map.put(8, "kokan");
		map.put(4, "solapur");
		map.put(5, "Nagpur");
		map.put(2, "pune");
		map.put(3, "Satara");
		map.put(2, "pune");
		String value = "";
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (entry.getKey() == 1)
				value = entry.getValue();
		}
		return value;

	}

	public static void usingKeySet() {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("One", 1);
		map.put("Two", 2);
		map.put("Three", 3);

		for (String key : map.keySet()) {
			if (key == "Three") {
				System.out.println(map.get(key));
			}
		}

	}

}
