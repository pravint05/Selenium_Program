package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case6 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tellstar\\Desktop\\Dont Move File\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // Interface objectname=new classaname();

		driver.get("https://www.facebook.com/");
		
		Point P1=driver.manage().window().getPosition();  //To get the position of browser	
		System.out.println(P1);
		
		Thread.sleep(5000);
		
		Point P2 = new Point(550,150);		//To change the position of browser	
		driver.manage().window().setPosition(P2);
		
		Thread.sleep(5000);
		
		driver.close();
	}
}
