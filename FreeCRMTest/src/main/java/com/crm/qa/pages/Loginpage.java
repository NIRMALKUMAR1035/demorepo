package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Loginpage extends Testbase {
	
	//page factory or --object repository
	
	@FindBy(name="email")
	WebElement email;
	
	@FindBy(name="password")
	WebElement password;
	                                                                                 //how to you initialize webelements using pagefactory
	
	@FindBy(xpath="//div[contains(@class,'ui fluid')]")                       //with the help of pagefactory.initelements(driver,tis)
	WebElement Loginbtn;
	
	@FindBy(xpath="//a[@href='https://api.cogmento.com/register']")
	WebElement signup;
	
	
	public Loginpage() { //constructor
		
		PageFactory.initElements(driver,this);
	}
		
	
	//actions:
	
	public String validateloginpagetitle() {
			
			return driver.getTitle();
			
		}
	
	public Homepage login(String un, String pwd) {
		email.sendKeys(un);
		password.sendKeys(pwd);
		Loginbtn.click();
		
		return new Homepage();
		
		
		
		
	}
	

}
