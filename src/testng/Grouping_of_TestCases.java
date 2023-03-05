package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping_of_TestCases {
	
	@Test(groups="login")
	public void m1() {
		Reporter.log("Running m1 method", true);
	}
	
	@Test(groups="login")
	public void m2() {
		Reporter.log("Running m2 method", true);
	}
	
	@Test(groups="Dashboard")
	public void m3() {
		Reporter.log("Running m3 method", true);
	}
	
	@Test(groups="profile")
	public void m4() {
		Reporter.log("Running m4 method", true);
	}
	
	@Test(groups="profile")
	public void m5() {
		Reporter.log("Running m5 method", true);
	}
	
	@Test(groups="logout")
	public void m6() {
		Reporter.log("Running m6 method", true);
	}


}
