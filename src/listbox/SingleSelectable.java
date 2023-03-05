package listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

		Thread.sleep(3000);

		// Step-I:Identify Listbox(find Address of listbox)and store it into an Object
		WebElement Day = driver.findElement(By.xpath("//select[@name='birthday_day']"));

		// Step-II:Create object of Select Class
		Select S1 = new Select(Day);

		// Step-III:Call the methods
		S1.selectByValue("10");
		
		//To check whether listbox is multiselectable or not?
		boolean listbox = S1.isMultiple();
		System.out.println(listbox);

		Thread.sleep(1000);

		WebElement Month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select S2 = new Select(Month);
		S2.selectByIndex(10);

		Thread.sleep(1000);

		WebElement Year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select S3 = new Select(Year);
		S3.selectByVisibleText("1993");
		
		//To get text of selected option
		WebElement B1 = S3.getFirstSelectedOption();
		String text =B1.getText();
		System.out.println(text);
		
		//To get text of all option(w/o selecting)
		List<WebElement> A1=S2.getOptions();
		for(WebElement V1:A1) 
		{
			System.out.println(V1.getText());
		}
		
		Thread.sleep(2000);
		driver.quit();

	}
}
