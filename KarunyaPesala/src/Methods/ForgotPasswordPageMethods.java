package Methods;

import org.openqa.selenium.WebDriver;

import pages.Forgotpassword;
import pages.LoginPage;

public class ForgotPasswordPageMethods {
	
	 WebDriver driver;
	 
	Forgotpassword fp=new Forgotpassword(driver);
	 
	 public ForgotPasswordPageMethods( WebDriver driver) {
		 
		 this.driver = driver;
		 
	 }
	 
	 public void enterOrangeHRmUsername(String username) {
		 
		 driver.findElement(fp.orangeHRMusername_Textbox).sendkeys(username);
		 
	 }
	 public void clickResetPassword() {
		 
		 driver.findElement(fp.resetpassword_Button).click();
		 
	 }
 public void clickcancel() {
		 
		 driver.findElement(fp.cancel_Button).click();
}
	
}	 
