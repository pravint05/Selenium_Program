package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Method_assertEquals {

	@Test
	public void m1() {
		String S1 = "Hi";
		String S2 = "Hi";
		Assert.assertEquals(S1, S2);// Pass // (actual,expected)
	}

	@Test
	public void m2() {
		String S1 = "Hi";
		String S2 = "Hello";
		Assert.assertEquals(S1, S2);// fail // (actual,expected)
	}

	@Test
	public void m3() {
		String S1 = "Good";
		String S2 = "Night";
		Assert.assertEquals(S1, S2, "Failed:both results are different");// Pass // (actual,expected)
	}

}
