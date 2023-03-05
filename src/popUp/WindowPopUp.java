package popUp;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // browser maximise

		driver.get("https://skpatro.github.io/demo/links");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicitly wait

		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Set<String> All_IDs = driver.getWindowHandles();
		ArrayList<String> A1 = new ArrayList<String>(All_IDs);

		// To get WindowID
		String ChildWindowID = A1.get(1);
		String MainPageID = A1.get(0);

		// To switch to window
		driver.switchTo().window(ChildWindowID);

		Dimension D1 = new Dimension(1300, 500);
		driver.manage().window().setSize(D1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		Thread.sleep(3000);

		driver.switchTo().window(MainPageID);

		// click new Tab button
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();

	}
}
