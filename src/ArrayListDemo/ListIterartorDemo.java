package ArrayListDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterartorDemo {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList();
		al.add("Vedi");
		al.add("Cheru");
		al.add("Nagu");
		al.add("Durga");
		al.add("Venki");
		al.add("BalKrihna");
		System.out.println(al);
		ListIterator<String> itr = al.listIterator();
		while (itr.hasNext()) {
			String s = (String) itr.next();
			if (s.equals("Venki")) {
				itr.remove();
			} else if (s.equals("Durga")) {
				itr.add("Chintu");
			} else if (s.equals("Nagu")) {
				itr.set("Pratiksha");
			}
		}
		
		System.out.println(al);
	}
}
