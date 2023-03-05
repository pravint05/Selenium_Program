package handle_dynamic_element;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Case1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Dimension D1 = new Dimension(1200, 700);
		driver.manage().window().setSize(D1);

		// To enter URL on the webpage/To open an application
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		Thread.sleep(2000);
		Search.sendKeys("iphone 13");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement RR=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[4]"));
		String S1=RR.getText();
		System.out.println(S1);	//1,68,856 Ratings & 9,163 Reviews 14dec,
	}

}
