package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// To enter URL on the webpage/To open an application
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Close hidden division pop-up
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step-I:Identify Address and store it into an Object(to perform left click)
		WebElement Leftclick = driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		Actions act = new Actions(driver);
		act.click(Leftclick).perform();

	}

}
