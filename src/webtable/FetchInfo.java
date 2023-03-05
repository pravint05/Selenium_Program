package webtable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FetchInfo {
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
		Search.sendKeys("RapidBox Sneakers For Men  (Blue)");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		WebElement Shoes = driver.findElement(By.xpath(
				"//img[@src='https://rukminim1.flixcart.com/image/612/612/xif0q/shoe/c/v/r/-original-imagg5xwdgc7cpgf.jpeg?q=70']"));
		act.click(Shoes).perform();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Set<String> AllIDs = driver.getWindowHandles();
		ArrayList<String> A1 = new ArrayList<String>(AllIDs);

		// to get Window Id
		String Childwindow = A1.get(1);

		driver.switchTo().window(Childwindow);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='Size Chart']")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Fetch data of row 3
		for (int i = 1; i <= 4; i++) {
			WebElement E1 = driver.findElement(By.xpath("//table[@class='_2WObml']//tr[3]/td[" + i + "]"));
			//LHS(String)"+Variable+"RHS(String)
			String S1 = E1.getText();
			System.out.print(S1 + " ");
		}

	}

}
