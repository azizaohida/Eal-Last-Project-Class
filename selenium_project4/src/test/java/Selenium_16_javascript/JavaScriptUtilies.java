package Selenium_16_javascript;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptUtilies{
 //flash method (color+flash)      1
	public  static  void changeColor(String Color , WebElement element ,WebDriver driver) {
		JavascriptExecutor    Jsexecutor = (JavascriptExecutor)driver;
		Jsexecutor.executeScript("arguments[0].style.backgroundColor='" +Color+ "'" , element);		
         try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
   public static void   flash(WebElement element, WebDriver driver) {
	   String  bgColor = element.getCssValue("backgroundColor");
	   System.out.println(bgColor);
	  
	  for(int i=0; i<10; i++) {
	   changeColor("#0000FF", element,driver);
	   changeColor(bgColor, element, driver);
	   
   }
  
   
   
   
   
   
   
   
   
   
   
   } 
	//draw method  (green)  2
  public  static void  drawBrodergreen(WebElement element, WebDriver driver) {
     JavascriptExecutor   Jsexecutor = (JavascriptExecutor)driver;
     Jsexecutor.executeScript("arguments[0].style.border='5px solid green'", element);
		  
	  }
       //red  
  public  static void  drawBroderred(WebElement element, WebDriver driver) {
	     JavascriptExecutor   Jsexecutor = (JavascriptExecutor)driver;
	     Jsexecutor.executeScript("arguments[0].style.border='5px solid red'", element);
			  
		  }
  
  
  //blue
  public  static void  drawBroderblue(WebElement element, WebDriver driver) {
	     JavascriptExecutor   Jsexecutor = (JavascriptExecutor)driver;
	     Jsexecutor.executeScript("arguments[0].style.border='5px solid blue'", element);
			  
		  }

  
 //Date                3
  public  static  void    selectbyDateJs(WebDriver driver, WebElement element, String Datevalue) {
		
		JavascriptExecutor  Jsexecutor =  (JavascriptExecutor)driver;
		Jsexecutor.executeScript("arguments[0].setAttribute('value','"+ Datevalue + "')", element);
	}
	
	
	//Alert             4
     public  static  void   generateAlert(WebDriver driver, String message) {
	
	JavascriptExecutor    Jsexecutor = (JavascriptExecutor)driver;
	Jsexecutor.executeScript("alert('"+message +"')");
	}
	
	  //click by JS//method javascript 5
 	public static void  Jsclick(WebDriver driver, WebElement element) {
 	
 	JavascriptExecutor  Jsexecutor = (JavascriptExecutor)driver;
 	
 	Jsexecutor.executeAsyncScript("arguments[0].click()", element);
 	
 	}
     
       //Scroll Down 6
     public  static  void   scrollPageDown(WebDriver driver) {
   	  JavascriptExecutor  Jsexecutor = (JavascriptExecutor)driver;
   	Jsexecutor.executeAsyncScript("window.scrollTo(0, document.body.scrollHeight)");
	
	
	
	}
	//Scroll up 7
     public   static void  scrollIntoView(WebDriver driver, WebElement element) {
    		
	JavascriptExecutor  Jsexecutor  = (JavascriptExecutor)driver;
	Jsexecutor.executeScript("arguments[0].scrollIntoView(true)", element);
     }
     
	
}
	

