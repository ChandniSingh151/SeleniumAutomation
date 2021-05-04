package com.qa.testscript;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.utility.ExcelUtility;
import com.qa.testbase.TestBase_FaceBook;

public class TC_FaceBook extends TestBase_FaceBook {

	@Test(dataProvider="fetchData")
	public void login(String s1,String s2) throws InterruptedException
	{
		Thread.sleep(1000);
		FaceBookOR.getEmailField().clear();
		Thread.sleep(1000);
		FaceBookOR.getEmailField().sendKeys(s1);
		Thread.sleep(1000);
        FaceBookOR.getPasswordField().clear();
		FaceBookOR.getPasswordField().sendKeys(s2);
		FaceBookOR.getLogInButton().click();
		Thread.sleep(1000);
		FaceBookOR.getFriends().click();
		FaceBookOR.getLogOutDropDown().click();
		Thread.sleep(1000);
		
		//FaceBookOR.getlogOut().click();
		//Thread.sleep(1000);
	}
	
	@DataProvider
	public Object[][] fetchData() throws IOException
	{
		String xlPath="./testdata/TestData.xlsx";
		String xlSheet="Sheet2";
		int rowcount=ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellcount=ExcelUtility.getCellCount(xlPath, xlSheet, rowcount);
		String [][] data=new String[rowcount][cellcount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				data[i-1][j]=ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			}
		}
		
		return data;
	}	
	

}