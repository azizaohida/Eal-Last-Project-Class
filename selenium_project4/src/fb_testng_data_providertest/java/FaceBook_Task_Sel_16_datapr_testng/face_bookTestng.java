package FaceBook_Task_Sel_16_datapr_testng;

import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

import Selenium_16_Task_facebookPOM.homepage_fb_Task;

import java.sql.Driver;

import org.testng.annotations.DataProvider;

public class face_bookTestng   extends  Utilities2{
 
	
	
	@Test(dataProvider = "fblogin")
  public void facebooklogin(Integer email, String password) {
		homepage_fb_Task  hfb =  new homepage_fb_Task(Driver);
         hfb.emailfieldbutton(email);
 hfb.passwordfieldbutton(password);
  hfb.loginbutton();
  
}

   @DataProvider(name ="fblogin")
  public Object[][] fblogin() {
	
	 String ud = System.getProperty(user.dir);  
	   
	   String  xcelfilepath = ud + "\\TestData_facebook_Task_16\\selenium_16 Task Excel sheet.xlsx" ;
	   
	   
	   Xlsx_Reeader_EAL1  reader = new Xlsx_Reeader_EAL1(xcelfilepath);
	 Object[][] data = reader.getSheetData("fbsignUp");
    };
  }
}
