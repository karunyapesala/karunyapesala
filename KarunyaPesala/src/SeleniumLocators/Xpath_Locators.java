package SeleniumLocators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karunya\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.manage().window().maximize();
		
		Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Static way\
		
		//Absolute xpath
		
		driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("bramhaiah");
		
		//Relative xpath
		
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).sendKeys("sudharani");
		
		
		//driver.close();


	}

}
