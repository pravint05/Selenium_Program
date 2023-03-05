package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tellstar/Videos/HitPaw/Velocity/Notes/Morning/Selenium/5%20(18aug)/xpath/id1.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("abc123")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.id("abc456")).sendKeys("xyz@123");
	}
}
