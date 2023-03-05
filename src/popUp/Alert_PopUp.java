package popUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("Abcd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);

		// To switch to Alert pop-up
		Alert ALT = driver.switchTo().alert();
		ALT.dismiss(); // To click Cancel button

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='cusid']")).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("PQRs");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);

		Alert alt = driver.switchTo().alert();
		alt.accept(); // to click OK button
		Thread.sleep(4000);

		//To get the text
		String S1 = alt.getText();
		System.out.println(S1);

		Alert a1 = driver.switchTo().alert();
		a1.accept(); // to click OK button

		Thread.sleep(3000);
		driver.quit();

	}

}
