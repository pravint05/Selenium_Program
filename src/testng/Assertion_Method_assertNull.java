package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Method_assertNull {

	@Test
	public void m1() {
		String ActualResult = null;
		Assert.assertNull(ActualResult); // pass
	}

	@Test
	public void m2() {
		String ActualResult = "abcd";
		Assert.assertNull(ActualResult); // fail
	}

}
