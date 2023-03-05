package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//click create new account button (Using xpath by contains)
		driver.findElement(By.xpath("//a[contains(text(),'Create New ')]")).click();
		
		//wait
		Thread.sleep(3000);
		
		//Enter FirstName (using Xpath by index)
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Pravin");
	}

}
