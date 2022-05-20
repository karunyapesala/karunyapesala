package Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

@Test

public class Login {
	
	WebDriver driver; 
	
	LoginPage lpm=new LoginPage(driver);
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karunya\\Desktop\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
	
	
	
	
		
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
}
