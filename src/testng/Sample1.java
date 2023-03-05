package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1 {
	
	@Test()
	public void m1() {
		Reporter.log("Running m1 method", true);
	}
	
	@Test()
	public void m2() {
		Reporter.log("Running m2 method", true);
	}

}
