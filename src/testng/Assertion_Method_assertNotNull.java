package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Method_assertNotNull {
	
	@Test
	public void m1() {
		String ActualResult = null;
		Assert.assertNotNull(ActualResult); // fail
	}

	@Test
	public void m2() {
		String ActualResult = "abcd";
		Assert.assertNotNull(ActualResult); // pass
	}

}
