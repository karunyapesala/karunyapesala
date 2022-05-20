package JavaBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumwithJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karunya\\Desktop\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=101.0.4951.41/");
		
		driver.manage().window().maximize();
		
		driver.close();

	}

}
