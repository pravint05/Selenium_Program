package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Enter UN (Using ID css selector )
		driver.findElement(By.cssSelector("input#email")).sendKeys("abcd1234");	
		//Enter password
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("ZXY@123");
		//click on login(Using Attribute css selector)
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
