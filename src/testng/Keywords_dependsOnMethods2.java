package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_dependsOnMethods2 {
//if test case gets fail, then dependent test case gets skip
	@Test()
	public void login() {
		Assert.fail();				 // for test case fail purpose
		Reporter.log("Log-In", true);
	}

	@Test(dependsOnMethods = { "login" })
	public void logout() {
		Reporter.log("Log-Out", true);
	}
}
