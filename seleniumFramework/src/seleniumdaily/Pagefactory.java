package seleniumdaily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Pagefactory { 
	
	WebDriver driver ;
	
	public  Pagefactory(WebDriver driver)
	{
		this .driver =driver 
	}
	
	//Define User name Field
		@FindBy(how=How.ID, using="login_login_username")
		private WebElement usernameField;
		
		//Define Password Field
		@FindBy(how=How.ID, using="login_login_password")
		private WebElement passwordField;
		
		//Define Login Button
		@FindBy(how=How.ID, using="login_submit")
		private WebElement loginButton;
		
		//Define User name Enter Method
		public void EnterUserName(String usernametext)
		{
			usernameField.sendKeys(usernametext);
		}
		
		//Define Password Enter Method
			public void EnterPassword(String passwordtext)
			{
				passwordField.sendKeys(passwordtext);
			}
			
		//Define Login Button Click Method
			public void ClickLoginButton()
			{
				loginButton.click();
			}

}
