package pom_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {

	LoginPage Log;
	HomePage Home;

	@BeforeClass()
	public void OpenBrowser() {
		LaunchBrowser();

		Log = new LoginPage(driver);
		Home = new HomePage(driver);

	}

	@BeforeMethod()
	public void LoginApp() throws IOException {
		Log.EnterMail(UtilityClass.GetData("EmailID"));
		Log.EnterPSW(UtilityClass.GetData("Password1"));
		Log.ClickBTN();
	}

	@Test()
	public void Test1() throws EncryptedDocumentException, IOException {

		String ActualResult = Home.Verify();
		String ExpectedResult = UtilityClass.FetchExceldata(0, 0);
		Assert.assertEquals(ActualResult, ExpectedResult);

	}

	@AfterMethod()
	public void LogoutApp(ITestResult Result) throws IOException {
		if (Result.getStatus() == ITestResult.FAILURE) {
			UtilityClass.ScreenShot(driver);
		}

		Home.clickLogout();

	}

	@AfterClass()
	public void CloseBrowser() {
		driver.close();

	}
}
