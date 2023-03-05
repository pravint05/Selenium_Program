package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions1 {

	// To move cursor

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// To enter URL on the webpage/To open an application
		driver.get("https://demo.automationtesting.in/Frames.html");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Step-I:Identify dropdownbox(find Address of dropdownbox)and store it into an
		// Object
		WebElement dropdown = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));

		// Step-II:Create object of Actions Class
		Actions act = new Actions(driver);

		// To move cursor
		act.moveToElement(dropdown).perform();

		Thread.sleep(2000);

		// to click window option
		driver.findElement(By.xpath("//a[text()='Windows']")).click();

	}

}
