package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Forgotpassword {
	
	public WebDriver driver;
	
	
	   public Forgotpassword(WebDriver driver) {
		
		this.driver = driver;
		
		public By orangeHRMusername_Textbox=By.id("securityAuthentication[userName]");
		public By resetPassword_Button=By.id("btnSearchValues");
		public By Cancel_Button=By.id("btnCancel");
		
		
		
	}

}
