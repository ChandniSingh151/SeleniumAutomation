package com.qa.testscript;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.AmazonCategoryPages;

public class TC_AmazonCategoryAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver chromeDriver = new ChromeDriver();
		
		AmazonCategoryPages aCP = new AmazonCategoryPages(chromeDriver);
		
		chromeDriver.manage().window().maximize();
		
		chromeDriver.get("http://www.amazon.in/");
		
		
		List<WebElement> categories = aCP.getCategories();
		
		Set<WebElement> displayedCategories = new LinkedHashSet<WebElement>();
		
		for(WebElement elem : categories)
			if(elem.isDisplayed())
				displayedCategories.add(elem);
		
		
		System.out.println("Total no of items are :- "+displayedCategories.size());
		
		System.out.println();
		
		System.out.println("Names present in the category list box are :- ");
		System.out.println("------------------------------------------------------------");
		for(WebElement elem : displayedCategories)
			System.out.println(elem.getText());	
		chromeDriver.close();

	}

}
