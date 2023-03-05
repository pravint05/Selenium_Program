package popUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

		Thread.sleep(2000);

		// Enter Mobile/Email
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("8412046375");

		Thread.sleep(2000);

		// Enter Password
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("abcd1234");

		Thread.sleep(2000);

		// Click login button
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}

}
