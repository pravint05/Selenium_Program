package scroll_UpDownLeftRight;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");

		Thread.sleep(2000);

		// Scroll down : Enter 2nd parameter +ve pixel value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000)");

		Thread.sleep(4000);

		// Scroll up : Enter 2nd parameter -ve pixel value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-500)");

	}

}
