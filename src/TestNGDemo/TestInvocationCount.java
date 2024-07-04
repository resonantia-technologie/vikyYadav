package TestNGDemo;

import org.testng.annotations.Test;

public class TestInvocationCount {
	@Test(invocationCount = 19)
	public void testInvoucationCount() {
		int count=0;
		System.out.println("count : "+count++);
	}
}
