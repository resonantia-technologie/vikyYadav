package TestNGDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class UseListernsDemo implements IRetryAnalyzer{

	@Test
	public boolean testLinsterns() {
		int retryCnt = 0;
		int maxRetryCnt = 2;
		//This method will be called everytime a test fails. It will return TRUE if a test fails
		// and need to be retried, else it returns FALSE
		// retry(ITestResult result) {
		if (retryCnt < maxRetryCnt) {
		//System.out.println("Retrying " + result.getName() + " again and the count is " + (retryCnt+1));
		retryCnt++;
		return true;
		}
		return false;
		
	}
	

	public boolean retry(ITestResult result) {
		
		return false;
	}
}
