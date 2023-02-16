package facebook_data_pr_testng;

import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

import Selenium_16_Task_Utility.Utilities2;
import Selenium_16_Task_facebookPOM.homepage_fb_Task;

import org.testng.annotations.DataProvider;

public class facebookTest  extends  Utilities2 {
 
	@Test(dataProvider = "facebooklogindata")
  public void fbook(String email, String password) throws InterruptedException {
 homepage_fb_Task  fb =  new homepage_fb_Task(driver);
	  
 fb.emailfieldbox(email);
 Thread.sleep(1000);
 
 fb.passwordfieldbox(password);
 fb.loginbutton();
 
 driver.navigate().back();
 Thread.sleep(1000);
  }
 @DataProvider
	  public Object[][] facebooklogindata() {
     String  ud =  System.getProperty("user.dir");
		   String excelfilepath = ud +"\\TestData1\\EvanTeacher_testdata.xlsx";
	 Xlsx_Reeader_EAL1  reader  =  new  Xlsx_Reeader_EAL1(excelfilepath);
	       Object[][] data = reader.getSheetData("fb");
		    return data;
		    };
  }

