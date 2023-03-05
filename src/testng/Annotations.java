package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeClass				//Start condition
	public void OpenBrowser()
	{
		Reporter.log("Open Browser", true);
	}
	
	@BeforeMethod				//Pre-condition
	public void Login()
	{
		Reporter.log("Login Application", true);
	}
	
	@Test								//Test Case/Test Method
	public void Test9()
	{
		Reporter.log("Run Test Case9", true);
	}
	
	@Test								//Test Case/Test Method			
	public void Test2()
	{
		Reporter.log("Run Test Case2", true);
	}
	
	@AfterMethod				 //Post-condition
	public void Logout()
	{
		Reporter.log("Logout Application", true);
	}
	
	@AfterClass					//End condition 
	public void CloseBrowser()
	{
		Reporter.log("Close Browser", true);
	}
}
