package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		// Create object of chromeDriver class
		WebDriver driver = new ChromeDriver(); // Interface objectname=new classaname();

		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		String Title1 =driver.getTitle();	//to get title of webpage
		System.out.println(Title1);
		
		String URL=driver.getCurrentUrl();	//to get current URL of the webpage
		System.out.println(URL);
		
		Thread.sleep(3000);
		
		driver.manage().window().minimize();	//To minimize browser
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();	//To maximize browser
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}
	
}
