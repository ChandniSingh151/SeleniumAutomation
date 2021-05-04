package com.qa.testscript;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.qa.testbase.TestBase_CityBank;


public class TC_CitiBank_01   extends TestBase_CityBank{
	
	
	@Test
	public void multipleWindow()
	{
		CitiBankOR.getTermsCondition().click();
		List<WebElement>  b=CitiBankOR.getAllLink();
		int size=b.size();
		//System.out.println(size);
		for(int i=1;i<size;i++)
		{
			WebElement a=b.get(i);
			String s=a.getText();
			System.out.println(s);
		}
		
	}
	

}


