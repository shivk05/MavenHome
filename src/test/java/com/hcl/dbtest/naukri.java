package com.hcl.dbtest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.hcl.dbReports.TestBase;
import com.hcl.dbprop.prop;

@Listeners(com.hcl.dbListener.listenerclass.class)

public class naukri extends TestBase{
	

	Logger log = Logger.getLogger(prop.class);	
	

	static WebDriver dr;
	prop obj;
	
	@Test(priority=1)
	public void Testcase1() throws Exception{	
		PropertyConfigurator.configure("D:/Shivkumar/ShivMaven/log4j.properties");
		obj = new prop();
		obj.openbrowser();
		obj.professionalclick();
		obj.fnamefill();
		obj.emailidfill();
		obj.pwdfill();
		obj.mobnofill();
		obj.matchURLmethod();	
		obj.timeout();
		obj.workexpyearfill();
		obj.timeout();
		obj.workexpmonth();
		log.info("Testcase1 Success");
	}
	
	@Test(priority=2)
	public void Testcase2() throws InterruptedException{
		obj.timeout();
		obj.matchURLmethod();
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
		obj.scrollmethod();
		log.info("Testcase4 Success");
	}
	
	@Test(priority=5)
	public void Testcase5(){
		obj.windowtitle();
		log.info("Testcase5 Success");
	}	
	
	@Test(priority=6)
	public void Testcase6(){
		obj.windowclose();
		log.info("Testcase6 Success");
	}	

}
