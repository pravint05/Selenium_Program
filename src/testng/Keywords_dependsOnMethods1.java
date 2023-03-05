package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_dependsOnMethods1 {

	@Test()
	public void login() {
		Reporter.log("Log-In", true);
	}

	@Test(dependsOnMethods = { "login" })
	public void logout() {
		Reporter.log("Log-Out", true);
	}

}
