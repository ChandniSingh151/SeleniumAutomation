package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.GoogleAutoSuggATPages;
import com.qa.testbase.TestBase_GoogleAutoSuggestion;

public class TC_GoogleAutoSuggAT extends TestBase_GoogleAutoSuggestion {
	
	@Test
	@Parameters({"searchValue"})
	public void testingAutomation(String searchValue) throws InterruptedException {
	
		gAP1.getSearchInputField().sendKeys(searchValue);
		
		Thread.sleep(2000);
		
		List<WebElement> suggestionLists = gAP1.getSuggestionList();
		
		for(WebElement elem : suggestionLists) {
//			System.out.println(elem.getText());
			Reporter.log(elem.getText());
		}
		
		gAP1.getSearchButton().submit();
	}

}
