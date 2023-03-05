package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// To enter URL on the webpage/To open an application
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(2000);

		// To switch to frame(String FrameID/ String FrameName)
		driver.switchTo().frame("iframeResult");

		// click button
		driver.findElement(By.xpath("//button[@type='button']")).click();

		Thread.sleep(2000);

		// To switch to main page
		driver.switchTo().defaultContent();

		// Click Home Icon
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();

	}

}
