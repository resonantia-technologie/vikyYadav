package TestNGDemo;

import org.testng.annotations.Test;

public class TestNGGroupTest {
	@Test(groups = "smoke")
	public void testMethod1() {
		System.out.println("This is smoke test cases");
	}

	@Test(groups = "smoke")
	public void testMethod2() {
		System.out.println("This is smoke test cases 2");
	}

	@Test(groups = "smoke")
	public void testMethod3() {
		System.out.println("This is smoke test cases 3");
	}

	@Test(groups = "smoke")
	public void testMethod4() {
		System.out.println("This is smoke test cases 4");
	}

	@Test(groups = "smoke")
	public void testMethod5() {
		System.out.println("This is smoke test cases 5");
	}

	@Test(groups = "regression")
	public void testMethod6() {
		System.out.println("This is regression test cases 6");
	}

	@Test(groups = "regression")
	public void testMethod7() {
		System.out.println("This is regression test cases 2");
	}

	@Test(groups = "regression")
	public void testMethod8() {
		System.out.println("This is regression test cases 3");
	}

	@Test(groups = "regression")
	public void testMethod9() {
		System.out.println("This is regression test cases 4");
	}

	@Test(groups = "regression")
	public void testMethod10() {
		System.out.println("This is regression test cases 5");
	}

	@Test(groups = "sanity")
	public void testMethod11() {
		System.out.println("This is sanity test cases 6");
	}

	@Test(groups = "sanity")
	public void testMethod12() {
		System.out.println("This is sanity test cases 2");
	}

	@Test(groups = "sanity")
	public void testMethod13() {
		System.out.println("This is sanity test cases 3");
	}

	@Test(groups = "sanity")
	public void testMethod14() {
		System.out.println("This is sanity test cases 4");
	}

	@Test(groups = "sanity")
	public void testMethod15() {
		System.out.println("This is sanity test cases 5");
	}
	
	@Test(dependsOnGroups = {"sanity","smoke"})
	public void dependsOnGroup() {
		System.out.println("Depnds on group");
	}

}
