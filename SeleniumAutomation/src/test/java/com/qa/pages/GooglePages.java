package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages {
	
	WebDriver driver;

	@FindBy(name= "q")WebElement SearchTextField;
	@FindBy(xpath= "//input[@value='Google Search']")WebElement SubmitButton;

	public GooglePages(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	public WebElement getSearchTextField(){
		return SearchTextField;
	}
	public WebElement getSubmitButton(){
		return SubmitButton;
	}

}


