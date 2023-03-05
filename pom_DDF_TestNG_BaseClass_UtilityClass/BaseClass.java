package pom_DDF_TestNG_BaseClass_UtilityClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	WebDriver driver;

	@Test
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dashboard.playboxtv.in/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}
