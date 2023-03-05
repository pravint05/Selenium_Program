package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// To enter URL on the webpage/To open an application
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Month = driver.findElement(By.id("month"));
		Actions act = new Actions(driver);
		act.click(Month).perform();

		Thread.sleep(2000);

		// To move one option upword
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();

		Thread.sleep(2000);
		
		// To move one option upword
		act.sendKeys(Keys.ARROW_DOWN).perform();

		Thread.sleep(2000);

		// to select perticular option
		act.sendKeys(Keys.ENTER).perform();
	}

}
