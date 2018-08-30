package seleniumdaily;

public class pageObjectMode4 {

	public void Test()
	{
		
		Webdriver driver =new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		pageobjectmodel login =new pageobjectmodel() ;
		
		login.typeusername();
		login.password();
		login.submit();
		
		
		driver.close();
				
	}
	
}
