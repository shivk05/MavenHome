package com.hcl.dbReports;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Onlysnap {
	//WebDriver dr;
	
	/*public void snap(WebDriver dr ,String path) throws NullPointerException, IOException{
		Calendar cal = Calendar.getInstance();	
		SimpleDateFormat form = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		File srcfile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File(path));
	}*/
	public static String cap (WebDriver dr,String Scree){
		try{
			
			TakesScreenshot  ts = (TakesScreenshot)dr;
		File sour = ts.getScreenshotAs(OutputType.FILE);
		String dest = "D://libi"+Scree+".png";
		File destination = new File(dest);
		FileUtils.copyFile(sour,destination);
		System.out.println("Taken");
		return dest;
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			return e.getMessage();
		}
	
	}

}
