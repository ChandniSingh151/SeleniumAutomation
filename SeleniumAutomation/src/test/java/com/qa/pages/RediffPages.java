package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

 

public class RediffPages {
WebDriver driver;
@FindBy(linkText="Create Account")
WebElement CreateAccountLink;
public WebElement getCreateAccountLink(){
	return CreateAccountLink;
}
@FindBy(xpath="//tbody/tr[3]/td[3]/input[1]")
WebElement FullNameTextField;
public WebElement getFullNameTextField(){
	return FullNameTextField;
}
@FindBy(xpath="//input[contains(@name,'login')]")
WebElement EmailIDTextField;
public WebElement getEmailIDTextField(){
	return EmailIDTextField;
}
@FindBy(className="btn_checkavail")
WebElement CheckAvailabilityBtn;
public WebElement getCheckAvailabilityBtn(){
	return CheckAvailabilityBtn;
}	
public RediffPages(WebDriver driver)
{
this.driver=driver;
PageFactory.initElements(driver,this);
}
}
