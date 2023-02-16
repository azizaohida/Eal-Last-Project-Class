package Amazon_Task_16_Dataprovider;

import org.testng.annotations.Test;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

import Amazon_TasK_16_POM.Amazon_searh_items;
import Selenium_16_Task_Utility.Utilities2;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;

public class ItemTest    extends  Utilities2 {
 
	
	@Test(dataProvider = "dp")
  public void f( String  searchitem) throws InterruptedException {
	  Amazon_searh_items   amt =  new Amazon_searh_items(driver);
      amt.searchfieldbutton(searchitem);
  
  
  
  }

  @DataProvider
  public Object[] dp() {
	  String  ud =  System.getProperty("user.dir");
	   String excelfilepath = ud+"\\TestData1\\EvanTeacher_testdata.xlsx";
Xlsx_Reeader_EAL1  reader  =  new  Xlsx_Reeader_EAL1(excelfilepath);
      Object[] data = reader.getSheetData("amazonitem");
	    return data;
    };
  }

