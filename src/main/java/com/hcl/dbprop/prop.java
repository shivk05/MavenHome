package com.hcl.dbprop;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.hcl.dbtest.ExcelRead;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class prop extends ExcelRead {
	
    WebDriver dr;
    DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    
    ExcelRead obj = new ExcelRead();

    By professional = By.xpath("html/body/div[1]/form/div[2]/div/button");
    By fname = By.xpath(".//*[@id='fname']");
    By emailid = By.xpath(".//*[@id='email']");
    By pwd = By.xpath(".//*[@id='basicDetailForm']/div[3]/div[1]/div/input");
    By mobno = By.xpath(".//*[@id='basicDetailForm']/div[4]/div[1]/div/input[2]");
    By workexpyear = By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input");
    By workexpmonth = By.xpath(".//*[@id='basicDetailForm']/resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input");
    
    
    public void openbrowser(){
        dr = new FirefoxDriver();
        dr.manage().window().maximize();
        dr.get("https://my.naukri.com/account/createaccount");    
    }
    
    public void professionalclick(){
        dr.findElement(professional).click();
    }
    
    public void fnamefill(){
    	
    	String x = obj.sh.getCell(1,0).getContents();
        dr.findElement(fname).sendKeys(x);
    }
    
    public void emailidfill(){
        dr.findElement(emailid).sendKeys("abs@cde.com");
    }
    
    public void pwdfill(){
        dr.findElement(pwd).sendKeys("angd14lkjurmnh");
    }
    
    public void mobnofill(){
        dr.findElement(mobno).sendKeys("12345678910");
    }
    
    public void workexpyearfill(){
    	Select dropdown1 = new Select(dr.findElement(workexpyear));
    	dropdown1.selectByVisibleText("8");
        
    }
    
    public void workexpmonth(){
    	Select dropdown2 = new Select(dr.findElement(workexpmonth));
    	dropdown2.selectByVisibleText("0");
    }
    
    public void timeout() throws InterruptedException{
        Thread.sleep(2000);
    }
    
    public static void main(String[] args) {        
        
    }
    
    public void matchURLmethod() {
        String Actual = dr.getCurrentUrl();        
        String Expected = "https://my.naukri.com/account/register/basicdetailsq";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(Actual, Expected,"URL did not match");        
    }
    
    public void screenshotmethod() throws Exception
    {
        //get current date time with Date()
        Date date = new Date();
        
        // Now format the date
        String date1= dateFormat.format(date);
        
        File scrFile = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);        
        FileUtils.copyFile(scrFile, new File("D:/Shivkumar/ShivMaven/SnapShotFolder/Snap" + date1 + ".png"));
    }
    
    public void scrollmethod(){
        JavascriptExecutor js = ((JavascriptExecutor)dr) ;
        js.executeScript("scroll(0,2000)");
        js.executeScript("scroll(0,-500)");
    }
    
    public void windowtitle(){
        String handle = dr.getWindowHandle();
        dr.switchTo().window(handle);
        String Actual2 = dr.getTitle();
        String Expected2 = "Resume Manager - Post Resume Online - Submit your CV - Naukri.com";
        Assert.assertEquals(Actual2, Expected2,"Title did not match");        
    }
    
	public void excelread() throws BiffException, IOException{
		File f = new File("D:/Shivkumar/ExcelSheet.xls");		
		Workbook wb = Workbook.getWorkbook(f);
		Sheet sh = wb.getSheet(0);
		String x = sh.getCell(1,0).getContents();
	}
    
    public void windowclose(){
    	dr.close();
    }   

}