package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Method_assertNotEquals {

	@Test
	public void m1() {
		String S1 = "Hi";
		String S2 = "Hi";
		Assert.assertNotEquals(S1, S2);// Fail // (actual,expected)
	}

	@Test
	public void m2() {
		String S1 = "Hi";
		String S2 = "Hello";
		Assert.assertNotEquals(S1, S2);// Pass // (actual,expected)
	}

}
