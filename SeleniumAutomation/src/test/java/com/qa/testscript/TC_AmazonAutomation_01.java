package com.qa.testscript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.AmazonAutomationPages;
import com.qa.utility.ExcelUtility;


// Test Script Class
public class TC_AmazonAutomation_01 extends AmazonautomationTestBase {

	@Test(dataProvider="supplyData")
	public void searchCategory(String input1, String input2) throws InterruptedException {
		
		Thread.sleep(1000);
		new Select(AmazonAutomationPages.getCategoryDropDown()).selectByVisibleText(input1);
		Thread.sleep(2000);
		AmazonAutomationPages.getCategoryInputSearchBox().sendKeys(input2);
		AmazonAutomationPages.getSearchButton().click();
		AmazonAutomationPages.getCategoryInputSearchBox().clear();
		
		List<WebElement> titleOfItems = AmazonAutomationPages.namesOfBooks();
		for(WebElement elem : titleOfItems) {
			System.out.println(elem.getText());
		}
		List<WebElement> priceOfItems = AmazonAutomationPages.priceOfItems();
		for(int i=0;i<titleOfItems.size();i++) {
			if(!(priceOfItems.get(i).getText().equals("0"))){
				System.out.println(titleOfItems.get(i).getText()+"-----: Rs. "+priceOfItems.get(i).getText());
			}
			else
				{System.out.println("Not Available");}
			
		}
		
		List<WebElement> items=(List<WebElement>) AmazonAutomationPages.getCategoryInputSearchBox();
	for(int i=0;i<items.size();i++){
		System.out.println(items.get(i).getText()+"-----:Rs."+priceOfItems.get(i).getText());
	}
	
	}
	
	
	@DataProvider
	public String[][] supplyData() throws IOException {
		
		String xlPath=".//testdata/TestData.xlsx";
		String xlSheet="Sheet1";
		int rowCount=ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellCount=ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
		String[][] data=new String[rowCount][cellCount];
		for(int i=1;i<=rowCount;i++){
			for(int j=0;j<cellCount;j++){
			data[i-1][j]=ExcelUtility.getCellData(xlPath, xlSheet, i, j);
		}}
		return data;
	
		
		//Object data[][] = new Object[3][2];
		
		
//		data[0][0] = "Books";
//		data[0][1] = "Da vinci code";
//		
//		data[1][0] = "Electronics";
//		data[1][1] = "Mobile phones";
//		
//		data[2][0] = "Furniture";
//		data[2][1] = "Wooden tables";
//		
//		return data;
		
	}
	
}
