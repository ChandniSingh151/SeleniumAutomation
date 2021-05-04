package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;


import com.qa.testbase.TestBase_AmazonFooter;

public class TC_AmazonFooter extends TestBase_AmazonFooter{
	@Test
	public void getCountryNames()
	{
		List<WebElement>  countryNames=getCountryNames.getCountryNames();
		for(WebElement countryName:countryNames)
		{
			Reporter.log(countryName.getText()+"-----:"+countryName.getAttribute("href"),true);
		}
	

}
}
