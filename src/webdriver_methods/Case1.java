package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case1 {
	public static void main(String[] args) throws InterruptedException {

		// Parameter-I: Name of the Browser(Small letter)
		// Parameter-II: Path of the chromedriver.exe file(Convert \ to\\)

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		// Create object of chromeDriver class
		WebDriver driver = new ChromeDriver(); // Interface objectname=new classaname();

		// To enter URL on webpage or To open an application
		driver.get("https://www.amazon.com/");

		// To open new window Tab (same browser)
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");

		// To open new window Tab (same browser)
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.netflix.com/");

		// To close current tab of the browser
		driver.close();

		// wait
		Thread.sleep(3000);

		// To close all the tabs of the browser
		driver.quit();
	}
}
