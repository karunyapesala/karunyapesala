package SeleniumLocators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karunya\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Static way\
		
		//Absolute xpath
		
		driver.findElement(By.cssSelector("#field1")).sendKeys("bramhaiah");
		
		//Relative xpath
		
		driver.findElement(By.cssSelector("input[id='field2']")).sendKeys("manojkumar");
		
		
		//driver.close();


	}

}
