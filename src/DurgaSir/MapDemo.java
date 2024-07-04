package DurgaSir;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "Pune");
		map.put(2, "Mumbai");
		map.put(1, "Delhi");
		map.put(5, "Satara");
		map.put(7, "Goa");
		map.put(9, "Panaji");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			if (entry.getKey() == 5) {
				System.out.println(entry.getValue());
			}
		}

	}
}
