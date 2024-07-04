package TestNGDemo;

import org.testng.annotations.Test;

public class PriorityDemo {
	@Test(priority = -3)
	public void test1() {
		System.out.println("This is prioirty -3");
	}

	@Test(priority = -54)
	public void test2() {
		System.out.println("This is prioirty -54");

	}

	@Test(priority = 3)
	public void test3() {
			System.out.println("This is prioirty 3");

	}

	@Test(priority = 54)
	public void test4() {
		System.out.println("This is prioirty 54");

	}
}
