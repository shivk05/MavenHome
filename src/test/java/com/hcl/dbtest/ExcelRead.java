package com.hcl.dbtest;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.Test;

public class ExcelRead {
	
	public File f;
	public Workbook wb;
	public Sheet sh;
	public String x;
	
	@Test
	public void excelread(String x) throws BiffException, IOException{
		f = new File("D:/Shivkumar/ExcelSheet.xls");		
		wb = Workbook.getWorkbook(f);
		sh = wb.getSheet(0);				
	}


}
