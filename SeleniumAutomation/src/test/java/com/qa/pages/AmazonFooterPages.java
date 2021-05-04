package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonFooterPages {
	WebDriver driver;
	@FindBy(xpath="/html/body/div[1]/div[5]/div[4]")
	WebElement FooterSection;
	public WebElement getFooterSection1()
	{
		return FooterSection;
	}
	//xpath="/html/body/div[1]/div[5]/div[4]//a"


	@FindAll(@FindBy(xpath="/html/body/div[1]/div[5]/div[4]//a"))
	List<WebElement> countryNames;
	public List<WebElement> getCountryNames()
	{
		return countryNames;
	}

	public AmazonFooterPages(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


}
