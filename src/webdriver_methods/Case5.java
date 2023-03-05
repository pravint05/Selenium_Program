package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case5 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Interface objectname=new classaname();

		driver.get("https://www.facebook.com/");
		
		Dimension D1=driver.manage().window().getSize();  //to get size of the browser	
		System.out.println(D1);

		Thread.sleep(5000);
		
		Dimension D2 = new Dimension(200, 1000);   //to set size of the browser
		driver.manage().window().setSize(D2);
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
