package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Tellstar/Videos/HitPaw/Velocity/Notes/Morning/Selenium/5%20(18aug)/xpath/linktext.html");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("face")).click();

	}
}
