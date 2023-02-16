package Apache_poi_practice;

import java.util.Arrays;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

public class Apachepoi_class_xlsx_15 {

	public static void main(String[] args) {
		
	String  xcelfilepath =  "C:\\My automation Task\\My workspace 1\\selenium_project4\\TestData_facebook_Task_16\\selenium_16 Task Excel sheet.xlsx";
	
 Xlsx_Reeader_EAL1   reader = new  Xlsx_Reeader_EAL1(xcelfilepath);
	//how many  count Rows
	int rowcount = reader.getRowCount("fbsignUp");
	System.out.println(rowcount);
	// how many columns
	
	int  columnscount = reader.getColumnCount("fbsignUp");
	System.out.println(columnscount);
	
	Object[][] data = reader.getSheetData("fbsignUp");
	System.out.println(Arrays.deepToString(data));
	
	
	
	}

}
