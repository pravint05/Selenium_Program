package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample2 {

	@Test()
	public void m3() {
		Reporter.log("Running m3 method", true);
	}

	@Test()
	public void m4() {
		Reporter.log("Running m4 method", true);
	}

}
