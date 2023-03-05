package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tellstar/Videos/HitPaw/Velocity/Notes/Morning/Selenium/5%20(18aug)/xpath/tagname.html");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("input")).sendKeys("abc123");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("XYZ@123");
	}
}
