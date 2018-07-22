package com.hcl.dbtest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.hcl.dbReports.TestBase;
import com.hcl.dbprop.prop;

public class naukri3 extends TestBase{
	
	Logger log = Logger.getLogger(prop.class);	
	
	static WebDriver dr;
	prop obj;
	
	@Test(priority=1)
	public void Testcase1() throws Exception{	
		PropertyConfigurator.configure("D:/Shivkumar/ShivMaven/log4j.properties");
		obj = new prop();
		obj.openbrowser();		
		log.info("Testcase1 Success");
	}
	
	@Test(priority=2)
	public void Testcase2(){
		obj.windowtitle();
		log.info("Testcase2 Success");
	}
	
	@Test(priority=3)
	public void Testcase3() throws Throwable{
		obj.timeout();
		obj.screenshotmethod();
		log.info("Testcase3 Success");
	}
	
	@Test(priority=4)
	public void Testcase4(){
		obj.windowclose();
		log.info("Testcase4 Success");
	}		

}
