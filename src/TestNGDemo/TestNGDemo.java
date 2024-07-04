package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {


	@Test()
	public void testNGIgnor() {

		String str = "Kwiran";
		String str1 = "Kiran";
		Assert.assertEquals(str, str1);

	}
}
