package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case3 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Interface objectname=new classaname();

		// to enter URL on webpage/to open an application
		driver.navigate().to("https://gtmetrix.com/");

		Thread.sleep(2000); // wait

		driver.navigate().to("https://quickdraw.withgoogle.com/");

		Thread.sleep(2000);

		driver.navigate().to("https://dashboard.playboxtv.in/");

		Thread.sleep(2000);
		
		driver.navigate().back(); // to move backward

		Thread.sleep(2000);

		driver.navigate().refresh(); // to refresh webpage

		Thread.sleep(2000);

		driver.navigate().back();

		Thread.sleep(2000);

		driver.navigate().forward(); // to move forward

		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}
}
