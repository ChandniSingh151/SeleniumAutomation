package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckingAmazonAppTitlePages {
	WebDriver driver;
	public CheckingAmazonAppTitlePages(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
