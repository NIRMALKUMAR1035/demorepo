package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Contactspage extends Testbase {
	


	@FindBy(xpath="//div[contains(@class,'ui header')]")
	WebElement contactslabel;
	
public Contactspage() { //constructor
		
		PageFactory.initElements(driver,this);
	}
		
public boolean verifycontactslabel() {
	
	return contactslabel.isDisplayed();
}

public void selectcontactsbyname(String name) {
	
	driver.findElement(By.xpath("//td[text()='"+name+"']")).click();;
	
}

	
}
