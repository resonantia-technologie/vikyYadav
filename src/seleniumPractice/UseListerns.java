package seleniumPractice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class UseListerns {
	@Test
	public void test1() {
		System.out.println("Executing test1");
		Assert.assertTrue(true);
	}

	@Test
	public void test2() {
		System.out.println("Executing test2");
		Assert.assertTrue(false);
	}
}
