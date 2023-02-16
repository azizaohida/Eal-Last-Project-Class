package FaceBook_Task_Sel_16_datapr_testng;

import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

import Selenium_16_Task_facebookPOM.homepage_fb_Task;

import java.sql.Driver;

import org.testng.annotations.DataProvider;

public class facebook_login_Test    extends   Utilities2{
 
@Test(dataProvider = "fblogin")
  public void facebooklogin(String email, String password) {
 
	homepage_fb_Task    ob = new homepage_fb_Task(Driver);
	ob.emailfieldbutton(email);
	ob.passwordfieldbutton(password);
	ob.loginbutton();
	}
 @DataProvider(name="fblogin")
  public Object[][] facebooklogin() {
   
	String ud = System.getProperty(user.dir);
	   
	   String   xcelpath = "ud+"\\TestData_facebook_Task_16\\selenium_16 Task Excel sheet.xlsx";
	   
	   Xlsx_Reeader_EAL1     reader =  new Xlsx_Reeader_EAL1(xcelpath);
	   Object[][] data = reader.getSheetData("fbsignUp");
	     return data;
   
    
    
	   
    };
  }
}
