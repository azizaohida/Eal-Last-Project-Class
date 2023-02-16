package Bask_Test;

import java.util.Arrays;

import com.shams.excel.reader.Utility.Xlsx_Reeader_EAL1;

public class Basic_Apache {

	public static void main(String[] args) {
		

	String 	excelfilepath = "C:\\My automation Task\\My workspace 1\\selenium_project4\\TestData1\\testdata.xlsx";
		
		
		Xlsx_Reeader_EAL1   reader =  new   Xlsx_Reeader_EAL1(excelfilepath);
	
	int  rowcount = reader.getColumnCount("ebaylogin");
     System.out.println("number of the row =" + rowcount);
	
	
	int   columncount = reader.getRowCount("ebaylogin");
	System.out.println("number of the coloumn = " +columncount);
	
	    Object[][]  data = reader.getSheetData("ebaylogin");
	//System.out.println(Arrays.deepToString(data));
	System.out.println(Arrays.deepToString(data));
	}

}
