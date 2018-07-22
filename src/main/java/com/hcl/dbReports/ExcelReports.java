package com.hcl.dbReports;

import org.automationtesting.excelreport.Xl;

public class ExcelReports {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   try {
	Xl.generateReport("Reports.xlsx");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}
