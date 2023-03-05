package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_timeout {
	
	//if any test case chances of failure, so we give timeOut time, within that test pass otherwise it gets fail and other test cases run
	
	@Test(timeOut=3000)
	public void m1() {
		Reporter.log("Running m1 method", true);
	}
	
	@Test()
	public void m2() {
		Reporter.log("Running m2 method", true);
	}
	
	@Test(timeOut=3000)
	public void m3() throws InterruptedException {
		Thread.sleep(5000);
		Reporter.log("Running m3 method", true);
	}
	
	@Test()
	public void m4() {
		Reporter.log("Running m4 method", true);
	}
	
	

}
