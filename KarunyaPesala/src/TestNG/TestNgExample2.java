package TestNG;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgExample2 {
	
	@Test
	
	public  void login() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karunya\\Desktop\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.orangehrm.com/");
			
			driver.close();
			
			 
				
			
			
			
			
	}
	
	 
}
