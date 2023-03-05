package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_invocationCount {
	//to run test case multiple times
	@Test(invocationCount = 5)
	public void m1() {
		Reporter.log("Running m1 method", true);
	}

}
