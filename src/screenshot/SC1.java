package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SC1 {
	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");	
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		//wait
		Thread.sleep(3000);
		
		//to take screenshot(Typecast/downcasting/convert)
		File Source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		System.out.println(Source);
		File Destination = new File("E:\\Velocity Screenshot\\sample2.jpg");
		FileHandler.copy(Source, Destination);

	}

}
