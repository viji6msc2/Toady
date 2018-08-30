package seleniumdaily;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.beust.jcommander.Parameter;

public class parelexecution {


		WebDriver driver =null ;
		@Parameter ("browser")
		
		public void initialixzeBrowser(String browser)
		{
			if(browser.equals("fireFox"))
			{
				
				driver=new FirefoxDriver();
			}
			
			else
			{
				
				System.setProperty("webdriver.ie.driver", "c://iedriver.exe");
				driver=new InternetExplorerDriver();
			}
			
			@Test
			public class test1extends launch Browser{
				
				public void gotogoole(){
					
					driver.get("http://www.google.com");
					
				}
			}
		}
	}

}
