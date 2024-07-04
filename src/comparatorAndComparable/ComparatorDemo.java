package comparatorAndComparable;

public class ComparatorDemo {
	public static void main(String[] args) {
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		System.out.println("Z".compareTo("Z"));
		System.out.println("A".compareTo(null));
	}
}
