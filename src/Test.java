
public class Test {
	protected void getDetails() {
		System.out.println("Derived class");
	}
}

class Derived extends Test {
	protected final void getDetails() {
		System.out.println("Test class");
	}

	public static void main(String[] args) {
		Test obj = new Test();
		obj.getDetails();
	}
}
