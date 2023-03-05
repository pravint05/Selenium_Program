package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	WebDriver driver = null;

	@Parameters("browserName")
	@Test
	public void m1(String browserName) {
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

			driver = new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Tellstar\\Desktop\\Dont Move File\\geckodriver.exe");

			driver = new FirefoxDriver();
		}

		driver.get("https://dashboard.playboxtv.in/login");

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ceo@tellstar.in");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//button[@class='login100-form-btn']")).click();

		String ExpectedText = "TELLSTAR";
		WebElement title = driver.findElement(By.xpath("//h6[text()='TELLSTAR']"));
		String ActualText = title.getText();

		if (ExpectedText.equals(ActualText)) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}

	}

}
