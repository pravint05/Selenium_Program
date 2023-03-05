package pom_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {

	public LoginPage L1;
	public HomePage H1;

	@BeforeClass()
	public void OpenBrowser() {
		LaunchBrowser();

		LoginPage L1 = new LoginPage(driver);
		HomePage H1 = new HomePage(driver);

	}

	@BeforeMethod()
	public void LoginApp() throws IOException
	{
		String S1=UtilityClass.GetData("EmailID");
		L1.EnterMail(S1);

	}

	@Test()
	public void Test1() {

	}

	@AfterMethod()
	public void LogoutApp() {

	}

	@AfterClass()
	public void CloseBrowser() {
		driver.close();

	}
}
