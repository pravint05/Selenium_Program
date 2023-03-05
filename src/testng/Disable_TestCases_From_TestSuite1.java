package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_TestCases_From_TestSuite1 {
	// disable test case from test suite by using exclude

	@Test()
	public void m1() {
		Reporter.log("Running m1 method", true);
	}

	@Test()
	public void m2() {
		Reporter.log("Running m2 method", true);
	}

	@Test()
	public void m3() {
		Reporter.log("Running m3 method", true);
	}

	@Test()
	public void m4() {
		Reporter.log("Running m4 method", true);
	}

}
