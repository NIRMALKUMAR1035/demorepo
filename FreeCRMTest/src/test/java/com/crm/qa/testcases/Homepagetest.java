package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class Homepagetest extends Testbase {
	
	Loginpage loginpage;
	Homepage homepage; 
	Contactspage contactspage;
	
	//1)test case should be seperated --independent with eachother
	//2)before each testcase launch browser and login
	//3)@test--execute testcase
	//4)after each testcase close the browser
	
	
	public Homepagetest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		
		initialization();
		
		 loginpage=new Loginpage();
		 contactspage =new Contactspage();
		 
		 homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyhomepagetitle() {
		
		String homepagetitle=homepage.verifyhomepagetitle();
		Assert.assertEquals(homepagetitle, "CRM","homepage title not matched");
		}
     
	@Test(priority=2)
	public void verifyusernametitle() {
		
		Assert.assertTrue(homepage.verifycorrectusername());
		
		}
	@Test()
		public void verifycontactslinktext() {
		
		contactspage=homepage.clickoncontactslink();
			
			
		}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

	}
	
	

	
	
