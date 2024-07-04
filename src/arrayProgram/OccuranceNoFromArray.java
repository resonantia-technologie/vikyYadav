package arrayProgram;

import java.util.HashMap;
import java.util.Map;

public class OccuranceNoFromArray {
	public static void main(String[] args) {
		int a[] = { 4, 5, 44, 3, 32, 2, 23, 4, 2, 2,6,3 ,3,3};
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(Integer c: a) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
	}
}
