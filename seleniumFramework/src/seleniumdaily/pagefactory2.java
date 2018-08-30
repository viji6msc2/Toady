package seleniumdaily;

import org.openqa.selenium.support.PageFactory;

public class pagefactory2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 @Test
		  public void LoginTest() {
			  //Initialize Login Page
		  LoginPage loginPage=PageFactory.initElements(driver, LoginPage.class);
		  //Enter user name
		  loginPage.EnterUserName("student1");
		  //Enter Password
		  loginPage.EnterPassword("Testing1");
		  //Click Login Button
		  loginPage.ClickLoginButton();

	}

}
