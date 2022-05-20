package SeleniumLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName_Locators3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karunya\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.name("email")).sendKeys("Karunya Pesala");
		
		driver.findElement(By.name("pass")).sendKeys("Karunya Pesala");
		
		driver.findElement(By.name("login")).click();
		
		//driver.close();


	}

}
