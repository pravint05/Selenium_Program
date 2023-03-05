package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Emailable_Report {
	
	@Test
	public void m1()
	{
		Reporter.log("Running m1 method", true);
	}

	@Test
	public void m2()
	{
		Reporter.log("Running m2 method", true);
	}
	
	@Test
	public void m3()
	{
		Reporter.log("Running m3 method");
	}
	@Test
	
	public void m4()
	{
		Reporter.log("Running m4 method", false);
	}
}
