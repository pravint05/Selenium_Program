package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disable_TestCases_From_TestSuite2 {
	// disable test case from test suite by using include

	@Test()
	public void m5() {
		Reporter.log("Running m5 method", true);
	}

	@Test()
	public void m6() {
		Reporter.log("Running m6 method", true);
	}

	@Test()
	public void m7() {
		Reporter.log("Running m7 method", true);
	}

	@Test()
	public void m8() {
		Reporter.log("Running m8 method", true);
	}

}
