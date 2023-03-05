package testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample3 {
	
	@Test()
	public void m5() {
		Reporter.log("Running m5 method", true);
	}
	
	@Test()
	public void m6() {
		Assert.fail();
		Reporter.log("Running m6 method", true);
	}

}
