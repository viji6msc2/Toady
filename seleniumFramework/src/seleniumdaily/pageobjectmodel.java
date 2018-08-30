
package seleniumdaily;

import org.openqa.selenium.By;

public class pageobjectmodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Webdriver driver ;
		
		By username =By.id("username");
		By password =By.xpath(".//*[@id='username']");
		By Submit =By.Submit("wp-submit");
		
		
		public  pageobjectmodel(Webdriver driver)
		{
			this .driver =driver ;
		}
		
		public void typeusername()
		{
			
			driver.findElement(username).sendKeys("viji6msc@gmail.com");
		}
		
		public void typeusername()
		{
			driver.findElement(password).sendKeys("password");
			
		}
		
		public void clicksubmit()
		{
			
			driver.findElement(Submit).click();
		}
		
		
		
		
	}

	public void typeusername() {
		// TODO Auto-generated method stub
		
	}

}
