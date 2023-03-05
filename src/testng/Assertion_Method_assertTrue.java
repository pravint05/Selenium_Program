package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Method_assertTrue {

	@Test
	public void m1() {
		boolean ActualResult = true;		
		Assert.assertTrue(ActualResult);		//pass
	}

	@Test
	public void m2() {
		boolean ActualResult = false;
		Assert.assertTrue(ActualResult);		//fail
	}

}
