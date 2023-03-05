package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Method_assertFalse {
	
	@Test
	public void m1() {
		boolean ActualResult = true;		
		Assert.assertFalse(ActualResult);		//Fail
	}

	@Test
	public void m2() {
		boolean ActualResult = false;
		Assert.assertFalse(ActualResult);		//Pass
	}

}
