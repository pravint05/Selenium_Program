package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tellstar/Videos/HitPaw/Velocity/Notes/Morning/Selenium/5%20(18aug)/xpath/name1.html");
		driver.manage().window().maximize();
		driver.findElement(By.name("1234")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.name("5678")).sendKeys("xyz@123");
		Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("file:///C:/Users/Tellstar/Videos/HitPaw/Velocity/Notes/Morning/Selenium/5%20(18aug)/xpath/name2.html");
		driver.findElement(By.name("1234")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.name("1234")).sendKeys("xyz@123");
	}

}
