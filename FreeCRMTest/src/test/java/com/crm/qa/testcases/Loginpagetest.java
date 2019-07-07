package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class Loginpagetest extends Testbase{
	
	Loginpage loginpage;
	Homepage homepage;           //defining at class level  so that i can use it throughout the class
	
	public Loginpagetest() {
		super();
	}
	
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		 loginpage=new Loginpage();
	}
	
	@Test(priority=1)
	public void loginpagetitletest() {
		
		String title=loginpage.validateloginpagetitle();
		Assert.assertEquals(title, "CRM");
		
	}
	@Test(priority=2)
	public void logintest() {
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
