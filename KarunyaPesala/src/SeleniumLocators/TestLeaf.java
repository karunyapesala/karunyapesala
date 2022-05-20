package SeleniumLocators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLeaf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karunya\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.manage().window().maximize();
		
       driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		//1st way
		
		//driver.findElement(By.xpath("//button[text()='Edit.html']")).click();	
		
		//2nd way
		
		driver.findElement(By.xpath("//button[contains(test(),'Edit.html')]")).click();		


       Timeouts implicitlyWait = driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//Static way\
		
		//Absolute xpath
		
		//driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("bramhaiah");
		
		//Relative xpath
		
		//driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
		
		//driver.findElement(By.xpath("//*[@id=\"field1\"]")).sendKeys("sudharani");
		
		
		//driver.close();


	}

		
	}

