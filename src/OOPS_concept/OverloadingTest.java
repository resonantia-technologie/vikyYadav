package OOPS_concept;
public class OverloadingTest {	
	OverloadingTest() {
	System.out.println("This is constructor");
	}

	public static void main(String[] args) {
	System.out.println("This is main method in java");
	}

	public static final void main(Object t) {
	System.out.println("This is overloaded Object method");
	}
	
	public static final void main(int t) {
	System.out.println("This is overloaded int method");
	}

}
