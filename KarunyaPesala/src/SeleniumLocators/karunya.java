package SeleniumLocators;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class karunya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karunya\\Desktop\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.orangehrm.com/");
		
		

	}

}
