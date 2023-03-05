package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions5 {
		//drag and drop mouse action
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// To enter URL on the webpage/To open an application
		driver.get("https://demo.guru99.com/test/drag_drop.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Source1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement Destination1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Source1, Destination1).perform();
		
		Thread.sleep(3000);
		
		WebElement Source2 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement Destination2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(Source2, Destination2).perform();
	}
}
