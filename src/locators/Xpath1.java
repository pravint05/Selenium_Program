package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Interface objectname=new classaname();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		// Enter UN ( Using Xpath by attribute & sendkeys method )
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Abc123@gmail.com");

		// Enter PSW
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("XYZ7869@shaji");

		Thread.sleep(2000);

		// Click Login Button ( Using Xpath by text and click method )
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
}
