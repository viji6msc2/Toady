package seleniumdaily;

public class OnjectReposistory3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Create WebDriver Instance		
	    WebDriver driver;			
	    System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
	    driver = new ChromeDriver();					
	    driver.get("http://demo.guru99.com/test/guru99home/");					
	    driver.manage().window().maximize();			
	// Load the properties File		
	    Properties obj = new Properties();					
	    FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");									
	    obj.load(objfile);					
	// Nagigate to link Mobile Testing and Back		
	    driver.findElement(By.xpath(obj.getProperty("MobileTesting"))).click();							
	    driver.navigate().back();			
	// Enter Data into Form		
	    driver.findElement(By.id(obj.getProperty("EmailTextBox"))).sendKeys("testguru99@gmail.com");									
	    driver.findElement(By.id(obj.getProperty("SignUpButton"))).click();							
	  }		

	}//


		
	}

}
