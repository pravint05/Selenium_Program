package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keywords_priority {
	
	//Basedo priority test cases run
	
	@Test(priority=2)
	public void m1()
	{
		Reporter.log("Running m1 method",true);
	}

	@Test
	public void m2()
	{
		Reporter.log("Running m2 method",true);
	}

	@Test(priority=1)
	public void m3()
	{
		Reporter.log("Running m3 method",true);
	}

	@Test(priority=-1)
	public void m4()
	{
		Reporter.log("Running m4 method",true);
	}
	
	@Test(priority=1)
	public void m5()
	{
		Reporter.log("Running m5 method",true);
	}
}
