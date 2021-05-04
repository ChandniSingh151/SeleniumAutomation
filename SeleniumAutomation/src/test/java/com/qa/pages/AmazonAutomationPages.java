package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Page Object Model (POM) [Object repository]
public class AmazonAutomationPages {
	
	WebDriver driver;
	
	public AmazonAutomationPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="searchDropdownBox")
	static
	WebElement categoryDropDown;
	
	@FindBy(id="twotabsearchtextbox")
	static
	WebElement categoryInputSearchBox;
	
	@FindBy(id="nav-search-submit-button")
	static
	WebElement searchButton;
	
	@FindAll(@FindBy(xpath="//span[@class='a-price-whole']"))
	static
	List<WebElement> priceOfItems;
	public static List<WebElement> priceOfItems(){
		return priceOfItems;
	}
	
	@FindAll(@FindBy(xpath="//span[contains(text(),'The Da Vinci')]"))
	static
	List<WebElement> namesOfBooks;
	public static List<WebElement> namesOfBooks(){
		return namesOfBooks;
	}

	public List<WebElement> getSearchResults() {
		return getSearchResults();
	}
	public WebDriver getDriver() {
		return driver;
	}

	public static WebElement getCategoryDropDown() {
		return categoryDropDown;
	}

	public static WebElement getCategoryInputSearchBox() {
		return categoryInputSearchBox;
	}

	public static WebElement getSearchButton() {
		return searchButton;
	}
	
}
