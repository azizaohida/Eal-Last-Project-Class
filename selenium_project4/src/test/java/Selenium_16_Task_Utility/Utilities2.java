package Selenium_16_Task_Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Utilities2 {

	public static WebDriver driver;
	
	
	@Parameters({"browser" , "urlAddress"})
	@BeforeClass
	public static void Ibrowser(String nameofbrowser,String url) throws InterruptedException {
		
		  String ud = System.getProperty("user.dir");
			
		  if(nameofbrowser.equalsIgnoreCase("Edge")) {
				System.setProperty("WebDriver.Edge.driver", ud +"\\Driver\\msedgedriver.exe");
				   driver = new EdgeDriver();
	           
			     driver.get(url);
				
				driver.manage().window().maximize();
		 }
		
		  else if(nameofbrowser.equalsIgnoreCase("Chrome")) {
				
				System.setProperty("WebDriver.Chrome.driver", ud + "\\Drivers\\chromedriver.exe");
				   driver = new ChromeDriver();
	        
				
				driver.manage().window().maximize();
			
				driver.get(url);}	
		  
		 }	
	
	@AfterClass
	public void  teardown() {
		
	
		
	}
	
	
	  public static  void    screenshot(String foldername) throws IOException {
		  String ud = System.getProperty("user.dir");
		  Date objects = new Date();
			System.out.println(objects);
			String    Date = objects.toString().replace(" ", "_").replace(":", "_");
			System.out.println(Date);
			
			
	File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
					
			FileHandler.copy(screenshotFile, new File(ud+"\\Pictures\\"+foldername+"\\"+Date +"Myss.jpg"));
			
			       
			  }  
			
}		
	 
	