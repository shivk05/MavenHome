package com.hcl.dbCapitaJavaClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CapitaClass {
	
	File f;
	FileInputStream fis;
	String title;
	Properties p;
	WebDriver dr;
	
    /*By TITLE = By.xpath(p.getProperty("TITLE"));
    By FNAME = By.xpath(p.getProperty("FNAME"));
    By FATHER = By.xpath(p.getProperty("FATHER"));
    By LNAME = By.xpath(p.getProperty("LNAME"));
    By MSTATUS = By.xpath(p.getProperty("MSTATUS"));
    By GENDER = By.xpath(p.getProperty("GENDER"));
    By BYEAR = By.xpath(p.getProperty("BYEAR"));
    By BMONTH = By.xpath(p.getProperty("BMONTH"));
    By BDAY = By.xpath(p.getProperty("BDAY"));
    By PAN = By.xpath(p.getProperty("PAN"));
    By EMAIL = By.xpath(p.getProperty("EMAIL"));
    By PIC = By.xpath(p.getProperty("PIC"));
    By PDNEXT = By.xpath(p.getProperty("PDNEXT"));*/
	
	public void loadpropfile(){
		f = new File("H:/Eclipse/872018/ShivMaven/WebXpaths.properties");
		try {
			fis = new FileInputStream(f);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		p = new Properties();
		try {
			p.load(fis);
			} catch (IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
    public void openbrowser(){
        dr = new FirefoxDriver();
        dr.manage().window().maximize();
        dr.get(p.getProperty("URL"));    
    }
    
    public void titleselect(String title){
        dr.findElement(By.xpath(p.getProperty(title))).sendKeys("Mr.");
    }
    
    public void fnamefill(){
        dr.findElement(By.xpath(p.getProperty("FNAME"))).sendKeys("John");
    }
	

}
