package com.train.org.selenium_project4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IBrowser {

	static WebDriver  driver;
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("WebDriver.Chrome.driver", "C:\\My automation Task\\My workspace 1\\selenium_project4\\Driver\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
       driver.manage().window().maximize();
	
	  Thread.sleep(4000);
	
	driver.get("https://www.youtube.com/");
	
	Thread.sleep(2000);
	
	driver.navigate().refresh();
	
	Thread.sleep(1000);
	driver.navigate().back();
	
	Thread.sleep(1000);
	driver.navigate().forward();
	
	// sessionid
	String sessionid = driver.getWindowHandle();
	System.out.println(sessionid);
	
	// Current Url
	String  Url = driver.getCurrentUrl();
	
	System.out.println(Url);
	// pageTitle
	  String  pageTittle = driver.getTitle();
	
	System.out.println(pageTittle);
	
	//veryify the homepageTittle
	 String  HomepageTittle = driver.getTitle();
	
	 if (HomepageTittle.equals("YouTube")) {
		 
		 System.out.println("Tittle is correct - YouTube");
	 }
	 
	 else {
		 
		 System.out.println("Tittle is incorrect - not youtube");
	 }
	 
	 
	 
	 
	 
	 
	
	driver.close();
	
	
	
	}

}
