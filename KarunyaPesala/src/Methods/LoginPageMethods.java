package Methods;

import org.openqa.selenium.WebDriver;

import pages.LoginPage;

public class LoginPageMethods {
	
	 WebDriver driver;
	 
	 LoginPage lp=new LoginPage(driver);
	 
	 public LoginPageMethods( WebDriver driver) {
		 
		 this.driver = driver;
		 
	 }
	 
	 public void enterUsername() {
		 
		 driver.findElement(lp.username_Textbox).sendkeys("Admin");
		 
	 }
	 public void enterPassword() {
		 
		 driver.findElement(lp.password_Textbox).sendkeys("Admin123");
		 
	 }
      public void clickLogin() {
		 
		 driver.findElement(lp.login_Button).click();
}

       public void enterForgotPassword() {
	 
	         driver.findElement(lp.ForgotPassword_Button).click();
}
}
