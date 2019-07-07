package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Homepage extends Testbase{
	
	@FindBy(xpath="//span[text()='nirmal kumar']")
	WebElement usernamelabel;
	
	@FindBy(xpath="//span[text()='Contacts']")
	WebElement contactslink ;
	
	@FindBy(xpath="//span[text()='Deals']")
	WebElement dealslink;
	
	@FindBy(xpath="//span[text()='Tasks']")
	WebElement tasklink;
	
	
	//initializing page objects
	public Homepage() {
		 
		  PageFactory.initElements(driver,this);
		    
	}
	
	public String verifyhomepagetitle() {
		return driver.getTitle();
	}
	
	public boolean verifycorrectusername() {
		return usernamelabel.isDisplayed();
	}
		
		public Contactspage clickoncontactslink() {
			
			contactslink.click();
			return new Contactspage();
		}
		
     public Dealspage clickonDealspagelink() {
			
			dealslink.click();
			return new Dealspage();
		}
		
		
	}
	
	
