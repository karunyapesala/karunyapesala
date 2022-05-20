package TestNG;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgExample1 {
	
	public WebDriver driver;

	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karunya\\Desktop\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		}
	@BeforeMethod
	public void waitSometime() {
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}
	
	@Test
	
	public  void login() {
		
		 driver.get("https://www.orangehrm.com/");
			
		}
	
	@Test
	
	public  void enterusername() {
		
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	}
	public  void enterpassword() {
		
		 driver.findElement(By.id("txtpassword")).sendKeys("Admin123");
	}
	@AfterMethod
	public void waitSometime1() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}		
	@AfterSuite
	public void logout() {
	}
	
	 
}
