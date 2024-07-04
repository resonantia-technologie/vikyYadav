package TestNGDemo;

import org.testng.annotations.Test;

public class DependsOnMethods {


	@Test()
	public void loginTest() {
		System.out.println("user login successfully: ");
	}

	@Test(dependsOnMethods = "loginTest")
	public void doValidation() {
		System.out.println("Validation is done base on dependsOnMethods");
	}
	
	

}
