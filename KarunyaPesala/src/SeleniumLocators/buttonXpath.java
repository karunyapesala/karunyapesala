package SeleniumLocators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonXpath {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karunya\\Desktop\\chromedriver.exe");
				
		  WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				
				driver.navigate().to("http://www.leafground.com/");
				
				driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
				
				System.out.println(driver.getTitle());
				
				//1st way
				
				driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a")).click();	
				
				driver.findElement (By.xpath("//*[@id=\"email\"]")).sendKeys("Karunya967@gmail.com");
				
				driver.findElement (By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).clear();
				
				driver.findElement (By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys("testleafSelenium");
				
				
                driver.findElement (By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).clear();

				driver.findElement (By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input")).sendKeys("Selenium");
				
				driver.findElement (By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).clear();

				driver.findElement (By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input")).sendKeys("selenium with java");

				driver.findElement (By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input")).clear();
				
			}

		

		
	
}