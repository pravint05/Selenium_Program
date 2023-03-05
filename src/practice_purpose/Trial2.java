package practice_purpose;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://skpatro.github.io/demo/links");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Set<String> All_IDs = driver.getWindowHandles();
		ArrayList<String> A1 = new ArrayList<String>(All_IDs);

		String ChildWindowID = A1.get(1);
		String MainPageID = A1.get(0);
		
		driver.switchTo().window(ChildWindowID);
		
		Dimension D1= new Dimension(1200,700);
		driver.manage().window().setSize(D1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();

		Thread.sleep(3000);

		driver.switchTo().window(MainPageID);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

		driver.switchTo().window(ChildWindowID);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();

	}

}
