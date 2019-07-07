package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Contactspage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.Loginpage;

public class Contactspagetest extends Testbase {
	
	Loginpage loginpage;
	Homepage homepage; 
	Contactspage contactspage;
	
	public Contactspagetest() {
		super();
	}
	

	@BeforeMethod
	public void setup() {
		
		initialization();
		
		 loginpage=new Loginpage();
		 contactspage =new Contactspage();
		 
		 homepage= loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 contactspage=homepage.clickoncontactslink();
	}
	
	@Test(priority=1)
	public void verifycontactspagetitle() {
		
		Assert.assertTrue(contactspage.verifycontactslabel());
		
		}
	                                                          //to comment testcase in estng.xml--source-add block comment
	@Test(priority=2)
	public void selectcontact() {
		
		contactspage.selectcontactsbyname("new test 3");
		
	}
	
	@Test(priority=2)
	public void selectmultiplecontact() {
		
		contactspage.selectcontactsbyname("new test 2");
		contactspage.selectcontactsbyname("new test 1");
		
	}
	
	
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

	

}
