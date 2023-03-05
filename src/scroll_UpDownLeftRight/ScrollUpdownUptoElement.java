package scroll_UpDownLeftRight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpdownUptoElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/guru99home/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement ele = driver.findElement(By.xpath("//a[text()='Facebook']"));

		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);

		Thread.sleep(4000);

		WebElement ele2 = driver.findElement(By.xpath("//h3[text()='All provided FREE!!!']"));

		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele2);

	}

}
