import org.testng.annotations.Test;

public class PriorityTest {

	@Test(priority = 0)
	public void m1() {
		System.out.println("priority zero");
	}

	@Test(priority = 1)
	public void m2() {
		System.out.println("priority one");

	}

	@Test()
	public void m7() {
		System.out.println("No priority");

	}

	@Test
	public void m4() {
		System.out.println("No priority");

	}

	@Test
	public void m5() {
		System.out.println("No priority");

	}

}
