package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleAutoSuggATPages {
	
	WebDriver driver;

	public GoogleAutoSuggATPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public GoogleAutoSuggATPages() {
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="q")
	WebElement searchInputField;
	
	@FindAll(@FindBy(xpath="/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul/li"))
	List<WebElement> suggestionList;
	
	@FindBy(name="btnK")
	WebElement searchButton;

	public WebElement getSearchInputField() {
		return searchInputField;
	}

	public List<WebElement> getSuggestionList() {
		return suggestionList;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}
	
}
