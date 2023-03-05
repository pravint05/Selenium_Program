package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_HardAssert {

	@Test
	public void m1() {

		String S1 = "Hi";
		String S2 = "Hello";
		String S3 = "Good Morning";

		Assert.assertNotEquals(S1, S2);// pass
		Assert.assertEquals(S1, S2);// fail
		Assert.assertNotEquals(S1, S3);// pass
		Assert.assertEquals(S1, S3);// fail
		Assert.assertNotEquals(S2, S3);// pass
		Assert.assertEquals(S2, S3);// fail

	}
}