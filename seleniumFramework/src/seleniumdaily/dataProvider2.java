package seleniumdaily;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class dataProvider2 {
	
	WebDriver driver ;
    XssfWorkbook workbook ;
    XssfSheet sheet ;
    Xssfcell cell ;
    
    
    public void launchbrowser() {
    	
    	System.setProperty("Webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
    	driver=new ChromeDriver();
        driver.get("http://www.gogole.com");
        
        driver.manage().window().maximize();
    	
   }
	
	

  public void fbloginlogout()
  {
	  
	  File file = new File("D:\\Test.xlsx");
	  
	  FileInputStream fis = new FileInputStream(fis);
	  
	  Workbook wb = new HssfWorkbook(fis);
	  
	  sheet =wb.geSheetAt(0);
	  
	  for(int i=1 ; i<=sheet.getlastRowNum() ; i++)
		  
	  {
		  
		  cell =sheet.getRow(i).getcell(0);
		  cell.setcelltype(cell.CELL_TYPE_STRING);
		  driver.findElement(By.xpath("\\input[@input='value']")).clear();
		  driver.findElement(By.xpath("\\input[@input='value']")).sendKeys(cell.getStringcellvalue());
	  }
	  
	  
	  
	  
  }

		
}
