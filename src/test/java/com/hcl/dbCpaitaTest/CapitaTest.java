package com.hcl.dbCpaitaTest;

import org.testng.annotations.Test;

import com.hcl.dbCapitaJavaClass.CapitaClass;


public class CapitaTest{
	

	@Test(priority=1)
	public void Testcase1() throws Exception{	
		CapitaClass obj = new CapitaClass();
		
		obj.loadpropfile();
		obj.openbrowser();
		obj.titleselect("Title");
		obj.fnamefill();	
		
		
	}

}
