package FaceBook_Task_Sel_16_datapr_testng;

import org.testng.annotations.Test;

import Selenium_16_Task_facebookPOM.homepage_fb_Task;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class facebookTest    extends    Utilities2{
  
	
	@Test(dataProvider = "facebooklogin")
  public void fblogin(Integer n, String s) {
		homepage_fb_Task  ob =  new   homepage_fb_Task(driver);
    ob.emailfieldbutton(s);
  ob.passwordfieldbutton(s);
  ob.loginbutton();
  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
}
