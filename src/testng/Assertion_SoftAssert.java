package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion_SoftAssert {

	@Test
	public void m1() {
		SoftAssert Soft = new SoftAssert();

		String S1 = "Hi";
		String S2 = "Hello";
		String S3 = "Good Morning";

		Soft.assertEquals(S1, S2);// false
		Soft.assertNotEquals(S1, S2);// true
		Soft.assertEquals(S1, S3);// false
		Soft.assertNotEquals(S1, S3);// true
		Soft.assertEquals(S2, S3);// false
		Soft.assertNotEquals(S2, S3);// true
		Soft.assertAll();// to show notifications in console
	}
}
